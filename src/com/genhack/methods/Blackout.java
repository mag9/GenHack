package com.genhack.methods;

import java.awt.Color;
import java.io.PrintStream;
import java.util.*;
import javax.swing.*;

/**
 * @author Jeremy Stark
 * Blackout will create multiple borderless, black windows.
 * The inspiration for this class came from this 
 * scene from the 2004 Disney movie - The Incredibles: http://bit.ly/1Vdtlpf
 */
public class Blackout 
{
	public static boolean run = true;
	public static PrintStream ps = System.out;
	public static Random random = new Random();
	public static int num;
	
	public void newWindow()
        {
		JFrame f = new JFrame();
		f.setSize(3000, 3000);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocation(random.nextInt(2000), random.nextInt(1100));
                f.setBackground(Color.BLACK);
                f.setUndecorated(true);
		num++;
		ps.println("New Window Created: " + num);
		f.setVisible(true);
	}
	
	public void letsgo()
        {
		while(run){
			newWindow();
		}
	}	
}