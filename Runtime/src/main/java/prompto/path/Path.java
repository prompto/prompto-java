package prompto.path;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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
		return StreamSupport.stream(FileSystems.getDefault().getRootDirectories().spliterator(), false)
				.map(java.nio.file.Path::toString)
				.collect(Collectors.toList());
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
		return Files.isSymbolicLink(java.nio.file.Paths.get(path));
	}

}
