
import java.io.*;
import java.util.Scanner;
import java.util.regex.*;

public class StringProcessor {

	public int readInputInt() {

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter integer:");
			int s = scan.nextInt();
			return s;
		}
	}

	public String readInputText() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter Text \n");
			return br.readLine();
		} catch (IOException error) {
			System.out.println(error.getMessage());
			return null;
		}
	}

	public String processText(String inputText, int wordsAmount) {

		Pattern lastWordPattern = Pattern.compile("!");
		Matcher lastWordPatternMatcher = lastWordPattern.matcher(inputText);
		if (lastWordPatternMatcher.find()) {
			String[] words = inputText.split(" ");
			int size = words.length;
			if (size < wordsAmount) {
				inputText = "";
			}

		}
		return inputText;

	}

	public void showResult(String processedString) {
		System.out.println("Result: \n" + processedString);
	}
}