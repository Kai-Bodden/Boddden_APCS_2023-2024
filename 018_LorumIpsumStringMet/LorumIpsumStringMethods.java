public class LorumIpsumStringMethods {
    public static void main(String[]args) {
        String lorumIpsum = ("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Sed tempus urna et pharetra pharetra massa massa ultricies mi. Tellus orci ac auctor augue mauris augue neque gravida. Convallis tellus id interdum velit laoreet id. Nibh venenatis cras sed felis eget velit aliquet sagittis. Volutpat blandit aliquam etiam erat velit. Lectus vestibulum mattis ullamcorper velit sed. Nisl pretium fusce id velit. Non blandit massa enim nec dui nunc mattis enim. Felis eget velit aliquet sagittis id. Sapien eget mi proin sed. Metus dictum at tempor commodo ullamcorper a. Morbi blandit cursus risus at.               ");
        String trim = lorumIpsum.trim(); 
        String letter = "q";
        String letterOne = "z";
        String oForX = trim.replace("o", "x");
        System.out.println("The blob has " + lorumIpsum.length() + " characters.");
        System.out.println("The trimmed blob has " + trim.length() + " words.");
        System.out.println("The blob in uppercase is, " + trim.toUpperCase());
        System.out.println("The blob in lowercase is, " + trim.toUpperCase());
        System.out.println("Is the original blob equal to the trimmed blob? " + lorumIpsum.equals(trim));
        System.out.println("Is the trimmed blob equal to the trimmed blob? " + trim.equals(trim));
        System.out.println("The letter " + letter + " is at index " + trim.indexOf(letter));
        System.out.println("Relacing the o's with x's, gives the new blob: " + oForX);
        System.out.println("Does the blob constain the letter Z? " + trim.contains(letterOne));
        //we can use string methods without having to add any objects
    }
}

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/