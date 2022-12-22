/**
   Hold methods illustrating looping using FOR

   Contrary to good Javafication, this class is not a user-defined
   datatype. Rather, for pedagogic convenience, it is just a collection
   of methods aimed at learning to write FOR loops.
 */
public class ForLooper {

    /**
       stringify
       @return a string representation of "me",
               starting with "label",
               including the count of elements, followed by
               elements surrounded by vertical bars (|)
     */
    public static String stringify (
        String [] commandLine
      , String label
      ) {
        String result =   label
                        + " has "
                        + commandLine.length
                        +" elements: ";

        // a FOR loop to augment "result" with elements
        for (int i = 0; i < commandLine.length; i ++){
          result +=  " |" + commandLine[i] + "|,";
        }

        return result;
    }


    /**
       sumNnios
       @return the sum of the smallest "numToSum"
               Non-Negative Odd Integers (nnios)
     */
    public static int sumNnios( int numToSum) {
        int accum = 0;
        
        for (int i = 0; i < numToSum; i++){
          accum += 2*i + 1;
        }
        // stub that adds two nnois of interest
        // accum =   1                  // smallest nnoi
        //         + 2 * numToSum + 1   // largest nnoi to include
        //         ;
        
        return accum;
    }
}
