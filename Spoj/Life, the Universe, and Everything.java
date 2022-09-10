import java.util.Scanner;

class Life
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);

        while(true)
        {
            int ip=sc.nextInt();
            if(ip == 42) 
                break;
            System.out.println(ip);
        }
    }
}
