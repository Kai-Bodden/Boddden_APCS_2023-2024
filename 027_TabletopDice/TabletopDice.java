public class TabletopDice {
    public static void main (String[]args) { 
        int d4 = (int)(1 + (Math.random() * 4));
        System.out.println("The four sided die rolled a: " + d4);
        int d6 = (int)(1 + (Math.random() * 6));
        System.out.println("The six sided die rolled a: " + d6);
        int d8 = (int)(1 + (Math.random() * 8));
        System.out.println("The eight sided die rolled a: " + d8);
        int d10 = (int)(1 + (Math.random() * 10));
        System.out.println("The ten sided die rolled a: " + d10);
        int percentileD10 = (int)(1 + (Math.random() * 10));
        int percentile = percentileD10 * 10;
        System.out.println("The percentile die rolled a : " + percentile);
        int d12 = (int)(1 + (Math.random() * 12));
        System.out.println("The twelve sided die rolled a: " + d12);
        int d20 = (int)(1 + (Math.random() * 20));
        System.out.println("The twenty sided die rolled a: " + d20);
        
        /* almost forgot that if i use the int d10 in percentile, it will always be 10x d10. Also used (int) to chop off the double value 
        giving an int. writing int alone didn't work. Assuming it was because Math.random give a double. Had to look up how Math.random works. 
        The min is the (x +...) and the max is (...*x). 
        */
    }
}