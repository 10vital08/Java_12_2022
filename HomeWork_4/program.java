package HomeWork_4;

import java.util.Scanner;

public class program {

    public static int FindCount(int a_, int b_) {
        int count = 1;
        int temp = 0;
        for (int i = a_; i <= b_; i++) {
            temp = i;

            while (b_ / temp >= 2) {
                count++;
                if (b_ + 1 / temp >= 2) {
                    count++;
                }
                temp *= 2;
            }
        }
        return count;
    }

    static int F(int a, int b) {
        // System.out.println(b);
        // new Scanner(System.in).nextLine();
        if (b == a)
            return 1;
        else if (b < a) {
            return 0;
        } else if (b % 2 != 0)
            return F(a, b - 1);
        else
            return F(a, b - 1) + F(a, b / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 2;
        int b = 1000;

        // int a = Integer.parseInt(sc.nextLine());
        // int b = Integer.parseInt(sc.nextLine());
        System.out.println(FindCount(a, b));
        // System.out.println(F(2, 13));

    }
}
