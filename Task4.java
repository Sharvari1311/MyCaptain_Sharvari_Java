import java.util.Scanner;
public class SwitchCase
{
    public static void main(String[] args)
    {
    System.out.println("Choose one \t\t 1.Hey \t\t 2.Hi \t\t 3.Hello");
    Scanner sc= new Scanner(System.in);
    int choice=sc.nextInt();
    switch(choice)
    {
        case 1: System.out.println("You said Hey!!!");
                 break;
        case 2 :System.out.println("You said Hi!!!");
                 break;
        case 3 :System.out.println("You said Hello!!!");
                 break;
        default: System.out.println("Unexpected value: " + choice);
    }
    }
}
