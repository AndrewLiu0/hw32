/**
Andrew Liu
hw039
worked with no one
advised by no one  

Represent a Fibonacci sequence
 */
public class FibonacciSeq {

  // Create a private instance field to eventually
  // hold a reference to an array of int values.
  // your code here

  private int[] fib;

  /**
     Initialize this object with an array of the
     first 8 Fibonacci numbers, starting at 1.
   */
  public void gimme(int i) {
    fib = new int [i];
    int index = 0;
    while (index < fib.length){
      if (index <=1){
        fib[index] = 1;
      }
      else{
        fib[index] = fib[index - 1] + fib[index -2];
      }
      index ++;
    }

  }

  /**
     @return a string representation of this instance
   */
  public String toString() {
      String result;
      result = "the sequence: ";
      int index = 0;
      while (index < fib.length){
        result += " " + fib[index++];
      }



      return result;
  }

}