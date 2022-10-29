/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author rishi
 */
public class createPerson extends javax.swing.JPanel {

    /**
     * Creates new form createPerson
     */
     private JPanel rightpanel;
     private PersonDirectory PersonDirectory;
      private Person person;
   
    private Boolean isEdit = Boolean.FALSE;
    
    public createPerson(JPanel rightpanel,PersonDirectory personDirectory) {
        initComponents();
        this.PersonDirectory=personDirectory;
        this.rightpanel=rightpanel;
       
        
    }
    private void populatePersonsTable(ArrayList<Person> personsList) {
        DefaultTableModel model = (DefaultTableModel) tblperson.getModel();
        model.setRowCount(0);
        if(personsList.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "No Person's found. Please add"
                    + " Person's", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (Person person : personsList) {
            Object[] row = new Object[3];
            row[0] = person;
            row[1]= person.getAge();
            if(person.getPatient()!=null)
            {
                row[2] = person.getPatient().getPatientID();
            }
            else
            {
                row[2] = "Patient Not Created";
            }
            model.addRow(row);
        }
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblperson = new javax.swing.JTable();
        btnbackk = new javax.swing.JButton();
        btncreateperson = new javax.swing.JButton();
        btnviewperson = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        txtsearchperson = new javax.swing.JTextField();
        btnrefresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Person Directory");

        tblperson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Age", "Patient ID"
            }
        ));
        jScrollPane1.setViewportView(tblperson);

        btnbackk.setText("<--Back");
        btnbackk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackkActionPerformed(evt);
            }
        });

        btncreateperson.setText("Create Person");
        btncreateperson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreatepersonActionPerformed(evt);
            }
        });

        btnviewperson.setText("View Person");
        btnviewperson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewpersonActionPerformed(evt);
            }
        });

        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        btnrefresh.setText("Refresh");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnsearch)
                                .addGap(18, 18, 18)
                                .addComponent(txtsearchperson))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnbackk)
                                .addGap(18, 18, 18)
                                .addComponent(btncreateperson)))
                        .addGap(18, 18, 18)
                        .addComponent(btnviewperson)
                        .addGap(18, 18, 18)
                        .addComponent(btnrefresh))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbackk)
                    .addComponent(btncreateperson)
                    .addComponent(btnviewperson)
                    .addComponent(btnrefresh))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsearch)
                    .addComponent(txtsearchperson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(269, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
   
    private void btnbackkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackkActionPerformed
        // TODO add your handling code here:
         rightpanel.remove(this);
        CardLayout layout = (CardLayout) rightpanel.getLayout();
        layout.previous(rightpanel);
        
        
    }//GEN-LAST:event_btnbackkActionPerformed

    private void btncreatepersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreatepersonActionPerformed
        // TODO add your handling code here:
        enterdataperson edpJPanel= new enterdataperson(rightpanel, PersonDirectory);
        rightpanel.add("edpJPanel", edpJPanel);
        CardLayout layout=(CardLayout) rightpanel.getLayout();
        layout.next(rightpanel);
    }//GEN-LAST:event_btncreatepersonActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        // TODO add your handling code here:
        txtsearchperson.setText("");
        populatePersonsTable(PersonDirectory.getPersonHistory());
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void btnviewpersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewpersonActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblperson.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.", 
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person=(Person) tblperson.getValueAt(selectedRow, 0);
        /*pass userProcessContainer and Patient*/
        viewperson vJPanel= new viewperson(rightpanel, person,Boolean.FALSE);
        rightpanel.add("vJPanel", vJPanel);
        CardLayout layout=(CardLayout) rightpanel.getLayout();
        layout.next(rightpanel);
    }//GEN-LAST:event_btnviewpersonActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        String key= txtsearchperson.getText();
        if(key.length()==0)
        {
            JOptionPane.showMessageDialog(this, "Please enter key.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ArrayList<Person> searchPersons;
        searchPersons=PersonDirectory.searchPerson(key);
        populatePersonsTable(searchPersons);
    }//GEN-LAST:event_btnsearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbackk;
    private javax.swing.JButton btncreateperson;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnviewperson;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblperson;
    private javax.swing.JTextField txtsearchperson;
    // End of variables declaration//GEN-END:variables
}