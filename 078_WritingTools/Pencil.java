public class Pencil extends WritingTool {
    //adding an attribute only for Pencil 
    boolean isMechanical;


    public Pencil(String handHeldUtencilType, String writingMaterial, String color, boolean isMechanical){
        //super refrences the parent class writing tool, using its premade variables and conditions
        super(handHeldUtencilType, writingMaterial, color);
        this.isMechanical = isMechanical;
    }

    //pencil specific method
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
