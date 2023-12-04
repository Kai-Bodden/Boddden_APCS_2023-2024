public class PowerAttack {
    public static void main(String[] args) {
        System.out.println("Your trying to avoid having to be in calc ab with Liam McLay, but the scary math monster wants to drag you down. Fight to survive.");
        int strength = 3;
        int health = 13;

        while (health > 0){
        int attack = (int)(1 + (Math.random() * 10));
        System.out.println("Your strength is " + strength);
        System.out.println("You roll an attack of " + attack);
        int total = (attack + strength);
        System.out.println("You have an attack of " + total + " hit points.");

        if(total >= 11){
            int damage = (int)(1 + (Math.random() * 3));
            if (damage == 1){
                damage = 4;
            }
            else if (damage == 2){
                damage = 5;
            }
            else{
                damage = 6;
            }
            System.out.println("You dealt " + damage + " damage.");
            health = health - damage;
            System.out.println("The monster has a health of " + health);
        }    
        else{
            System.out.println("Your attack was below the armor level, attack again.");
        }
     } 
     System.out.println("You win, the monsters health is " + health + ". You avoided calc ab with Liam McLay.");
    }
}
