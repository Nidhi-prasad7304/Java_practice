import java.util.*;
class n8
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int i,n,p=1, s=0;
        System.out.println("Enter any no");
        n=input.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
        if(s==n)
        {
            System.out.println("No is perfect");
        }
        else{
            System.out.println("No is not perfect");
        }
    }
}