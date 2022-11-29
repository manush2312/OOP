import java.util.Scanner;
class ISBN
{
    public static void main(String args[])
    {
    int n= Integer.parseInt(args[0]);
    Scanner sc= new Scanner(System.in);

        int temp,r,count=0;
        int sum=0;
        temp=n;
        while(n>0)
        {
            n=n/10;
            count++;
            if(count<10)
            System.out.println("The number should of 10 digits");
        }
        while(temp>0)
        {
            r=temp%10;
            for(int i=10;i>=1;i--)
            {
                sum+=r*i;
            }
            System.out.println("The full ISBN number is: "+args[0]);
            temp/=10;
            if(sum%11==0)
            {
                System.out.println("the number is ISBN");
            }
            else
            System.out.println("Illegal ISBN");
        }
    }
}