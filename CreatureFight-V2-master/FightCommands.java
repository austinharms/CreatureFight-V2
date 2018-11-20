import greenfoot.*;

/**
 * Write a description of class PlayerCommands here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FightCommands implements MenuCommands
{       
    /**
     * execute implements the proper attack for the creature
     * depending on what option the user clicks in the menu
     * 
     * @param idx is the index of the option in the fight menu
     * @param c is the creature that is related to this fight menu
     * @return Nothing is returned
     */
    public void execute( int idx, Creature c )
    {
        //TODO (54): Inside the execute method, use the attack method of the Creature class by accessing it through the c parameter
        c.attack(idx);
    }
    
}
