import java.util.Scanner;

/**
 * Created by jc431075 on 1/09/17.
 */
public class CategorizeStrings
{
    public static void main (String[] args)
    {
        int MAX = 10;
        final String QUIT = "hehe";
        String userInput;
        int theOneWord = 0;
        int theTwoWord = 0;
        int theThreeWord = 0;
        int spaces;
        Scanner input = new Scanner(System.in);
        String[] oneWord = new String[MAX];
        String[] twoWords = new String[MAX];
        String[] threeWords = new String[MAX];

        System.out.print("Enter string plz " +
                QUIT + " to quit >> ");
        userInput = input.nextLine();
        while(!userInput.equals(QUIT) && (theOneWord + theTwoWord + theThreeWord < MAX))
        {
            spaces = 0;
            for(int x = 0; x < userInput.length(); ++x)
            {
                if(userInput.charAt(x) == ' ')
                    ++spaces;
            }
            if(spaces == 0)
            {
                oneWord[theOneWord] = userInput;
                ++theOneWord;
            }
            else
            if(spaces == 1)
            {
                twoWords[theTwoWord] = userInput;
                ++theTwoWord;
            }
            else
            {
                threeWords[theThreeWord] = userInput;
                ++theThreeWord;
            }
            if(theOneWord + theTwoWord + theThreeWord < MAX)
            {
                System.out.print("Enter string plz " +
                        QUIT + " to quit >> ");
                userInput = input.nextLine();
            }
        }
        System.out.println("\nDo you want to see the list of" +
                "\n    one-word strings," +
                " two-word strings, or longer strings?");
        System.out.print("   Please enter O, T, or L, or " +
                QUIT + " to quit >> ");
        userInput = input.nextLine();
        while(!userInput.equals(QUIT))
        {
            String letter = userInput.substring(0,1).toLowerCase();
            if(letter.equals("o"))
                display(oneWord, theOneWord, "one-word");
            else
            if(letter.equals("t"))
                display(twoWords, theTwoWord, "two-word");
            else
            if(letter.equals("l"))
                display(threeWords, theThreeWord, "longer");
            else
            {
                display(oneWord, theOneWord, "one-word");
                display(twoWords, theTwoWord, "two-word");
                display(threeWords, theThreeWord, "longer");
            }
            System.out.println("\nOne word, two word, or longer strings.");
            System.out.print("(O, T, or L, or) " +
                    QUIT + " to exit >> ");
            userInput = input.nextLine();
        }
    }
    public static void display(String[] array, int max, String msg)
    {
        System.out.println("\nList of " + msg + " strings:");
        if(max == 0)
            System.out.println("Nothin in the list dood");
        else
            for(int x = 0; x < max; ++x)
                System.out.println(array[x]);
    }
}
