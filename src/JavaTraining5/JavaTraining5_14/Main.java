package JavaTraining5.JavaTraining5_14;

public class Main {
    // sizeの大きさの配列を作る関数
    public static int[] makeArray(int size) {
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
        }
        return newArray;
    }

    // sizeに4を代入し, 配列をアウトプットする.
    public static void main(String[] args) {
        int[] array = makeArray(4);
        for (int i: array) {
            System.out.println(i);
        }
    }
}
