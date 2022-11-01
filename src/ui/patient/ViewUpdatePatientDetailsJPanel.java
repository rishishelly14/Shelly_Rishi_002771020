/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package ui.patient;

import model.StringVerifier;
import model.Patient;
import java.awt.CardLayout;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rishi
 */
public class ViewUpdatePatientDetailsJPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form ViewPatientDetailsJPanel
     */
    private Patient patient;
    private JPanel userProcessContainer;
    private Boolean isEdit = Boolean.FALSE;
    
    public ViewUpdatePatientDetailsJPanel(JPanel upc, Patient patient, Boolean isEdit) {
        initComponents();
        this.userProcessContainer = upc;
        this.patient = patient;
        this.isEdit = isEdit;
        addVerifiers();
        populatePatientDetails();
        modifyTextFields(this.isEdit);
    }
    
    private void addVerifiers() {
        InputVerifier stringVerifier = new StringVerifier();
        primaryDocNameJTextField.setInputVerifier(stringVerifier);
        prefferedPharmacyJTextField.setInputVerifier(stringVerifier);
    }
    
    private void populatePatientDetails() {
        patientIDJTextField.setText(patient.getPatientID());
        primaryDocNameJTextField.setText(patient.getPrimaryDoctorName());
        prefferedPharmacyJTextField.setText(patient.getPrefferedPharmacy());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patientIDJLabel = new javax.swing.JLabel();
        primaryDocNameJLabel = new javax.swing.JLabel();
        prefferedPharmacyJLabel = new javax.swing.JLabel();
        patientIDJTextField = new javax.swing.JTextField();
        primaryDocNameJTextField = new javax.swing.JTextField();
        prefferedPharmacyJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        editJButton = new javax.swing.JButton();
        saveJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setMinimumSize(new java.awt.Dimension(500, 700));
        setPreferredSize(new java.awt.Dimension(500, 700));

        patientIDJLabel.setText("Patient ID");

        primaryDocNameJLabel.setText("Primary Doctor Name");

        prefferedPharmacyJLabel.setText("Preffered Pharmacy");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient Details");

        backJButton.setBackground(new java.awt.Color(0, 0, 0));
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        editJButton.setBackground(new java.awt.Color(255, 153, 153));
        editJButton.setText("Edit");
        editJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJButtonActionPerformed(evt);
            }
        });

        saveJButton.setBackground(new java.awt.Color(255, 153, 153));
        saveJButton.setText("Save");
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(editJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(saveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(patientIDJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(primaryDocNameJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(prefferedPharmacyJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(189, 189, 189)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(prefferedPharmacyJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(primaryDocNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(patientIDJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(452, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientIDJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientIDJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(primaryDocNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(primaryDocNameJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prefferedPharmacyJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prefferedPharmacyJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editJButton)
                    .addComponent(saveJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 284, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJButtonActionPerformed
        // TODO add your handling code here:
        modifyTextFields(true);
    }//GEN-LAST:event_editJButtonActionPerformed
    
    private void modifyTextFields(Boolean isEdit) {
        if (isEdit) {
            patientIDJTextField.setEnabled(true);
            primaryDocNameJTextField.setEnabled(true);
            prefferedPharmacyJTextField.setEnabled(true);
        } else {
            patientIDJTextField.setEnabled(false);
            primaryDocNameJTextField.setEnabled(false);
            prefferedPharmacyJTextField.setEnabled(false);
        }
    }

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
        // TODO add your handling code here:
        
        if (checkBlankInput()) {
            patient.setPatientID(patientIDJTextField.getText());
            patient.setPrimaryDoctorName(primaryDocNameJTextField.getText());
            patient.setPrefferedPharmacy(prefferedPharmacyJTextField.getText());
            JOptionPane.showMessageDialog(this, "Patient updated!!", "Update", 
                    JOptionPane.INFORMATION_MESSAGE);
            modifyTextFields(false);
        } else {
            JOptionPane.showMessageDialog(this, "Please enter correct values", 
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_saveJButtonActionPerformed
    private Boolean checkBlankInput() {
        if (patientIDJTextField.getText().length()==0
                || primaryDocNameJTextField.getText().length() == 0
                || prefferedPharmacyJTextField.getText().length() == 0) {
            return false;
        } else {
            return true;
        }
    }
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton editJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel patientIDJLabel;
    private javax.swing.JTextField patientIDJTextField;
    private javax.swing.JLabel prefferedPharmacyJLabel;
    private javax.swing.JTextField prefferedPharmacyJTextField;
    private javax.swing.JLabel primaryDocNameJLabel;
    private javax.swing.JTextField primaryDocNameJTextField;
    private javax.swing.JButton saveJButton;
    // End of variables declaration//GEN-END:variables
}
