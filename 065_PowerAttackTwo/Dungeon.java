public class Dungeon{
    public static void main(String[] args) {
        System.out.println("You are brought into a dungeon with a monster.");

        Hero hero = new Hero("Lebron", 100, 11, 700);
        Monster monster = new Monster("Gorlock", "Destroyer", 5000, 701, 10);

        hero.heroDesc();
        monster.monsterDesc();

        while(monster.getHealth() >= 0 && hero.getHealth() >= 0){
            if(hero.getAttack()>monster.getArmor()){
            System.out.println(hero.getName() + " attacks");
            System.out.println("The attack has a value of: " + hero.getAttack());
            monster.setHealth(monster.getHealth()-hero.getAttack());
            System.out.println("The monsters health is now " + monster.getHealth());
            }
            else{
                System.out.println("The hero's attack is ineffective.");
            }
            if(monster.getAttack()>hero.getArmor()){
            System.out.println(monster.getName() + " attacks");
            System.out.println("The attack has avalue of: " + monster.getAttack());
            hero.setHealth(hero.getHealth() - monster.getAttack());
            System.out.println("The heros health is now " + hero.getHealth());
            }
            else{
                System.out.println("The monster's attack is ineffective.");
            }

            if(monster.getHealth()<0){
                System.out.println(hero.getName() + " wins!");
            }
            else if(hero.getHealth()<0){
                System.out.println(monster.getName() + " wins!");
            }
        
       }
    }
}

/*

1/3 - Compile/Content
-Not quite finished? Good start.
1/1 - Formatting
1/1 - Comments

*/