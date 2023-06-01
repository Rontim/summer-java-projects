import java.util.ArrayList;

public class PrimeNumbers {
    public static void main(String[] args) {
        ArrayList <Integer> prime = findPrime(1, 100);
        System.out.println(prime + "\nLength: " + prime.size());
    }
    public static ArrayList<Integer> findPrime(int start, int End){
        ArrayList <Integer> prime = new ArrayList<Integer>();

        for (int i = start; i < End; i ++){
            int n = 2;
            boolean isPrime = true;
            while (n <= i/2) {
                if (i % n == 0){
                    isPrime = false;
                    break;
                }
                n++;
            }
            if (isPrime){
                prime.add(i);
            }

        }

        return prime;
    }
}
