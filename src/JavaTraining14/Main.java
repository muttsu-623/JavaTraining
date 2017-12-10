package JavaTraining14;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws Exception {
        // 本日の日付を表示する.
        Date today = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(today);
        int d = c.get(Calendar.DATE);
        d += 100;
        c.set(Calendar.DATE, d);
        Date nextDay = c.getTime();
        SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
        String s = f.format(nextDay);
        System.out.println("今日の100日後は、" + s + "です。");
    }
}
