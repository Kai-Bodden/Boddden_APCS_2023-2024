public class LoopYourName {
   public static void main(String[] args) {
    String name = "kai";

    for(int i = 0; i<name.length(); i++){
        //will go until all nunbers are printed
        System.out.println(name.substring(i,i+1));
    }
   } 
}
