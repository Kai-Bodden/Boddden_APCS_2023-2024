public class Pen extends WritingTool{

    ////adding an attribute only for pem
    boolean isClicky;

    public Pen(String handHeldUtencilType, String writingMaterial, String color, boolean isClicky){
        //super refrences the parent class writing tool, using its premade variables and conditions
        super(handHeldUtencilType, writingMaterial, color);
        this.isClicky = isClicky;
    }

    //pen specific method
    public void clickPen(){
        if(isClicky){
            System.out.println("The pen was clicked :)");
        }
        else{
            System.out.println("This is not a clicky pen. No click :(");
        }
    }

    public String toString(){
        return "This " + color + " pen, uses " + writingMaterial + ". Is it clicky? " + isClicky; 
    }
    
}
