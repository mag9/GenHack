package com.genhack.methods;

import java.io.PrintStream;
import java.util.*;
import javax.swing.*;

public class WindowFun {
	
	public static boolean run = true;
	public static Random random = new Random();
	public static int num;
	
	public void newWindow()
        {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocation(random.nextInt(2000), random.nextInt(1100));
		f.setVisible(true);
	}
	
	public void letsgo(){
		while(run){
			newWindow();
		}
	}	
}