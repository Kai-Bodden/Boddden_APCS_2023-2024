public class PolymorphicFoods {
    public static void main(String[] args) {
        Food[] food = {new Cereal("5/17/24", 145, 50.0, "Cinnamon Toast Crunch", "General Mills", 5), new Chicken("5/15/25", 300, 25.4, "Chicken", "Wing", false)};

        for(Food i : food){
            System.out.println(i);

            if(i instanceof Cereal){
                Cereal c = (Cereal)i;
                c.addMilk();
                c.pour();
            }
            if(i instanceof Chicken){
                Chicken w = (Chicken)i;
                w.fry();
            }
        }
    }
}
