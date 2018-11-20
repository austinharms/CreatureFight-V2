import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Creature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creature extends Actor
{
    private HealthBar creatureBar;
    private int healthNumber;
    private int playerOwnership;
    
    //TODO (45): Declare a String instance variable called type 
    private String type;

    /**
     * Default constructor for objects of the Creature class
     * 
     * @param There are no parameters
     * @return an object of the Creature class
     */
    public Creature()
    {
        healthNumber = 500;
        playerOwnership = 0;
        creatureBar = new HealthBar(healthNumber, healthNumber, 10);
    }

    /**
     * Constructor that allows customization of objects of the Creature class
     * 
     * @param health is the amount of health the Creature object will have
     * @param whichPlayer discusses whether the creature belongs to player 1 or player 2
     * @return an object of the Creature class
     */
    //TODO (46): Add a third parameter to this method signature, a String parameter called creatureType (change the method comment block accordingly)
    public Creature( int health, int whichPlayer, String creatureType )
    {
        healthNumber = health;
        playerOwnership = whichPlayer;
        creatureBar = new HealthBar(healthNumber, healthNumber, 10);
        
        //TODO (47): Initialize the type variable to the creatureType parameter
        type = creatureType;
    }
    
    /**
     * act will complete actions that the Creature object should
     * accomplish while the scenario is running
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        //empty method that will get overridden in subclasses
    }
    
    /**
     * TODO (50): Declare a public method called attack that does not
     *            return anything and has an integer parameter called idx
     *            
     * TODO (51): Inside the method, put a comment stating that attack is an
     *            "empty method that will get overridden in subclasses
     */
    public void attack(int idx)
    {
        //empty method that will get overridden in subclasses
    }

    /**
     * getHealthBar returns the health bar for this creature
     * for use in other parts of the code or for the user's information
     * 
     * @param There are no parameters
     * @return A HealthBar object that corresponds to the health bar
     *         for this creature
     */
    protected HealthBar getHealthBar()
    {
        return creatureBar;
    }

    /**
     * getPlayerOwner states whether the creature is owned by player
     * one or player two
     * 
     * @param There are no parameters
     * @return An integer that represents which player this Creature belongs to
     */
    public int getPlayerOwner()
    {
        return playerOwnership;
    }
    
    /**
     * TODO (52): Declare a protected method called getType that returns a
     *            String and has no parameters
     * 
     * TODO (53): Inside the method, return the type of the Creature
     */
    protected String getType()
    {
        return type;
    }

}
