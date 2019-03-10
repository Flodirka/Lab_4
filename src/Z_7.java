import java.util.Scanner;
public class Z_7
{
    public static void main(String[] args)
    {
        int n;
        Scanner s = new Scanner (System.in);
        System.out.println("Введите число: ");
        n = s.nextInt();
        System.out.println("Шестнадцатеричное представление числа: "+Integer.toHexString(n));
        System.out.println("Двоичное представление числа: "+Integer.toBinaryString(n));
        System.out.println("Восьмеричное представление числа: "+Integer.toOctalString(n));
    }
}
