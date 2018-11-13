import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Creature extends Actor
{
    /**
     * atEdgeOfWorld is the code for when the frog hits the edge of the world.
     * 
     * @params - there are no parameters.
     * @returns - there are no return types.
     */
    public boolean atEdgeOfWorld()
    {
        return getX()<5 || getY()<5 || getX()>getWorld().getWidth()-5 || getY()>getWorld().getHeight()-5;
    }   
}
