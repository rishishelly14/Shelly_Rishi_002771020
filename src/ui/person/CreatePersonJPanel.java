/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package ui.person;
import model.IntegerVerifier;
import model.StringVerifier;
import model.Person;
import model.PersonDirectory;
import java.awt.CardLayout;
import javax.swing.InputVerifier;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rishi
 */
public class CreatePersonJPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form CreatePatientJPanel
     */
    private PersonDirectory personDirectory;
    private JPanel userProcessContainer;
    
    public CreatePersonJPanel(JPanel userProcessContainer,PersonDirectory personDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.personDirectory = personDirectory;
        addVerifiers();
    }
    
    private void addVerifiers() {
        InputVerifier integerVerifier = new IntegerVerifier();
        personAgeJTextField.setInputVerifier(integerVerifier);
        InputVerifier stringVerifier = new StringVerifier();
        pesonNameJTextField.setInputVerifier(stringVerifier);
        InputVerifier integerVerifier1 = new IntegerVerifier();
        personWeightJTextField.setInputVerifier(integerVerifier1);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        personAgeJTextField = new javax.swing.JTextField();
        addPersonJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        patientNameJLabel = new javax.swing.JLabel();
        AgeJLabel = new javax.swing.JLabel();
        pesonNameJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        weightjLabel = new javax.swing.JLabel();
        personWeightJTextField = new javax.swing.JTextField();
        addressjLabel = new javax.swing.JLabel();
        cityjLabel = new javax.swing.JLabel();
        personAddressJTextField = new javax.swing.JTextField();
        personCommunityJTextField = new javax.swing.JLabel();
        personCommunityjComboBox = new javax.swing.JComboBox<>();
        personCityCombobox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 204, 204));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        personAgeJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personAgeJTextFieldActionPerformed(evt);
            }
        });

        addPersonJButton.setBackground(new java.awt.Color(0, 0, 0));
        addPersonJButton.setForeground(new java.awt.Color(255, 255, 255));
        addPersonJButton.setText("Create Profile");
        addPersonJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPersonJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Person Profile");

        patientNameJLabel.setText("Person Name: ");
        patientNameJLabel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                patientNameJLabelKeyPressed(evt);
            }
        });

        AgeJLabel.setText("Age : ");

        pesonNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesonNameJTextFieldActionPerformed(evt);
            }
        });
        pesonNameJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pesonNameJTextFieldKeyPressed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(0, 0, 0));
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText(">>Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        weightjLabel.setText("Weight: ");

        personWeightJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personWeightJTextFieldActionPerformed(evt);
            }
        });

        addressjLabel.setText("Address:");

        cityjLabel.setText("City:");

        personCommunityJTextField.setText("Community:");

        personCommunityjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select A City First", "Roxbury", "Fenway", "Downtown", "Kenmore", "West Salem", "South Salem", " ", " " }));
        personCommunityjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personCommunityjComboBoxActionPerformed(evt);
            }
        });

        personCityCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select  An Option", "Boston", "Salem", " " }));
        personCityCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personCityComboboxActionPerformed(evt);
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
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(373, 373, 373)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(weightjLabel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(patientNameJLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cityjLabel)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pesonNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(personWeightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(personCityCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(personCommunityJTextField)
                                    .addComponent(AgeJLabel)
                                    .addComponent(addressjLabel))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(personAgeJTextField)
                                    .addComponent(personAddressJTextField)
                                    .addComponent(personCommunityjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(addPersonJButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientNameJLabel)
                    .addComponent(pesonNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgeJLabel)
                    .addComponent(personAgeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(personWeightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressjLabel)
                    .addComponent(personAddressJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityjLabel)
                    .addComponent(personCityCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personCommunityJTextField)
                    .addComponent(personCommunityjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(addPersonJButton)
                .addGap(178, 178, 178)
                .addComponent(backJButton)
                .addGap(80, 80, 80))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addPersonJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPersonJButtonActionPerformed
        // TODO add your handling code here:
        if (checkBlankInput()==Boolean.TRUE)
        {
            Person person=personDirectory.createAndAddPerson();
            person.setPersonName(pesonNameJTextField.getText());
            person.setAge(Integer.parseInt(personAgeJTextField.getText()));
            person.setweight(Integer.parseInt(personWeightJTextField.getText()));
            person.setCommunity((String)personCommunityjComboBox.getSelectedItem());
            person.setCity((String)personCityCombobox.getSelectedItem());
            //person.setCity(personCityJTextField.getText());
            person.setAddress(personAddressJTextField.getText());
            
            JOptionPane.showMessageDialog(this, "Person added!!", "Update",
                    JOptionPane.INFORMATION_MESSAGE);
            clearFields();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please enter all values",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addPersonJButtonActionPerformed
    private void clearFields()
    {
        pesonNameJTextField.setText("");
        personAgeJTextField.setText("");
        personWeightJTextField.setText("");
        personAddressJTextField.setText("");
       // personCityJTextField.setText("");
       
     
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
    }
    private Boolean checkBlankInput()
    {
        if(pesonNameJTextField.getText().length()==0
                ||personAgeJTextField.getText().length()==0 || personAddressJTextField.getText().length()==0 
                || personWeightJTextField.getText().length()==0)
                

        {
            return false;
        }
        else{
            return true;
        }
    }
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void personWeightJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personWeightJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personWeightJTextFieldActionPerformed

    private void personCommunityjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personCommunityjComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personCommunityjComboBoxActionPerformed

    private void personCityComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personCityComboboxActionPerformed
        // TODO add your handling code here:
        
        try{
            
            if (personCityCombobox.getSelectedItem().equals("Select  An Option"))
            {   personCommunityjComboBox.removeAllItems();

                personCommunityjComboBox.addItem("Select A City First");
                

            }
            else
            
            
            if (personCityCombobox.getSelectedItem().equals("Boston"))
            {   personCommunityjComboBox.removeAllItems();

                personCommunityjComboBox.addItem("Roxbury");
                personCommunityjComboBox.addItem("Fenway");
                personCommunityjComboBox.addItem("Downtown");
                personCommunityjComboBox.addItem("Kenmore");

            }
            else
            if (personCityCombobox.getSelectedItem().equals("Salem"))
            {   personCommunityjComboBox.removeAllItems();

                personCommunityjComboBox.addItem("West Salem");
                personCommunityjComboBox.addItem("South Salem");
                

            }
           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_personCityComboboxActionPerformed

    private void pesonNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesonNameJTextFieldActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_pesonNameJTextFieldActionPerformed

    private void personAgeJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personAgeJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personAgeJTextFieldActionPerformed

    private void patientNameJLabelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_patientNameJLabelKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientNameJLabelKeyPressed

    private void pesonNameJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesonNameJTextFieldKeyPressed
        // TODO add your handling code here:
        char C = evt.getKeyChar();
        if (Character.isLetter(C)|| Character.isWhitespace(C) || Character.isISOControl(C)){
        
           pesonNameJTextField.setEditable(true);
        
        }
        
        else{
        
            pesonNameJTextField.setEditable(true);
            JOptionPane.showMessageDialog(null, "Please Enter a Valid Name");
        
        }
    }//GEN-LAST:event_pesonNameJTextFieldKeyPressed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeJLabel;
    private javax.swing.JButton addPersonJButton;
    private javax.swing.JLabel addressjLabel;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel cityjLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel patientNameJLabel;
    private javax.swing.JTextField personAddressJTextField;
    private javax.swing.JTextField personAgeJTextField;
    private javax.swing.JComboBox<String> personCityCombobox;
    private javax.swing.JLabel personCommunityJTextField;
    private javax.swing.JComboBox<String> personCommunityjComboBox;
    private javax.swing.JTextField personWeightJTextField;
    private javax.swing.JTextField pesonNameJTextField;
    private javax.swing.JLabel weightjLabel;
    // End of variables declaration//GEN-END:variables
}
