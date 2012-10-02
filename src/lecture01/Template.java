package lecture01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/* 典型的な Java のプログラムの書き方を復習するための例題
 * 特に main メソッドのコメントに注目して下さい．非常に重要な内容です．
 */

public class Template implements ActionListener {
	// クリック数を勘定するためのインスタンス変数の宣言
	private int n = 0;

	// ボタンがクリックされたときに呼び出されるメソッド．
	public void actionPerformed(ActionEvent e) {
		n++; // クリック数を増やし，
		System.out.println("クリック (" + n + ")"); // メッセージを出力している．
	}

	// 画面構成を記述するメソッド
	private void startGUI() {
		JFrame win = new JFrame("Hello Application"); // ウィンドウを作成し，（この時点ではまだ画面に表示されていない）
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ウィンドウの「閉じるボタン」が押されたときの挙動を定義し，
		{ // ウィンドウに "クリックしてみて" ボタンを配置
			JButton button = new JButton("クリックしてみて");
			button.addActionListener(this);
			win.add(button);
		}
		win.pack(); // ウィンドウの大きさを適切に計算させる
		win.setVisible(true); // ウィンドウの準備ができたので画面に表示する．
	}

	// 主だった処理の内容は run メソッドに記述すること．
	private void run() {
		startGUI();
	}

	public static void main(String[] _) {
		/*
		 * Java の main メソッドのように static
		 * 宣言されているメソッドは特殊な性質を持っていて使い方が制約されます．そのため，不慣れなプログラマが無理に main
		 * メソッドに多くのコードを記述するとさまざまな問題に出会います ．
		 * このため計算機科学第一では，mainメソッドの機能は，クラスのインスタンスを作成して，
		 * そのインスタンスのrunメソッドで主要な処理を記述することとしています．
		 * この小さな手間を惜しんで，変なエラーに悩まされることのないようにして下さい．
		 */
		new Template().run();
	}
}
