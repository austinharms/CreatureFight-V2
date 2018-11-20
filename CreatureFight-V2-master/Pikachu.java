import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;

/**
 * Write a description of class Pikachu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pikachu extends Creature
{
    /**
     * Constructor for objects of class Pikachu
     * 
     * @param w is a reference to the world that Pikachu gets added to
     * @return An object of type Pikachu
     */
    public Pikachu(World w)
    {
        //TODO (49): Add a third parameter of Electric to this super line
        super(650, 2, "Electric");
        getImage().scale(150, 100);
        w.addObject( getHealthBar() , 100, 25 );
    }

    /**
     * Act - do whatever the Pikachu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        CreatureWorld playerWorld = (CreatureWorld)getWorld();

        if( getHealthBar().getCurrent() <= 0 )
        {
            getWorld().showText("Pikachu has fainted...", getWorld().getWidth()/2, getWorld().getHeight()/2 + 26);
            Greenfoot.delay(30);
        }
    }  
    
    /**
     * TODO (64): Declare a public method called attack that does not return
     *            anything and has an integer parameter called idx
     *            
     * TODO (65): Declare a local CreatureWorld variable called playerWorld that stores a reference to the CreatureWorld
     * 
     * TODO (66): Declare a local Creature variable called enemy that is initialized to player one's creature
     * 
     * TODO (67): Declare a local String variable called enemyType that is initialized to the enemy's type
     * 
     * TODO (68): If the idx parameter is equal to 0...
     * 
     *      TODO (69): The user has chosen Tackle, so add -30 points of health to the enemy's health bar
     *      
     * TODO (70): Otherwise...
     * 
     *      TODO (71): The user has chosen Thunderbolt, so add -65 points of health to the enemy's health bar
     *      
     * TODO (72): Set the turn number to player one's turn
     */
        public void attack(int idx)
    {
        CreatureWorld playerWorld = (CreatureWorld) getWorld();
        Creature enemy = playerWorld.getPlayerOne();
        String enemyType = enemy.getType();
        if(idx == 0)
        {
            enemy.getHealthBar().add(-30);
        }
        else
        {
            enemy.getHealthBar().add(-65);
        }
        playerWorld.setTurnNumber(1);
    }
}
