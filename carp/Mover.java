import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mover extends Actor

{
    public boolean heeftzwaard;

    /**
     * Act - do whatever the Mover wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void img()
    {
        int zwaard = 0;
    }

    public void act() 
    {
        heeftzwaard = false;
    }

    public void moveAround()
    {
        int y = getY();
        int x = getX();
        {if(Greenfoot.isKeyDown("Right")) {
                setRotation(0);
                move(5);
                if(hitWalls())
                {
                    setLocation(x - 5, y);
                }
            } 
            if(Greenfoot.isKeyDown("Up")) {
                setRotation(-90);
                move(5);
                if(hitWalls())
                {
                    setLocation(x, y + 5);
                }
            }
            {if(Greenfoot.isKeyDown("Down")) {
                    setRotation(90);
                    move(5);
                    if(hitWalls())
                    {
                        setLocation(x, y - 5);
                    }
                } 
            }
            {if(Greenfoot.isKeyDown("Left")) {
                    setRotation(0);
                    move(-5);
                    if(hitWalls())
                    {
                        setLocation(x + 5, y);
                    }
                }
            }
        }
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