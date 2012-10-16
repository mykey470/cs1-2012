package lecture02;

import static java.lang.System.out;

public class RightMostBit {
	
	long rightMostBit1(long bits) {
		for (long bit = 1; bit > 0; bit <<= 1)
			if ((bits & bit) == 0) return bit;
		return 0L;
	}

	/**
	 *  引数[bits]のビット列のなかで最右の1ビットの位置のみを1とする値を返す。
	 *  (e.g., 10100111 => 00001000)
	 *  ただし、該当するビットがなければ0を返す。
	 *  
	 * @param bits 任意の long 値
	 * @return bits のなかで最右の1ビットの位置のみを1とする値
	 */
	final long rightMostBit2(long bits) {
		return ~bits & (bits + 1);
	}
	
	private void run() {
		for (long x = 0; x <= 16L; x++) {
			out.printf("%2d: %2d, %2d\n", x,
					this.rightMostBit1(x),
					~x & (x + 1),
					this.rightMostBit2(x));
		}
	}
	
	public static void main(String[] _) {
		new RightMostBit().run();
	}
}
