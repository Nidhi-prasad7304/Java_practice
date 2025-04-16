import java.util.*;
class n4
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n,i;
        System.out.println("Enter any no");
        n=input.nextInt();
        for(i=1;i<=10;i++)
        {
            System.out.println(n+ "*" +i+"="+n*i);
        }
    }
}