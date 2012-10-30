package jp.ac.titech.is.cs1.lecture03;

public class ComparatorBug {
	public int compare1(Integer x1, Integer x2) {
		int n1 = x1, n2 = x2;
		return n1 < n2 ? -1 : n1 == n2 ? 0 : 1;
	}
	
	public int compare2(Integer x1, Integer x2) {
		return x1 < x2 ? -1 : x1 == x2 ? 0 : 1;
	}
	
	private void run() {
		Integer two = 2;
		for (Integer i = 1; i <= 3; i++) {
			Integer n = new Integer(i);
			System.out.printf("compare1(2, %d) -> %d\n", n, compare1(two, n));
			System.out.printf("compare2(2, %d) -> %d\n", n, compare2(two, n));
		}
	}
	
	public static void main(String[] _) {
		new ComparatorBug().run();
	}
}

