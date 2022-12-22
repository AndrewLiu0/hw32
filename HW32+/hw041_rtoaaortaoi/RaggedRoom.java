/**
   Represent a room whose file sizes vary
   
   meanings of...
      persons: a reference to an array of references to
               an array of integers.
      persons[3]: a reference to the 4th reference inside the array
      persons[3][2]: the number accossiated with index 2 of the 4th reference of persons 
 */
public class RaggedRoom {

    // person number at a particular file and rank
    private int[][] persons;

    /**
       @return a string representation of this instance
     */
    public String toString() {
        String result;
        result =   "number of files: "
                 + persons.length + System.lineSeparator()
                 + "files" + System.lineSeparator()
                 ;
         // show each file, with its number, ranks, and persons
        for( int file = 0; file < persons.length; ++file ){
             result += file + "    ranks: ";

             // show each rank number in this file
            for( int rank = 0; rank < persons[file].length; ++rank){
                result +=  rank + "   ";
            }
            result += System.lineSeparator();
            result += "   persons: ";
            for (int rank = 0; rank < persons[file].length; ++rank){
                if(persons[file][rank] >= 10){
                    result +=  persons[file][rank] + "  ";
                }
                else{
                    result +=  persons[file][rank] + "   ";
                }
            }
             // show each person number in this file

             result += System.lineSeparator();
         }
        return result;
    }


    /**
       Populate the "persons" array with consecutive
       person numbers, starting at 0.
     */
    public  void populate() {

        int count = 0;
        for (int i = 0 ; i < persons.length; i++){
            for (int j = 0; j < persons[i].length; j ++){
                persons[i][j] = count++;
            }
        }
    }


    /**
      You can ignore this for the homework due
      Wednesday 2022-12-07.
      It will be discussed in Wednesday's class.

      Construct an instance
      now: with magic numbers matching room 307. Ugh.
      future: from file sizes on the command line
     */
    public RaggedRoom() {
        persons = new int[5][];

        persons[0] = new int[8];
        persons[1] = new int[6];
        persons[2] = new int[6];
        persons[3] = new int[7];
        persons[4] = new int[7];
    }
}