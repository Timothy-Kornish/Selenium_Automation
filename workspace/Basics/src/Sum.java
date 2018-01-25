
public class Sum {

	public static void main(String[] args) {
		int a[] = {2, 5, 6, 7, 4};
		
		System.out.println(sum(a));
	}
	
	public static int sum(int[] a) {
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
		return total;
	}
}
