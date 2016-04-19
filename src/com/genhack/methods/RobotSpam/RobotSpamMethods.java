package com.genhack.methods.RobotSpam;

import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.*;
import java.util.logging.*;

public class RobotSpamMethods 
{
    /**
     * An object of the RobotSpamTime method.
     */
    RobotSpamTime rst = new RobotSpamTime();
    
    /**
     * A string which represents the operating system of the computer that the program is running on.
     */
    private final String ostype = System.getProperty("os.name").toLowerCase();
    
    private Robot robo;
    
    /**
     * The main method of the class.
     * Called on the press of the "spam" button.
     */
    public void letsgo()
    {
        /**
         * Printing out the text entered into the spamText box.
         */
        System.out.println(rst.spamText.getText());
        
        /**
         * Call the copyToClipboard method.
         */
        copyToClipboard();
    }
    
    /**
     * Copies the spamText to the clipboard for pasting.
     */
    private void copyToClipboard()
    {
        StringSelection stringSelection = new StringSelection(rst.spamText.getText());
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        
        typebro();
    }
    
    /**
     * Invokes the typebro method.
     * This uses the Robot object for use in automated typing
     */
    private void typebro()
    {   
        try
        {
            robo = new Robot();
                  
            boolean running = true;
            
            /**
             * Determines the operating system 
             * that the software is running on.
             * 
             * If on mac, it will use the keycode VK_META 
             * as a stand-in for the Command key.
             */
            if(ostype.startsWith("mac"))
            {
                while(running)
                {
                    robo.keyPress(KeyEvent.VK_META);
                    robo.keyPress(KeyEvent.VK_V);
                    
                    robo.keyRelease(KeyEvent.VK_V);
                    robo.keyRelease(KeyEvent.VK_META);
                    
                    robo.keyPress(KeyEvent.VK_ENTER);
                    robo.keyRelease(KeyEvent.VK_ENTER);
                }
            } else {
                while(running)
                {
                    robo.keyPress(KeyEvent.VK_CONTROL);
                    robo.keyPress(KeyEvent.VK_V);
                    
                    robo.keyRelease(KeyEvent.VK_V);
                    robo.keyRelease(KeyEvent.VK_CONTROL);
                    
                    robo.keyPress(KeyEvent.VK_ENTER);
                    robo.keyRelease(KeyEvent.VK_ENTER);
                }
            }
        } catch (AWTException ex) 
        {
            Logger.getLogger(RobotSpamMethods.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
