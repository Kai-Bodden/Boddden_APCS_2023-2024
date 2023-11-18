public class SubstringPrinter {
    public static void main (String[]args) {
        String text = ("The quick brown fox jumps over the lazy dog.") ;
        System.out.println(text.substring(40, 43));
        System.out.println(text.substring(16, 19));
        System.out.println(text.substring(37, 39));
        System.out.println(text.substring(17, 23));
        System.out.println(text.substring(42, 43));
        /*starts at and includes first number, ends at last but doesnt include 
        substring can help use a part of a string*/
    }
}
