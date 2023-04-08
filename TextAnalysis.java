/*
Text Analysis: Have the user enter a short paragraph. You may assume that they will
not overflow the String and that they will use proper punctuation (one space after a
period, or a comma). You may also assume they will use no other special characters.
Once they enter the data, your program should report the following things:

 - The total number of non-whitespace characters in the paragraph.
 - The total number of words in the paragraph.
 - The average number of words per sentence.
 - The average word length.
The program should finish by printing each sentence in the
 */
import java.util.*;


public class TextAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a paragraph: ");
        String paragraph = scanner.nextLine();
        
        int numCharacters = paragraph.replaceAll("\\s", "").length();
        int numWords = paragraph.split("\\s+").length;
        int numSentences = paragraph.split("[.?!]").length;
        double avgWordsPerSentence = (double) numWords / numSentences;
        double avgWordLength = (double) numCharacters / numWords;
        
        System.out.println("Total number of non-whitespace characters: " + numCharacters);
        System.out.println("Total number of words: " + numWords);
        System.out.println("Average number of words per sentence: " + avgWordsPerSentence);
        System.out.println("Average word length: " + avgWordLength);
        
        String[] sentences = paragraph.split("[.?!]");
        System.out.println("Sentences:");
        for (String sentence : sentences) {
            System.out.println(sentence.trim());
        }
    }
}

