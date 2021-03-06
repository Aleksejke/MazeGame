package view;

import java.awt.Color;
import javax.swing.JColorChooser;


public class ColorSettings extends javax.swing.JDialog {
    private Color borderColor, DotColor, BackgroundColor;
    private boolean entered = false;

    /**
     * Creates new form ColorSettings
     */
    public ColorSettings(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        Borders = new javax.swing.JLabel();
        Dot = new javax.swing.JLabel();
        ChooserOfDot = new javax.swing.JLabel();
        Changer = new javax.swing.JButton();
        ChooserOfBorder = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        ChooserOfBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Colors");

        Borders.setText("Borders color:");

        Dot.setText("Dot color:");

        ChooserOfDot.setBackground(new java.awt.Color(255, 0, 0));
        ChooserOfDot.setText(" ");
        ChooserOfDot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChooserOfDot.setOpaque(true);
        ChooserOfDot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChooserOfDotMouseClicked(evt);
            }
        });

        Changer.setText("Change Color");
        Changer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangerActionPerformed(evt);
            }
        });

        ChooserOfBorder.setBackground(new java.awt.Color(0, 0, 0));
        ChooserOfBorder.setText(" ");
        ChooserOfBorder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChooserOfBorder.setOpaque(true);
        ChooserOfBorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChooserOfBorderMouseClicked(evt);
            }
        });

        Background.setText("Background color:");

        ChooserOfBackground.setBackground(new java.awt.Color(153, 153, 153));
        ChooserOfBackground.setText(" ");
        ChooserOfBackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChooserOfBackground.setOpaque(true);
        ChooserOfBackground.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChooserOfBackgroundMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5))
                                .addComponent(Borders, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Dot)
                                .addGap(58, 58, 58)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChooserOfDot, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChooserOfBorder, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChooserOfBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(Changer)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Borders)
                    .addComponent(ChooserOfBorder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dot)
                    .addComponent(ChooserOfDot))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Background)
                    .addComponent(ChooserOfBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Changer)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChooserOfDotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChooserOfDotMouseClicked
        DotColor = JColorChooser.showDialog(this, "Dot color", Color.red);
        ChooserOfDot.setBackground(DotColor);
    }//GEN-LAST:event_ChooserOfDotMouseClicked

    private void ChangerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangerActionPerformed
        entered = true;
        this.dispose();
    }//GEN-LAST:event_ChangerActionPerformed

    private void ChooserOfBorderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChooserOfBorderMouseClicked
        borderColor = JColorChooser.showDialog(this, "Borders color", Color.BLACK);
        ChooserOfBorder.setBackground(borderColor);
    }//GEN-LAST:event_ChooserOfBorderMouseClicked

    private void ChooserOfBackgroundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChooserOfBackgroundMouseClicked
        BackgroundColor = JColorChooser.showDialog(this, "Background color", Color.gray);
        ChooserOfBackground.setBackground(BackgroundColor);
    }//GEN-LAST:event_ChooserOfBackgroundMouseClicked
   
    public Color getBorderColor() {
        return borderColor;
    }

    public Color getDotColor() {
        return DotColor;
    }

    public Color getBackgroundColor() {
        return BackgroundColor;
    }

    public boolean isEntered() {
        return entered;
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ColorSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColorSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColorSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColorSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ColorSettings dialog = new ColorSettings(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Borders;
    private javax.swing.JButton Changer;
    private javax.swing.JLabel ChooserOfBackground;
    private javax.swing.JLabel ChooserOfBorder;
    private javax.swing.JLabel ChooserOfDot;
    private javax.swing.JLabel Dot;
    // End of variables declaration//GEN-END:variables
}
