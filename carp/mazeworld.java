import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mazeworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mazeworld extends World
{

    /**
     * Constructor for objects of class mazeworld.
     * 
     */
    public mazeworld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MazeBlock mazeBlock = new MazeBlock();
        addObject(mazeBlock,0*50,11*50);
        MazeBlock mazeBlock2 = new MazeBlock();
        addObject(mazeBlock2,1*50,11*50);
        MazeBlock mazeBlock3 = new MazeBlock();
        addObject(mazeBlock3,2*50,11*50);
        MazeBlock mazeBlock4 = new MazeBlock();
        addObject(mazeBlock4,3*50,11*50);
        MazeBlock mazeBlock5 = new MazeBlock();
        addObject(mazeBlock5,4*50,11*50);
        MazeBlock mazeBlock6 = new MazeBlock();
        addObject(mazeBlock6,5*50,11*50);
        MazeBlock mazeBlock7 = new MazeBlock();
        addObject(mazeBlock7,6*50,11*50);
        MazeBlock mazeBlock8 = new MazeBlock();
        addObject(mazeBlock8,7*50,11*50);
        MazeBlock mazeBlock9 = new MazeBlock();
        addObject(mazeBlock9,8*50,11*50);
        MazeBlock mazeBlock10 = new MazeBlock();
        addObject(mazeBlock10,9*50,11*50);
        MazeBlock mazeBlock11 = new MazeBlock();
        addObject(mazeBlock11,10*50,11*50);
        MazeBlock mazeBlock12 = new MazeBlock();
        addObject(mazeBlock12,11*50,11*50);
        MazeBlock mazeBlock13 = new MazeBlock();
        addObject(mazeBlock13,11*50,10*50);
        MazeBlock mazeBlock14 = new MazeBlock();
        addObject(mazeBlock14,11*50,9*50);
        MazeBlock mazeBlock15 = new MazeBlock();
        addObject(mazeBlock15,11*50,8*50);
        MazeBlock mazeBlock16 = new MazeBlock();
        addObject(mazeBlock16,11*50,7*50);
        MazeBlock mazeBlock17 = new MazeBlock();
        addObject(mazeBlock17,11*50,5*50);
        MazeBlock mazeBlock18 = new MazeBlock();
        addObject(mazeBlock18,11*50,6*50);
        MazeBlock mazeBlock19 = new MazeBlock();
        addObject(mazeBlock19,11*50,4*50);
        MazeBlock mazeBlock20 = new MazeBlock();
        addObject(mazeBlock20,11*50,3*50);
        MazeBlock mazeBlock21 = new MazeBlock();
        addObject(mazeBlock21,11*50,2*50);
        MazeBlock mazeBlock22 = new MazeBlock();
        addObject(mazeBlock22,11*50,1*50);
        MazeBlock mazeBlock23 = new MazeBlock();
        addObject(mazeBlock23,11*50,0*50);
        MazeBlock mazeBlock24 = new MazeBlock();
        addObject(mazeBlock24,10*50,0*50);
        MazeBlock mazeBlock25 = new MazeBlock();
        addObject(mazeBlock25,9*50,0*50);
        MazeBlock mazeBlock26 = new MazeBlock();
        addObject(mazeBlock26,8*50,0*50);
        MazeBlock mazeBlock27 = new MazeBlock();
        addObject(mazeBlock27,7*50,0*50);
        MazeBlock mazeBlock28 = new MazeBlock();
        addObject(mazeBlock28,6*50,0);
        MazeBlock mazeBlock29 = new MazeBlock();
        addObject(mazeBlock29,5*50,0);
        MazeBlock mazeBlock30 = new MazeBlock();
        addObject(mazeBlock30,4*50,0);
        MazeBlock mazeBlock31 = new MazeBlock();
        addObject(mazeBlock31,3*50,0);
        MazeBlock mazeBlock32 = new MazeBlock();
        addObject(mazeBlock32,2*50,0);
        MazeBlock mazeBlock33 = new MazeBlock();
        addObject(mazeBlock33,1*50,0);
        MazeBlock mazeBlock34 = new MazeBlock();
        addObject(mazeBlock34,0*50,0);
        MazeBlock mazeBlock35 = new MazeBlock();
        addObject(mazeBlock35,0*50,1*50);
        MazeBlock mazeBlock36 = new MazeBlock();
        addObject(mazeBlock36,0*50,2*50);
        MazeBlock mazeBlock37 = new MazeBlock();
        addObject(mazeBlock37,0*50,3*50);
        MazeBlock mazeBlock38 = new MazeBlock();
        addObject(mazeBlock38,0*50,4*50);
        MazeBlock mazeBlock39 = new MazeBlock();
        addObject(mazeBlock39,0*50,5*50);
        MazeBlock mazeBlock40 = new MazeBlock();
        addObject(mazeBlock40,0*50,6*50);
        MazeBlock mazeBlock41 = new MazeBlock();
        addObject(mazeBlock41,0*50,7*50);
        MazeBlock mazeBlock42 = new MazeBlock();
        addObject(mazeBlock42,0*50,8*50);
        MazeBlock mazeBlock43 = new MazeBlock();
        addObject(mazeBlock43,0*50,10*50);
        MazeBlock mazeBlock44 = new MazeBlock();
        addObject(mazeBlock44,0*50,9*50);
        MazeBlock mazeBlock45 = new MazeBlock();
        addObject(mazeBlock45,10*50,10*50);
        MazeBlock mazeBlock46 = new MazeBlock();
        addObject(mazeBlock46,10*50,9*50);
        MazeBlock mazeBlock47 = new MazeBlock();
        addObject(mazeBlock47,10*50,8*50);
        MazeBlock mazeBlock48 = new MazeBlock();
        addObject(mazeBlock48,10*50,7*50);
        MazeBlock mazeBlock49 = new MazeBlock();
        addObject(mazeBlock49,10*50,6*50);
        MazeBlock mazeBlock50 = new MazeBlock();
        addObject(mazeBlock50,10*50,5*50);
        MazeBlock mazeBlock51 = new MazeBlock();
        addObject(mazeBlock51,10*50,4*50);
        MazeBlock mazeBlock52 = new MazeBlock();
        addObject(mazeBlock52,10*50,3*50);
        MazeBlock mazeBlock53 = new MazeBlock();
        addObject(mazeBlock53,10*50,2*50);
        MazeBlock mazeBlock54 = new MazeBlock();
        addObject(mazeBlock54,10*50,1*50);
        MazeBlock mazeBlock55 = new MazeBlock();
        addObject(mazeBlock55,9*50,1*50);
        MazeBlock mazeBlock56 = new MazeBlock();
        addObject(mazeBlock56,9*50,2*50);
        MazeBlock mazeBlock57 = new MazeBlock();
        addObject(mazeBlock57,9*50,3*50);
        MazeBlock mazeBlock58 = new MazeBlock();
        addObject(mazeBlock58,9*50,4*50);
        MazeBlock mazeBlock59 = new MazeBlock();
        addObject(mazeBlock59,9*50,5*50);
        MazeBlock mazeBlock60 = new MazeBlock();
        addObject(mazeBlock60,9*50,6*50);
        MazeBlock mazeBlock61 = new MazeBlock();
        addObject(mazeBlock61,9*50,7*50);
        MazeBlock mazeBlock62 = new MazeBlock();
        addObject(mazeBlock62,9*50,8*50);
        MazeBlock mazeBlock63 = new MazeBlock();
        addObject(mazeBlock63,9*50,10*50);
        MazeBlock mazeBlock64 = new MazeBlock();
        addObject(mazeBlock64,9*50,9*50);
        MazeBlock mazeBlock65 = new MazeBlock();
        addObject(mazeBlock65,1*50,9*50);
        MazeBlock mazeBlock66 = new MazeBlock();
        addObject(mazeBlock66,2*50,9*50);
        MazeBlock mazeBlock67 = new MazeBlock();
        addObject(mazeBlock67,3*50,9*50);
        MazeBlock mazeBlock68 = new MazeBlock();
        addObject(mazeBlock68,4*50,9*50);
        MazeBlock mazeBlock69 = new MazeBlock();
        addObject(mazeBlock69,5*50,9*50);
        MazeBlock mazeBlock70 = new MazeBlock();
        addObject(mazeBlock70,6*50,9*50);
        MazeBlock mazeBlock71 = new MazeBlock();
        addObject(mazeBlock71,8*50,9*50);
        MazeBlock mazeBlock72 = new MazeBlock();
        addObject(mazeBlock72,8*50,8*50);
        MazeBlock mazeBlock73 = new MazeBlock();
        addObject(mazeBlock73,6*50,8*50);
        MazeBlock mazeBlock74 = new MazeBlock();
        addObject(mazeBlock74,6*50,7*50);
        MazeBlock mazeBlock75 = new MazeBlock();
        addObject(mazeBlock75,8*50,7*50);
        MazeBlock mazeBlock76 = new MazeBlock();
        addObject(mazeBlock76,6*50,5*50);
        MazeBlock mazeBlock77 = new MazeBlock();
        addObject(mazeBlock77,8*50,5*50);
        MazeBlock mazeBlock78 = new MazeBlock();
        addObject(mazeBlock78,5*50,6*50);
        MazeBlock mazeBlock79 = new MazeBlock();
        addObject(mazeBlock79,5*50,7*50);
        MazeBlock mazeBlock80 = new MazeBlock();
        addObject(mazeBlock80,5*50,5*50);
        MazeBlock mazeBlock81 = new MazeBlock();
        addObject(mazeBlock81,7*50,3*50);
        MazeBlock mazeBlock82 = new MazeBlock();
        addObject(mazeBlock82,7*50,2*50);
        MazeBlock mazeBlock83 = new MazeBlock();
        addObject(mazeBlock83,7*50,1*50);
        MazeBlock mazeBlock84 = new MazeBlock();
        addObject(mazeBlock84,6*50,3*50);
        MazeBlock mazeBlock85 = new MazeBlock();
        addObject(mazeBlock85,5*50,3*50);
        MazeBlock mazeBlock86 = new MazeBlock();
        addObject(mazeBlock86,2*50,2*50);
        removeObject(mazeBlock86);
        addObject(mazeBlock86,2*50,3*50);
        MazeBlock mazeBlock87 = new MazeBlock();
        addObject(mazeBlock87,4*50,3*50);
        MazeBlock mazeBlock88 = new MazeBlock();
        addObject(mazeBlock88,2*50,1*50);
        MazeBlock mazeBlock89 = new MazeBlock();
        addObject(mazeBlock89,1*50,1*50);
        MazeBlock mazeBlock90 = new MazeBlock();
        addObject(mazeBlock90,2*50,5*50);
        MazeBlock mazeBlock91 = new MazeBlock();
        addObject(mazeBlock91,1*50,5*50);
        MazeBlock mazeBlock92 = new MazeBlock();
        addObject(mazeBlock92,3*50,5*50);
        MazeBlock mazeBlock93 = new MazeBlock();
        addObject(mazeBlock93,4*50,5*50);
        MazeBlock mazeBlock94 = new MazeBlock();
        addObject(mazeBlock94,4*50,6*50);
        MazeBlock mazeBlock95 = new MazeBlock();
        addObject(mazeBlock95,4*50,7*50);
        MazeBlock mazeBlock96 = new MazeBlock();
        addObject(mazeBlock96,5*50,8*50);
        MazeBlock mazeBlock97 = new MazeBlock();
        addObject(mazeBlock97,4*50,8*50);
        MazeBlock mazeBlock98 = new MazeBlock();
        addObject(mazeBlock98,3*50,7*50);
        MazeBlock mazeBlock99 = new MazeBlock();
        addObject(mazeBlock99,3*50,8*50);
        MazeBlock mazeBlock100 = new MazeBlock();
        addObject(mazeBlock100,3*50,6*50);
        MazeBlock mazeBlock101 = new MazeBlock();
        addObject(mazeBlock101,2*50,6*50);
        MazeBlock mazeBlock102 = new MazeBlock();
        addObject(mazeBlock102,2*50,7*50);
        MazeBlock mazeBlock103 = new MazeBlock();
        addObject(mazeBlock103,2*50,8*50);
        MazeBlock mazeBlock104 = new MazeBlock();
        addObject(mazeBlock104,1*50,8*50);
        MazeBlock mazeBlock105 = new MazeBlock();
        addObject(mazeBlock105,1*50,7*50);
        MazeBlock mazeBlock106 = new MazeBlock();
        addObject(mazeBlock106,1*50,6*50);
        MazeBlock mazeBlock107 = new MazeBlock();
        addObject(mazeBlock107,3,598);
        MazeBlock mazeBlock108 = new MazeBlock();
        addObject(mazeBlock108,50,598);
        MazeBlock mazeBlock109 = new MazeBlock();
        addObject(mazeBlock109,98,597);
        MazeBlock mazeBlock110 = new MazeBlock();
        addObject(mazeBlock110,144,598);
        MazeBlock mazeBlock111 = new MazeBlock();
        addObject(mazeBlock111,194,596);
        MazeBlock mazeBlock112 = new MazeBlock();
        addObject(mazeBlock112,241,596);
        MazeBlock mazeBlock113 = new MazeBlock();
        addObject(mazeBlock113,293,599);
        MazeBlock mazeBlock114 = new MazeBlock();
        addObject(mazeBlock114,346,598);
        MazeBlock mazeBlock115 = new MazeBlock();
        addObject(mazeBlock115,396,598);
        MazeBlock mazeBlock116 = new MazeBlock();
        addObject(mazeBlock116,447,596);
        MazeBlock mazeBlock117 = new MazeBlock();
        addObject(mazeBlock117,497,597);
        MazeBlock mazeBlock118 = new MazeBlock();
        addObject(mazeBlock118,547,599);
        MazeBlock mazeBlock119 = new MazeBlock();
        addObject(mazeBlock119,596,596);
        MazeBlock mazeBlock120 = new MazeBlock();
        addObject(mazeBlock120,598,545);
        MazeBlock mazeBlock121 = new MazeBlock();
        addObject(mazeBlock121,598,498);
        MazeBlock mazeBlock122 = new MazeBlock();
        addObject(mazeBlock122,598,446);
        MazeBlock mazeBlock123 = new MazeBlock();
        addObject(mazeBlock123,599,394);
        MazeBlock mazeBlock124 = new MazeBlock();
        addObject(mazeBlock124,599,344);
        MazeBlock mazeBlock125 = new MazeBlock();
        addObject(mazeBlock125,597,294);
        MazeBlock mazeBlock126 = new MazeBlock();
        addObject(mazeBlock126,599,246);
        MazeBlock mazeBlock127 = new MazeBlock();
        addObject(mazeBlock127,599,195);
        MazeBlock mazeBlock128 = new MazeBlock();
        addObject(mazeBlock128,599,143);
        mazeBlock128.setLocation(588,136);
        MazeBlock mazeBlock129 = new MazeBlock();
        addObject(mazeBlock129,598,96);
        MazeBlock mazeBlock130 = new MazeBlock();
        addObject(mazeBlock130,599,47);
        MazeBlock mazeBlock131 = new MazeBlock();
        addObject(mazeBlock131,597,2);
        Garp garp = new Garp();
        addObject(garp,49,505);
        removeObject(mazeBlock65);
        removeObject(mazeBlock66);
        removeObject(mazeBlock67);
        removeObject(mazeBlock68);
        removeObject(mazeBlock69);
        removeObject(mazeBlock70);
        removeObject(mazeBlock76);
        removeObject(mazeBlock80);
        removeObject(mazeBlock93);
        removeObject(mazeBlock92);
        removeObject(mazeBlock90);
        removeObject(mazeBlock91);
        removeObject(mazeBlock88);
        removeObject(mazeBlock89);
        zwaard zwaard = new zwaard();
        addObject(zwaard,401,52);
        addObject(mazeBlock128,596,147);
        Monster monster2 = new Monster();
        addObject(monster2,144,96);
        addObject(mazeBlock128,595,144);
        Win win = new Win();
        addObject(win,305,55);
        Monster monster = new Monster();
        addObject(monster,401,300);
        mazeBlock8.setLocation(366,537);
        removeObject(mazeBlock8);
        monster2.setLocation(351,546);
        monster2.setLocation(144,204);
        removeObject(monster2);
        removeObject(monster);
        Monster monster3 = new Monster();
        addObject(monster3,348,548);
        Monster monster4 = new Monster();
        addObject(monster4,51,200);
        monster3.setLocation(334,542);
        removeObject(monster3);
        removeObject(mazeBlock77);
        monster4.setLocation(56,215);
        monster4.setLocation(112,210);
        Monster monster5 = new Monster();
        addObject(monster5,351,249);
        monster4.setLocation(92,84);
    }
}