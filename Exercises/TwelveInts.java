/**
 * Created by jc431075 on 1/09/17.
 */
public class TwelveInts
{
    public static void main (String args[])
    {
        int[] numbers = {18, 21, 43, 45, 65, 3, 56, 65, 23, 32, 43, 52};
        int i;
        for (i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + "  ");
        System.out.println();
        for (i = numbers.length - 1; i >= 0; i--)
            System.out.print("" + numbers[i] + "  ");
        System.out.println();
    }
}
