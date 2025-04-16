import java.util.*;
class n11
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n,num,rev=0,d;
        System.out.println("Enter any no");
        num=input.nextInt();
        n=num;
        while(n>0)
        {
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        System.out.println("Reverse no :"+rev);
        if(rev==num)
        {
            System.out.println("No is palindrome");
        }
        else{
            System.out.println("No is not palindrome");
        }
    }
}