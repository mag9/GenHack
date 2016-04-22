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
     * Its main function is to direct the motion of the program.
     * So it calls the method, makeThoseFiles().
     */
    public void letsgo()
    {
        makeThoseFiles();
    }
    
    /**
     * This is the functional method of the class.
     * In this method, it will create the actual files using a while loop
     * and the File object.
     */
    private void makeThoseFiles()
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
