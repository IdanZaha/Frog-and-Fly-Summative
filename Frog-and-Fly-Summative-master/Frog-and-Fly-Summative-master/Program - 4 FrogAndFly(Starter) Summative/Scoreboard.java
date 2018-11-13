import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Scoreboard extends Actor
{
    private int points; // Edits the point amount on the scoreboard.
    private Font myFont = new Font("Comic Sans MS", true, false, 24); // This is the font of the text.

    /**
     * This is the setup of the scoreboard.
     * 
     * @params - there are no parameters.
     * @returns - there are no return types.
     */
    public Scoreboard()
    {
        points = 0; // Starting points.
        GreenfootImage img = new GreenfootImage(150,30); // This is a Greenfoot image.
        img.setFont( myFont ); // Font shown on the screen.
        img.drawString("Score: " + points, 5,25); // This is the Score text.
        setImage(img); // This sets the image in the scoreboard.
    }

    /**
     * addToScore updates the score of the scoreboard when a fly eats a fruit.
     * 
     * @params - there are no parameters
     * @returns - there are no return types
     */
    public void addToScore() 
    {
        points++; // Adds in points during the fly eating a fruit.
        GreenfootImage img = getImage(); // Greenfoot image.
        img.clear(); // Clears the image.
        if(points < 100) { // If scoreboard reaches 100 points then the game stops.
            img.drawString("Score: " + points, 5,25);  // Score so if the fly eats a fruit it adds a point.
        } else { // If the fly reaches 100 points then...
            img.drawString("You win!!!", 5,25); // It replaces the scoreboard with "You win!!!"
            Greenfoot.stop(); // If you win the program stops.
        }        
    }    
}