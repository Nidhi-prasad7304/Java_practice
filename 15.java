import java.util.*;
class O
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int day;
        System.out.println("Enter days no:");
        day=input.nextInt();
        switch(day)
        {
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("wednesday");
            break;
            case 5:
            System.out.println("thusday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Saturday");
            break;
            default:
            System.out.println("Invalid input");
        }
    }
}