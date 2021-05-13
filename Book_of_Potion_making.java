import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        try
        {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int rem;
        int count=0;
        int i=10;
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem*i;
            n=n/10;
            count++;
            i--;
        }
         if(sum%11==0)
         {
           System.out.print("Legal ISBN");   
         }
         else
        {
        System.out.print("Illegal ISBN");
        }
        }
        catch(Exception e)
        {
          System.out.print("Illegal ISBN");   
        }
        
        
       
    }
}
