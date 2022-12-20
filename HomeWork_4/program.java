package HomeWork_4;

import java.util.Scanner;

public class program {

    public static int[] FillArray (int start, int x){
        int[] array = new int[x + 1];

        for (int i = 0; i < x + 1; i++) {
            array[i] = 0;
        }
        array[start] = 1;

        for (int i = start + 1; i < x + 1; i++) {
            array[i] = array[i - 1];

            if((i % 2 == 0) && (i / 2 >= start)){
                array[i] += array[i / 2];
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 20;
        int[] result = FillArray(a, b);
        System.out.println(result[b]);
    }
}
