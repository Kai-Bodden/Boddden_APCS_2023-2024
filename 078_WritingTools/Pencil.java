public class Pencil extends WritingTool {

    boolean isMechanical;

    public Pencil(String handHeldUtencilType, String writingMaterial, String color, boolean isMechanical){
        super(handHeldUtencilType, writingMaterial, color);
        this.isMechanical = isMechanical;
    }

    public void Sharpen(){
        if(isMechanical){
            System.out.println("You can't sharpen a mechanical pencil.");
        }
        else{
            System.out.println("The pencil is now sharp.");
        }
    }

    public String toString(){
        return "This " + color + " pencil, uses " + writingMaterial + ". Is it mechanical? " + isMechanical;
    }
}
