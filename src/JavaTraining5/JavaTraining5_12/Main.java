package JavaTraining5.JavaTraining5_12;

public class Main {
    // 配列をアウトプットする関数.
    public static void printArray(int[] array) {
        for (int element: array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4};
        printArray(array);
    }
}
