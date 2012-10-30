package jp.ac.titech.is.cs1.lecture01;
import java.util.*;

// Template.java の形式に沿って定義したソートプログラムの例

public class Sort {
  private void run() {
    int[] array = new int[1000];
    Random r = new Random();
    for (int i = 0; i < array.length; i++) array[i] = r.nextInt(1000);
    
    System.out.println(array[0]);
    Arrays.sort(array);
    System.out.println(array[0]);
  }
  
  public static void main(String[] _) {
    new Sort().run();
  }
}
