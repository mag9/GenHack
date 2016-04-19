package com.genhack.methods;

import java.io.File;
import java.io.IOException;

/**
 * @author jeremystark
 * This program creates multiple blank text files entitled "youbadbroX". 
 * The program looks for the users home folder as the location to create the files 
 * in, then uses a boolean constant that keeps the while loop constantly running.
 */
public class CreateFile
{
    /**
     * The string location of the user's home folder.
     */
    private static final String userHomeFolder = System.getProperty("user.home") + "/Desktop";
    
    /**
     * The integer value for which the file numbering will begin.
     */
    private static int fileNumber = 0;
    
    /**
     * A constant that will keep the while loop going.
     */
    private final boolean running = true;
    
    /**
     * The main method of the class.
     * Its entirety is to write files at the user's desktop folder.
     */
    public void letsgo()
    {
        while(running)
        {
            File file = new File(userHomeFolder, "youmadbro" + fileNumber + ".txt");
            fileNumber += 1;
            try {

                  if (file.createNewFile()){
                    System.out.println("File " + fileNumber + " is created!");
                  }else{
                    System.out.println("File already exists.");
                  }

            } catch (IOException e) {
                  e.printStackTrace();
            }
        }
    }
}
