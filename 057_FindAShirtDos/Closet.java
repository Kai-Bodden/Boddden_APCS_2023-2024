public class Closet {
    public static void main(String[] args) {
        //creating my individually updated shirts
        Shirt basic = new Shirt();
        Shirt one = new Shirt("blue","nike","hoodie",true,true);
        Shirt two = new Shirt("black", "chrome heart", "shorts", false, true);
        Shirt three = new Shirt("white", "supreme", "sock", false, false);

        basic.selfDescription();
        basic.cleanStatus();
        basic.fold();

        System.out.println("");

        one.selfDescription();
        one.cleanStatus();
        one.fold();

        System.out.println("");

        two.selfDescription();
        two.cleanStatus();
        two.fold();

        System.out.println("");

        three.selfDescription();
        three.cleanStatus();
        three.fold();
    }
}

/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/