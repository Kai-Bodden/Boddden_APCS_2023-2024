public class TierList {
  public static void main(String[] args) {
    String[][] tierListArray = {
        {"S-Tier:", "Fortnite,", "MarioKart,", "Star Wars Battlefront 2"},
        {"A-Tier:", "GTAV,", "Minecraft"},
        {"B-Tier:", "2048,", "COD,", "Forza Motorsport"},
        {"C-Tier:", "Apex,", "Roblox,", "R6 Siege"},
        {"D-Tier:", "PUBG,", "NBA2k"},
        {"F-Tier:", "Valorant,", "CSGO,", "Overwatch"},
    };
    
    tierListPrinter(tierListArray);


}  
    public static void tierListPrinter(String[][] tierListArray){
    for(int row = 0; row < tierListArray.length; row++){
        for(int column = 0; column < tierListArray[row].length; column++){
            System.out.print(tierListArray[row][column] + " ");
        }
        System.out.println();
    }
    } 
}
