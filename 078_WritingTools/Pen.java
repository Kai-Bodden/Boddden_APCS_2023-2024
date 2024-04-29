public class Pen extends WritingTool{

    boolean isClicky;

    public Pen(String handHeldUtencilType, String writingMaterial, String color, boolean isClicky){
        super(handHeldUtencilType, writingMaterial, color);
        this.isClicky = isClicky;
    }

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
