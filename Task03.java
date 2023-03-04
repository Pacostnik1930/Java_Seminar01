import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        System.out.println("Введите значение массива :");
        int[] numbs = new int[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbs.length; i++) {

            numbs[i] = sc.nextInt();
        }
        int val = 3;
        int a = numbs.length - 1;
        for (int i = 0; i < numbs.length / 2; i++) {
            if(numbs[i] == numbs[a]){
                a --;
            }
            int c = numbs[i];
            numbs[i] = numbs[a];
            numbs[a] = c;
            
        }
        a -= 1;
    System.out.println(Arrays.toString(numbs));

    }
}