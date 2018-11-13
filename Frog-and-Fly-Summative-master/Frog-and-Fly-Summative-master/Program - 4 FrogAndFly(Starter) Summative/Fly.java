import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * Have the fly count how many Food object it eats (2 marks)
 * Every time the fly eats all 10 Food objects, add 10 more Food
 * objects to the world and continue playing. (3 marks)
 * 
 */
public class Fly extends Creature
{
    
    /**
     * Fly is the method used for the flys spawn rotation.
     * 
     * @ params - there are no parameters     
     * @ returns - there are no returns
     */
    public Fly()
    {
        /*
         * modify this code to make the turtle face any random 
         * initial direction
         */
        setRotation(getRandomNumber(0,360) ); // When the game starts it spawning in a random location at a random degree.
    }
    
       public int getRandomNumber(int start, int end)
    {
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    } 
    
    public void act() 
    {
        // make the fly move 4 steps in the direction it is facing
        /*
         * Make the fly turn left or right 5 degrees when
         * the left or right arrow key is pressed. 
         */
        checkKeys(); // checkKeys method name.
        
        
        /*
         * If the fly touches a Food object, remove the Food object
         * from the world. 
         */
        checkForFood(); // Checks if a fly touches a piece of food it removes the food, and also works to update the scoreboard.
        
        
    }   
    
    /**
     * checkKeys is used for when a certain key is clicked is proceeds to do something.
     * (left, right, up)
     * @ params - there are no params
     * @ returns - there are no returns
     */
        private void checkKeys()
    {
        if(Greenfoot.isKeyDown("left")==true) // If statement for isKeyDown going left.
        {
            turn(-5); // If left arrow is clicked it goes left.
        }
        else if(Greenfoot.isKeyDown("right")==true) // If statement for isKeyDown going right.
        {
            turn(+5); // If right arrow is clicked it goes right.
        }
        if(Greenfoot.isKeyDown("up")==true)
        {
            move(4);
        }
    }
    
    /**
     * checkForFood checks for is there is food on the map it updates the scoreboard and also
     * updates when a fly hits a fruit it gets removed
     * 
     * @params - there are no parameters
     * @returns - there are no returns
     */
    private void checkForFood()
    {
        if(isTouching(Food.class)==true)
        {
            removeTouching(Food.class);
            ((Beach)getWorld()).update();
        }
    }
}
