import java.util.Scanner;

public class main
{
   public static void main(String[]args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter your password: ");
       String newpassword = sc.nextLine();
       System.out.println("verify your password: ");
       String verify = sc.nextLine();
       
       if (newpassword.equals(verify))
       {
           System.out.println("password verified");
       }
       
       else
       {    
           System.out.println("password not verified");
       }
   }
}
