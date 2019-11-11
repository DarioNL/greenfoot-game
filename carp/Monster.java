import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster extends Actor
{
    /**
     * Act - do whatever the Monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveSpider();
    }    

        public void moveSpider()
    {
        //move (5);
        //if(hitWalls()){
        //    setRotation(-180);
        //} ik kreeg het niet op tijd af
    }
    
    public boolean hitWalls()
    {
        if(isTouching(MazeBlock.class))
        {
            return true;
        }else
        {
            return false;
        }
    }

}
