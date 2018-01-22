/**
 * A program to allow students to try out different String methods.
 * 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer {

	public static void main(String[] args) {
		String sample = "The quick brown fox jumped over the lazy dog.";

		// Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println("sample.indexOf(\"quick\") = " + position);

		// Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println("sample.toLowerCase() = " + lowerCase);
		System.out.println("After toLowerCase(), sample = " + sample);

		// Try other methods here:

		int notFoundPsn = sample.indexOf("slow");
		System.out.println("Index not found: " + notFoundPsn);

		System.out.println("We will now demonstrate the difference between indexOf with one parameter vs two");
		int regularIndexOf = sample.indexOf("o");
		int twoParamIndexOf = sample.indexOf("o", 14);
		System.out.println("sample.indexOf(\"o\") = " + regularIndexOf);
		System.out.println("sample.indexOf(\"o\", 14) = " + twoParamIndexOf);
		System.out.println("It will ignore any instances before the starting index, meaning the first one uses the o in 'brown' while the second uses the o in 'over'");
	}

}
