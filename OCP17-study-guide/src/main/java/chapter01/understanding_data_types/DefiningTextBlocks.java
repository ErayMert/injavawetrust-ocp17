package chapter01.understanding_data_types;

public class DefiningTextBlocks {

    public static void main(String[] args) {

        String eyeTest = "\"Java Study Guide\"\n  by Scott & Jeanne";
        System.out.println(eyeTest);

        // A text block starts and ends with three double quotes ("""), and the contents don’t need to be escaped.
        String textBlock = """
                "Java Study Guide"
                  by Scott & Jeanne
                """;


        System.out.println(textBlock);


        String pyramid = """
                  * 
                 * *
                * * *
                """;
        System.out.println(pyramid);

        // Text blocks require a line break after the opening """, making this one invalid.
        // String block = """doe"""; // DOES NOT COMPILE

        String block = """
                doe \
                deer""";

        System.out.println(block);
        System.out.println();

        String block2 = """
                doe \n
                deer""";
        System.out.println(block2);
        System.out.println();

        String block3 = """
          "doe\"\"\"
          \"deer\"""
         """;

        System.out.println(block3);
        // All of the \" escape the ".
    }
}
