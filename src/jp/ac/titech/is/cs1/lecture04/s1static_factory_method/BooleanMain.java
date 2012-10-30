package jp.ac.titech.is.cs1.lecture04.s1static_factory_method;

public class BooleanMain {
	Boolean[] bools = null;
	Runtime r = Runtime.getRuntime();
	long space, time;

	private void at_start(String testname) {
		System.out.printf("%s: ", testname);
		bools = new Boolean[1 << 20];
		time = System.currentTimeMillis();
		System.gc();
		space = r.freeMemory();
	}

	private void at_stop() {
		long m = space - r.freeMemory();
		long t = System.currentTimeMillis() - time;
		System.out.printf("計算時間 - %4dms, メモリ使用量 - %8dB\n", t, m);
	}

	private void test1() {
		at_start("[New]");
		for (int i = 0; i < bools.length; i++)
			bools[i] = new Boolean(i % 2 == 0);
		at_stop();
	}

	private void test2() {
		at_start("[Static factory method]");
		for (int i = 0; i < bools.length; i++)
			bools[i] = Boolean.valueOf(i % 2 == 0);
		at_stop();
	}

	private void run() {
		/*
		 * 以下のループは一見無駄に見えるかもしれない。しかし、
		 * Java でのプログラムの実行は Just-in-time compilation （
		 * 実行時最適化) の影響で、徐々に高速化する。この影響を観察するために Java 
		 * でベンチマークするときは、同じテストを数回繰り返すべきである。
		 */
		for (int i = 1; i < 5; i++) {
			test1();
			test2();
		}
	}

	public static void main(String[] _) {
		new BooleanMain().run();
	}
}
