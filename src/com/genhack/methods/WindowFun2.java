package com.genhack.methods;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;

public class WindowFun2 
{
    JFrame f;
    public static Random random = new Random();
    
    public void createWindows()
    {
        
    }
    
    public void grow()
    {
        f.setLocation(random.nextInt(2000), random.nextInt(1100));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for(int i = 10; i <= 600; i += 10)
        {
            f.setSize(i, i);
            
            if(i == 600)
            {
                shrink();
            }
            
            f.setVisible(true);
        }
    }    
    
    public void shrink()
    {
        for(int a = 600; a >=10; a -= 10)
        {
           f.setSize(a, a);
           
           if(a == 10)
           {
               grow();
           }
           
           f.setVisible(true);
        }
    }
    
    public void letsGo()
    {
        WindowFun2 wf = new WindowFun2();
    }
}
