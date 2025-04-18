import java.util.*;
class n17
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Enter any no");
        n=input.nextInt();
        disp(n,-1,1);
    }
    static void disp(int n,int a,int b)
    {
        int c;
        if(n>0)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            disp(n-1,a,b);
        }
    }
}