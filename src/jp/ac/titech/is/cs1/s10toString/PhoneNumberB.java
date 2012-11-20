package jp.ac.titech.is.cs1.s10toString;

import jp.ac.titech.is.cs1.s09hashcode.PhoneNumber;

/**
 * @author wakita
 * PhoneNumberA の出力結果があんまりなので，toString メソッドを追加してみた例．
 * 
 * 電話番号によっては，出力にやや問題がある．
 */
class PhoneNumberB implements PhoneNumber {
    private final int areaCode, prefix, number;

    public PhoneNumberB(int a, int p, int n) {
        areaCode = a;
        prefix = p;
        number = n;
    }

    public String toString() {
        return String.format("(%d)%d-%d", areaCode, prefix, number);
    }
}
