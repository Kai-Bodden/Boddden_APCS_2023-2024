public class HandTwo {
    public static void main(String[] args) {
        //making phones
        PhoneTwo phoneA = new PhoneTwo();
        PhoneTwo phoneB = new PhoneTwo("Samsung", 10, "mini", "Orange", "USB-C", 69);
        PhoneTwo phoneC = new PhoneTwo("Huaweii", 20, "Max");

        //toString
        System.out.println(phoneA.toString());
        System.out.println(phoneB.toString());
        System.out.println(phoneC.toString());

        phoneA.text("Texting from my new iPhone 15");
        phoneB.music("Freestyle - Lil Baby");
        phoneC.call("Incoming call from: MOM");
    }
}

/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/