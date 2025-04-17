import java.util.*;
class n15
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int num,n,dn=0,a=1,d;
        System.out.println("Enter binary no");
        num=input.nextInt();
        n=num;
        while(n>0)
        {
            d=n%10;
            dn=dn+d*a;
            a=a*2;
            n=n/10;
        }
        System.out.println("Decimal no:"+dn);
    }
}