import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;

/**
 * Write a description of class Charmander here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Charmander extends Creature
{
    /**
     * Constructor for objects of class Charmander
     * 
     * @param w is a reference to the world that Charmander gets added to
     * @return An object of type Charmander
     */
    public Charmander(World w)
    {
        //TODO (48): Add a third parameter of Fire to this super line
        super(700, 1, "Fire");
        getImage().scale(150, 100);
        w.addObject( getHealthBar() , 300, w.getHeight() - 50 );
    }

    /**
     * Act - do whatever the Charmander wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        CreatureWorld playerWorld = (CreatureWorld)getWorld();

        if( getHealthBar().getCurrent() <= 0 )
        {
            getWorld().showText("Charmander has fainted...", getWorld().getWidth()/2, getWorld().getHeight()/2 + 26);
            Greenfoot.delay(30);
        }
    }

    /**
     * TODO (55): Declare a public method called attack that does not return
     *            anything and has an integer parameter called idx
     *            
     * TODO (56): Declare a local CreatureWorld variable called playerWorld that stores a reference to the CreatureWorld
     * 
     * TODO (57): Declare a local Creature variable called enemy that is initialized to player two's creature (you will need to use the getPlayerTwo method of playerWorld)
     * 
     * TODO (58): Declare a local String variable called enemyType that is initialized to the enemy's type (you will need to use the getType method of enemy)
     * 
     * TODO (59): If the idx parameter is equal to 0...
     * 
     *      TODO (60): The user has chosen Scratch, so add -25 points of health to the enemy's health bar (you will need to use the add method of health bar and use the getHealthBar method of enemy to do this)
     *      
     * TODO (61): Otherwise...
     * 
     *      TODO (62): The user has chosen Flamethrower, so add -70 points of health to the enemy's health bar
     *      
     * TODO (63): Set the turn number to player two's turn (Use the setTurnNumber method of playerWorld to change the turn number to 2)
     */
    /**
     * attack based on the idx paramiter takes away health from the enemy creature
     * and makes it the next persons turn
     * 
     * @param an int used to change how mutch health is taken away
     * @return nothing is returned
     */
    public void attack(int idx)
    {
        CreatureWorld playerWorld = (CreatureWorld) getWorld();
        Creature enemy = playerWorld.getPlayerTwo();
        String enemyType = enemy.getType();
        if(idx == 0)
        {
            enemy.getHealthBar().add(-25);
        }
        else
        {
            enemy.getHealthBar().add(-70);
        }
        playerWorld.setTurnNumber(2);
    }

}
