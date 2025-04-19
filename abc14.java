
class abc14
{
    static int countpalindrome()
    {
         int n,m,rev=0,c=0,i;
         for(i=101;i<=200;i++)
         {
           n=i;
           rev=0;
           while(n!=0)
           {
            m=n%10;
            rev=rev*10+m;
            n=n/10;
           }
           if(i==rev)
           {
            System.out.println(i+"");
            c++;
           }
         } 
        return c;
    }
    public static void main(String args[])
    {
        int r;
        r=countpalindrome();
     System.out.println("\n palindrome  no between 101 to 200:"+r);
    }
}