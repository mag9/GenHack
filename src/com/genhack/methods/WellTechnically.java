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
            //AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(this.getClass().getResource("res/techn.wav"));
            
            InputStream is = ClassLoader.getSystemResourceAsStream("Audio/police.wav");
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(is);
            
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
