import java.util.*;
class zoo {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int count_x=0;
        int sum=0;
        String name=sc.next();
        for(int i=0;i<name.length();i++)
        {

            if(name.charAt(i)=='z')
            {
                count_x++;
            }
            else
            {
                break;
            }

        }
        if(name.substring(count_x).length()==2*count_x)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
