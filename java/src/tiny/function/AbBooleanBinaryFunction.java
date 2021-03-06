package tiny.function;

public abstract class AbBooleanBinaryFunction<First, Second> extends
		AbBinaryFunction<First, Second, Boolean> implements
		BooleanBinaryFunction<First, Second> {
	@Override
	public Boolean evaluate(First first, Second second) throws Exception {
		return Boolean.valueOf(this.evaluateBoolean(first, second));
	}
}
