import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("Enter number of stars: ");
        Scanner scan = new Scanner(System.in);
        int numStars = scan.nextInt();

        for (int i = 0; i < numStars; i++){
            for (int j = 0; j < i; j++){
                System.out.print("x");
            }
            System.out.println();
        }

        for (int i = numStars - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                System.out.print("x");
            }
            System.out.println();
        }
    }
}


/*
x
xx
xxx
xxxx
xxxxx
xxxxx
xxxx
xxx
xx
x
*/