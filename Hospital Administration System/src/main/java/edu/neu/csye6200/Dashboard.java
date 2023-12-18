/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.neu.csye6200;

/**
 *
 * @author 91790
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
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

        CreatePatient = new javax.swing.JButton();
        patientProfile = new javax.swing.JButton();
        appointmentScheduler = new javax.swing.JButton();
        prescriptionManagement = new javax.swing.JButton();
        billing = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CreatePatient.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CreatePatient.setForeground(new java.awt.Color(0, 153, 255));
        CreatePatient.setText("Create Patient");
        CreatePatient.setActionCommand("Patient Profile");
        CreatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatePatientActionPerformed(evt);
            }
        });

        patientProfile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        patientProfile.setForeground(new java.awt.Color(0, 153, 255));
        patientProfile.setText("Patient Profile");
        patientProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientProfileActionPerformed(evt);
            }
        });

        appointmentScheduler.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        appointmentScheduler.setForeground(new java.awt.Color(0, 153, 255));
        appointmentScheduler.setText("Appointment Scheduler");
        appointmentScheduler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentSchedulerActionPerformed(evt);
            }
        });

        prescriptionManagement.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        prescriptionManagement.setForeground(new java.awt.Color(0, 153, 255));
        prescriptionManagement.setText("Prescription Management");
        prescriptionManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prescriptionManagementActionPerformed(evt);
            }
        });

        billing.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        billing.setForeground(new java.awt.Color(0, 153, 255));
        billing.setText("Billing");
        billing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingActionPerformed(evt);
            }
        });

        Logout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Logout.setForeground(new java.awt.Color(0, 153, 255));
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Dashboard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CreatePatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(patientProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(appointmentScheduler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(billing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(prescriptionManagement, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
            .addComponent(Logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(CreatePatient, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patientProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(appointmentScheduler, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(billing, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prescriptionManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patientProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientProfileActionPerformed
    PatientProfile patientprofile= new PatientProfile();
        patientprofile.setVisible(true); 
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_patientProfileActionPerformed

    private void CreatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatePatientActionPerformed
        Createpatient newlogin= new Createpatient();
        newlogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CreatePatientActionPerformed

    private void appointmentSchedulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentSchedulerActionPerformed
      AppointmentScheduler appointmentscheduler= new AppointmentScheduler();  
       appointmentscheduler.setVisible(true);// TODO add your handling code here:
       this.dispose();
    }//GEN-LAST:event_appointmentSchedulerActionPerformed

    private void billingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingActionPerformed
    BillingModule billing= new BillingModule();
    billing.setVisible(true);// TODO add your handling code here:
    this.dispose();
    }//GEN-LAST:event_billingActionPerformed

    private void prescriptionManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prescriptionManagementActionPerformed
    PrescriptionManagement  prescriptionManagement = new   PrescriptionManagement();  
    prescriptionManagement.setVisible(true);// TODO add your handling code here:
    this.dispose();
    }//GEN-LAST:event_prescriptionManagementActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
        AdminLoginForm adminloginForm = new AdminLoginForm();
        adminloginForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreatePatient;
    private javax.swing.JButton Logout;
    private javax.swing.JButton appointmentScheduler;
    private javax.swing.JButton billing;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton patientProfile;
    private javax.swing.JButton prescriptionManagement;
    // End of variables declaration//GEN-END:variables
}