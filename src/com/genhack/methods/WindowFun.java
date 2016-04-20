package com.genhack.methods;

import java.io.PrintStream;
import java.util.*;
import javax.swing.*;

/**
 * @author jeremystark
 * This class will create an infinite amount of blank windows.
 */
public class WindowFun {
	
	public static boolean run = true;
	public static Random random = new Random();
	public static int num;
	
        /**
         * This method creates and sets the parameters for a blank window.
         */
	public void newWindow()
        {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocation(random.nextInt(2000), random.nextInt(1100));
		f.setVisible(true);
	}
	
        /**
         * This method runs a while loop that infinitely 
         * calls the newWindow method.
         */
	public void letsgo(){
		while(run){
			newWindow();
		}
	}	
}