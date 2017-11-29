package JavaTraining5.Training5_2;

public class Main {
    public static void email(String title, String address, String text) {
        System.out.println("「" + address + "」に以下のメールを送信しました。");
        System.out.println("件名：【" + title + "】");
        System.out.println("本文：" + text);
    }
    public static void main(String[] args) {
        System.out.println("宛先を入力してください。");
        String address = new java.util.Scanner(System.in).nextLine();
        System.out.println("件名を入力してください。");
        String title = new java.util.Scanner(System.in).nextLine();
        System.out.println("本文を入力してください。");
        String text = new java.util.Scanner(System.in).nextLine();
        email(title, address, text);
    }
}
