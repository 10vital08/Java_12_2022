// Написать программу, показывающую последовательность действий для игры
// “Ханойская башня”

package HomeWork_2;

import java.util.Scanner;

public class program {

    public static void Hannoy(int count, char disk_1, char disk_2, char disk_3) {
        if (count > 0) {
            Hannoy(count - 1, disk_1, disk_3, disk_2);
            System.out.println(disk_1 + " -> " + disk_2);
            Hannoy(count - 1, disk_3, disk_2, disk_1);
        }
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Задайте количество колец - ");
        int countCircle = Integer.parseInt(iScanner.nextLine());
        Hannoy(countCircle, 'A', 'B', 'C');
    }
}
