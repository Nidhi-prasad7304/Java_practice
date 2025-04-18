import java.util.*;
class n18
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int a,b;
        System.out.println("Enter any two no");
        a=input.nextInt();
        b=input.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Print swap value:"+a);
        System.out.println("Print swap value:"+b);
    }
}