package com.genhack.methods;

import java.io.*;
import javax.sound.sampled.*;


public class WellTechnically 
{
    public void letsgo()
    {
        System.out.println("Lets Go!");
        
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
