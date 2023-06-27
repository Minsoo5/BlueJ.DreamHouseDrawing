
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Circle window;
    private Triangle roof;
    private Circle sun;
    private Triangle star1;
    private Triangle star2;
    private Triangle star3;
    private Triangle star4;
    private Triangle star5;
    private Triangle star6;
    private Triangle star7;
    private Triangle star8;
    private Square nightSky;
    private Square lawn;
    private Circle moon;
    private Square garage;
    private Circle pond;
    private Square door;
    private Square driveWay;
    private Square garageDoor;
    
    
    
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
        nightSky = new Square();
        nightSky.changeColor("black");
        nightSky.changeSize(1000);
        nightSky.moveHorizontal(-60);
        nightSky.moveVertical(-50);
        nightSky.makeVisible();
        
        lawn = new Square();
        lawn.changeColor("green");
        lawn.changeSize(300);
        lawn.moveHorizontal(-60);
        lawn.moveVertical(150);
        lawn.makeVisible();
        
        pond = new Circle();
        pond.changeColor("blue");
        pond.changeSize(70);
        pond.moveHorizontal(200);
        pond.moveVertical(150);
        pond.makeVisible();
        
        driveWay = new Square();
        driveWay.changeColor("darkGray");
        driveWay.changeSize(70);
        driveWay.moveHorizontal(77);
        driveWay.moveVertical(180);
        driveWay.makeVisible();
        
        wall = new Square();
        wall.changeColor("red");
        wall.moveHorizontal(-20);
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();
        
        garage = new Square();
        garage.changeColor("magenta");
        garage.moveHorizontal(80);
        garage.moveVertical(115);
        garage.changeSize(65);
        garage.makeVisible();
        
        garageDoor = new Square();
        garageDoor.changeColor("black");
        garageDoor.moveHorizontal(93);
        garageDoor.moveVertical(140);
        garageDoor.changeSize(40);
        garageDoor.makeVisible();
        
        door = new Square();
        door.changeColor("gray");
        door.moveHorizontal(35);
        door.moveVertical(145);
        door.changeSize(35);
        door.makeVisible();

        window = new Circle();
        window.changeColor("white");
        window.moveHorizontal(55);
        window.moveVertical(78);
        window.makeVisible();

        roof = new Triangle();
        roof.changeColor("gray");
        roof.changeSize(40, 130);
        roof.moveHorizontal(40);
        roof.moveVertical(80);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("white");
        sun.moveHorizontal(210);
        sun.moveVertical(-30);
        sun.changeSize(60);
        sun.makeVisible();
        
        moon = new Circle();
        moon.changeColor("black");
        moon.moveHorizontal(215);
        moon.moveVertical(-29);
        moon.changeSize(38);
        moon.makeVisible();
        
        star1 = new Triangle();
        star1.changeColor("yellow");
        star1.changeSize(4, 6);
        star1.moveHorizontal(150);
        star1.moveVertical(70);
        star1.makeVisible();
        
        star2 = new Triangle();
        star2.changeColor("yellow");
        star2.changeSize(4, 6);
        star2.moveHorizontal(100);
        star2.moveVertical(40);
        star2.makeVisible();
        
        star3 = new Triangle();
        star3.changeColor("yellow");
        star3.changeSize(4, 6);
        star3.moveHorizontal(80);
        star3.moveVertical(50);
        star3.makeVisible();
        
        star4 = new Triangle();
        star4.changeColor("yellow");
        star4.changeSize(4, 6);
        star4.moveHorizontal(250);
        star4.moveVertical(90);
        star4.makeVisible();
        
        star5 = new Triangle();
        star5.changeColor("yellow");
        star5.changeSize(4, 6);
        star5.moveHorizontal(200);
        star5.moveVertical(150);
        star5.makeVisible();
        
        star6 = new Triangle();
        star6.changeColor("yellow");
        star6.changeSize(4, 6);
        star6.moveHorizontal(20);
        star6.moveVertical(20);
        star6.makeVisible();
        
        star7 = new Triangle();
        star7.changeColor("yellow");
        star7.changeSize(4, 6);
        star7.moveHorizontal(200);
        star7.moveVertical(70);
        star7.makeVisible();
        
        star8 = new Triangle();
        star8.changeColor("yellow");
        star8.changeSize(4, 6);
        star8.moveHorizontal(150);
        star8.moveVertical(70);
        star8.makeVisible();
        

        
        

        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
