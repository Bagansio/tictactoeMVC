/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Bagansio
 */
public class View_Game extends javax.swing.JFrame {

    /**
     * Creates new form View_test
     */
    public View_Game() {
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

        jDialog1 = new javax.swing.JDialog();
        sq00 = new javax.swing.JLabel();
        sq01 = new javax.swing.JLabel();
        sq02 = new javax.swing.JLabel();
        sq10 = new javax.swing.JLabel();
        sq11 = new javax.swing.JLabel();
        sq12 = new javax.swing.JLabel();
        sq20 = new javax.swing.JLabel();
        sq21 = new javax.swing.JLabel();
        sq22 = new javax.swing.JLabel();
        btn00 = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();
        btn02 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        btn_restart = new javax.swing.JButton();
        label_turn = new javax.swing.JLabel();
        label_winsO = new javax.swing.JLabel();
        label_winsX = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(sq00, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 170, 150));
        getContentPane().add(sq01, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 170, 150));
        getContentPane().add(sq02, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 180, 150));
        getContentPane().add(sq10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 180, 200));
        getContentPane().add(sq11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 180, 200));
        getContentPane().add(sq12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 180, 200));
        getContentPane().add(sq20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 180, 200));
        getContentPane().add(sq21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 170, 190));
        getContentPane().add(sq22, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, 180, 200));
        getContentPane().add(btn00, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 180, 160));
        getContentPane().add(btn01, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 160, 160));
        getContentPane().add(btn02, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 180, 160));
        getContentPane().add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 170, 200));
        getContentPane().add(btn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 170, 200));
        getContentPane().add(btn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 180, 200));
        getContentPane().add(btn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 170, 200));
        getContentPane().add(btn21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 170, 200));
        getContentPane().add(btn22, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, 180, 200));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/boardd.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 105, -1, -1));

        btn_restart.setText("RESTART");
        getContentPane().add(btn_restart, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        label_turn.setText("TURN OF: PLAYER 1 --X--");
        getContentPane().add(label_turn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 36, -1, 20));

        label_winsO.setText("PLAYER 2 (0) WINS: 0");
        getContentPane().add(label_winsO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        label_winsX.setText("PLAYER 1 (X) WINS: 0");
        getContentPane().add(label_winsX, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(View_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    public javax.swing.JButton btn00;
    public javax.swing.JButton btn01;
    public javax.swing.JButton btn02;
    public javax.swing.JButton btn10;
    public javax.swing.JButton btn11;
    public javax.swing.JButton btn12;
    public javax.swing.JButton btn20;
    public javax.swing.JButton btn21;
    public javax.swing.JButton btn22;
    public javax.swing.JButton btn_restart;
    private javax.swing.JDialog jDialog1;
    public javax.swing.JLabel label_turn;
    public javax.swing.JLabel label_winsO;
    public javax.swing.JLabel label_winsX;
    public javax.swing.JLabel sq00;
    public javax.swing.JLabel sq01;
    public javax.swing.JLabel sq02;
    public javax.swing.JLabel sq10;
    public javax.swing.JLabel sq11;
    public javax.swing.JLabel sq12;
    public javax.swing.JLabel sq20;
    public javax.swing.JLabel sq21;
    public javax.swing.JLabel sq22;
    // End of variables declaration//GEN-END:variables
}
