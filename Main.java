import java.util.Scanner;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;




public class Main {
    private static File f;
    private static Scanner s;

    public static void main(String[] args) throws FileNotFoundException {
        f = new File("words.txt");

        int twoLetter = twoLetterWords();
        int longestWords = longestWords();
        int numOfPalindromes = numOfPalindromes();

        System.out.println(twoLetter);
        System.out.println(longestWords);
        System.out.println(numOfPalindromes);
        s.close();
    }

    public static int twoLetterWords() throws FileNotFoundException {
        int count = 0;
        s = new Scanner(f);
        while (s.hasNext()) {
            if (s.nextLine().length() == 2) {
                count++;
            }
        }
        return count;
    }


    public static int longestWords() throws FileNotFoundException {
        int maxLength = 0;
        int repeats = 0;
        String targetString;
        s = new Scanner(f);
        while (s.hasNext()) {
            targetString = s.nextLine();
            if (targetString.length() > maxLength) maxLength = s.nextLine().length();

        }
        s.close();
        s = new Scanner(f);
        while (s.hasNext()) {
            targetString = s.nextLine();
            if (targetString.length() == maxLength) repeats++;
        }
        return repeats;
    }

    public static int numOfPalindromes() throws FileNotFoundException {
        s = new Scanner(f);
        int palindromes = 0;

        String targetString;
        while (s.hasNext()) {
            targetString = s.nextLine();
            String reversedString = "";
            for (int i = targetString.length() - 1; i >= 0; i--) {
                reversedString += targetString.charAt(i);
            }
            if (reversedString.equals(targetString)) palindromes++;
        }
        return palindromes;

    }
//
//    int palindromes = 0;
//
//    String targetString;
//    while(s.hasNext())
//
//    {
//        targetString = s.nextLine();
//        String reversedString = new StringBuilder(targetString).reverse().toString();
//
//        if (reversedString.equals(targetString)) {
//            palindromes++;
//        }
//    }
//    return palindromes;
//}
//

}
