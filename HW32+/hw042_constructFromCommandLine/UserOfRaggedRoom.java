/**
   Exercise the RaggedRoom class
 */
import java.util.Arrays;
public class UserOfRaggedRoom {
    public static void main( String[] commandLine) {
          int [] parameters = new int [commandLine.length];
          for (int i = 0 ; i < commandLine.length; i++){
               parameters[i] = i;
               parameters[i] = Integer.parseInt(commandLine[i]);
          }
          RaggedRoom room307 = new RaggedRoom(parameters.length, parameters);

        System.out.println(
                System.lineSeparator()
              + "----- see room 307, with its ragged seating -----"
              + System.lineSeparator()
              + room307
              );
         /* Expecting, eventually, to see a filled-in version of...
               number of files: 5
               files
               0    ranks:  0 1 2 3 4 5 6 7
                    person: 0 1 2 ...     7

               1    ranks:  0 1 2 3 4 5
                    person: 8 9 ...   13

               2    ranks:  0 1 2 3 4 5
                    person: 14 ...    21

               3    ranks:  0 1 2 3 4 5 6
                    person:

               4    ranks:  0 1 2 3 4 5 6
                    person:     ...     33
         */


         // create and display a rectangular room
        System.out.println(
                System.lineSeparator()
              + "----- see a rectangular room -----"
              + System.lineSeparator()
              + new RaggedRoom(4, 3)
              );

     
     }


        
     
}
