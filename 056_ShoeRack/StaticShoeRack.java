public class StaticShoeRack {
    public static void main(String[] args) {
        StaticShoes nike = new StaticShoes();
        StaticShoes adidas = new StaticShoes();
        StaticShoes uggs = new StaticShoes();

        nike.shoeBrand = "Nike";
        nike.color = "Black";
        nike.size = 12;

        adidas.shoeBrand = "Adidas";
        adidas.color = "blue";
        adidas.size = 6;

        uggs.shoeBrand = "Ugg";
        uggs.color = "Beige";
        uggs.size = 11;

        nike.staticPrintShoe();
        adidas.staticPrintShoe();
        uggs.staticPrintShoe();
    }
}
//static so its updates are permanent
