import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		StringProcessor processor = new StringProcessor();

		String textToProcess = processor.readInputText();
		int number = processor.readInputInt();
		String processedString = processor.processText(textToProcess, number);
		processor.showResult(processedString);
	}
}
