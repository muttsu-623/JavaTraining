package JavaTraining3;

public class training3_3 {
    public static void main(String[] args){
        int seibetsu = new java.util.Random().nextInt(2);
        int age = 21;
        System.out.print("こんにちは、");
        if (seibetsu == 0) {
            System.out.print("私は男です。");
        } else {
            System.out.print("私は女です。");
        }
    }
}
