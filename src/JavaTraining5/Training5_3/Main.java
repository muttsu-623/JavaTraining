package JavaTraining5.Training5_3;

public class Main {

    // 引数が title, address, text のとき
    public static void email(String title, String address, String text) {
        System.out.println("「" + address + "」に以下のメールを送信しました。");
        System.out.println("件名：【" + title + "】");
        System.out.println("本文：" + text);
    }

    // 引数が address, text のとき
    public static void email(String address, String text) {
        System.out.println("「" + address + "」に以下のメールを送信しました。");
        System.out.println("件名：【無題】");
        System.out.println("本文：" + text);
    }

    public static void main(String[] args) {
        System.out.println("宛先を入力してください。");
        String address = new java.util.Scanner(System.in).nextLine();
        System.out.println("本文を入力してください。");
        String text = new java.util.Scanner(System.in).nextLine();
        email(address, text);
    }

}
