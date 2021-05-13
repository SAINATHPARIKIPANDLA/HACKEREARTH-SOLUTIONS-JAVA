import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       int length=sc.nextInt();
       int pages=sc.nextInt();
       if(length<=23 && pages>=500 && pages<=1000)
       {
           System.out.println("Take Medicine");
       }
       else
       {
           System.out.println("Don't take Medicine");
       }

    }
}
