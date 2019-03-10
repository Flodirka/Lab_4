import java.util.Scanner;
public class Z_8
{
    public static void main(String[] args)
    {
        int n;
        Scanner s = new Scanner (System.in);

        System.out.print("Введите число");

        System.out.println();

        n = s.nextInt();

        if(n<0||n>9)
        {
            System.out.print("Error");
        }
        else
        {
            switch (n)
            {
                case 0: System.out.print("ноль");
                break;
                case 1: System.out.print("один");
                break;
                case 2: System.out.print("два");
                break;
                case 3: System.out.print("три");
                break;
                case 4: System.out.print("четыре");
                break;
                case 5: System.out.print("пять");
                break;
                case 6: System.out.print("шесть");
                break;
                case 7: System.out.print("семь");
                break;
                case 8: System.out.print("восемь");
                break;
                case 9: System.out.print("девять");
                break;
            }
        }
    }
}
