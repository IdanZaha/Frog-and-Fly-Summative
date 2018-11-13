import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 5 marks
 */
public class Beach extends World
{
private Scoreboard score;
public Beach()
{    
       super(800, 600, 1); // Size of the world.
       // add 10 Food objects to the world (NOTE: YOU SHOULD BE CALLING A METHOD FROM THIS CLASS TO 
       // DO THIS!)
       addFood(10);
       // add a Fly object at a random position somewhere in the world
       addObject(new Fly(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
       // add a Frog object at the center of the world 
       addObject(new Frog(), getWidth()/2, getHeight()/2 ); 
       // scoreboard.
       score = new Scoreboard(); // Creates a new scoreboard.
       addObject( score, 75, 25); // Adds the Scoreboard object.
}
/**
* public void act holds your code to make your program act upon putting code in the "act" method.
* 
* @params - there are 0 params
* @return - there are 0 return types
*/
public void act()
{
    if(getObjects(Food.class).size()==0) // This code is the code for when there is no fruit on the map.
        {
            addFood(10); // This code is so that when the fruit is not there it adds ten again.
        }
}
 /**
  * addFood is the method that adds in food objects to the world at random widths and heights.
  * 
  * @params - there is 1 parameter
  * @return - there is no return types
  */ 
 
 public void addFood(int n)
    {
        for(int f=0; f<n; f++) // This code helps for the food when all the food is gone is respawns.
        {
            int x = Greenfoot.getRandomNumber( getWidth()); // Code for random number X so it gets a random X.
            int y = Greenfoot.getRandomNumber( getHeight()); // Code for random number Y so it gets a random Y.
            addObject(new Food(), x, y); // Adds in fruits in a random x and y.
        }
    }
    
    /**
     * update is used for updating the scoreboard each time a fly eats a fruit.
     * 
     * @param - there are no parameters
     * @return - there are no return types
     */
 public void update()
    {
        score.addToScore(); // Updates the score in the beach world.
    }
}