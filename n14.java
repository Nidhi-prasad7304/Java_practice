import java.util.*;
class n14
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n,num,bn=0,d,a=1;
        System.out.println("Enter any no");
        num=input.nextInt();
        n=num;
        while(n>0)
        {
            d=n%2;
            bn=bn+d*a;
            a=a*10;
            n=n/2;
        }
        System.out.println("Binary no:"+bn);
    } 
}    