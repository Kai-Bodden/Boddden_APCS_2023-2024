public class Desk {
    public static void main(String[] args) {
        //creating pens
        WritingTool bluePen = new WritingTool("Pen", "Ink", "Blue");
        Pen redPen = new Pen("Pen", "Ink", "Red", true);
        Pencil twoPencil = new Pencil("Pencil", "Lead", "Gray", false);

        //to strings
        System.out.println(bluePen);
        System.out.println(redPen);
        System.out.println(twoPencil);
        //methods
        bluePen.drawSmile();
        redPen.clickPen();
        twoPencil.Sharpen(); 
    }
}
