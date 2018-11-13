import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Food extends Actor
{
    
    public Food()
    {
        /*
         * There are 5 different fruit images available to this scenario.
         * 
         * apple1.png
         * bananas.png
         * cherries.png
         * grapes.png
         * strawberry.png 
         * 
         * Modify this code so that the Food object will have the
         * one of the FIVE images assigned to it (instead of the one of three it currently uses) 
         */ 

        int foodType = Greenfoot.getRandomNumber(5); // Makes it choose a number out of 5 to set an image.
        if( foodType == 0 ) { // Food image 0.
            setImage("apple1.png"); // Apple image.
        } else if( foodType == 1 ) { // Food image 1.
            setImage("bananas.png"); // Banana image.
        } else if( foodType == 2 ) { // Food image 2.
            setImage("cherries.png"); // Cherry Image.
        }
        else if( foodType == 3 ) { // Food image 3.
            setImage("grapes.png"); // Grape image.
        }
        else{ // Food image 4.
            setImage("strawberry.png"); // Strawberry image.
        }
    }   
}
