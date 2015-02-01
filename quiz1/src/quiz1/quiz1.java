package quiz1;
import java.util.Scanner;

public class quiz1
{
   public static void main(String[] args)
   {
	  Scanner keyboard = new Scanner(System.in);
     
      System.out.println("Enter your username");
      String username = keyboard.nextLine();
      System.out.println("Enter your password");
      String password = keyboard.nextLine();
     
      System.out.printf("Hello %s, ", username);
      System.out.println("Welcome to CSC200 class!");
      System.out.printf("Your password is %s", password);
     
    }
}