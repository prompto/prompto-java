package prompto.type;

import java.util.Collection;
import java.util.stream.Collectors;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.declaration.BuiltInMethodDeclaration;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.literal.TextLiteral;
import prompto.param.CategoryParameter;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.value.IValue;
import prompto.value.TextValue;

public abstract class ContainerType extends IterableType {

	protected static abstract class JoinMethod extends BuiltInMethodDeclaration {
			
			public JoinMethod() {
				super("join", new CategoryParameter(TextType.instance(), new Identifier("delimiter"), new TextLiteral("\",\"")));
			}
			
			@Override
			public IValue interpret(Context context) throws PromptoError {
				Collection<IValue> items = getItems(context);
				String delimiter = (String)context.getValue(new Identifier("delimiter")).getStorableData();
				String joined = items.stream()
									.map(Object::toString)
									.collect(Collectors.joining(delimiter));
				return new TextValue(joined);
			};
			
			protected abstract Collection<IValue> getItems(Context context);
	
			@Override
			public IType check(Context context) {
				return TextType.instance();
			}
			
			@Override
			public void transpileCall(Transpiler transpiler, ArgumentList arguments) {
				transpiler.append("join(");
				if(!arguments.isEmpty())
					arguments.getFirst().transpile(transpiler, this);
				transpiler.append(")");
			}
						
		}

	protected ContainerType(Family family, IType itemType, String fullName) {
		super(family, itemType, fullName);
	}
	
	@Override
	public IType checkContains(Context context, IType other) {
		if(itemType.isAssignableFrom(context, other))
			return BooleanType.instance();
		else
			return super.checkContains(context, other);
	}
	
	@Override
	public void declareMember(Transpiler transpiler, Identifier name) {
	    if (!"count".equals(name.toString())) {
	        super.declareMember(transpiler, name);
	    }
	}
	
	@Override
	public void transpileMember(Transpiler transpiler, Identifier name) {
	    if ("count".equals(name.toString())) {
	        transpiler.append("length");
	    } else {
	        super.transpileMember(transpiler, name);
	    }
	}
	
	@Override
	public void declareIterator(Transpiler transpiler, Identifier id, IExpression expression) {
	    transpiler = transpiler.newChildTranspiler(null);
	    transpiler.getContext().registerValue(new Variable(id, this.itemType));
	    expression.declare(transpiler);
	}
	
	@Override
	public void transpileIterator(Transpiler transpiler, Identifier id, IExpression expression) {
	    transpiler.append(".iterate(function(").append(id.toString()).append(") { return ");
	    transpiler = transpiler.newChildTranspiler(null);
	    transpiler.getContext().registerValue(new Variable(id, this.itemType));
	    expression.transpile(transpiler);
	    transpiler.append("; }, this)");
	    transpiler.flush();
	}

	public static void compileSliceFirst(Context context, MethodInfo method, Flags flags, IExpression first) {
		if(first==null)
			method.addInstruction(Opcode.LCONST_1);
		else {
			ResultInfo finfo = first.compile(context, method, flags.withPrimitive(true));
			finfo = CompilerUtils.numberTolong(method, finfo);
		}
	}

	public static void compileSliceLast(Context context, MethodInfo method, Flags flags, IExpression last) {
		if(last==null) {
			method.addInstruction(Opcode.LCONST_1);
			method.addInstruction(Opcode.LNEG);
		} else {
			ResultInfo linfo = last.compile(context, method, flags.withPrimitive(true));
			linfo = CompilerUtils.numberTolong(method, linfo);
		}
	}
}
