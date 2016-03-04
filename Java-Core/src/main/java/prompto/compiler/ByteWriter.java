package prompto.compiler;

import java.io.IOException;
import java.io.OutputStream;

class ByteWriter {

	OutputStream o;
	
	ByteWriter(OutputStream o) {
		this.o = o;
	}
	
	private void write(int i) {
		try {
			o.write(i);
		} catch (IOException e) {
			throw new CompilerException(e);
		}
	}

	void writeBytes(byte[] b) {
		try {
			o.write(b);
		} catch (IOException e) {
			throw new CompilerException(e);
		}
	}

	void writeU1(int u1) {
		write(u1);
	}

	void writeU2(int u2) {
		write(u2 >> 8);
		write(u2);
	}

	void writeU4(int u4) {
		write(u4 >> 24);
		write(u4 >> 16);
		write(u4 >> 8);
		write(u4);
	}



}
