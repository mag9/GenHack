package com.genhack;

import com.genhack.methods.RobotSpam.RobotSpamTime;
import com.genhack.methods.*;
import java.awt.AWTException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainMenu extends javax.swing.JFrame
{
    public static boolean running = true;
    
    // Creates new form MainMenu
    public MainMenu()
    {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        blackOutButton = new javax.swing.JButton();
        windowFun = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        robotFunTime = new javax.swing.JButton();
        robotype = new javax.swing.JButton();
        createfile = new javax.swing.JButton();
        technicallyButton = new javax.swing.JButton();
        robotSpamTime = new javax.swing.JButton();
        warningLabel = new javax.swing.JLabel();
        holdthisforaSec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        blackOutButton.setText("Black Out");
        blackOutButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                blackOutButtonActionPerformed(evt);
            }
        });

        windowFun.setText("Window Fun");
        windowFun.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                windowFunActionPerformed(evt);
            }
        });

        stopButton.setText("Stop All");
        stopButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                stopButtonActionPerformed(evt);
            }
        });

        robotFunTime.setText("Robot Fun Time");
        robotFunTime.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                robotFunTimeActionPerformed(evt);
            }
        });

        robotype.setText("U WUT M8");
        robotype.addActionListener(new java.awt.event.ActionListener()
            {
                public void actionPerformed(java.awt.event.ActionEvent evt)
                {
                    try
                    {
                        robotypeTimeActionPerformed(evt);
                    }

                    catch (AWTException ex)
                    {
                        Logger.getLogger(RobotTyping.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });

            createfile.setText("Create File");
            createfile.addActionListener(new java.awt.event.ActionListener()
            {
                public void actionPerformed(java.awt.event.ActionEvent evt)
                {
                    createfileActionPerformed(evt);
                }
            });

            technicallyButton.setText("Well, Technically");
            technicallyButton.addActionListener(new java.awt.event.ActionListener()
            {
                public void actionPerformed(java.awt.event.ActionEvent evt)
                {
                    technicallyButtonActionPerformed(evt);
                }
            });

            robotSpamTime.setText("Robot Spam Time");
            robotSpamTime.addActionListener(new java.awt.event.ActionListener()
            {
                public void actionPerformed(java.awt.event.ActionEvent evt)
                {
                    robotSpamTimeActionPerformed(evt);
                }
            });

            warningLabel.setText("<-- Don't ever press that one.");

            holdthisforaSec.setText("Just Hold This For a Sec");
            holdthisforaSec.addActionListener(new java.awt.event.ActionListener()
            {
                public void actionPerformed(java.awt.event.ActionEvent evt)
                {
                    holdthisforaSecActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(holdthisforaSec)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stopButton))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(blackOutButton)
                        .addComponent(windowFun)
                        .addComponent(robotFunTime)
                        .addComponent(robotype)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(createfile)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(warningLabel))
                        .addComponent(technicallyButton)
                        .addComponent(robotSpamTime))
                    .addContainerGap(92, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(blackOutButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(windowFun)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(robotFunTime)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(robotype)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(createfile)
                        .addComponent(warningLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(technicallyButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(robotSpamTime)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                            .addComponent(stopButton)
                            .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(holdthisforaSec)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void blackOutButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_blackOutButtonActionPerformed
    {//GEN-HEADEREND:event_blackOutButtonActionPerformed
        Blackout bo = new Blackout();
        bo.letsgo();
    }//GEN-LAST:event_blackOutButtonActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_stopButtonActionPerformed
    {//GEN-HEADEREND:event_stopButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_stopButtonActionPerformed

    private void windowFunActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_windowFunActionPerformed
    {//GEN-HEADEREND:event_windowFunActionPerformed
        WindowFun wf = new WindowFun();
        wf.letsgo();
    }//GEN-LAST:event_windowFunActionPerformed

    private void robotFunTimeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_robotFunTimeActionPerformed
    {//GEN-HEADEREND:event_robotFunTimeActionPerformed
        RobotFunTime rft = new RobotFunTime();
        rft.letsgo();
    }//GEN-LAST:event_robotFunTimeActionPerformed

    private void createfileActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_createfileActionPerformed
    {//GEN-HEADEREND:event_createfileActionPerformed
        CreateFile cf = new CreateFile();
        cf.letsgo();
    }//GEN-LAST:event_createfileActionPerformed

    private void technicallyButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_technicallyButtonActionPerformed
    {//GEN-HEADEREND:event_technicallyButtonActionPerformed
        WellTechnically wt = new WellTechnically();
        wt.letsgo();
    }//GEN-LAST:event_technicallyButtonActionPerformed

    private void robotSpamTimeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_robotSpamTimeActionPerformed
    {//GEN-HEADEREND:event_robotSpamTimeActionPerformed
        RobotSpamTime rst = new RobotSpamTime();
        rst.createWindow();
    }//GEN-LAST:event_robotSpamTimeActionPerformed

    private void holdthisforaSecActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_holdthisforaSecActionPerformed
    {//GEN-HEADEREND:event_holdthisforaSecActionPerformed
        JustHoldThisForASec jhtfas = new JustHoldThisForASec();
        jhtfas.letsgo();
    }//GEN-LAST:event_holdthisforaSecActionPerformed
    
    private void robotypeTimeActionPerformed(java.awt.event.ActionEvent evt) throws AWTException                                             
    {    
        RobotTyping rt = new RobotTyping();
        rt.typebro();
    }  
    
    public static void main(String args[])
    {
        MainMenu mm = new MainMenu();
        
        /* Create and display the form */
        mm.setVisible(true);
        mm.setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blackOutButton;
    private javax.swing.JButton createfile;
    private javax.swing.JButton holdthisforaSec;
    private javax.swing.JButton robotFunTime;
    private javax.swing.JButton robotSpamTime;
    private javax.swing.JButton robotype;
    private javax.swing.JButton stopButton;
    private javax.swing.JButton technicallyButton;
    private javax.swing.JLabel warningLabel;
    private javax.swing.JButton windowFun;
    // End of variables declaration//GEN-END:variables
}