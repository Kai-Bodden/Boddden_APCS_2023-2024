public class AreasOfRectangles {
    public static void main (String [] args) {
        double convMmToCm = 10;
        double convInToCm = 2.54;
        //divide yds conv, dividecm convinTocm to get in
        double convCmToYds = 91.44;

        double widthOne = 5.5;
        double heightOne = 7.8;
        double widthTwo = 99.4;
        double heightTwo = 500.352;
        double widthThree = 75 * convInToCm;
        double heightThree = 800;
        double widthFour = 500029.75;
        double heightFour = 90029384.0 / convInToCm;
        double widthFive = 600000.0 / convCmToYds;
        double heightFive = (8343491034.0 / convMmToCm) / convCmToYds;
        

        double recOne = (widthOne * heightOne);
        double recTwo = (widthTwo * heightTwo);
        double recThree = (widthThree * heightThree);
        double recFour = (widthFour * heightFour);
        double recFive = (widthFive * heightFive);

        System.out.println(recOne + " inches");
        System.out.println(recTwo + " centimeters");
        System.out.println(recThree + " centimeters");
        System.out.println(recFour + " inches");
        System.out.println(recFive + " yards");
    }    
}
