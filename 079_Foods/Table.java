public class Table {
    public static void main(String[] args) {
        Food apple = new Food("5/15/24", 50, 6.2, "apple");
        Cereal cheerio = new Cereal("5/12/27", 200, 40.1, "Cheerio", "Kellog", 3);
        Chicken leg = new Chicken("5/14/24", 350, 20.0, "Chicken", "Drumstick", true);

        System.out.println(apple);
        System.out.println(cheerio);
        System.out.println(leg);

        leg.fry();
        cheerio.pour();
        apple.buy();

    }
}
