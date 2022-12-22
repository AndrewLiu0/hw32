/**
   Exercise the FibonacciSeq class
 */
public class UserOfFibonacciSeq {
    public static void main( String[] commandLine) {

        // first 8 Fibonacci numbers, starting a at 1
        FibonacciSeq thruF8 = new FibonacciSeq();
        thruF8.gimme(8);

        System.out.println(
            System.lineSeparator()
          + "----- first 8 Fibonacci numbers -----"
          + System.lineSeparator()
          + thruF8
          );
        FibonacciSeq thru15 = new FibonacciSeq();
        thru15.gimme(15);

        System.out.println(
            System.lineSeparator()
          + "----- first 15 Fibonacci numbers -----"
          + System.lineSeparator()
          + thru15
          );
          FibonacciSeq thru35 = new FibonacciSeq();
        thru35.gimme(35);

        System.out.println(
            System.lineSeparator()
          + "----- first 35 Fibonacci numbers -----"
          + System.lineSeparator()
          + thru35
          );
    }
}
