import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        System.out.println("Введите значение массива :");
        int[] numbs = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbs.length; i++) {

            numbs[i] = sc.nextInt();
        }
        int count = 0;
        int max = 0;
        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] == 1) {
                count++;
                if (max < count) {
                    max = count;
                } else {
                    count = 0;
                }
            }
        }
        System.out.println(Arrays.toString(numbs));
        System.out.println(max);
    }

}
