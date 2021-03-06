/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printrecord;

import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Priyank H
 */
public class PrinterSystem extends javax.swing.JFrame {


    /**
     * Creates new form PrinterSystem
     */
    public PrinterSystem() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReceipt = new javax.swing.JTextArea();
        txtRefer = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCourse = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        txtStudentID = new javax.swing.JTextField();
        txtStudentName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDOB = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtTelephone = new javax.swing.JTextField();
        Print = new javax.swing.JButton();
        AddRecord = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Print Records");
        setPreferredSize(new java.awt.Dimension(1160, 700));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 8));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setText("Student Records");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(334, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 1100, 100);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        txtReceipt.setColumns(20);
        txtReceipt.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtReceipt.setRows(5);
        jScrollPane1.setViewportView(txtReceipt);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(590, 130, 520, 430);

        txtRefer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtRefer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        getContentPane().add(txtRefer);
        txtRefer.setBounds(290, 160, 270, 37);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Reference Number:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 160, 240, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Course Code:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 210, 200, 30);

        txtCourse.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtCourse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        getContentPane().add(txtCourse);
        txtCourse.setBounds(290, 210, 270, 40);

        txtTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        getContentPane().add(txtTitle);
        txtTitle.setBounds(290, 265, 270, 40);

        txtStudentID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtStudentID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        getContentPane().add(txtStudentID);
        txtStudentID.setBounds(290, 320, 270, 37);

        txtStudentName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtStudentName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        getContentPane().add(txtStudentName);
        txtStudentName.setBounds(290, 370, 270, 37);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Course Title:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 270, 190, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Student ID:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 320, 200, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Student Name:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 370, 200, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Date of Birth:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 420, 200, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Address:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 470, 210, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Telephone:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 520, 200, 30);

        txtDOB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtDOB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        getContentPane().add(txtDOB);
        txtDOB.setBounds(290, 420, 270, 40);

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        getContentPane().add(txtAddress);
        txtAddress.setBounds(290, 470, 270, 37);

        txtTelephone.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtTelephone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        getContentPane().add(txtTelephone);
        txtTelephone.setBounds(290, 520, 270, 37);

        Print.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Print.setText("Print");
        Print.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });
        getContentPane().add(Print);
        Print.setBounds(350, 580, 230, 50);

        AddRecord.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        AddRecord.setText("Add Record");
        AddRecord.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRecordActionPerformed(evt);
            }
        });
        getContentPane().add(AddRecord);
        AddRecord.setBounds(60, 580, 240, 50);

        Exit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Exit.setText("Exit");
        Exit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit);
        Exit.setBounds(890, 580, 210, 50);

        Clear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Clear.setText("Clear");
        Clear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        getContentPane().add(Clear);
        Clear.setBounds(630, 580, 210, 50);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        txtReceipt.setText("");
        txtRefer.setText("");
        txtCourse.setText("");
        txtTitle.setText("");
        txtStudentID.setText("");
        txtStudentName.setText("");
        txtDOB.setText("");
        txtAddress.setText("");
        txtTelephone.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        try {
            // TODO add your handling code here:
            txtReceipt.print();
        } catch (PrinterException ex) {
            Logger.getLogger(PrinterSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_PrintActionPerformed
    private JFrame frame;
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        frame=new JFrame();
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you wish to exit","Print Systems",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void AddRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRecordActionPerformed
        // TODO add your handling code here:
        
        txtReceipt.append("\t\t Student Record\n\n"+
                "Reference No.:\t\t"+ txtRefer.getText()+
                "\n=======================================\n"+
                "Course Code:\t\t"+ txtCourse.getText()+
                "\nCourse Title:\t\t"+ txtTitle.getText()+
                "\nStudent ID:\t\t"+ txtStudentID.getText()+
                "\nStudent Name:\t\t"+ txtStudentName.getText()+
                "\nDate of Birth:\t\t"+ txtDOB.getText()+
                "\nAddress:\t\t"+ txtAddress.getText()+
                "\nTelephone:\t\t"+ txtTelephone.getText());
    }//GEN-LAST:event_AddRecordActionPerformed

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
            java.util.logging.Logger.getLogger(PrinterSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrinterSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrinterSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrinterSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrinterSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddRecord;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Print;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCourse;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextArea txtReceipt;
    private javax.swing.JTextField txtRefer;
    private javax.swing.JTextField txtStudentID;
    private javax.swing.JTextField txtStudentName;
    private javax.swing.JTextField txtTelephone;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
