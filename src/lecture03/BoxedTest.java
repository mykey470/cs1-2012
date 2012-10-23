package lecture03;

public class BoxedTest {
	static int vi;
	private void test1() {
		System.out.printf("test1: vi %s 42\n", vi == 42 ? "==" : "!=");
	}
	
	static Integer i;
	private void test2() {
		System.out.printf("test1: i %s 42\n", i == 42 ? "==" : "!=");
	}
	
	private void run() { test1(); test2(); }
	
	public static void main(String[] _) {
		new BoxedTest().run();
	}
}

