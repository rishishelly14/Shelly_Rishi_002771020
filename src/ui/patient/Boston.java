/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.patient;

import java.awt.CardLayout;
import model.Person;
import model.PersonDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rishi
 */
public class Boston extends javax.swing.JPanel {

    /**
     * Creates new form VitalSignReport
     */
    
    private PersonDirectory personDirectory;
    private JPanel userProcessContainer;
    public Boston() {
    }

    public Boston(JPanel userProcessContainer, PersonDirectory personDirectory) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
         initComponents();
        this.userProcessContainer = userProcessContainer;
        this.personDirectory = personDirectory;
        System.out.println(personDirectory.getPersonHistory().size());
        int len = personDirectory.getPersonHistory().size();
        ArrayList<Person> reportList = new ArrayList<>();
        int countA =0, totalA =0;
        int countB =0, totalB =0;
        int countC =0, totalC =0;
        int countD =0, totalD =0;
        int countE =0, totalE =0;
        int countF =0, totalF =0;
        int countG =0, totalG =0;
        int countH =0, totalH =0;
        
        reportList = personDirectory.getPersonHistory();
        for (int i =0; i<len; i++){
            if(reportList.get(i).getCommunity().equals("Roxbury")){
                totalA++;
                if(reportList.get(i).hasVitalSigns()){
                    countA++;
                }
                
            }
            
            else if(reportList.get(i).getCommunity().equals("Fenway")){
                totalB++;
                if(reportList.get(i).hasVitalSigns()){
                    countB++;
                }
                
            }
            else if(reportList.get(i).getCommunity().equals("Downtown")){
                totalC++;
                if(reportList.get(i).hasVitalSigns()){
                    countC++;
                }
                
            }
            else if(reportList.get(i).getCommunity().equals("Kenmore")){
                totalD++;
                if(reportList.get(i).hasVitalSigns()){
                    countD++;
                }
                
            }
            
            else if(reportList.get(i).getCommunity().equals("West Salem")){
                totalE++;
                if(reportList.get(i).hasVitalSigns()){
                    countE++;
                }
                
            }
            else if(reportList.get(i).getCommunity().equals("South Salem")){
                totalF++;
                if(reportList.get(i).hasVitalSigns()){
                    countF++;
                }
                
            }
            
            else if(reportList.get(i).getCommunity().equals("Barne Barton")){
                totalG++;
                if(reportList.get(i).hasVitalSigns()){
                    countG++;
                }
                
            }
            else if(reportList.get(i).getCommunity().equals("Beacon Park")){
                totalH++;
                if(reportList.get(i).hasVitalSigns()){
                    countH++;
                }
                
            } 
            
            
        }
        
        DefaultTableModel model = (DefaultTableModel) vieReportJTable.getModel();
        model.setRowCount(0);
        if(reportList.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "No Persons found. Please add Persons",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
       
            Object[] row = new Object[8];
            row[0] = "Roxbury";
            row[1]= ""+totalA;
            row[2]= ""+countA;
           // row[3] = (countA/totalA)*100;
            model.addRow(row);
            row[0] = "Fenway";
            row[1]= ""+totalB;
            row[2]= ""+countB;
           // row[3] = (countB/totalB)*100;
            model.addRow(row);
            row[0] = "Downtown";
            row[1]= ""+totalC;
            row[2]= ""+countC;
           // row[3] = (countC/totalC)*100;
            model.addRow(row);
            row[0] = "Kenmore";
            row[1]= ""+totalD;
            row[2]= ""+countD;
           // row[3] = (countD/totalD)*100;
//           model.addRow(row);
//            row[0] = "kandivali";
//            row[1]= ""+totalE;
//            row[2]= ""+countE;
//            //
//            model.addRow(row);
//            row[0] = "BORIVALI";
//            row[1]= ""+totalF;
//            row[2]= ""+countF;
//            //
//            model.addRow(row);
//            row[0] = "dhoni";
//            row[1]= ""+totalG;
//            row[2]= ""+countG;
//            //
//            model.addRow(row);
//            row[0] = "raina";
//            row[1]= ""+totalH;
//            row[2]= ""+countH;
           
            model.addRow(row);
        
        
        //System.out.println("total number of patients is "+count);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        vieReportJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        vieReportJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Community", "# total patients", "# abnormal patients"
            }
        ));
        jScrollPane1.setViewportView(vieReportJTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Boston Community");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(249, 249, 249))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable vieReportJTable;
    // End of variables declaration//GEN-END:variables
}
