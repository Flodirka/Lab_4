import java.util.Scanner;
public class Z_11
{
    public static boolean palindrome(String s)
     {
         int palindrome = 0; //считает кол-во раз, когда 2 цифры в числе стоят зеркально
         int size = s.length(); //кол-во цифр в строке

         if (size==1) return true;
         for (int i=0;i<size/2;i++)
         {
             if(s.charAt(i)==s.charAt(size-1-i))
                 palindrome++;
         }
         if (palindrome==size/2) return true;
         return false;
     }

    public static void main(String[] args)
    {
        Scanner scann = new Scanner(System.in);

        System.out.println("Введите размерность: ");
        int size = scann.nextInt();

        System.out.println("Введите элементы массива: ");
        String[] mass = new String[size];

        for(int i=0;i<size;i++) mass[i] = scann.next();

        System.out.println("Числа палиндромы: ");
        for(String s : mass)
        {
            if (palindrome(s)) System.out.print(s+", ");
        }

        System.out.println();
    }
}
