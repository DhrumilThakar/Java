package harmonics;
import harmonics.Harmonic;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Harmonic series: ");
        int numberOfTerms = userInput.nextInt();

        // Create an object of the Harmonic class
        Harmonic harmonicCalculator = new Harmonic();

        // Calculate the harmonic series sum
        double harmonicSeriesSum = harmonicCalculator.calculateHarmonicSeries(numberOfTerms);

        System.out.printf("The Harmonic series sum of %d terms is: %.5f%n", numberOfTerms, harmonicSeriesSum);
        
        userInput.close();
    }
}