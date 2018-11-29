/**
 *
 * @author nmack
 */
import java.awt.CardLayout;

/**
 *
 * @author nmack
 */
public class UI extends javax.swing.JFrame {
    @SuppressWarnings("compatibility:2647264885859345639")
    private static final long serialVersionUID = 1L;

    /** Creates new form UI */
    public UI() {
        initComponents();
    }
 
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private String service = "Spotify", mood = "Joyous"; 
    private boolean[] answers = new boolean[5];
    private int questionNumber = 0;
    
    private void initComponents() {//GEN-BEGIN:initComponents

        cards = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        mood4 = new javax.swing.JButton();
        mood2 = new javax.swing.JButton();
        mood6 = new javax.swing.JButton();
        mood1 = new javax.swing.JButton();
        mood5 = new javax.swing.JButton();
        mood3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextArea4 = new javax.swing.JTextArea();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));

        cards.setLayout(new java.awt.CardLayout());

        jLabel1.setText("                     Select a Service                    ");
        jLabel1.setFocusable(false);

        jButton1.setText("Netflix");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Spotify");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(80, 80, 80))
        );

        cards.add(jPanel1, "card5");

        jLabel2.setText("                                        Select a Mood                                 ");

        mood4.setText("Joyous");
        mood4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mood4ActionPerformed(evt);
            }
        });

        mood2.setText("Grieved");
        mood2.setMaximumSize(new java.awt.Dimension(52, 21));
        mood2.setMinimumSize(new java.awt.Dimension(52, 21));
        mood2.setPreferredSize(new java.awt.Dimension(52, 21));
        mood2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mood2ActionPerformed(evt);
            }
        });

        mood6.setText("Lugubrious");
        mood6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mood6ActionPerformed(evt);
            }
        });

        mood1.setText("Bored");
        mood1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mood1ActionPerformed(evt);
            }
        });

        mood5.setText("Shocked");
        mood5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mood5ActionPerformed(evt);
            }
        });

        mood3.setText("Confused");
        mood3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mood3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mood1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mood4, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mood5, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(mood2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(mood3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(mood6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(52, 52, 52))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mood1)
                    .addComponent(mood2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mood3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mood4)
                    .addComponent(mood5)
                    .addComponent(mood6))
                .addGap(80, 80, 80))
        );

        cards.add(jPanel2, "card3");

        jButton5.setText("Yes");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("No");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel3.setText("Question 1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(80, 80, 80))
        );

        cards.add(jPanel3, "card4");

        jTextArea4.setColumns(20);
        jTextArea4.setRows(4);
        jTextArea4.setTabSize(5);
        jTextArea4.setText("Reccomendations:\nLink\nLink\nLink");
        jTextArea4.setMinimumSize(new java.awt.Dimension(93, 60));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jTextArea4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jTextArea4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        cards.add(jPanel4, "card5");

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2043Project/src/cs2043bkgrdgradblk.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getAccessibleContext().setAccessibleName("jFrame0");

        pack();
    }//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        service = jButton1.getText();
        ((CardLayout)(cards.getLayout ())).show (cards, "card3");
        mood1.setText("Excited");
        mood2.setText("Emotional");
        mood3.setText("Content");
        mood4.setText("Upset");
        mood5.setText("Bored");
        mood6.setText("Adventurous");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        service = jButton2.getText();
        ((CardLayout)(cards.getLayout ())).show (cards, "card3");
        mood1.setText("Excited");
        mood2.setText("Emotional");
        mood3.setText("Content");
        mood4.setText("Upset");
        mood5.setText("Nostalgic");
        mood6.setText("Chill");
        
    }//GEN-LAST:event_jButton2ActionPerformed



    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        answers[questionNumber] = true;
        questionNumber ++;
        if (questionNumber >= 5) {
            ((CardLayout)(cards.getLayout ())).show (cards, "card5");
        }
        else{
            String q = nextQuestion();
            jLabel3.setText(q);
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        answers[questionNumber] = false;
        questionNumber ++;
        if (questionNumber >= 5) {
            ((CardLayout)(cards.getLayout ())).show (cards, "card5");
        }
        else{
            String q = nextQuestion();
            jLabel3.setText(q);
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed



    private void mood3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mood3ActionPerformed
        // TODO add your handling code here:
        mood = mood3.getText();
        jLabel3.setText(nextQuestion());
        ((CardLayout)(cards.getLayout ())).show (cards, "card4");

    }//GEN-LAST:event_mood3ActionPerformed

    private void mood5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mood5ActionPerformed
        // TODO add your handling code here:
        mood = mood5.getText();
        jLabel3.setText(nextQuestion());
        ((CardLayout)(cards.getLayout ())).show (cards, "card4");

    }//GEN-LAST:event_mood5ActionPerformed

    private void mood1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mood1ActionPerformed
        // TODO add your handling code here:
        mood = mood1.getText();
        jLabel3.setText(nextQuestion());
        ((CardLayout)(cards.getLayout ())).show (cards, "card4");

    }//GEN-LAST:event_mood1ActionPerformed

    private void mood6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mood6ActionPerformed
        // TODO add your handling code here:
        mood = mood6.getText();
        jLabel3.setText(nextQuestion());
        ((CardLayout)(cards.getLayout ())).show (cards, "card4");

    }//GEN-LAST:event_mood6ActionPerformed

    private void mood2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mood2ActionPerformed
        // TODO add your handling code here:
        mood = mood2.getText();
        jLabel3.setText(nextQuestion());
        ((CardLayout)(cards.getLayout ())).show (cards, "card4");
        
    }//GEN-LAST:event_mood2ActionPerformed

    private void mood4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mood4ActionPerformed
        // TODO add your handling code here:
        mood = mood4.getText();
        jLabel3.setText(nextQuestion());
        ((CardLayout)(cards.getLayout ())).show (cards, "card4");
        
    }//GEN-LAST:event_mood4ActionPerformed

    public String nextQuestion(){
        String res = "";
        int nextQ = 0;
        if (service == "Spotify"){
            if (mood == "Nostalgic"){
                switch (questionNumber){
                case 0: 
                    nextQ = 1;
                    break;
                case 1:
                    nextQ = 2;
                    break;
                case 2:
                    if (answers[0]){
                        if (answers[1]){        
                            nextQ = 3;
                        }
                        else{
                            nextQ = 6;
                        }
                    }
                    else{
                        if (answers[1]){        
                            nextQ = 8;
                        }
                        else{
                            nextQ = 6;
                        }
                    }
                    break;
                case 3:
                    if (answers[0]){        
                        nextQ = 4;
                    }
                    else{
                        nextQ = 9;
                    }
                    break;
                case 4:
                    if (((answers[0] && (!answers[1])) && answers[2]) || (((!answers[0]) && (!answers[1])) && answers[2])){        
                        nextQ = 7;
                    }
                    else{
                        nextQ = 5;
                    }
                    break;
                }

                switch (nextQ) {
                case 1:
                    res = "Were you born before 1980?";
                    break;
                case 2:
                    res = "Do you enjoy pop music?";
                    break;
                case 3:
                    res = "Do you enjoy ballads";
                    break;
                case 4:
                    res = "Do you enjoy songs from the 80's?";
                    break;
                case 5:
                    res = "Do you want uplifting music?";
                    break;
                case 6:
                    res = "Do you enjoy rock music?";
                    break;
                case 7:
                    res = "Are you feeling angry or angsty?";
                    break;
                case 8:
                    res = "Do you enjoy R&B / rap?";
                    break;
                case 9:
                    res = "Do you enjoy songs from the 90's?";
                    break;
                }
            }
            else{
                res = ("Question " + questionNumber);
            }
        }
        else if(service == "Netflix"){
            res = ("Question " + questionNumber);

            
        }
        else{
            res = "Error";
        }
        return res;
    }

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing
                                                                   .UIManager
                                                                   .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing
                         .UIManager
                         .setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util
                .logging
                .Logger
                .getLogger(UI.class.getName())
                .log(java.util
                         .logging
                         .Level
                         .SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util
                .logging
                .Logger
                .getLogger(UI.class.getName())
                .log(java.util
                         .logging
                         .Level
                         .SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util
                .logging
                .Logger
                .getLogger(UI.class.getName())
                .log(java.util
                         .logging
                         .Level
                         .SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util
                .logging
                .Logger
                .getLogger(UI.class.getName())
                .log(java.util
                         .logging
                         .Level
                         .SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt
            .EventQueue
            .invokeLater(new Runnable() {
                public void run() {
                    new UI().setVisible(true);
                }
            });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JPanel cards;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JButton mood1;
    private javax.swing.JButton mood2;
    private javax.swing.JButton mood3;
    private javax.swing.JButton mood4;
    private javax.swing.JButton mood5;
    private javax.swing.JButton mood6;
    // End of variables declaration//GEN-END:variables

}
