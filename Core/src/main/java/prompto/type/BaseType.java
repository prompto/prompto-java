package prompto.type;

import java.security.InvalidParameterException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;

import com.fasterxml.jackson.databind.JsonNode;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.ShortOperand;
import prompto.compiler.StackState;
import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.CmpOp;
import prompto.grammar.Identifier;
import prompto.parser.CodeSection;
import prompto.parser.ICodeSection;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.store.FamilyInfo;
import prompto.utils.CodeWriter;
import prompto.value.IValue;
import prompto.value.RangeBase;

public abstract class BaseType extends CodeSection implements IType {

	Family family;

	protected BaseType(Family family) {
		this.family = family;
	}

	@Override
	public FamilyInfo getFamilyInfo(Context context) {
		IType resolved = resolve(context, null);
		if(resolved==null || resolved==this)
			return new FamilyInfo(family, false);
		else
			return resolved.getFamilyInfo(context);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof IType))
			return false;
		IType type = (IType) obj;
		return this.getTypeName().equals(type.getTypeName());
	}

	@Override
	public String toString() {
		return getTypeName();
	}
	
	@Override
	public String getTranspiledName(Context context) {
		return getTypeName();
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(getTypeName());
	}
	
	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse, ICodeSection section) {
		if(other instanceof EnumeratedNativeType)
			return checkAdd(context, ((EnumeratedNativeType)other).getDerivedFrom(), tryReverse, section);
		else if(tryReverse)
			return other.checkAdd(context, this, false, section);
		else {
			context.getProblemListener().reportIllegalOperation(section, "add", tryReverse ? this : other, tryReverse ? other : this );
			return VoidType.instance();
		}
	}

	@Override
	public IType checkSubstract(Context context, IType other, ICodeSection section) {
		if(other instanceof EnumeratedNativeType)
			return checkSubstract(context, ((EnumeratedNativeType)other).getDerivedFrom(), section);
		else {
			context.getProblemListener().reportIllegalOperation(section, "subtract", this, other );
			return VoidType.instance();
		}		
	}

	@Override
	public IType checkDivide(Context context, IType other, ICodeSection section) {
		if(other instanceof EnumeratedNativeType)
			return checkDivide(context, ((EnumeratedNativeType)other).getDerivedFrom(), section);
		else {
			context.getProblemListener().reportIllegalOperation(section, "divide", this, other );
			return VoidType.instance();
		}	
	}

	@Override
	public IType checkIntDivide(Context context, IType other, ICodeSection section) {
		if(other instanceof EnumeratedNativeType)
			return checkIntDivide(context, ((EnumeratedNativeType)other).getDerivedFrom(), section);
		else {
			context.getProblemListener().reportIllegalOperation(section, "divide", this, other );
			return VoidType.instance();
		}	
	}

	@Override
	public IType checkMultiply(Context context, IType other, boolean tryReverse, ICodeSection section) {
		if(other instanceof EnumeratedNativeType)
			return checkMultiply(context, ((EnumeratedNativeType)other).getDerivedFrom(), tryReverse, section);
		else if(tryReverse)
			return other.checkMultiply(context, this, false, section);
		else {
			context.getProblemListener().reportIllegalOperation(section, "multiply", tryReverse ? this : other, tryReverse ? other : this );
			return VoidType.instance();
		}
	}

	@Override
	public IType checkModulo(Context context, IType other, ICodeSection section) {
		if(other instanceof EnumeratedNativeType)
			return checkModulo(context, ((EnumeratedNativeType)other).getDerivedFrom(), section);
		else {
			context.getProblemListener().reportIllegalOperation(section, "modulo", this, other );
			return VoidType.instance();
		}			
	}
	
	@Override
	public void checkCompare(Context context, IType other, ICodeSection section) {
		if(other instanceof EnumeratedNativeType)
			checkCompare(context, ((EnumeratedNativeType)other).getDerivedFrom(), section);
		else 		
			context.getProblemListener().reportIllegalOperation(section, "compare", this, other);
	}

	@Override
	public void checkContains(Context context, IType other, ICodeSection section) {
		if(other instanceof EnumeratedNativeType)
			checkContains(context, ((EnumeratedNativeType)other).getDerivedFrom(), section);
		else 	
			context.getProblemListener().reportIllegalOperation(section, "contain", this, other);
	}

	@Override
	public void checkContainsAllOrAny(Context context, IType other) {
		if(other instanceof EnumeratedNativeType)
			checkContainsAllOrAny(context, ((EnumeratedNativeType)other).getDerivedFrom());
		else 		
			throw new SyntaxError(this.getTypeName() + " cannot contain " + other.getTypeName());
	}

	@Override
	public IType checkItem(Context context, IType itemType, ICodeSection section) {
		throw new SyntaxError("Cannot read item from " + this.getTypeName());
	}

	@Override
	public IType checkMember(Context context, Identifier name) {
		if("text".equals(name.toString()))
			return TextType.instance();
		else if("json".equals(name.toString()))
			return TextType.instance();
		else {
			context.getProblemListener().reportUnknownMember(name, name.toString());
			return VoidType.instance();
		}
	}

	@Override
	public IType checkStaticMember(Context context, Identifier name) {
		context.getProblemListener().reportUnknownMember(name, name.toString());
		return VoidType.instance();
	}

	@Override
	public IType checkSlice(Context context) {
		throw new SyntaxError("Cannot slice " + this.getTypeName());
	}

	@Override
	public IType checkIterator(Context context) {
		throw new SyntaxError("Cannot iterate over " + this.getTypeName());
	}

	@Override
	public abstract void checkUnique(Context context);

	@Override
	public abstract void checkExists(Context context);

	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return this==other 
				|| this.equals(other) 
				|| other.equals(NullType.instance());
	}

	@Override
	public abstract boolean isMoreSpecificThan(Context context, IType other);

	@Override
	public final void checkAssignableFrom(Context context, IType other, ICodeSection section) {
		if (!isAssignableFrom(context, other))
			context.getProblemListener().reportIllegalAssignment(section, this, other);
	}

	@Override
	public IType checkRange(Context context, IType other) {
		throw new SyntaxError("Cannot create range of " + this.getTypeName() + " and " + other.getTypeName());
	}

	@Override
	public RangeBase<?> newRange(Object left, Object right) {
		throw new SyntaxError("Cannot create range of " + this.getTypeName());
	}

	@Override
	public String toString(Object value) {
		return value.toString();
	}

	@Override
	public Comparator<? extends IValue> getComparator(Context context, IExpression key, boolean descending) {
		throw new RuntimeException("Unsupported!");
	}

	@Override
	public IValue convertJavaValueToIValue(Context context, Object value) {
		throw new RuntimeException("Unsupported convertJavaValueToIValue for " 
				+ this.getClass() + " and value type " + value.getClass().getSimpleName());
	}
	
	@Override
	public IValue getStaticMemberValue(Context context, Identifier name) throws PromptoError {
		throw new SyntaxError("Cannot read member from " + this.getTypeName());
	}
	
	@Override
	public Set<IMethodDeclaration> getMemberMethods(Context context, Identifier name) throws PromptoError {
		return Collections.emptySet();
	}

	@Override
	public Set<IMethodDeclaration> getStaticMemberMethods(Context context, Identifier name) throws PromptoError {
		return Collections.emptySet();
	}

	@Override
	public IValue readJSONValue(Context context, JsonNode value, Map<String, byte[]> parts) {
		throw new InvalidParameterException(value.toString());
	}

	public static Opcode[] CMP_OPCODES = createOpcodes();

	public static Opcode[] createOpcodes() {
		Opcode[] opcodes = new Opcode[CmpOp.values().length];
		opcodes[CmpOp.LT.ordinal()] = Opcode.IF_ICMPLT;
		opcodes[CmpOp.LTE.ordinal()] = Opcode.IF_ICMPLE;
		opcodes[CmpOp.GT.ordinal()] = Opcode.IF_ICMPGT;
		opcodes[CmpOp.GTE.ordinal()] = Opcode.IF_ICMPGE;
		return opcodes;
	}

	public static ResultInfo compileCompareToEpilogue(MethodInfo method, Flags flags) {
		method.addInstruction(Opcode.ICONST_0);
		Opcode opcode = CMP_OPCODES[flags.cmpOp().ordinal()];
		method.addInstruction(opcode, new ShortOperand((short)7));
		StackState branchState = method.captureStackState();
		method.addInstruction(Opcode.ICONST_0);
		method.addInstruction(Opcode.GOTO, new ShortOperand((short)4));
		method.restoreFullStackState(branchState);
		method.placeLabel(branchState);
		method.addInstruction(Opcode.ICONST_1);
		StackState lastState = method.captureStackState();
		method.placeLabel(lastState);
		if(flags.toPrimitive())
			return new ResultInfo(boolean.class);
		else
			return CompilerUtils.booleanToBoolean(method);
	}

	public static BiFunction<IValue, IValue, Integer> getValuesComparator(boolean descending) {
		return descending ? 
				((k1, k2) -> IValue.compareValues(k2, k1)) :
				((k1, k2) -> IValue.compareValues(k1, k2));
	}
	
}
