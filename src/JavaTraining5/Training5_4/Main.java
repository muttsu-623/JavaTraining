package JavaTraining5.Training5_4;

public class Main {
    // 三角形の面積を求めるメソッド
    public static double calcTriangleArea(double bottom, double height) {
        return bottom * height / 2;
    }

    // 円の面積を求めるメソッド
    public static double calcCircleArea(double radius) {
        return radius * radius * 3.14;
    }


    public static void main(String[] args) {
        System.out.println("三角形の面積を求めます. 底辺の長さ, 高さの順に入力してください.");
        double bottom = new java.util.Scanner(System.in).nextDouble();
        double height = new java.util.Scanner(System.in).nextDouble();
        System.out.println("三角形の面積は," + calcTriangleArea(bottom, height) + "cmです.");
        System.out.println("次に, 円の面積を求めます. 円の半径を入力してください.");
        double radius = new java.util.Scanner(System.in).nextDouble();
        System.out.println("円の面積は," + calcCircleArea(radius) + "です.");
    }
}
