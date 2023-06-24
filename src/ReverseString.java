
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String runner;
        boolean run = true;
        while(run) {
            System.out.print("Enter a word you wish to reverse: ");
            Scanner sc = new Scanner(System.in);

            String r = reverse(sc.next());
            System.out.println(r);

            System.out.print("Would you wish to continue, Y/N: ");
            runner = sc.next();

            if (runner.equals("Y") | runner.equals("y")){
                run = true;
            } else if (runner.equals("N") | runner.equals("n")) {
                run = false;
            } else {
                System.out.print("You did not enter A valid letter, Y/N: ");
                runner = sc.next();
                if (runner.equals("Y") | runner.equals("y")){
                    run = true;
                } else if (runner.equals("N") | runner.equals("n")) {
                    run = false;
                }
            }
        }
    }

    public static  String reverse(String s){
        char[] letters = new char[s.length()];

        int letterIndex = 0;

        for (int i = s.length() - 1; i >= 0; i--){
            letters[letterIndex] = s.charAt(i);
            letterIndex++;
        }


        StringBuilder reverse = new StringBuilder();

        for (int i = 0; i < s.length(); i++){
            reverse.append(letters[i]);
        }
        return reverse.toString();
    }
}
