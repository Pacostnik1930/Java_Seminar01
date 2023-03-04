import java.util.Scanner;

public class Task01{

    public static void main(String[] args) {
        
    

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя :");
        String name = iScanner.nextLine();
        System.out.println("Привет, " + name + "!");
        iScanner.close();
    }
}