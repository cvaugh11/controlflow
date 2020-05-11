public class Asciichars {
    public static void printNumbers() {
        int i;
        for (i = 48; i < 58; i++) {
        System.out.println("The Ascii decimal value of: " + ( char) i + " is " + i);
        }
    }
    public static void printLowerCase() {
        int i;
        for (i = 97; i < 123; i++) {
        System.out.println("The Ascii decimal value of Lowercase:" + ( char) i + " is " + i);
        }
    }
    public static void printUpperCase() {
        int i;
        for (i = 65; i < 91; i++) {
        System.out.println("The Ascii decimal value of Uppercase:" + ( char) i + " is " + i);
        }
    }
}
