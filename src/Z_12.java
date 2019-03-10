import java.util.Scanner;
public class Z_12
{
    public static void main (String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите размерность треугольника паскаля: ");
        int n = s.nextInt();
        System.out.println();
        PascalTriangle(n);
    }

    public static void PascalTriangle (int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if (j==0 || j==i)
                {
                    System.out.print(" "+1+" ");
                }
                else System.out.print(" "+factorial(i,j)+" ");
            }
            System.out.println();
        }
    }

    public static int factorial(int n, int m)
    {
        long r1=1, r2=1;

        for(int i=n-(n-m)+1;i<=n;i++)
        {
            r1*=i;
        }

        for(int i=1;i<=n-m;i++)
        {
            r2*=i;
        }
        return (int) (r1/r2);
    }
}
