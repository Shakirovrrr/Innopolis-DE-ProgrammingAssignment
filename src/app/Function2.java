package app;

/**
 * 2-argument function interface.
 *
 * @param <T1> 1st argument type.
 * @param <T2> 2nd argument type.
 * @param <R>  Result type.
 */
public interface Function2<T1, T2, R> {
	/**
	 * Function body.
	 *
	 * @param x 1st argument.
	 * @param y 2nd argument.
	 * @return Result.
	 */
	R f(T1 x, T2 y);
}
