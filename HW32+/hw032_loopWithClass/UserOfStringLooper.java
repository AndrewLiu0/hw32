/**
  Exercise the StringLooper class
  Andrew Liu
  hw032
  worked with no one; advised by no one;
 */

public class UserOfStringLooper {
    public static void main( String[] commandLine) {
        System.out.println( System.lineSeparator()
                          + "----- demo toUpperCase -----");
        StringLooper s0 = new StringLooper();
        s0.source = "Makes me wanna shout!";

        System.out.println( s0.toUpperCase());

        System.out.println( s0.verticalize());
    }

}