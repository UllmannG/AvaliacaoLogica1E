import java.util.Arrays;

public class Main {

    public static int[] generateFibonacciSequence(int n){
        int[] fibonacci = new int[n];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i =2; i < n; i++){
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i -2];
        }
        return fibonacci;
    }
    public static void main(String[] args) {
        int n = 6;
        int[] fibbonacciSequence = generateFibonacciSequence(n);
        System.out.println("Sequencia de Fibonnaci ("+ n +" elementos_: " + Arrays.toString(fibbonacciSequence));
    }
}