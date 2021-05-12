import java.util.*;
class CountDivisors {
    public static void main(String args[] ) throws Exception {
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt(); 
       int n2=sc.nextInt(); 
        int div=sc.nextInt();
        int count=0; 
        for(int i=n1;i<=n2;i++)
        {
            if(i%div==0)
            {
                count++;
            }
           
        }
         System.out.println(count);

    }
}
