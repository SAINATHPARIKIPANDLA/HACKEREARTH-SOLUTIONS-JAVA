import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int no_photos=sc.nextInt();
        int w,h;
        for(int i=0;i<no_photos;i++)
        {
            w=sc.nextInt();
            h=sc.nextInt();
            if(w<l || h<l)
            {
                System.out.println("UPLOAD ANOTHER");
            }
            if(w>=l && h>=l)
            {
                if(w==h || (w<l && h<l))
                {
                System.out.println("ACCEPTED");
                }
                else
                {
                      System.out.println("CROP IT"); 
                }
            }
           
        }
        
    }
}
