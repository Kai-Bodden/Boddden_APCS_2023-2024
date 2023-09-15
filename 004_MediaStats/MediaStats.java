public class MediaStats {

   public static void main(String[]args) {

      int releaseA = 2015;
      int runTimeA = 2;
      int releaseB = 2014;
      int runTimeB = 3;
      int releaseC = 2020;
      int runTimeC = 2;
 
         String sanAn = ("San Andreas");
         String inter = ("Interstellar");
         String soul = ("Soul");
            
            String movieA = ("The movie " + sanAn + " was released in " + releaseA + " with a run time of " + runTimeA + " hours.");
            String movieB = ("The movie " + inter + " was released in " + releaseB + " with a run time of " + runTimeB + " hours.");
            String movieC = ("The movie " + soul + " was released in " + releaseC + " with a run time of " + runTimeC + " hours.");
 
               System.out.println(movieA);
               System.out.println(movieB);
               System.out.println(movieC);

                  /* 
                  //less complicated version :/
                  System.out.println("The movie San Andreas was released in "+""+releaseA+" with a run time of "+""+runTimeA+" hours");
                  System.out.println("The movie Interstellar was released in "+""+releaseB+" with a run time of "+""+runTimeB+" hours");
                  System.out.println("The movie Soul was released in "+""+releaseC+" with a run time of "+""+runTimeC+" hours");
                  */
   }
}