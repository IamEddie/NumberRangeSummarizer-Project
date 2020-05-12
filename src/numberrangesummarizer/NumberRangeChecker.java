package numberrangesummarizer;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*; 
import java.util.Iterator;

/**
 *
 * @author edmore
 */
public class  NumberRangeChecker implements NumberRangeSummarizer {

   //collect the input
   @Override
   public Collection<Integer> collect(String input)
   {
        String [] stringArray = input.split(","); 
        int [] intArray = Stream.of(stringArray).mapToInt(Integer::parseInt).toArray(); // using functional programming
        List<Integer> intList = new ArrayList<Integer>();
        for (int index = 0; index < intArray.length; index++)
        {
            intList.add(intArray[index]);
        }
       return intList;
   }

   //get the summarized string
   @Override
   public String summarizeCollection(Collection<Integer> input)
   {
        ArrayList<String> summary = new ArrayList<String>(); 
       
        ArrayList<Integer> sequence = new ArrayList<Integer>();

        Integer previous = 0;
        for (Iterator<Integer> iterator = input.iterator(); iterator.hasNext();) 
        {
            Integer current = iterator.next();
            
            if (previous != 0 && previous + 1 == current)     
            {
                if (!sequence.contains(previous)) sequence.add(previous);  
                if (!sequence.contains(current)) sequence.add(current);
            } 
            else 
            {
                if (sequence.size() > 1) 
                {  

                    if (summary.contains(sequence.get(0).toString()))
                        summary.remove(sequence.get(0).toString());  
                    
                   summary.add(sequence.get(0) + "-" + sequence.get(sequence.size() - 1));
                } 
    
                if (!sequence.contains(current)) summary.add(current.toString());
                
                sequence = new ArrayList<Integer>();
         
            }   
            previous = current;        
        }   
             
        return Arrays.toString(summary.toArray());
   }
}