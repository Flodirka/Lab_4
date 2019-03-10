import java.util.*;
public class Z_3 {
    public static void main (String[] args)
    {
        int n,i;
        Scanner s=new Scanner (System.in);
        n=s.nextInt();
        int [] a = new int [n];

        Random rnd = new Random();

        System.out.println();

        for(i=0;i<a.length;i++) // вводим числа в массив
        {
            a[i]=rnd.nextInt(50);
        }

        for (i=0;i<a.length; i++)
        {
            System.out.print(" " + a[i]);
        }

        System.out.println();
        System.out.print("Числа, которые делятся на 5 и 10:");

        for(i=0;i<a.length;i++)
        {
            if ((a[i]%5==0 || a[i]%10==0) && a[i]!=0)
            {
                System.out.print(" " + a[i]);
            }
        }
    }
}