import java.awt.Color;
import javax.swing.*;
public class NewJFrame extends javax.swing.JFrame
{
    String Player1, PP1, Player2, PP2;
    int count = 1;
    public NewJFrame()
    {
        initComponents();
        jPanel1.setVisible(false);
        jPanel3.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        OW = new javax.swing.JButton();
        EX = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        PLAYER1 = new javax.swing.JButton();
        PLAYER2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        A1 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Elephant", 3, 24)); // NOI18N
        jLabel1.setText("TIC TAC TOE");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("1. PLAYER 1, SELECT A LETTER YOU PREFER TO PLAY WITH :");

        OW.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        OW.setText("O");
        OW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OWActionPerformed(evt);
            }
        });

        EX.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        EX.setText("X");
        EX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("2. WHO WILL MAKE A FIRST MOVE?");

        PLAYER1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        PLAYER1.setText("PLAYER 1");
        PLAYER1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLAYER1ActionPerformed(evt);
            }
        });

        PLAYER2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        PLAYER2.setText("PLAYER 2");
        PLAYER2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLAYER2ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setText("PROCEED");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(OW)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EX)
                .addGap(88, 88, 88))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(PLAYER1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PLAYER2)
                .addGap(74, 74, 74))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5)
                            .addComponent(jLabel3))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OW)
                    .addComponent(EX))
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PLAYER1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PLAYER2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addComponent(jButton5))
        );

        A1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        A1.setForeground(new java.awt.Color(204, 0, 255));
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        A2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        A2.setForeground(new java.awt.Color(204, 0, 255));
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        A3.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        A3.setForeground(new java.awt.Color(204, 0, 255));
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        B1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        B1.setForeground(new java.awt.Color(204, 0, 255));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        B2.setForeground(new java.awt.Color(204, 0, 255));
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        B3.setForeground(new java.awt.Color(204, 0, 255));
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        C1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        C1.setForeground(new java.awt.Color(204, 0, 255));
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        C2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        C2.setForeground(new java.awt.Color(204, 0, 255));
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        C3.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        C3.setForeground(new java.awt.Color(204, 0, 255));
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(A3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(C3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(B1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(C1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(C2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(C3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel4.setText("PLAYER ONE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 169, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jPanel1.setVisible(true);
        jPanel2.setVisible(false);
        jPanel3.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void PLAYER1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLAYER1ActionPerformed
        jLabel4.setText("PLAYER ONE");
        PP1 = Player1;
    }//GEN-LAST:event_PLAYER1ActionPerformed

    private void PLAYER2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLAYER2ActionPerformed
        jLabel4.setText("PLAYER TWO");
        PP2 = Player2;
    }//GEN-LAST:event_PLAYER2ActionPerformed

    private void OWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OWActionPerformed
         Player1 = "O";
         Player2 = "X";
    }//GEN-LAST:event_OWActionPerformed

    private void EXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXActionPerformed
        Player1 = "X";
        Player2 = "O";
    }//GEN-LAST:event_EXActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER ONE"))
        {
            A1.setText(Player1);
            jLabel4.setText("PLAYER TWO");
        }else
        if(jLabel4.getText().equals("PLAYER TWO"))
        {
            A1.setText(Player2);
            jLabel4.setText("PLAYER ONE");
        }
        A1.setEnabled(false);
        P1Winner();
        P2Winner();
        Draw();
    }//GEN-LAST:event_A1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER ONE"))
        {
            A2.setText(Player1);
            jLabel4.setText("PLAYER TWO");
        }else
        if(jLabel4.getText().equals("PLAYER TWO"))
        {
            A2.setText(Player2);
            jLabel4.setText("PLAYER ONE");
        }
        A2.setEnabled(false);
        P1Winner();
        P2Winner();
        Draw();
    }//GEN-LAST:event_A2ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER ONE"))
        {
            A3.setText(Player1);
            jLabel4.setText("PLAYER TWO");
        }else
        if(jLabel4.getText().equals("PLAYER TWO"))
        {
            A3.setText(Player2);
            jLabel4.setText("PLAYER ONE");
        }
        A3.setEnabled(false);
        P1Winner();
        P2Winner();
        Draw();
    }//GEN-LAST:event_A3ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER ONE"))
        {
            B1.setText(Player1);
            jLabel4.setText("PLAYER TWO");
        }else
        if(jLabel4.getText().equals("PLAYER TWO"))
        {
            B1.setText(Player2);
            jLabel4.setText("PLAYER ONE");
        }
        B1.setEnabled(false);
        P1Winner();
        P2Winner();
        Draw();
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER ONE"))
        {
            B2.setText(Player1);
            jLabel4.setText("PLAYER TWO");
        }else
        if(jLabel4.getText().equals("PLAYER TWO"))
        {
            B2.setText(Player2);
            jLabel4.setText("PLAYER ONE");
        }
        B2.setEnabled(false);
        P1Winner();
        P2Winner();
        Draw();
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER ONE"))
        {
            B3.setText(Player1);
            jLabel4.setText("PLAYER TWO");
        }else
        if(jLabel4.getText().equals("PLAYER TWO"))
        {
            B3.setText(Player2);
            jLabel4.setText("PLAYER ONE");
        }
        B3.setEnabled(false);
        P1Winner();
        P2Winner();
        Draw();
    }//GEN-LAST:event_B3ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER ONE"))
        {
            C1.setText(Player1);
            jLabel4.setText("PLAYER TWO");
        }else
        if(jLabel4.getText().equals("PLAYER TWO"))
        {
            C1.setText(Player2);
            jLabel4.setText("PLAYER ONE");
        }
        C1.setEnabled(false);
        P1Winner();
        P2Winner();
        Draw();
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER ONE"))
        {
            C2.setText(Player1);
            jLabel4.setText("PLAYER TWO");
        }else
        if(jLabel4.getText().equals("PLAYER TWO"))
        {
            C2.setText(Player2);
            jLabel4.setText("PLAYER ONE");
        }
        C2.setEnabled(false);
        P1Winner();
        P2Winner();
        Draw();
    }//GEN-LAST:event_C2ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        count = count+1;
        if(jLabel4.getText().equals("PLAYER ONE"))
        {
            C3.setText(Player1);
            jLabel4.setText("PLAYER TWO");
        }else
        if(jLabel4.getText().equals("PLAYER TWO"))
        {
            C3.setText(Player2);
            jLabel4.setText("PLAYER ONE");
        }
        C3.setEnabled(false);
        P1Winner();
        P2Winner();
        Draw();
    }//GEN-LAST:event_C3ActionPerformed
        private void P1Winner()
    {
        int dButton;
        if(A1.getText().equals(Player1) && A2.getText().equals(Player1) && A3.getText().equals(Player1))
        {
            A1.setBackground(java.awt.Color.darkGray); A2.setBackground(java.awt.Color.darkGray); A3.setBackground(java.awt.Color.darkGray);
            JOptionPane.showMessageDialog(null, "PLAYER 1 WINS");
            System.exit(0);
                
        }
        if(B1.getText().equals(Player1) && B2.getText().equals(Player1) && B3.getText().equals(Player1))
        {
            B1.setBackground(java.awt.Color.darkGray); B2.setBackground(java.awt.Color.darkGray); B3.setBackground(java.awt.Color.darkGray);
            JOptionPane.showMessageDialog(null, "PLAYER 1 WINS");
            System.exit(0);
        }
        if(C1.getText().equals(Player1) && C2.getText().equals(Player1) && C3.getText().equals(Player1))
        {
            C1.setBackground(java.awt.Color.darkGray); C2.setBackground(java.awt.Color.darkGray); C3.setBackground(java.awt.Color.darkGray);
            JOptionPane.showMessageDialog(null, "PLAYER 1 WINS");
            System.exit(0);
        }
        if(A1.getText().equals(Player1) && B1.getText().equals(Player1) && C1.getText().equals(Player1))
        {
            A1.setBackground(java.awt.Color.darkGray); B1.setBackground(java.awt.Color.darkGray); C1.setBackground(java.awt.Color.darkGray);
            JOptionPane.showMessageDialog(null, "PLAYER 1 WINS");
            System.exit(0);
        }
        if(A2.getText().equals(Player1) && B2.getText().equals(Player1) && C2.getText().equals(Player1))
        {
            A2.setBackground(java.awt.Color.darkGray); B2.setBackground(java.awt.Color.darkGray); C2.setBackground(java.awt.Color.darkGray);
            JOptionPane.showMessageDialog(null, "PLAYER 1 WINS");
            System.exit(0);
        }
        if(A3.getText().equals(Player1) && B3.getText().equals(Player1) && C3.getText().equals(Player1))
        {
            A3.setBackground(java.awt.Color.darkGray); B3.setBackground(java.awt.Color.darkGray); C3.setBackground(java.awt.Color.darkGray);
            JOptionPane.showMessageDialog(null, "PLAYER 1 WINS");
            System.exit(0);
        }
        if(A1.getText().equals(Player1) && B2.getText().equals(Player1) && C3.getText().equals(Player1))
        {
            A1.setBackground(java.awt.Color.darkGray); B2.setBackground(java.awt.Color.darkGray); C3.setBackground(java.awt.Color.darkGray);
            JOptionPane.showMessageDialog(null, "PLAYER 1 WINS");
            System.exit(0);
        }
        if(A3.getText().equals(Player1) && B2.getText().equals(Player1) && C1.getText().equals(Player1))
        {
            A3.setBackground(java.awt.Color.darkGray); B2.setBackground(java.awt.Color.darkGray); C1.setBackground(java.awt.Color.darkGray);
            JOptionPane.showMessageDialog(null, "PLAYER 1 WINS");
            System.exit(0);
        }   
    }
        private void P2Winner()
    {
        if(A1.getText().equals(Player2) && A2.getText().equals(Player2) && A3.getText().equals(Player2))
        {
            A1.setBackground(java.awt.Color.CYAN); A2.setBackground(java.awt.Color.CYAN); A3.setBackground(java.awt.Color.CYAN);
            JOptionPane.showMessageDialog(null, "PLAYER 2 WINS");
            System.exit(0);
            
        }
        if(B1.getText().equals(Player2) && B2.getText().equals(Player2) && B3.getText().equals(Player2))
        {
            B1.setBackground(java.awt.Color.CYAN); B2.setBackground(java.awt.Color.CYAN); B3.setBackground(java.awt.Color.CYAN);
            JOptionPane.showMessageDialog(null, "PLAYER 2 WINS");
            System.exit(0);
        }
        if(C1.getText().equals(Player2) && C2.getText().equals(Player2) && C3.getText().equals(Player2))
        {
            C1.setBackground(java.awt.Color.CYAN); C2.setBackground(java.awt.Color.CYAN); C3.setBackground(java.awt.Color.CYAN);
            JOptionPane.showMessageDialog(null, "PLAYER 2 WINS");
            System.exit(0);
        }
        if(A1.getText().equals(Player2) && B1.getText().equals(Player2) && C1.getText().equals(Player2))
        {
            A1.setBackground(java.awt.Color.CYAN); B1.setBackground(java.awt.Color.CYAN); C1.setBackground(java.awt.Color.CYAN);
            JOptionPane.showMessageDialog(null, "PLAYER 2 WINS");
            System.exit(0);
        }
        if(A2.getText().equals(Player2) && B2.getText().equals(Player2) && C2.getText().equals(Player2))
        {
            A2.setBackground(java.awt.Color.CYAN); B2.setBackground(java.awt.Color.CYAN); C2.setBackground(java.awt.Color.CYAN);
            JOptionPane.showMessageDialog(null, "PLAYER 2 WINS");
            System.exit(0);
        }
        if(A3.getText().equals(Player2) && B3.getText().equals(Player2) && C3.getText().equals(Player2))
        {
            A3.setBackground(java.awt.Color.CYAN); B3.setBackground(java.awt.Color.CYAN); C3.setBackground(java.awt.Color.CYAN);
            JOptionPane.showMessageDialog(null, "PLAYER 2 WINS");
            System.exit(0);
        }
        if(A1.getText().equals(Player2) && B2.getText().equals(Player2) && C3.getText().equals(Player2))
        {
            A1.setBackground(java.awt.Color.CYAN); B2.setBackground(java.awt.Color.CYAN); C3.setBackground(java.awt.Color.CYAN);
            JOptionPane.showMessageDialog(null, "PLAYER 2 WINS");
            System.exit(0);
        }
        if(A3.getText().equals(Player2) && B2.getText().equals(Player2) && C1.getText().equals(Player2))
        {
            C1.setBackground(java.awt.Color.CYAN); B2.setBackground(java.awt.Color.CYAN); A3.setBackground(java.awt.Color.CYAN);
            JOptionPane.showMessageDialog(null, "PLAYER 2 WINS");
            System.exit(0);
        }
    }
        private void Draw()
        {
            if(count > 9)
            {
                JOptionPane.showMessageDialog(null, "DRAW");
                System.exit(0);;
            }
        }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton EX;
    private javax.swing.JButton OW;
    private javax.swing.JButton PLAYER1;
    private javax.swing.JButton PLAYER2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
