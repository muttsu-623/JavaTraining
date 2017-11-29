package JavaTraining5.JavaTraining5_3;
// main➡methodA➡methodBが呼び出される。

public class Main {
    public static void methodA() {
        System.out.println("methodAが呼び出されました。");
        methodB();
    }
    public static void methodB() {
        System.out.println("methodBが呼び出されました。");
    }
    public static void main(String[] args) {
        methodA();
    }
}
