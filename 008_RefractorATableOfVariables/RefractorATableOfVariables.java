public class RefractorATableOfVariables {
    public static void main(String []args) {
        int c1r1 = 1;
        int c1r2 = 2;
        int c1r3 = 3;
        int c1r4 = 4;
        int c2r1 = c1r1*c1r1;
        int c2r2 = c1r2*c1r2;
        int c2r3 = c1r3*c1r3;
        int c2r4 = c1r4*c1r4;
        int c3r1 = c1r1*c1r1*c1r1;
        int c3r2 = c1r2*c1r2*c1r2;
        int c3r3 = c1r3*c1r3*c1r3;
        int c3r4 = c1r4*c1r4*c1r4;
//learned how to effectively and efficiently use variables for math
        System.out.println("a    a^2    a^3");
        System.out.println(c1r1 + "    " + c2r1 + "      " + c3r1);
        System.out.println(c1r2 + "    " + c2r2 + "      " + c3r2);
        System.out.println(c1r3 + "    " + c2r3 + "      " + c3r3);
        System.out.println(c1r4 + "    " + c2r4 + "     " + c3r4);
    }
}