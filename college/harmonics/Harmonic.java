// File: Harmonic.java
package harmonics;

public class Harmonic {

    // Method to calculate the Harmonic series up to n terms
    public double calculateHarmonicSeries(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }
}
