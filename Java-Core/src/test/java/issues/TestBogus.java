package issues;

import java.io.InputStream;

import org.junit.Ignore;
import org.junit.Test;

import prompto.declaration.DeclarationList;
import prompto.parser.ECleverParser;
import prompto.runtime.Context;
import prompto.runtime.Executor;
import prompto.runtime.Interpreter;

@Ignore
public class TestBogus {

	@Test
	public void test() throws Exception {
		try(InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream("issues/bogus.pec")) {
			DeclarationList decls = new ECleverParser(input).parse_declaration_list();
			Context context = Context.newGlobalContext();
			decls.register(context);
			decls.check(context);
			Interpreter.interpretMainNoArgs(context);
			Executor.executeMainNoArgs(context);
			
		}
	}

}
