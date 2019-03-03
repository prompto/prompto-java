package prompto.type;

import java.lang.reflect.Type;
import java.util.Comparator;
import java.util.Map;

import prompto.expression.IExpression;
import prompto.grammar.CmpOp;
import prompto.intrinsic.PromptoVersion;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.value.IValue;
import prompto.value.VersionValue;

import com.fasterxml.jackson.databind.JsonNode;


public class VersionType extends NativeType {

	static VersionType instance = new VersionType();

	public static VersionType instance() {
		return instance;
	}

	private VersionType() {
		super(Family.VERSION);
	}

	@Override
	public Type getJavaType(Context context) {
		return PromptoVersion.class;
	}
	
	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return super.isAssignableFrom(context, other) ||
				other==VersionType.instance();
	}

	@Override
	public IValue convertJavaValueToIValue(Context context, Object value) {
        if (value instanceof PromptoVersion)
            return new VersionValue((PromptoVersion)value);
        else
            return super.convertJavaValueToIValue(context, value);
	}
	
	@Override
	public IType checkCompare(Context context, IType other, ISection section) {
		if (other instanceof VersionType)
			return BooleanType.instance();
		return super.checkCompare(context, other, section);
	}

	@Override
	public Comparator<VersionValue> getComparator(boolean descending) {
		return descending ?
				new Comparator<VersionValue>() {
					@Override
					public int compare(VersionValue o1, VersionValue o2) {
						return o2.getStorableData().compareTo(o1.getStorableData());
					}
				} :
				new Comparator<VersionValue>() {
					@Override
					public int compare(VersionValue o1, VersionValue o2) {
						return o1.getStorableData().compareTo(o2.getStorableData());
					}
		};
	}

	@Override
	public String toString(Object value) {
		return "'" + value.toString() + "'";
	}
	
	@Override
	public IValue readJSONValue(Context context, JsonNode value, Map<String, byte[]> parts) {
		PromptoVersion version = PromptoVersion.parse(value.asText());
		return new VersionValue(version);
	}
	
	@Override
	public void declareCompare(Transpiler transpiler, IType other) {
		// nothing to do
	}
	
	@Override
	public void transpileCompare(Transpiler transpiler, IType other, CmpOp operator, IExpression left, IExpression right) {
	    left.transpile(transpiler);
	    transpiler.append(".");
	    operator.transpile(transpiler);
	    transpiler.append("(");
	    right.transpile(transpiler);
	    transpiler.append(")");
	}
}
