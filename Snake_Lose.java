import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake_End here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake_Lose extends World
{

    /**
     * Constructor for objects of class Snake_End.
     * 
     */
    public Snake_Lose()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1130, 800, 1); 
    }
    public void act()
    {
        pressSpace(); 
        
        MainRoom.countDown();
    
    }
    
    public void pressSpace()
    {
         
        if(Greenfoot.isKeyDown("space"))
        {
            Snake_Play sP = new Snake_Play();
            Greenfoot.setWorld(sP);
        }
    }
}
