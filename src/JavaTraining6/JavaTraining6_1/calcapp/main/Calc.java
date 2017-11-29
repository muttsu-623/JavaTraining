package JavaTraining6.JavaTraining6_1.calcapp.main;

public class Calc {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // 他のクラスのメソッドを呼ぶときは, クラス名.メソッド名() と記述する.
        int total = JavaTraining6.JavaTraining6_1.calcapp.logic.CalcLogic.tasu(a, b);
        int delta = JavaTraining6.JavaTraining6_1.calcapp.logic.CalcLogic.hiku(a, b);

        System.out.println("10 + 5 = "+ total);
        System.out.println("10 - 5 = "+ delta);
    }
}
