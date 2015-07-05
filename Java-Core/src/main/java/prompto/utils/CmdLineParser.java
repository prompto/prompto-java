package prompto.utils;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import prompto.utils.ArgsLexer;
import prompto.utils.ArgsParser;
import prompto.utils.ArgsParserBaseListener;
import prompto.utils.ArgsParser.ELEMENTContext;
import prompto.utils.ArgsParser.EntryContext;
import prompto.utils.ArgsParser.KeyContext;
import prompto.utils.ArgsParser.STRINGContext;

public class CmdLineParser {

	public static Map<String,String> parse(String input) throws Exception {
		if(input==null)
			input = "";
		try {
			CharStream stream = new ANTLRInputStream(input);
			ArgsLexer lexer = new ArgsLexer(stream);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ArgsParser parser = new ArgsParser(tokens);
			ParseTree tree = parser.parse();
			CmdLineBuilder builder = new CmdLineBuilder();
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(builder, tree);
			return builder.getCmdLineArgs();
		} catch (RecognitionException e) {
			e.printStackTrace(System.err);
			throw new Exception(e);
		}
	}
	
	static class CmdLineBuilder extends ArgsParserBaseListener {
		
		Map<String,String> args = new HashMap<String,String>();
		ParseTreeProperty<String> values = new ParseTreeProperty<String>();
		
		public Map<String, String> getCmdLineArgs() {
			return args;
		}

		@Override
		public void exitEntry(EntryContext ctx) {
			String key = values.get(ctx.k);
			String value = values.get(ctx.v);
			args.put(key,value);
		}

		@Override
		public void exitKey(KeyContext ctx) {
			values.put(ctx,ctx.getText());
		}

		@Override
		public void exitSTRING(STRINGContext ctx) {
			String s = ctx.getText();
			values.put(ctx,s.substring(1,s.length()-1));
		}

		@Override
		public void exitELEMENT(ELEMENTContext ctx) {
			values.put(ctx,ctx.getText());
		}
		 
	}
	
}
