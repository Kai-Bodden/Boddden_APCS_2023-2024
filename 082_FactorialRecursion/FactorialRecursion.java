public class FactorialRecursion {
    public static void main(String[] args) {
       //using method to print factorials
       System.out.println("Factorial 6 is " + factorial(6));
       System.out.println("Factorial 10 is " + factorial(10));
       System.out.println("Factorial 88 is " + factorial(88));
    }

    //facotrial method
    public static int factorial(int number){
        if (number == 0) {
            return 1;
        }
        else {
            return number * factorial(number -1);
        }
    }
}

/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/