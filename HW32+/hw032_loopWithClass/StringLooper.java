/**
  Loop through Strings
  Andrew Liu
  hw032
  worked with no one; advised by no one;
 */
public class StringLooper {

    public String source;
    
    /**
      @return an imitation of Java's String.toUpperCase()
     */
    public String toUpperCase() {
        String accumulator = "";
        
        int curPos = 0;
        while( curPos < source.length())
            accumulator += source.substring( curPos, ++curPos).toUpperCase();

        return accumulator;
    }

    /**
      @return a version of a string that prints vertically,
              by introducing the value returned by
              System.lineSeparator() between each character.
     */
    public String verticalize() {
        String accumulator = "";
        
        int curPos = 0;
        while(curPos< source.length())
            accumulator += source.substring(curPos, ++curPos).toUpperCase() + System.lineSeparator();
        return accumulator;
    }

}