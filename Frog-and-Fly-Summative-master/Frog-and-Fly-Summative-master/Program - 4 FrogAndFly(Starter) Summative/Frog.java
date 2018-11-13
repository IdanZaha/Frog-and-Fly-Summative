import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 10 marks
 */
public class Frog extends Creature
{
    // The Frog's speed ...
    private int speed;
    
    public Frog()
    {        
        // set the Frog's speed to a random number between 4 and 8
       speed = Greenfoot.getRandomNumber(4 + 4);
    }
    
    public void act() 
    {
        // make the Frog move at its speed, in the direction it is facing
        move(speed + 4); // Makes the speed a number between 4 and 8
        /*
         * Make the frog turn off course 35% of the time.
         * It will turn left or right 15 degrees equally as often. 
         */ 
        
        if(Greenfoot.getRandomNumber(100) > 35) // 35% of the time the frog will move a number between 4 and 8.
        {
            move(speed + 4); // Makes the speed a number between 4 and 8.
        }
        if(Greenfoot.getRandomNumber(2) < 1) // A half of the time it will turn 15 degrees to the right.
        {
            turn(15); // Makes the frog turn 15 degrees right.
        }
        if(Greenfoot.getRandomNumber(2) < 1) // The other half it will turn 15 degrees left.
        {
            turn(-15); // Makes the frog turn 15 degrees left.
        }
        
        /*
         * If the frog is near an edge of the world, make it turn
         * 7 degrees to the right. 
         * 
         * Hint: use the atEdgeOfWorld method in the Creature class.
         */
        if(atEdgeOfWorld()==true) // If the frog hits the edge of the world it...
        {
            turn(7); // turns 7 degrees if it hits the edge.
        }
        
        /*
         * If the frog encounters the fly, the game ends, so
         * stop the scenario 
         */ 
        if(isTouching(Fly.class) == true) // If the frogs hit the fly then..
        {
            Greenfoot.stop(); // the program stops.
        }  
    }
}



