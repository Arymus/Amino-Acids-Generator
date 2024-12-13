import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Amino Acids Generator");
        System.out.println("Enter 3 letters: either a T, A, G, or C.");

        String dna = scanner.nextLine();
        dna = dna.toLowerCase();
        String[] dnaArray = dna.split(" ");

        String[] rnaArray = null;
        String rna = null;

        for (nucleotide : dnaArray) {
            if (nucleotide == "t") {
                rna = "a";
            }
        }
    }
}
