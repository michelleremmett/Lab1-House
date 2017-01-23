/**
 * This is supposed to be a house with a window on the roof and in the middle. The squares are a door.
 *
 * @author  Michelle Remmett
 * @version 2017.01.23
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Square window2;
    private Triangle roof;
    private Circle sun;
    private Circle sun2;
    private Person person; 

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-95);
        window.moveVertical(110);
        window.changeSize(30);
        window.makeVisible();
        
        window2 = new Square();
        window2.changeColor("black");
        window2.moveHorizontal(-95);
        window2.moveVertical(90);
        window2.changeSize(30);
        window2.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
        
        sun = new Circle();
        sun.changeColor("white");
        sun.moveHorizontal(-15);
        sun.moveVertical(10);
        sun.changeSize(30);
        sun.makeVisible();

        sun2 = new Circle();
        sun2.changeColor("white");
        sun2.moveHorizontal(-15);
        sun2.moveVertical(70);
        sun2.changeSize(30);
        sun2.makeVisible();
        
        person = new Person ();
        person.changeColor("black");
        person.moveHorizontal(60);
        person.moveVertical(30);
        person.makeVisible();
        
        person = new Person ();
        person.changeColor("black");
        person.moveHorizontal(90);
        person.moveVertical(30);
        person.makeVisible();
        
        person = new Person ();
        person.changeColor("black");
        person.moveHorizontal(-150);
        person.moveVertical(30);
        person.makeVisible();
        
        person = new Person ();
        person.changeColor("black");
        person.moveHorizontal(-200);
        person.moveVertical(30);
        person.makeVisible();
        
        person = new Person ();
        person.changeColor("black");
        person.moveHorizontal(-250);
        person.moveVertical(30);
        person.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            window2.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("white");
            sun2.changeColor("white");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
