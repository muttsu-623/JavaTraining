package JavaTraining5.JavaTraining5_13;

public class Main {
    // int型配列を受け取り, 配列内の要素すべてに1を加えるメソッド.
    public static void incArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
    }

    // array配列に値を代入し, incArrayメソッドに代入し, アウトプットする.
    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        incArray(array);
        for (int i: array) {
            System.out.println(i);
        }
    }
}
