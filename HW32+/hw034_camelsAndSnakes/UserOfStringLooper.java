/**
 * Exercise the StringLooper class
 */

public class UserOfStringLooper {
    public static void main(String[] commandLine) {
        StringLooper s0 = new StringLooper();

        // toVariablesFormat
        System.out.println(System.lineSeparator()
                + "----- toVariablesFormat -----");
        s0.source = "A_SNAKE_CASE_STUB";
        System.out.println(s0.toVariablesFormat());

        s0.source = "HEY_EVERYONE";
        System.out.println(s0.toVariablesFormat());

        s0.source = "MY_HA_YA_DU_QW_JD";
        System.out.println(s0.toVariablesFormat());

        // toConstantsFormat
        System.out.println(System.lineSeparator()
                + "----- toConstantsFormat -----");
        s0.source = "aCamelCaseStub";
        System.out.println(s0.toConstantsFormat());
        s0.source = "someCamelCaseStubThingyForTest";
        System.out.println(s0.toConstantsFormat());
        s0.source = "iHopeThisToConstantsFormatMethodWorks";
        System.out.println(s0.toConstantsFormat());

        System.out.println(System.lineSeparator()
                + "----- verticalize -----");
        s0.source = "Go!";
        System.out.println(s0.verticalize());
    }
}