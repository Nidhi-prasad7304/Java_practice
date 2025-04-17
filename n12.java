import java.util.*;
class n12
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n,i=1,c=0;
        System.out.println("Enter any no");
        n=input.nextInt();
        while(i<n)
        {
            if(i*i==n)
            {
                c=1;
                break;
            }
            i++;
        }
        if(c==1)
        {
            System.out.println("No is perfect square no");
        }
        else{
            System.out.println("No is not perfect square no");
        }
    }
}