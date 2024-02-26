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

    public void heroDesc(){
        System.out.println("The hero: "+ name + " has entered the dungeon.");
        System.out.println("Health: " + health);
        System.out.println("Armor: " + armor);
        System.out.println("Strength: " + strength);
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
    public int strength(){
        return strength;
    }
    public int getAttack(){
        int attack = (int)(1 + (Math.random() * 10)) + strength;
        return attack;
    }
    
    
    //setter
    public void setHealth(int health){
        this.health = health;
    }
    
}