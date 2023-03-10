/**
  Exercise the StringLooper class
  
  Bill Withers
  hw034
  worked with no one
  advised by no one
 */

public class UserOfStringLooper {
    public static void main( String[] commandLine) {
        StringLooper s0 = new StringLooper();

        // toVariablesFormat
        System.out.println( System.lineSeparator()
                          + "----- toVariablesFormat -----");
        s0.source = "A_SNAKE_CASE_NAME";
        System.out.println( s0.toVariablesFormat());

        s0.source = "ZEROUNDERSCORES";
        System.out.println( s0.toVariablesFormat());

        s0.source = "WHOLE_LOTTA_SNAKIN_GOIN_ON";
        System.out.println( s0.toVariablesFormat());


        // toConstantsFormat
        System.out.println( System.lineSeparator()
                          + "----- toConstantsFormat -----");
        s0.source = "aCamelCaseName";
        System.out.println( s0.toConstantsFormat());

        s0.source = "zerocaps";
        System.out.println( s0.toConstantsFormat());

        s0.source = "odd_But_Ok";
        System.out.println( s0.toConstantsFormat());


        // indexOf1 for hw035
        System.out.println( System.lineSeparator()
                          + "----- indexOf1 -----");
                                           //  01234
        System.out.println( s0.indexOf1( "X", "xkXcd")); // expecting 2
        System.out.println( s0.indexOf1( "a", "mdka")); // expecting 3
        System.out.println( s0.indexOf1( "a", "")); // expecting -1
        System.out.println( s0.indexOf1( "a", "jvfkdnbk")); // expecting -1
        
        
        


        // indexOfSubstring for hw035
        System.out.println( System.lineSeparator()
                          + "----- indexOfSubstring -----");
                                           //  a Martin ruler here can help
        System.out.println( s0.indexOfSubstring( "heyy", "heyy")); // expecting 0
        System.out.println( s0.indexOfSubstring( "y", "")); // expecting -1
        System.out.println( s0.indexOfSubstring( "sup", "wasssup")); // expecting 4
        System.out.println( s0.indexOfSubstring( "roar", "no")); // expecting -1
        System.out.println( s0.indexOfSubstring( "done", "i am finally done")); // expecting 13
        
        


        // System.out.println( System.lineSeparator()
                          // + "----- verticalize -----");
        // s0.source = "Go!";
        // System.out.println( s0.verticalize() );
    }
}