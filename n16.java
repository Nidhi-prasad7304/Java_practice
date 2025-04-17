import java.util.*;
class n16
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n,f;
        System.out.println("Enter any no");
        n=input.nextInt();
        f=fact(n);
        System.out.println("Factorial of "+n+" is "+f);
    }
    static int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}