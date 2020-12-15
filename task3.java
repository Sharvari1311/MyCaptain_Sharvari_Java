import java.util.Scanner;
public class task3 {

    public static void main() {
        int my = 60 * 24 * 365;
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        int min = input.nextInt();
        long years =(min / my);
        int days =(min / 60 / 24) % 365;
        System.out.println(min + " minutes is approximately " + years + " years and " + days + " days");
    }
}