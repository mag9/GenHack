package com.genhack.methods.RobotSpam;

import javax.swing.*;

public class RobotSpamTime extends javax.swing.JFrame
{
    
    /**
     * The robot spam methods.
     */
    private final RobotSpamMethods rsm = new RobotSpamMethods(this);

    /**
     * Creates new form RobotSpamTime
     */
    public RobotSpamTime()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        spamText = new javax.swing.JTextArea();
        spamButton = new javax.swing.JButton();
        prepareForLaunch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        spamText.setColumns(20);
        spamText.setRows(5);
        jScrollPane1.setViewportView(spamText);

        spamButton.setText("Bombs Away!");
        spamButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                spamButtonActionPerformed(evt);
            }
        });

        prepareForLaunch.setText("Prepare for Launch");
        prepareForLaunch.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                prepareForLaunchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(prepareForLaunch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spamButton)))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spamButton)
                    .addComponent(prepareForLaunch))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spamButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_spamButtonActionPerformed
    {//GEN-HEADEREND:event_spamButtonActionPerformed
        rsm.letsgo();
    }//GEN-LAST:event_spamButtonActionPerformed

    private void prepareForLaunchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_prepareForLaunchActionPerformed
    {//GEN-HEADEREND:event_prepareForLaunchActionPerformed
        rsm.copyToClipboard();
    }//GEN-LAST:event_prepareForLaunchActionPerformed

    public void createWindow()
    {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new RobotSpamTime().setVisible(true);
            }
        });
    }
    
    public String getSpamText()
    {
        return spamText.getText();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton prepareForLaunch;
    private javax.swing.JButton spamButton;
    private javax.swing.JTextArea spamText;
    // End of variables declaration//GEN-END:variables

    
}
