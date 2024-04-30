public class WritingTool {
    //variables
    String handHeldUtencilType;
    String writingMaterial;
    String color;

    public WritingTool(String handHeldUtencilType, String writingMaterial, String color){
        this.handHeldUtencilType = handHeldUtencilType;
        this.writingMaterial = writingMaterial;
        this.color = color;
    }

    public String toString(){
        return "This " + handHeldUtencilType + " is " + color + " and uses " + writingMaterial + " to write.";
    }
    
    //draw smile method
    public void drawSmile(){
        System.out.println(":)");
    }
}
