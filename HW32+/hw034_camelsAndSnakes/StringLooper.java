/**
 * Loop through Strings
 */
public class StringLooper {

  public String source;

  /**
   * @return a camel-case String without underscores
   *         when "source" is a snake-case String with underscores
   */
  public String toVariablesFormat() {
    int curPos = 0;
    String returnStr = "";
    while (curPos < source.length()) {
      if (source.substring(curPos, curPos + 1).equals("_")) {
        curPos++;
        returnStr += source.substring(curPos, ++curPos).toUpperCase();
      } else {
        returnStr += source.substring(curPos, ++curPos).toLowerCase();
      }
    }
    return returnStr;
  }

  /**
   * @return an all-caps, snake-case String with underscores
   *         when "source" is a camel-case String
   */
  public String toConstantsFormat() {
    int curPos = 0;
    String returnStr = "";
    // heyEveryone
    while (curPos < source.length()) {
      String curLetter = source.substring(curPos, curPos + 1);
      if (curLetter.equals(curLetter.toUpperCase())) {
        returnStr += "_" + source.substring(curPos, ++curPos).toUpperCase();
      } else {
        returnStr += source.substring(curPos, ++curPos).toUpperCase();
      }
    }

    return returnStr;
  }

  /**
   * @return an imitation of Java's String.toUpperCase()
   */
  public String toUpperCase() {
    String accumulator = "";

    int curPos = 0;
    while (curPos < source.length())
      accumulator += source.substring(curPos, ++curPos).toUpperCase();

    return accumulator;
  }

  /**
   * @return a version of a string that prints vertically,
   *         by introducing the value returned by
   *         System.lineSeparator() between each character.
   */
  public String verticalize() {
    String accumulator = "";

    int curPos = 0;
    while (curPos < source.length())
      accumulator += source.substring(curPos, ++curPos) + System.lineSeparator();
    return accumulator;
  }
}