import java.util.Scanner;
class InsufficientBalanceException  extends Exception  
{  
    public InsufficientBalanceException (String str)  
    {  
       super(str);  
    }  
}  
public class Main  
{  
    static void checkBalance (int amount) throws InsufficientBalanceException{    
       if(amount > 5000)
       {
        throw new InsufficientBalanceException("Insufficient balance  vvvvvvvv");    
    }  
       else {   
        System.out.println("Amount withdrawl");   
        }   
     }    
    public static void main(String args[])  
    {  
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter amount to be withdrawn");
        int N = inp.nextInt();
        try  
        { 
            checkBalance(N);  
        }  
        catch (InsufficientBalanceException ex)  
        {  
            System.out.println("Caught the exception");  
            System.out.println("Exception occured: " + ex);  
        }  
  
        System.out.println("rest of the code...");    
    }  
} 
