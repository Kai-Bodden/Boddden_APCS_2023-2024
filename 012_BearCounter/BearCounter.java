public class BearCounter {
    public static void main (String []args) {
        String bearDescStart = ("There are ");
        String bearDescEnd = (" bears in the forest.");
        int numBears = 0;
        String BearCount = (bearDescStart + numBears + bearDescEnd);

        System.out.println(bearDescStart + numBears + bearDescEnd);
        numBears++;
        System.out.println(bearDescStart + numBears + bearDescEnd);
        numBears++;
        System.out.println(bearDescStart + numBears + bearDescEnd);
        numBears++;
        System.out.println(bearDescStart + numBears + bearDescEnd);
        numBears--;
        System.out.println(bearDescStart + numBears + bearDescEnd);
        numBears--;
        System.out.println(bearDescStart + numBears + bearDescEnd);
        numBears--;
        System.out.println(bearDescStart + numBears + bearDescEnd);     
//i can use this skill to alter a varible throughout the duration of my code
    }
}