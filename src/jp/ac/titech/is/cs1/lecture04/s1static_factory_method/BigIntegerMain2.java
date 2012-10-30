package jp.ac.titech.is.cs1.lecture04.s1static_factory_method;

import java.math.BigInteger;

public class BigIntegerMain2 {
	BigInteger[] bigints = null;

	Runtime r = Runtime.getRuntime();
	long space, time;

	private void at_start(String testname) {
		System.out.print(testname + ": ");
		bigints = new BigInteger[1 << 20];
		time = System.currentTimeMillis();
		System.gc();
		space = r.freeMemory();
	}

	private void at_stop() {
		long t = System.currentTimeMillis() - time;
		long m = space - r.freeMemory();
		System.out.printf("計算時間 - %5dms, メモリ使用量: %8dB\n", t, m);
	}

	private void test1(byte n) {
		at_start("[New]");
		byte[] bytes = new byte[] { (byte) n };
		for (int i = 0; i < bigints.length; i++)
			bigints[i] = new BigInteger(bytes);
		at_stop();
	}

	private void test2(byte n) {
		at_start("[Static factory method]");
		for (int i = 0; i < bigints.length; i++)
			bigints[i] = BigInteger.valueOf(n);
		at_stop();
	}

	private void run() {
		System.out
				.println("BitInteger の static factory method の性能を new と比較するテスト");
		for (int i = 0; i < 20; i++) {
			byte b = (byte) i;
			System.out.printf("b = %d\n", b);
			test1(b);
			test2(b);
			System.out.println();
		}
	}

	/*
	 * 考えてみよう 1. このプログラムを実行し，run メソッドの実行結果をよく観察しなさい． 特に b
	 * の値と計算速度やメモリの使用量の変化との関係を調査しなさい． BigInteger.valueOf メソッドの実装方法の工夫を推察しなさい．
	 * 
	 * 2. あなたが作っているソフトウェアのなかで，1024 を頻繁に BigInteger で表現する必要が出てきた． このため BigInteger
	 * の代わりに MyBigInt クラスを作ることとした．このクラスの valueOf の 実装はどうあるべきか．
	 */

	public static void main(String[] _) {
		new BigIntegerMain2().run();
	}
}