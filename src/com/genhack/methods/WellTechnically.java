package com.genhack.methods;

import java.io.*;
import javax.sound.sampled.*;

/**
 * @author jeremystark
 * This method will play the vocal stylings of Michael Litt.
 * It will also (in the process of doing so) create a runnable 
 * file that will be written into the startup folder so you will
 * be forced to always come back for more.
 */
public class WellTechnically 
{
    /**
     * This is the main method.
     */
    public void letsgo()
    {
        System.out.println("Lets Go!");
        
        /**
         * This function creates an InputStream and then a BufferedInputStream to load the file.
         * Then it will use the AudioInputStream to run the BufferedInputStream.
         */
        try
        {
            InputStream is = WellTechnically.class.getResourceAsStream("/com/genhack/res/techn.wav");
            InputStream bufferedIn = new BufferedInputStream(is);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(bufferedIn);
            
            System.out.println("File loaded!");
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            
            System.out.println("Sound played!");
        } 
        catch(Exception ex) {
            System.out.println("Null Pointer BRO!");
        }
    }
}
