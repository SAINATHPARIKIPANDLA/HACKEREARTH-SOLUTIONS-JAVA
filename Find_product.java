import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       long sum=1;
       int[] a=new int[n];
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
           sum=(sum*a[i]) % (1000000007);
       } 
       System.out.print(sum);

    }
}
