package com.genhack.methods;

import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RobotFunTime
{
    
    private static final boolean running = true;
    
    public void click(int x, int y) throws AWTException
    {
        Robot bot = new Robot();
        bot.mouseMove(x, y);    
        bot.mousePress(InputEvent.BUTTON1_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_MASK);
    }
	
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