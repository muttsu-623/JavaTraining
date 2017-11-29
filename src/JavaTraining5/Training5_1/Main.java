package JavaTraining5.Training5_1;

public class Main {
    // 自己紹介用の関数
    public static void introduceOneself() {
        String name = "佐藤夢積";
        int age = 21;
        double height = 171.0;
        char gender = '男';
        System.out.println("こんにちは、私は" + name + "です。");
        System.out.println("年齢は、" + age + "歳です。");
        System.out.println("身長は、" + height + "cmです。");
        System.out.println("性別は、" + gender + "です。");
    }
    public static void main(String[] args) {
        introduceOneself();
    }
}
