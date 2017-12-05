
package view;

public class DotInputs extends javax.swing.JDialog {
    private int row, column;
    private String name;
    private boolean entered = false;
    /**
     * Creates new form DotInputs
     */
    public DotInputs(java.awt.Frame parent, boolean modal) {
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

        RowInput = new javax.swing.JLabel();
        ColumnInput = new javax.swing.JLabel();
        CreateADot = new javax.swing.JButton();
        Escape = new javax.swing.JButton();
        NameInput = new javax.swing.JLabel();
        NameOfDot = new javax.swing.JTextField();
        RowValue = new javax.swing.JComboBox<>();
        ColumnValue = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dot Inputs");

        RowInput.setText("Please enter in which row you would like to put a Dot:");

        ColumnInput.setText("Please enter in which column you would like to put a Dot:");

        CreateADot.setText("Create");
        CreateADot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateADotActionPerformed(evt);
            }
        });

        Escape.setText("Cancel");
        Escape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscapeActionPerformed(evt);
            }
        });

        NameInput.setText("Please enter the name of the Dot:");

        NameOfDot.setText("A");

        RowValue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ColumnValue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RowInput)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RowValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ColumnInput)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ColumnValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(CreateADot)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Escape)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NameInput)
                        .addGap(18, 18, 18)
                        .addComponent(NameOfDot)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RowInput)
                    .addComponent(RowValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ColumnInput)
                    .addComponent(ColumnValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameInput)
                    .addComponent(NameOfDot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateADot)
                    .addComponent(Escape))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateADotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateADotActionPerformed
        row = RowValue.getSelectedIndex();
        column = ColumnValue.getSelectedIndex();
        name = NameInput.getText();
        entered = true;
        this.dispose();
    }//GEN-LAST:event_CreateADotActionPerformed

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public String getName() {
        return name;
    }

    public boolean isEntered() {
        return entered;
    }
    
    
    
    private void EscapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscapeActionPerformed
        this.dispose();
    }//GEN-LAST:event_EscapeActionPerformed

    public void showProperties (int r, int c) {
        String[] rows = new String[r];
        String[] columns = new String[c];
        for (int i = 0; i < r; i++)
            rows[i] = "Row " + (i+1);
        RowValue.setModel(new javax.swing.DefaultComboBoxModel(rows));
        for (int i = 0; i < c; i++)
            columns[i] = "Column " + (i+1);
        ColumnValue.setModel(new javax.swing.DefaultComboBoxModel(columns));
        this.setVisible(true);
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
            java.util.logging.Logger.getLogger(DotInputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DotInputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DotInputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DotInputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DotInputs dialog = new DotInputs(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel ColumnInput;
    private javax.swing.JComboBox<String> ColumnValue;
    private javax.swing.JButton CreateADot;
    private javax.swing.JButton Escape;
    private javax.swing.JLabel NameInput;
    private javax.swing.JTextField NameOfDot;
    private javax.swing.JLabel RowInput;
    private javax.swing.JComboBox<String> RowValue;
    // End of variables declaration//GEN-END:variables
}
