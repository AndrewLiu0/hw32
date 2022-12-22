// /**
//    Represent a Fibonacci sequence
//    Andrew Liu
//    hw038
//    worked with Anthony Chen; advised by no one;
//  */
// public class FibonacciSeq {

//     // Create a private instance field to hold a
//     // reference to an array of int values.
//     private int[] array;
//     // your code here


//     /**
//        Initialize this object with an array of the
//        first 8 Fibonacci numbers, starting at 1.
//      */
//     public void gimme8() {
//       array = new int[8];
//       array[0] = 1;
//       array[1] = 1;
//       array[2] = array[0] + array[1];
//       array[3] = array[1] + array[2];
//       array[4] = array[2] + array[3];
//       array[5] = array[3] + array[4];
//       array[6] = array[4] + array[5];
//       array[7] = array[5] + array[6];
//     }


//     /**
//        @return a string representation of this instance
//      */
//     public String toString() {
//         String result;
//         result = "the sequence: ";
//         int curPos = 0;
//         while(curPos < array.length){
//           result+= array[curPos++] + " ";
//         }
//         result += "\nNumber of array entries available: " + array.length;
//         return result;
//     }

// }

/**
  Represent a Fibonacci sequence
  
  Ya Qi Chew 
  hw038
  worked with
  advised by 
 */
public class FibonacciSeq {

    // Create a private instance field to eventually
    // hold a reference to an array of int values.
    private int[] array; 

    /**
       Initialize this object with an array of the
       first 8 Fibonacci numbers, starting at 1.
     */
    public void gimme8() {
      array = new int [8]; 
      array [0] = 1; 
      array [1] = array [0];
      array [2] = array [1] + array [0]; 
      array [3] = array [2] + array [1]; 
      array [4] = array [3] + array [2]; 
      array [5] = array [4] + array [3]; 
      array [6] = array [5] + array [4]; 
      array [7] = array [6] + array [5]; 
    }


    /**
       @return a string representation of this instance
     */
    public String toString() {
        String result;
        result = "the sequence: "
                 + array; 
        
        int curPos = 0;
        while (curPos < array.length){
          result += array[curPos++]; 
        }
        return result;
    }
}
