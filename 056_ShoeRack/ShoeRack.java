public class ShoeRack {
    public static void main(String[] args) {
        Shoes nike = new Shoes();
        Shoes adidas = new Shoes();
        Shoes uggs = new Shoes();

        nike.shoeBrand = "Nike";
        nike.color = "Black";
        nike.size = 12;

        adidas.shoeBrand = "Adidas";
        adidas.color = "blue";
        adidas.size = 6;

        uggs.shoeBrand = "Ugg";
        uggs.color = "Beige";
        uggs.size = 11;

        nike.printShoe();
        adidas.printShoe();
        uggs.printShoe();
 
    }
}
//now each one is making its own instance
