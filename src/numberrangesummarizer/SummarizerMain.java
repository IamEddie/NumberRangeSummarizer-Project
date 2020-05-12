package numberrangesummarizer;

import java.util.Collection;

/**
 *
 * @author edmore
 * 
 */
public class SummarizerMain {

    public static void main(String[] args) {     

        String inputNumbers = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
        System.out.println("Input: " + inputNumbers);

        NumberRangeChecker summarizer = new NumberRangeChecker();
        
        Collection<Integer> data = summarizer.collect(inputNumbers);
        String summarizedString = summarizer.summarizeCollection(data);
        System.out.println("Result: " + summarizedString);
    }

    static void main(String args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}