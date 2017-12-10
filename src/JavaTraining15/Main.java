package JavaTraining15;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch(NullPointerException n) {
            System.out.println("NullPointerException 例外を catch しました");
            System.out.println("--スタックトレース(ここから)--");
            n.printStackTrace();
            System.out.println("--スタックトレース(ここまで)--");
        }
    }
}
