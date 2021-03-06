package tiny.function;

public abstract class AbBinaryFunction<First, Second, Target> extends
		AbFunction<Object[], Target> implements
		BinaryFunction<First, Second, Target> {
	@SuppressWarnings("unchecked")
	@Override
	public Target evaluate(Object[] source) throws Exception {
		return this.evaluate((First) source[0], (Second) source[1]);
	}
	@Override
	public Function<Second, Target> bindFirst(First value) {
		return new BindFirstFunction<First, Second, Target>(this, value);
	}
	@Override
	public Function<First, Target> bindSecond(Second value) {
		return new BindSecondFunction<First, Second, Target>(this, value);
	}
}
