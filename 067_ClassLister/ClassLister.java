public class ClassLister {
    public static void main(String[] args) {
        // Create an array containing the names of all classes
        String[] classNames = {"Math", "Spanish", "Physics", "Jewelry Making", "Spectrum", "Comp Sci"};

        // Use a for loop to print out the classes listed in the array
        System.out.println("My classes:");
        for (String className : classNames) {
            System.out.println(className);
        }
    }
}