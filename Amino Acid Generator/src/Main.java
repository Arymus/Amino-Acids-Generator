import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Stack;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creates a scanner object to scan user input
        
        // Instructions
        System.out.println("Amino Acids Generator");
        System.out.println("Enter 3 letters: either a T, A, G, or C.");

        String dna = scanner.nextLine(); // Assigns the user's input to a variable
        scanner.close(); // Close the scanner to prevent memory leaks
        String[] dnaArray = dna.split(""); // Split the user input at each character and makes an array

        String regex = "[tgac]"; // Defines the letters t, g, a, and c
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); // Finds t, g, a, or c and ignores the case
        Matcher matcher = pattern.matcher(dna); // Scans user input for t, g, a, or c
        boolean matchFound = matcher.find(); // Returns true if found, false if not found

        String rna = null; // Defines the rna string to reference in the if-statement
        ArrayList<String> rnaList = new ArrayList<>(); // Creates an array we can add items to
        // ^ Defines the list of rna early to reference in the if-statement


        if (matchFound) {
            for (String nucleotide : dnaArray) {
                rna = nucleotide.replaceAll("t", "A")
                .replaceAll("g", "C")
                .replaceAll("a", "U")
                .replaceAll("c", "G"); // Chaining .replaceAll keeps the result of all replaced letters
                rnaList.add(rna); // Add each replaced letter to the list of rna
            }
        } else {
            System.out.println("Please input a T, G, A, or C.");
        };


        String[] rnaArray = rnaList.toArray(new String[0]); // Converts the rnaList to a printable array
        System.out.println("Your RNA: " + rnaArray[0] + rnaArray[1] + rnaArray[2]); // Print the 3 letters in the array
    }
}
