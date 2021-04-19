package prompto.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;

public abstract class TarUtils {

	public static Path gz(Path srcPath, Path dstPath) throws IOException {
		try(OutputStream output = new FileOutputStream(dstPath.toFile())) {
			try (GZIPOutputStream gos = new GZIPOutputStream(output)) {
				try(InputStream input = new FileInputStream(srcPath.toFile())) {
					byte[] buffer = new byte[1024];
					int len;
					while ((len = input.read(buffer)) > 0) {
						gos.write(buffer, 0, len);
					}
				}
			}
		}
		return dstPath;
	}

	public static Path ungz(Path srcPath, Path dstPath) throws IOException {
		try(InputStream input = new FileInputStream(srcPath.toFile())) {
			try (GZIPInputStream gis = new GZIPInputStream(input)) {
				try(OutputStream output = new FileOutputStream(dstPath.toFile())) {
					byte[] buffer = new byte[1024];
					int len;
					while ((len = gis.read(buffer)) > 0) {
						output.write(buffer, 0, len);
					}
				}
			}
		}
		return dstPath;
	}

	public static Path tar(Path srcPath, Path dstPath) throws IOException {
		try(OutputStream output = new FileOutputStream(dstPath.toFile())) {
			try (TarArchiveOutputStream taos = new TarArchiveOutputStream(output)) {
				for(File file : srcPath.toFile().listFiles()) {
					ArchiveEntry entry = taos.createArchiveEntry(file, file.getName());
					taos.putArchiveEntry(entry);
					StreamUtils.copyBytes(file.toURI().toURL(), taos);
					taos.closeArchiveEntry();
				}
			}
		}
		return dstPath;
	}

	public static Path untar(Path srcPath, Path dstPath) throws IOException {
		dstPath.toFile().mkdirs();
		try(InputStream input = new FileInputStream(srcPath.toFile())) {
			try (TarArchiveInputStream tais = new TarArchiveInputStream(input)) {
				for(;;) {
					TarArchiveEntry entry = tais.getNextTarEntry();
					if(entry==null)
						break;
					if(entry.isDirectory())
						new File(dstPath.toFile(), entry.getName()).mkdirs();
					else
						Files.copy(tais, new File(dstPath.toFile(), entry.getName()).toPath(), StandardCopyOption.REPLACE_EXISTING);
				}
			}
		}
		return dstPath;
	}

}
