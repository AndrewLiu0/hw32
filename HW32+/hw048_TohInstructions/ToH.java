/**
 * Represent a solution to the Towers of Hanoi puzzle
 */
public class ToH {

  private int nDisks;
  private String from_saysRequestingEntity, to_saysRequestingEntity, spare_saysRequestingEntity;
  private Move[] moves;
  private int nMoves; // # of moves calculated so far.
  /*
   * Usefully, this is the offset into "moves" of the next
   * slot to be populated
   */

   private static final int MAX_MOVES = 16;

  /**
   * Construct an instance
   */
  public ToH(int nDisks, String from, String to, String spare) {
    this.nDisks = nDisks;
    from_saysRequestingEntity = from;
    to_saysRequestingEntity = to;
    spare_saysRequestingEntity = spare;

    // create an empty array of "moves
    Move[] moves = new Move [MAX_MOVES ];
  }

  /**
   * @return a string representation of this instance
   */
  public String toString() {
    String result;
    result = "To move " + nDisks + " disks"
        + " from " + from_saysRequestingEntity
        + " to " + to_saysRequestingEntity
        + " using " + spare_saysRequestingEntity
        + " if necessary:" + System.lineSeparator();
    // report the "moves", using Move.toString()
    for (int offset = 0; offset < nMoves; ++offset){
      result+= moves[offset] + System.lineSeparator();
    }
    // result += " stub for remainder of ToH.toString()";
    return result;
  }

  /**
   * Populate "moves" for the given problem.
   */
  public /* instance */ void generateAllMoves() {
    System.out.println("Toh.generateAllMoves() stub");
    generateMoves(nDisks, from_saysRequestingEntity, to_saysRequestingEntity, spare_saysRequestingEntity);
  }

  /**
   * Recursively add to "moves" for a particular point
   * in the problem, as specified in the parameters.
   */
  private /* instance */ void generateMoves(int nDisks, String from, String to, String spare) {
    // stub
    // moves[0] = new Move(from, to);
    if (nDisks == 1) {
      moves[nMoves ++ ] = new Move (from , to);
    } else {
      generateMoves(nDisks - 1, from, spare, to);
      moves[nMoves ++] = new Move (from, to)
      generateMoves(nDisks - 1, spare, to, from);

    }
  }

}