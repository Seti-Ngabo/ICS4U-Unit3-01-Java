/*
 * This program reverses the string
 * using recursion.
 *
 * @author  Seti Ngabo
 * @version 11.0.16
 * @since   2022-11-07
 */

final class Main {

    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The reverseString function.
     *
     * @param str the string that will be reversed.
     * @return String the reversed string.
     */
    public static String reverse(final String str) {
            if (str.length() == 0) {
                return str;
        } else {
                final String subString = str.substring(0, str.length() - 1);
                reverse(subString);

                final char newStr = str.charAt(str.length() -1);
                return newStr + reverse(subString);
        }
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
            final String oStr = "recursion";

        System.out.println();
        System.out.printf("The original string is: %s", oStr);
        System.out.printf("\nThe reversed string is: %s",
            reverse(oStr));
        System.out.println();
        System.out.println("\nDone.");
    }
}
