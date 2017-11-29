package JavaTraining5.JavaTraining5_10;

public class Main {
    // 1つ目のaddメソッド
    public static int add(int x, int y) {
        return x + y;
    }

    // 2つ目のaddメソッド
    public static double add(double x, double y) {
        return x + y;
    }

    // 3つ目のaddメソッド
    public static String add(String x, String y) {
        return x + y;
    }

    // mainメソッド
    public static void main(String[] args) {
        System.out.println("1つ目のaddメソッド");
        System.out.println(add(10, 20));
        System.out.println("2つ目のaddメソッド");
        System.out.println(add(5.6, 4.4));
        System.out.println("3つ目のaddメソッド");
        System.out.println(add("Hello ", "World"));
    }
}
