/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Image;
import javax.swing.ImageIcon;
import model.person;

/**
 *
 * @author Revanth
 */
public class viewJPanel extends javax.swing.JPanel {

    /**
     * 
     * Creates new form viewJPanel
     */ person Person;
    public viewJPanel(person Person) {
        initComponents();
        this.Person = Person;
        dispayPerson();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelProfile = new javax.swing.JLabel();
        labellName = new javax.swing.JLabel();
        labelGeographicalData = new javax.swing.JLabel();
        labelDateOfBirth = new javax.swing.JLabel();
        labelTelephoneNumber = new javax.swing.JLabel();
        labelFAXNumber = new javax.swing.JLabel();
        labelEmailAddress = new javax.swing.JLabel();
        labelSocialSecurityNumbers = new javax.swing.JLabel();
        labelMedicalRecordNumbers = new javax.swing.JLabel();
        labelBenificarNumbers = new javax.swing.JLabel();
        labelBankaccountNumber = new javax.swing.JLabel();
        labelCertificate = new javax.swing.JLabel();
        labelVehicleIdentifier = new javax.swing.JLabel();
        labelDeviceIdentifier = new javax.swing.JLabel();
        labelLinkedin = new javax.swing.JLabel();
        labelIPAddress = new javax.swing.JLabel();
        labelBiometric = new javax.swing.JLabel();
        labelPhoto = new javax.swing.JLabel();
        labelUniqueId = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtGeographicaldata = new javax.swing.JTextField();
        txtDateOfBirth = new javax.swing.JTextField();
        txtTelephoneNumber = new javax.swing.JTextField();
        txtFaxNumber = new javax.swing.JTextField();
        txtEmailAddress = new javax.swing.JTextField();
        txtSocialSecurityNumber = new javax.swing.JTextField();
        txtMedicalRecordNumber = new javax.swing.JTextField();
        txtHealthPlanNumber = new javax.swing.JTextField();
        txtBankAccountNumber = new javax.swing.JTextField();
        txtLicenseNumber = new javax.swing.JTextField();
        txtVehicleIdentifier = new javax.swing.JTextField();
        txtDeviceIdentifier = new javax.swing.JTextField();
        txtLinkedin = new javax.swing.JTextField();
        txtIPAddress = new javax.swing.JTextField();
        txtBiometricIdentifiers = new javax.swing.JTextField();
        txtPhoto = new javax.swing.JTextField();
        txtUniqueIdentifier = new javax.swing.JTextField();
        labelImage = new javax.swing.JLabel();

        labelProfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelProfile.setText("                                           View Profile");

        labellName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labellName.setText("Name");

        labelGeographicalData.setText("Geographic data");

        labelDateOfBirth.setText("Date of birth");

        labelTelephoneNumber.setText("Telephone numbers");

        labelFAXNumber.setText("FAX number");

        labelEmailAddress.setText("Email addresses");

        labelSocialSecurityNumbers.setText("Social Security number");

        labelMedicalRecordNumbers.setText("Medical record number");

        labelBenificarNumbers.setText("Health plan  number");

        labelBankaccountNumber.setText("Bank account numbers");

        labelCertificate.setText("License number");

        labelVehicleIdentifier.setText("Vehicle identifiers ");

        labelDeviceIdentifier.setText("Device identifiers ");

        labelLinkedin.setText("LinkedIn");

        labelIPAddress.setText("IP Address");

        labelBiometric.setText("Biometric identifiers");

        labelPhoto.setText("Full face photo");

        labelUniqueId.setText(" unique identifying number");

        txtEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailAddressActionPerformed(evt);
            }
        });

        labelImage.setText("Image");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelBankaccountNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelEmailAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelFAXNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTelephoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelDateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelGeographicalData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labellName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelSocialSecurityNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelMedicalRecordNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelBenificarNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(labelCertificate)
                    .addComponent(labelVehicleIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDeviceIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLinkedin)
                    .addComponent(labelIPAddress)
                    .addComponent(labelBiometric)
                    .addComponent(labelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUniqueId))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFaxNumber)
                    .addComponent(txtEmailAddress)
                    .addComponent(txtSocialSecurityNumber)
                    .addComponent(txtMedicalRecordNumber)
                    .addComponent(txtHealthPlanNumber)
                    .addComponent(txtBankAccountNumber)
                    .addComponent(txtLicenseNumber)
                    .addComponent(txtVehicleIdentifier)
                    .addComponent(txtDeviceIdentifier, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(txtLinkedin)
                    .addComponent(txtIPAddress)
                    .addComponent(txtBiometricIdentifiers)
                    .addComponent(txtPhoto)
                    .addComponent(txtUniqueIdentifier)
                    .addComponent(txtName)
                    .addComponent(txtGeographicaldata)
                    .addComponent(txtDateOfBirth)
                    .addComponent(txtTelephoneNumber))
                .addGap(26, 26, 26)
                .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labellName)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelGeographicalData)
                                    .addComponent(txtGeographicaldata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelDateOfBirth)
                                    .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelTelephoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelephoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(labelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFAXNumber)
                            .addComponent(txtFaxNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSocialSecurityNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSocialSecurityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMedicalRecordNumbers)
                            .addComponent(txtMedicalRecordNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelBenificarNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHealthPlanNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelBankaccountNumber)
                            .addComponent(txtBankAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelVehicleIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVehicleIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDeviceIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDeviceIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelLinkedin)
                            .addComponent(txtLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelIPAddress)
                            .addComponent(txtIPAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(labelBiometric))
                    .addComponent(txtBiometricIdentifiers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUniqueId)
                    .addComponent(txtUniqueIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailAddressActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelBankaccountNumber;
    private javax.swing.JLabel labelBenificarNumbers;
    private javax.swing.JLabel labelBiometric;
    private javax.swing.JLabel labelCertificate;
    private javax.swing.JLabel labelDateOfBirth;
    private javax.swing.JLabel labelDeviceIdentifier;
    private javax.swing.JLabel labelEmailAddress;
    private javax.swing.JLabel labelFAXNumber;
    private javax.swing.JLabel labelGeographicalData;
    private javax.swing.JLabel labelIPAddress;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel labelLinkedin;
    private javax.swing.JLabel labelMedicalRecordNumbers;
    private javax.swing.JLabel labelPhoto;
    private javax.swing.JLabel labelProfile;
    private javax.swing.JLabel labelSocialSecurityNumbers;
    private javax.swing.JLabel labelTelephoneNumber;
    private javax.swing.JLabel labelUniqueId;
    private javax.swing.JLabel labelVehicleIdentifier;
    private javax.swing.JLabel labellName;
    private javax.swing.JTextField txtBankAccountNumber;
    private javax.swing.JTextField txtBiometricIdentifiers;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtDeviceIdentifier;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtFaxNumber;
    private javax.swing.JTextField txtGeographicaldata;
    private javax.swing.JTextField txtHealthPlanNumber;
    private javax.swing.JTextField txtIPAddress;
    private javax.swing.JTextField txtLicenseNumber;
    private javax.swing.JTextField txtLinkedin;
    private javax.swing.JTextField txtMedicalRecordNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoto;
    private javax.swing.JTextField txtSocialSecurityNumber;
    private javax.swing.JTextField txtTelephoneNumber;
    private javax.swing.JTextField txtUniqueIdentifier;
    private javax.swing.JTextField txtVehicleIdentifier;
    // End of variables declaration//GEN-END:variables

    private void dispayPerson() {
       txtName.setText(Person.getName());
       txtGeographicaldata.setText(Person.getGeographicdata());
       txtDateOfBirth.setText(String.valueOf(Person.getDate_of_birth()));
       txtTelephoneNumber.setText(String.valueOf(Person.getTelephone_number()));
       txtFaxNumber.setText(String.valueOf(Person.getFax()));
       txtEmailAddress.setText(Person.getEmail_Address());
       txtSocialSecurityNumber.setText(String.valueOf(Person.getSocial_Security_Number()));
       txtMedicalRecordNumber.setText(String.valueOf(Person.getMedical_record_Number()));
       txtHealthPlanNumber.setText(String.valueOf(Person.getHealth_plan_beneficiary_number()));
       txtBankAccountNumber.setText(String.valueOf(Person.getBank_account_numbers()));
       txtLicenseNumber.setText(Person.getLicense_number());
       txtVehicleIdentifier.setText(Person.getVehicle_identifiers_and_serial_numbers_including_license_plates());
       txtDeviceIdentifier.setText(Person.getDevice_identifiers_and_serial_numbers());
       txtLinkedin.setText(Person.getLinkedIn());
       txtIPAddress.setText(Person.getInternet_protocol_addresses());
       txtBiometricIdentifiers.setText(Person.getBiometric_identifiers());
       txtPhoto.setText(String.valueOf(Person.getFull_face_photos_and_comparable_images()));
       txtUniqueIdentifier.setText(String.valueOf(Person.getUnique_identifying_number()));
       
       Image imm = Person.getImg();
       if(imm != null){ labelImage.setIcon(new ImageIcon(imm)); }
       
       
    }
}
