import java.util.Scanner;
public class Employee 
{
     int yof;
     String name,salary;
     
     public void getInput() 
     {    
          Scanner in = new Scanner(System.in);
          System.out.print("Enter the name : ");
          name = in.next();
          System.out.print("Enter the year of joining : ");
          yof = in.nextInt();
          System.out.print("Enter the salary address: ");
          salary = in.next();
     }
     public void display() 
     {
          System.out.print(name+" " + yof+" "+ salary);
     }
     
     public static void main(String[] args) 
     {    
          Employee e[] = new Employee[3];
          
          for(int i=0; i<3; i++) 
          {
               e[i] = new Employee();
               e[i].getInput();
          }
          System.out.println(" Data Entered as below ");
          for(int i=0; i<3; i++) 
          {
               e[i].display();
          }
     }
}
