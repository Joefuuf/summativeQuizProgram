/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jasho9017
 */
public class sumQuizProgram extends javax.swing.JFrame {
    int correctAnswers = 0;
    int incorrectAnswers = 0;
    String userGuess1, userGuess2, userGuess3, userGuess4, userGuess5; 
    
    
    public sumQuizProgram() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        subtitleLabel = new javax.swing.JLabel();
        subtitleLabel2 = new javax.swing.JLabel();
        questionLabel1 = new javax.swing.JLabel();
        answerOpt1 = new javax.swing.JLabel();
        answerOpt2 = new javax.swing.JLabel();
        answerOpt3 = new javax.swing.JLabel();
        answerOpt4 = new javax.swing.JLabel();
        answerTxtInput1 = new javax.swing.JTextField();
        questionLabel2 = new javax.swing.JLabel();
        answerOpt5 = new javax.swing.JLabel();
        answerOpt6 = new javax.swing.JLabel();
        answerOpt7 = new javax.swing.JLabel();
        answerOpt8 = new javax.swing.JLabel();
        answerTxtInput2 = new javax.swing.JTextField();
        questionLabel3 = new javax.swing.JLabel();
        answerOpt9 = new javax.swing.JLabel();
        answerOpt10 = new javax.swing.JLabel();
        answerOpt11 = new javax.swing.JLabel();
        answerOpt12 = new javax.swing.JLabel();
        answerTxtInput3 = new javax.swing.JTextField();
        questionLabel4 = new javax.swing.JLabel();
        answerOpt13 = new javax.swing.JLabel();
        answerOpt14 = new javax.swing.JLabel();
        answerOpt15 = new javax.swing.JLabel();
        answerOpt16 = new javax.swing.JLabel();
        answerTxtInput4 = new javax.swing.JTextField();
        calcTotalButton = new javax.swing.JButton();
        questionLabel5 = new javax.swing.JLabel();
        answerOpt17 = new javax.swing.JLabel();
        answerOpt18 = new javax.swing.JLabel();
        answerOpt19 = new javax.swing.JLabel();
        answerOpt20 = new javax.swing.JLabel();
        answerTxtInput5 = new javax.swing.JTextField();
        messageDisplayLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("AmericanTypItcDEEMed", 0, 18)); // NOI18N
        titleLabel.setText("Real Gamer Permadeath Quiz for Real Gamers");

        subtitleLabel.setFont(new java.awt.Font("AmericanTypItcDEEMed", 0, 14)); // NOI18N
        subtitleLabel.setText("If you answer all of the questions correctly, you are epic gamer!!");

        subtitleLabel2.setFont(new java.awt.Font("AmericanTypItcDEEMed", 0, 12)); // NOI18N
        subtitleLabel2.setText("Type in the corresponding letter, in Capitals, into the text box");

        questionLabel1.setText("1. Which one of these Batman Games was released first?");

        answerOpt1.setText("A) Batman: Arkham Origins");

        answerOpt2.setText("B) Batman: Arkham Knight");

        answerOpt3.setText("C) Batman: Arkham City");

        answerOpt4.setText("D) Batman: Arkham Asylum");

        answerTxtInput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerTxtInput1ActionPerformed(evt);
            }
        });

        questionLabel2.setText("2. Which Spider-man game was developed by Insomniac Games?");

        answerOpt5.setText("A) Ultimate Spider-Man");

        answerOpt6.setText("B) Spider-Man");

        answerOpt7.setText("C) Spider-Man: Shattered Dimensions");

        answerOpt8.setText("D)Spiderman 2");

        answerTxtInput2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerTxtInput2ActionPerformed(evt);
            }
        });

        questionLabel3.setText("3. Which one of these Bethesda games was released 3 times?");

        answerOpt9.setText("A) Elder Scrolls V:Skyrim");

        answerOpt10.setText("B) Dishonored");

        answerOpt11.setText("C) Doom");

        answerOpt12.setText("D) Fallout New Vegas");

        answerTxtInput3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerTxtInput3ActionPerformed(evt);
            }
        });

        questionLabel4.setText("4. Which game was the host game of the original PUBG mod?");

        answerOpt13.setText("A) DayZ");

        answerOpt14.setText("B) Arma 3");

        answerOpt15.setText("C) H1Z1");

        answerOpt16.setText("D) Arma 2");

        answerTxtInput4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerTxtInput4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(questionLabel1)
                    .addComponent(questionLabel2)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(answerOpt1)
                            .addComponent(answerOpt3)
                            .addComponent(answerOpt2)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addComponent(answerOpt4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(answerTxtInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(answerOpt5)
                            .addComponent(answerOpt6)
                            .addComponent(answerOpt7)
                            .addComponent(answerOpt8)))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(answerTxtInput2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(questionLabel4)
                            .addComponent(questionLabel3)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(answerOpt13)
                                    .addComponent(answerOpt9)
                                    .addComponent(answerOpt10)
                                    .addComponent(answerOpt16)
                                    .addComponent(answerOpt15)
                                    .addComponent(answerOpt14)
                                    .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(answerOpt11, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(backgroundPanelLayout.createSequentialGroup()
                                            .addComponent(answerOpt12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(answerTxtInput3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(answerTxtInput4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel)
                    .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                            .addComponent(subtitleLabel)
                            .addGap(76, 76, 76))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                            .addComponent(subtitleLabel2)
                            .addGap(117, 117, 117)))))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(subtitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtitleLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionLabel1)
                    .addComponent(questionLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addComponent(answerOpt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(answerOpt2)
                            .addComponent(answerOpt10)))
                    .addComponent(answerOpt9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answerOpt3)
                    .addComponent(answerOpt11))
                .addGap(6, 6, 6)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(answerOpt4)
                            .addComponent(answerTxtInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(answerOpt12)
                        .addComponent(answerTxtInput3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionLabel2)
                    .addComponent(questionLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answerOpt5)
                    .addComponent(answerOpt13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answerOpt14)
                    .addComponent(answerOpt6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answerOpt15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(answerOpt7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answerOpt16)
                    .addComponent(answerOpt8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answerTxtInput4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(answerTxtInput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        calcTotalButton.setText("Done");
        calcTotalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcTotalButtonActionPerformed(evt);
            }
        });

        questionLabel5.setText("5. Nobou Uematsu is the composer for which video game franchise? ");

        answerOpt17.setText("A) Dragon Quest");

        answerOpt18.setText("C) Final Fantasy");

        answerOpt19.setText("B) Soulsbourne (Dark Souls, Bloodborne)");

        answerOpt20.setText("D) Super Mario Bros");

        answerTxtInput5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerTxtInput5ActionPerformed(evt);
            }
        });

        messageDisplayLabel.setFont(new java.awt.Font("AmericanTypItcDEEMed", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(calcTotalButton)
                .addGap(101, 101, 101))
            .addGroup(layout.createSequentialGroup()
                .addComponent(questionLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(answerOpt20)
                        .addGap(52, 52, 52)
                        .addComponent(answerTxtInput5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(answerOpt17)
                            .addComponent(answerOpt19)
                            .addComponent(answerOpt18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(messageDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(questionLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(answerOpt17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(answerOpt19)
                        .addGap(7, 7, 7)
                        .addComponent(answerOpt18))
                    .addComponent(messageDisplayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(answerOpt20)
                    .addComponent(answerTxtInput5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(calcTotalButton)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void answerTxtInput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerTxtInput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerTxtInput1ActionPerformed

    private void answerTxtInput2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerTxtInput2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerTxtInput2ActionPerformed

    private void calcTotalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcTotalButtonActionPerformed
       userGuess1 = (answerTxtInput1.getText());
       userGuess2 = (answerTxtInput2.getText());
       userGuess3 = (answerTxtInput3.getText());
       userGuess4 = (answerTxtInput4.getText()); 
       userGuess5 = (answerTxtInput5.getText()); 
       
       if (userGuess1 .equals ("D"))
       {
            correctAnswers = correctAnswers + 1; 
        }
        else{
            incorrectAnswers = incorrectAnswers + 1;
        }
       if (userGuess2 .equals ("B")){
            correctAnswers = correctAnswers + 1; 
        }
        else{
            incorrectAnswers = incorrectAnswers + 1;
        }
       if (userGuess3 .equals ("A")){
           correctAnswers = correctAnswers + 1;
        }
        else{
            incorrectAnswers = incorrectAnswers + 1;
        }
       if (userGuess4 .equals ("B")){
            correctAnswers = correctAnswers + 1;
        }
        else{
            incorrectAnswers = incorrectAnswers + 1;
        }
       if (userGuess5 .equals ("C")){
            correctAnswers = correctAnswers + 1; 
        }
        else{
            incorrectAnswers = incorrectAnswers + 1;
        }
        if (correctAnswers <= 4){
            messageDisplayLabel.setText("Haha you are so not epic");
        }
        if (correctAnswers == 5){
            messageDisplayLabel.setText("WOW DUDE SO EPIC GAMING");
        }
    }//GEN-LAST:event_calcTotalButtonActionPerformed

    private void answerTxtInput3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerTxtInput3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerTxtInput3ActionPerformed

    private void answerTxtInput4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerTxtInput4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerTxtInput4ActionPerformed

    private void answerTxtInput5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerTxtInput5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerTxtInput5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sumQuizProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sumQuizProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sumQuizProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sumQuizProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sumQuizProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel answerOpt1;
    private javax.swing.JLabel answerOpt10;
    private javax.swing.JLabel answerOpt11;
    private javax.swing.JLabel answerOpt12;
    private javax.swing.JLabel answerOpt13;
    private javax.swing.JLabel answerOpt14;
    private javax.swing.JLabel answerOpt15;
    private javax.swing.JLabel answerOpt16;
    private javax.swing.JLabel answerOpt17;
    private javax.swing.JLabel answerOpt18;
    private javax.swing.JLabel answerOpt19;
    private javax.swing.JLabel answerOpt2;
    private javax.swing.JLabel answerOpt20;
    private javax.swing.JLabel answerOpt3;
    private javax.swing.JLabel answerOpt4;
    private javax.swing.JLabel answerOpt5;
    private javax.swing.JLabel answerOpt6;
    private javax.swing.JLabel answerOpt7;
    private javax.swing.JLabel answerOpt8;
    private javax.swing.JLabel answerOpt9;
    private javax.swing.JTextField answerTxtInput1;
    private javax.swing.JTextField answerTxtInput2;
    private javax.swing.JTextField answerTxtInput3;
    private javax.swing.JTextField answerTxtInput4;
    private javax.swing.JTextField answerTxtInput5;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton calcTotalButton;
    private javax.swing.JLabel messageDisplayLabel;
    private javax.swing.JLabel questionLabel1;
    private javax.swing.JLabel questionLabel2;
    private javax.swing.JLabel questionLabel3;
    private javax.swing.JLabel questionLabel4;
    private javax.swing.JLabel questionLabel5;
    private javax.swing.JLabel subtitleLabel;
    private javax.swing.JLabel subtitleLabel2;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
