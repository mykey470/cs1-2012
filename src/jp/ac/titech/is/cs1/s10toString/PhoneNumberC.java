package jp.ac.titech.is.cs1.s10toString;

import jp.ac.titech.is.cs1.s09hashcode.PhoneNumber;

/**
 * @author wakita
 * PhoneNumberB の出力の問題を改善した例．
 * printf はとても便利です。みんな学びましょう。
 */
class PhoneNumberC implements PhoneNumber {
    private final int areaCode, prefix, number;

    public PhoneNumberC(int a, int p, int n) {
        areaCode = a;
        prefix = p;
        number = n;
    }
    
    public String toString() {
        return String.format("(%02d)%04d-%04d", areaCode, prefix, number);
    }
}
