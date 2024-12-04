import java.util.Scanner;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;




public class Main {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws fileNotFoundException {
        f = new File("words.txt");

        int twoLetter = twoLetterWords();
    }

    public static int twoLetterWords() throws fileNotFoundException {
        int count = 0;
        s = new Scanner(f);
        while (s.hasNext()){
            if (s.nextLine().length() == 2){
                count ++;
            }
        }
    }
}
