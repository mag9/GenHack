package com.genhack.methods;

import java.awt.*;
import java.awt.event.*;
import java.util.logging.*;

/**
 * @author jeremystark
 * This program uses the Java Robot object for autonomous functions.
 * The program locates the corner of a computer's window and continues
 * to click whatever may be there.
*/
public class JustHoldThisForASec 
{
    /**
     * A constant boolean that keeps the Robot loop running.
     */
    private static final boolean running = true;
    
    /**
     * @param x This is the X position on the screen.
     * @param y This is the Y position on the screen.
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
     * This is the main method for this class.
     */
    public void letsgo()
    {
        while(running)
        {
            final int min = 1;
            final int max = 1;
            
            try
            {
                click(min, max);
            } 
            catch (AWTException ex)
            {
                Logger.getLogger(RobotFunTime.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
