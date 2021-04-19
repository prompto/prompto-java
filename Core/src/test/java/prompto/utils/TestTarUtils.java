package prompto.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.Test;

public class TestTarUtils {

	@Test
	public void fileIsGzedAndUngzed() throws IOException {
		Path dir = Files.createTempDirectory("TestTarUtils");
		File textFile  = new File(dir.toFile(), "textFile.txt");
		try(OutputStream output = new FileOutputStream(textFile)) {
			output.write("Hello!".getBytes());
		}
		assertTrue(textFile.exists());
		Path gzedFile = TarUtils.gz(textFile.toPath(), new File(dir.toFile(), "textFile.txt.gz").toPath());
		assertTrue(gzedFile.toFile().exists());
		Path textFile2 = TarUtils.ungz(gzedFile, new File(dir.toFile(), "textFile2.txt").toPath());
		assertTrue(textFile2.toFile().exists());
		try(InputStream input = new FileInputStream(textFile2.toFile())) {
			String value = StreamUtils.readString(input);
			assertEquals("Hello!", value);
		}
	}
	
	@Test
	public void dirIsTaredAndUntared() throws IOException {
		Path dir = Files.createTempDirectory("TestTarUtils");
		File toArchiveDir = new File(dir.toFile(), "toArchive");
		toArchiveDir.mkdirs();
		for(int i = 1; i<=3; i++) {
			File textFile  = new File(toArchiveDir, "textFile-" + i + ".txt");
			try(OutputStream output = new FileOutputStream(textFile)) {
				output.write(("Hello " + i + "!").getBytes());
			}
		}
		Path tarFile = TarUtils.tar(toArchiveDir.toPath(), new File(dir.toFile(), "archived.tar").toPath());
		assertTrue(tarFile.toFile().exists());
		Path untaredDir = TarUtils.untar(tarFile, new File(dir.toFile(), "unarchived").toPath());
		assertTrue(untaredDir.toFile().exists());
		for(int i = 1; i<=3; i++) {
			File textFile  = new File(untaredDir.toFile(), "textFile-" + i + ".txt");
			assertTrue(textFile.exists());
			try(InputStream input = new FileInputStream(textFile)) {
				String value = StreamUtils.readString(input);
				assertEquals("Hello " + i + "!", value);
			}
		}
		
	}

}
