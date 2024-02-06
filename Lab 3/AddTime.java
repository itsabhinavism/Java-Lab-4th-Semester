import java.util.*;

class Time {
    private int hour;
    private int minute;
    private int second;

    Time(int h, int m, int s) {
        this.hour = h;
        this.minute = m;
        this.second = s;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    Time add(Time t) {
        int h = this.hour + t.hour;
        int m = this.minute + t.minute;
        int s = this.second + t.second;
        if (s >= 60) {
            s -= 60;
            m++;
        }
        if (m >= 60) {
            m -= 60;
            h++;
        }
        return new Time(h, m, s);
    }
}

public class AddTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first time (hour minute second):");
        Time t1 = new Time(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        System.out.println("Enter the second time (hour minute second):");
        Time t2 = new Time(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        Time t3 = t1.add(t2);

        System.out.println("Sum of t1 and t2 is: " + t3.getHour() + ":" + t3.getMinute() + ":" + t3.getSecond());
    }
}