## Item 4: Enforce noninstantiability with a private constructor

この節では、コンストラクタを private 宣言することによって、本来、new されることが想定されないクラスを誤って new してしまう間違いを抑制する方法が述べられています。

このテクニックの主な応用例は、static メソッド(関数)の定義を集めたユーティリティクラスです。この講義のなかでは **jp.ac.titech.is.cs1.lib.U" クラスがそれに該当しています。このクラスを眺めて、コンストラクタがprivate宣言されている様子を学んで下さい。
