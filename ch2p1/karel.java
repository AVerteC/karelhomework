import kareltherobot.*;
import java.awt.Color;
public class karel implements Directions
{


   public static void main (String [] args)
{
    UrRobot karel = new UrRobot(2, 7, West, 0);
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        
        karel.pickBeeper();
        karel.turnOff();
    }
static {
    World.reset();
    World.readWorld("p1.kwld");
    World.setBeeperColor(Color.pink);
    World.setStreetColor(Color.blue);
    World.setNeutroniumColor(Color.green.darker());
    World.setDelay(100);
    World.setVisible(true);
}


}