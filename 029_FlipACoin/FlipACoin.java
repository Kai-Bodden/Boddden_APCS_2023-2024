public class FlipACoin {
    public static void main (String[]args) {
        int x = (int)(1 + (Math.random() * 2));
        if(x == 1)
        {
            System.out.println("Heads");
        }
        else if(x != 1)
        {
            System.out.println("Tails");
        }
    }   
}
//else if anything else is != which is useful when looking for more specific values and vice vesra