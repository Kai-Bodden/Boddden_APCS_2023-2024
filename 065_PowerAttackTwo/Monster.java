public class Monster{
    private String name;
    private String species;
    private int health;
    private int armor;
    private int strength;

    public Monster(String name, String species, int health, int armor, int strength){
        this.name = name;
        this.species = species;
        this.health = health;
        this.armor = armor;
        this.strength = strength;
    }

    public void monsterDesc(){
        System.out.println("The monster, " + name + " species, " + species + " is here to defend the dungeon.");
        System.out.println("Health: " + health);
        System.out.println("Armor: " + armor);
        System.out.println("Strength: " + strength);
    }
    public void victoryCheer(){
        System.out.println("The monster wins, Hooray");
    }
    public void defeatMoan(){
        System.out.println("The monster lost, Hooray?");
    }

    public String getName(){
        return name;
    }
    public String getSpecies(){
        return species;
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
    public int getAttack(){
        int attack = (int)(1 + (Math.random() * 10)) + strength;
        return attack;
    }

    public void setHealth(int health){
        this.health = health;
    }
}
