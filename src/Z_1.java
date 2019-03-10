import java.util.*;
public class Z_1
{
    public static void main (String[] args)
    {
        int n, i;
        Scanner s = new Scanner (System.in); //создаем новый сканер, для ввода с консоли
        n = s.nextInt();
        int [] a = new int [n];

        Random rnd = new Random(); // используем метод рандом для создания случайных чисел

        System.out.println();

        for(i=0;i<a.length;i++) // вводим числа в массив
        {
            a[i]=rnd.nextInt(50); //будут созданы числа до 50 целые
        }

        for (i=0;i<a.length; i++) //выводим полученный массив
        {
            System.out.print(" " + a[i]);
        }

        System.out.println();
        System.out.print("Четные числа: ");

        for(i=0;i<a.length;i++) //проверяем числа на четность
        {
            if (a[i]%2==0)
            {
                System.out.print(" " + a[i]);
            }
        }

        System.out.println();
        System.out.print("Нечетные числа: ");

        for(i=0;i<a.length;i++) //проверяем числа на нечетность
        {
            if (a[i]%2!=0)
            {
                System.out.print(" " + a[i]);
            }
        }
    }
}