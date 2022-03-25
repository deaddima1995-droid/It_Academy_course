package classwork.lesson14;

public class Pair<R, L> {
	private final R right;
	private final L left;
	
	private Pair(R right, L left) {
		this.right = right;
		this.left = left;
	}
	
	public static<R, L> Pair <R, L> of(R right, L left) {
		return new Pair(right,left);
	}
	
}
