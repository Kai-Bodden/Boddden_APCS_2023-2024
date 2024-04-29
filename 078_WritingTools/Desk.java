public class Desk {
    public static void main(String[] args) {
        WritingTool bluePen = new WritingTool("Pen", "Ink", "Blue");
        Pen redPen = new Pen("Pen", "Ink", "Red", true);
        Pencil twoPencil = new Pencil("Pencil", "Lead", "Gray", false);

        System.out.println(bluePen);
        System.out.println(redPen);
        System.out.println(twoPencil);
    }
}
