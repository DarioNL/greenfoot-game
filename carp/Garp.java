
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class carp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Garp extends Mover
{
    private GreenfootImage imageLeft;
    private GreenfootImage imageRight;

    public Garp()
    {
        imageLeft = new GreenfootImage("GarpLeft.png");
        imageRight = new GreenfootImage("GarpRight.png");
        setImage(imageRight);
        setImage(imageLeft);
    }

    /**
     * Act - do whatever the carp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        moveAround();
        changeImg();
        weaponCount();
        killOrBeKilled();
        test();
        win();
    }

    public void changeImg(){
        if(Greenfoot.isKeyDown("Up")) {
            if(getImage() == imageLeft) {
                setImage(imageRight);
            }
        }
        if(Greenfoot.isKeyDown("Down")) {
            if(getImage() == imageLeft) {
                setImage(imageRight);
            }
        }
        if(Greenfoot.isKeyDown("Right")) {
            if(getImage() == imageLeft) {
                setImage(imageRight);
            }
        }
        if(Greenfoot.isKeyDown("Left")) {
            if(getImage() == imageRight) {
                setImage(imageLeft);
            }
        }

    }

    public void test()
    {
        boolean heeftzwaard = false;
    }

    public void weaponCount()
    {
        World world;
        Actor zwaard;
        zwaard = getOneObjectAtOffset(0, 0, zwaard.class);
        if(zwaard != null) { 
            world = getWorld();
            world.removeObject(zwaard);
            heeftzwaard = true;
        }    
    }

    public void killOrBeKilled(){
        World world;
        Actor spider;
        Actor rupee;
        spider = getOneObjectAtOffset(0, 0, Monster.class);
        {
            if(spider != null) {
                if(heeftzwaard != true)
                {
                    world = getWorld();
                    world.removeObject(this);
                    Greenfoot.stop();
                }else
                {
                    world = getWorld();
                    world.removeObject(spider);
                    heeftzwaard = false;
                }
            }
        }
    }

    public void win(){
        World world;
        Actor rupee;
        rupee = getOneObjectAtOffset(0, 0, Win.class);
        {
            if(rupee != null){
                world = getWorld();
                world.removeObject(rupee);
            }
        }
    }
}
