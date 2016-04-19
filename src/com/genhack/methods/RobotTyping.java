package com.genhack.methods;

import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RobotTyping 
{
    
    private final String ostype = System.getProperty("os.name").toLowerCase();
    
    public void typebro()
    {   
        try
        {
            Robot robo = new Robot();
                  
            boolean running = true;
     
            if(ostype.startsWith("mac"))
            {
                robo.keyPress(KeyEvent.VK_META); 
                robo.keyPress(KeyEvent.VK_SPACE);
                robo.keyRelease(KeyEvent.VK_SPACE);
                robo.keyRelease(KeyEvent.VK_META);
                
                while(running)
                {
                    robo.keyPress(KeyEvent.VK_U);
                    robo.keyRelease(KeyEvent.VK_U);
                    
                    robo.keyPress(KeyEvent.VK_SPACE);
                    robo.keyRelease(KeyEvent.VK_SPACE);
                    
                    robo.keyPress(KeyEvent.VK_W);
                    robo.keyRelease(KeyEvent.VK_W);
                    robo.keyPress(KeyEvent.VK_A);
                    robo.keyRelease(KeyEvent.VK_A);
                    robo.keyPress(KeyEvent.VK_T);
                    robo.keyRelease(KeyEvent.VK_T);
                    
                    robo.keyPress(KeyEvent.VK_SPACE);
                    robo.keyRelease(KeyEvent.VK_SPACE);
                    
                    robo.keyPress(KeyEvent.VK_M);
                    robo.keyRelease(KeyEvent.VK_M);
                    robo.keyPress(KeyEvent.VK_8);
                    robo.keyRelease(KeyEvent.VK_8);
                    
                    robo.keyPress(KeyEvent.VK_SPACE);
                    robo.keyRelease(KeyEvent.VK_SPACE);
                }
            }
            
            if(ostype.startsWith("win"))
            {
                robo.keyPress(KeyEvent.VK_WINDOWS); 
                robo.keyRelease(KeyEvent.VK_WINDOWS); 
                
                while(running)
                {
                    robo.keyPress(KeyEvent.VK_U);
                    robo.keyRelease(KeyEvent.VK_U);
                    
                    robo.keyPress(KeyEvent.VK_SPACE);
                    robo.keyRelease(KeyEvent.VK_SPACE);
                    
                    robo.keyPress(KeyEvent.VK_W);
                    robo.keyRelease(KeyEvent.VK_W);
                    robo.keyPress(KeyEvent.VK_A);
                    robo.keyRelease(KeyEvent.VK_A);
                    robo.keyPress(KeyEvent.VK_T);
                    robo.keyRelease(KeyEvent.VK_T);
                    
                    robo.keyPress(KeyEvent.VK_SPACE);
                    robo.keyRelease(KeyEvent.VK_SPACE);
                    
                    robo.keyPress(KeyEvent.VK_M);
                    robo.keyRelease(KeyEvent.VK_M);
                    robo.keyPress(KeyEvent.VK_8);
                    robo.keyRelease(KeyEvent.VK_8);
                    
                    robo.keyPress(KeyEvent.VK_SPACE);
                    robo.keyRelease(KeyEvent.VK_SPACE);
                }
            }
        } 
        
        catch (AWTException ex)
        {
            Logger.getLogger(RobotTyping.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
