public class Hero{
    private String name;
    private int health;
    private int armor;
    private int strength;

    //constuctor
    public Hero(String name, int health, int armor, int strength){
        this.name = name;
        this.health = health;
        this.armor = armor;
        this.strength = strength;
    }

    public void attack(int attack){
        this.attack = attack;
        return attack;
    }
    public void victoryCheer(){
        System.out.println("VICTORY!!!! YEAHHHHH.");
    }
    public void defeatMoan(){
        System.out.println("Nooooooooo :( defeat");
    }
    //getter
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int getArmor(){
        return armor;
    }
    public int getStrength(){
        return strength;
    }
    
    //setter
    public void setHealth(int health){
        this.health = health;
    }
    
}