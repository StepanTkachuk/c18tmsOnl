package result2;

import result1.TextFormatter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    private static final String INPUT_FILE = "Lesson15/src/main/java/result2/input2.txt";
    private static final String OUTPUT_FILE = "Lesson15/src/main/java/result2/output2.txt";

    public static void main(String[] args) throws IOException {
        String text = Files.readString(Path.of(INPUT_FILE));

        List<String> sentences = TextFormatter.getSentencesFromText(text);
        List<String> filteredSentences = new ArrayList<>();
        for (String sentence : sentences) {
            int numberOfWords = TextFormatter.getCountWordsInString(sentence);
            if (numberOfWords >= 3 && numberOfWords <= 5 || TextFormatter.hasPalindromeInString(sentence)) {
                filteredSentences.add(sentence);
            }
        }

        Files.write(Path.of(OUTPUT_FILE), filteredSentences);
    }
}
