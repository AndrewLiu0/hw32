/**
  Loop through Strings
  extract limited to indexOfSubstring
 */
public class StringLooper {

    public String source;

    /**
       indexOfSubstring
       @return the index of the first occurrence of
               "seek"  (which can have any number of characters)
               in "within"
               or -1 if "seek" does not occur in "within".
     */
    public static int indexOfSubstring( String seek, String within) {
        // iterate through every possible starting position in "within"
        int withinPos = 0;
        while( withinPos < within.length() - seek.length() + 1) {
            if( isFullMatch(seek,within, withinPos)) return withinPos;
            ++withinPos;
        }
        return -1;  // seek does not appear
    }


     /**
        isFullMatch
        @return
      */
     private static boolean isFullMatch(String seek, String within, int withinPos){
     	boolean fullMatch = true;
     	int seekPos = 0;
     	while(seekPos < seek.length()){
     		fullMatch &= within.substring(withinPos + seekPos, withinPos + seekPos + 1).equals(seek.substring(seekPos.++seekPos));
     	}
     	return fullMatch;
                                          
    }


    /**
       Test methods in this class, especially private methods
       like isAllUpper
     */
    public static void main( String[] commandLine) {

        // test isFullMatch
        System.out.println( System.lineSeparator()
                          + "----- test isFullMatch -----");
        System.out.println( isFullMatch( "ey", "hey",0 );  // expecting false
        System.out.println( isFullMatch( "ey", "hey",1 );  // expecting true
    }
}
