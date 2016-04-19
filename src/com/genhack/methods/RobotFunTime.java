package com.genhack.methods;

import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class uses Java's Robot object to control the mouse
 * but uses a try and catch loop along with a random variable
 * to determine the location of the mouse.
 */
public class RobotFunTime
{
    
    /**
     * A constant boolean used to keep the main function's
     * while loop running.
     */
    private static final boolean running = true;
    
    /**
     * This class is used for creating the Robot object and initializing it's controls. 
     * @param x This is the X location of the mouse.
     * @param y This is the Y location of the mouse.
     * @throws AWTException 
     */
    public void click(int x, int y) throws AWTException
    {
        Robot bot = new Robot();
        bot.mouseMove(x, y);    
        bot.mousePress(InputEvent.BUTTON1_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_MASK);
    }
	
        /**
         * This is the main method of the class.
         */
	public void letsgo()
	{
		while(running)
		{
                    final int min = 100;
                    final int max = 1000;
                    final int range = (max + 1)-min;
		    int rand = (int)(java.lang.Math.random() * (range)) + min;
                        try
                        {
                            click(rand, rand);
                        } 
                        
                        catch (AWTException ex)
                        {
                            Logger.getLogger(RobotFunTime.class.getName()).log(Level.SEVERE, null, ex);
                        }
		}
	}
    
}