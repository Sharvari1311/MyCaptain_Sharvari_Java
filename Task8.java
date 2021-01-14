import java.util.Scanner;
public class fibonacci_series 
{
    public static void main(String[] args) 
    {
    	Scanner a = new Scanner(System.in);
    	int i=1,t1=0,t2=1,n;
    	System.out.println("Enter the number :");
    	n=a.nextInt();
        System.out.print("Fibonacci Series of First "+n+" terms: ");

        while (i<=n)
        {
            System.out.print(t1+" , ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            i++;
        }
    }
}
