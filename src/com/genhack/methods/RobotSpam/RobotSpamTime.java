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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        spamText.setColumns(20);
        spamText.setRows(5);
        jScrollPane1.setViewportView(spamText);

        spamButton.setText("Spam!");
        spamButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                spamButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spamButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spamButton)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spamButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_spamButtonActionPerformed
    {//GEN-HEADEREND:event_spamButtonActionPerformed
        rsm.letsgo();
    }//GEN-LAST:event_spamButtonActionPerformed

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
    private javax.swing.JButton spamButton;
    private javax.swing.JTextArea spamText;
    // End of variables declaration//GEN-END:variables

    
}
