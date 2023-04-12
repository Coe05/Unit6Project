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
public class TextAnalysis
{
    public static void main (String [] args) 
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a parapgraph: ");
        String paragraph = reader.nextLine(); 
        TextAnalysis(paragraph);
    }
    public static void TextAnalysis(String y)
    {
        int Spaces = 1; 
        int NonWhiteChar = 0;
        int NonWhiteNonPeriod = 0;
        for(int x = 0; x<y.length(); x++)
        {
            String q = y.substring(x,x+1); 
            if(q.equals(" "))
            {
                Spaces++; 
            }
            if(!q.equals(" "))  
            {
                NonWhiteChar++; 
            }
            if(!q.equals(" ") && !q.equals(".")) 
            {
                NonWhiteNonPeriod++; 
            }
        }
        int WordsSentence = 0; 
        for(int w = 0; w<y.length(); w++)
        {
            String q = y.substring(w,w+1); 
            if(q.equals(" ") )
            {
                WordsSentence++;
            }
            //Average = WordsSentence/Spaces;
        }
        //The total number of non-whitespace characters in the paragraph.
        System.out.println("The number non-whitespaces: " + NonWhiteChar );
        //The total number of words in the paragraph.
        System.out.println("The number words: " + Spaces );
        //The average number of words per sentence.
        System.out.println("The average number words per sentence: " + Spaces/NumberSentences(y)); 
        //The average word length.
        System.out.println("The average word length: " + (NonWhiteNonPeriod)/(Spaces));
        //Print each sentence
        PrintSentences(y); 
    }
    
    public static void PrintSentences(String y)
    {
        String period = ".";
        int start = 0;
        int end; 
        System.out.println("Each sentence printed out:"); 
        end = y.indexOf(period, start); 
        while (end != -1)
        {
            String sentence = y.substring(start, end);
            System.out.println(sentence); 
            start = end+1; 
            end = y.indexOf(period, start); 
            
        }
        String sentence = y.substring(start); 
        System.out.println(sentence); 
    }
    public static int NumberSentences(String y) 
    {
        String period = ".";
        int start = 0;
        int end; 
        int NumberSentences = 0; 
        System.out.println("Each sentence printed out:"); 
        end = y.indexOf(period, start); 
        while (end != -1)
        {
            String sentence = y.substring(start, end);
            start = end+1; 
            NumberSentences++;
            end = y.indexOf(period, start); 
        }
        String sentence = y.substring(start); 
        NumberSentences++; 
        //number of words 
        return NumberSentences;
    }
}
