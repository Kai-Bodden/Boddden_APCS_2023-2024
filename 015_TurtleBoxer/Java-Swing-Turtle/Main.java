import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {
    //Refer back to your Runestone academy book as needed.
    //Instantiate the world. The world should be 220x220.
    World habitat = new World(220, 220);
    //Instantiate a turtle. Name it as you wish.
    Turtle lebron = new Turtle(habitat);
    /*Have your turtle make 4 boxes in the world. The boxes should be in a 2x2 grid. Similar to this:
     ___ ___ 
    |   |   |
    |___|___|
    |   |   |
    |___|___|

    */
    lebron.forward(40);
    lebron.turnRight();
    lebron.forward(20);
    lebron.turnRight();
    lebron.forward(40);
    lebron.turnRight();
    lebron.forward(20);
    lebron.turn(180);
    lebron.forward(40);
    lebron.turnLeft();
    lebron.forward(40);
    lebron.turnLeft();
    lebron.forward(20);
    lebron.turnLeft();
    lebron.forward(20);
    lebron.turnLeft();
    lebron.forward(20);
    lebron.turn(180);
    lebron.forward(40);
    habitat.show(true);
 //Finally, set the world to be visible with a boolean. Ex: worldName.setVisible(the proper boolean);
  }
}
