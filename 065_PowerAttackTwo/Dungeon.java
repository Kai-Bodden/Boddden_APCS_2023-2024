public class Dungeon{
    public static void main(String[] args) {
        System.out.println("You are brought into a dungeon with a monster.");

        Hero hero = new Hero("Lebron", 100, 50, 700);
        Monster monster = new Monster("Gorlock", "Destroyer", 7000, 3000, 10);

        hero.heroDesc();
        monster.monsterDesc();

        if(monster.getHealth()>0){
            System.out.println("Lebron begins his attack.");
            System.out.println("His attack has a value of: " + hero.getAttack());
        }
    
    }
}

/*

1/3 - Compile/Content
-Not quite finished? Good start.
1/1 - Formatting
1/1 - Comments

*/