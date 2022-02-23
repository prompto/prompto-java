package prompto.path;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import prompto.utils.OS;

public abstract class Path {
	
	public static List<String> listRoots() {
		switch(OS.current()) {
			case LINUX:
			case WINDOWS:
				return _listRoots();
			case MACOSX:
				return listChildren("/Volumes/");
				default:
					throw new IllegalArgumentException("Unsupported OS: " + OS.current().name());
		}
	}
	
	static List<String> _listRoots() {
		try(var fs = FileSystems.getDefault()) {
			return StreamSupport.stream(fs.getRootDirectories().spliterator(), false)
					.map(java.nio.file.Path::toString)
					.collect(Collectors.toList());
		} catch(IOException e) {
			throw new RuntimeException(e);
		}
	}

	
	public static List<String> listChildren(String path) {
		return Arrays.asList(new File(path).list());
	}
	
	public static boolean pathExists(String path) {
		return new File(path).exists();
	}

	public static boolean pathIsFile(String path) {
		return new File(path).isFile();
	}

	public static boolean pathIsDirectory(String path) {
		return new File(path).isDirectory();
	}

	public static boolean pathIsLink(String path) {
		return Files.isSymbolicLink(Paths.get(path));
	}
	
	public static String compressToTempPath(String path) throws IOException {
		try(InputStream input = new FileInputStream(Paths.get(path).toFile())) {
			java.nio.file.Path compressedPath = Files.createTempFile("deflate", ".gz");
			try(OutputStream output = new FileOutputStream(compressedPath.toFile())) {
				try(OutputStream deflated = new GZIPOutputStream(output)) {
					byte[] data = new byte[0x10000];
					for(;;) {
						int read = input.read(data);
						if(read < 0)
							break;
						deflated.write(data, 0, read);
					}
					return compressedPath.toString();
				}
			}
		}
	}
	
	public static String decompressToTempPath(String path) throws IOException {
		try(InputStream input = new FileInputStream(Paths.get(path).toFile())) {
			try(InputStream inflated = new GZIPInputStream(input)) {
				java.nio.file.Path rawPath = Files.createTempFile("inflate", ".raw");
				try(OutputStream output = new FileOutputStream(rawPath.toFile())) {
					byte[] data = new byte[0x10000];
					for(;;) {
						int read = inflated.read(data);
						if(read < 0)
							break;
						output.write(data, 0, read);
					}
					return rawPath.toString();
				}
			}
		}
	}


}
