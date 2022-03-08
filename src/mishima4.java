import com.company.Main;
import java.util.Scanner;
public class mishima4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int [][]num= {{11,12,13,14},
                     {21,22,23,24},
                     {31,32,33,34},
                     {41,42,43,44}};
        for (int i = 0; i < num.length; i++)
        {
            if (i==i)
                System.out.printf(num[i][i]+" ");
        }
    }
}
