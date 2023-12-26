public class HelloWorldButAMethod {
    public static void main(String[] args) {
        //calling the custom method in the main method
        hello(); 
    }

    //custom hello method
    public static void hello() {
        System.out.println("Hello world!");
    }
}
//used a separate method and called upon it to print in main 