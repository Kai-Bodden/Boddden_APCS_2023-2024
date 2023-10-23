public class MaximumIntergers {
    public static void main(String[]args) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE; 
        System.out.println(max);
        System.out.println(min);
        int newMax = 1000002; 
        int newMin = 745 ;
        int overflow = max + (max + newMax) ; 
        int underflow = min + (min + newMin) ; 
        System.out.println("Overflow max is " +overflow);
        System.out.println("Ocweflow min is " + underflow);
//if you go past the max it resets to the min and vice versa


}
    
}
