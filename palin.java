
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner sc=new Scanner(System.in);
      String name=sc.next();
      String palin="";
      int j=name.length();
    for(int i=j-1;i>=0;i--)
    {
        palin=palin+name.charAt(i);
    }
    if(palin.equals(name))
    {
        System.out.println("YES");
    }
    else
    {
        System.out.println("NO");
    }


    }
}
