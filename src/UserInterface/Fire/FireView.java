/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Fire;

import Business.DatabaseUtil.DB4OUtil;
import Business.EcoSystem;
import Business.UserAcc.UserAcc;
import UserInterface.Police.PoliceDisplay;
import Utility.MapCoordinates;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 *  @author azizvohra
 */
public class FireView extends javax.swing.JPanel {
    
    
    private UserAcc userAcc;
    private EcoSystem system;
    private JPanel container;
    private DB4OUtil dB4OUtil;
    Timer timer;
    
    private void Time() {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date= new Date();
                DateFormat timeFormat =  new SimpleDateFormat("HH:mm a");
                String time = timeFormat.format(date);
                timeLabel1.setText(time);
            }
        };
        timer = new Timer(100, actionListener);
        timer.setInitialDelay(0);
        timer.start();
    }
    /**
     * Creates new form FireView
     * @param userProcessContainer
     * @param userAcc
     * @param ecosystem
     */
    public FireView(JPanel userProcessContainer, UserAcc userAcc,EcoSystem ecosystem) {
        initComponents();
        this.system = ecosystem;
        this.container = userProcessContainer;
        this.userAcc = userAcc;
        this.dB4OUtil = DB4OUtil.getInstance();
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
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fireDepartmentPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        goBack = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel14 = new javax.swing.JPanel();
        timeLabel1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rightSidePanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(250, 249, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel7.setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel8.setBackground(new java.awt.Color(245, 245, 245));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1020, -1, -1));
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo/safe together-logos_transparent copy.png"))); // NOI18N
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 90));

        fireDepartmentPanel.setBackground(new java.awt.Color(255, 255, 255));
        fireDepartmentPanel.setPreferredSize(new java.awt.Dimension(100, 48));
        fireDepartmentPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fireDepartmentPanelMousePressed(evt);
            }
        });
        fireDepartmentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-medical-expenses-insurance-24.png"))); // NOI18N
        fireDepartmentPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, -1));

        jLabel9.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(115, 120, 128));
        jLabel9.setText("Fire Department");
        fireDepartmentPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel9.add(fireDepartmentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 290, 60));

        goBack.setBackground(new java.awt.Color(255, 255, 255));
        goBack.setPreferredSize(new java.awt.Dimension(100, 48));
        goBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                goBackMousePressed(evt);
            }
        });
        goBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-logout-24.png"))); // NOI18N
        goBack.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, -1));

        jLabel22.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(115, 120, 128));
        jLabel22.setText("Return");
        goBack.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel9.add(goBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 780, 290, 60));
        jPanel9.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 770, 290, -1));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 288, 1080));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timeLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        timeLabel1.setText("3:45 PM");
        jPanel14.add(timeLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, -1, -1));

        jLabel23.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel23.setText("Fire");
        jPanel14.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel4.setForeground(new java.awt.Color(152, 151, 151));
        jLabel4.setText("Manage everything related to Pharmaceutical Enterprises");
        jPanel14.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jPanel8.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1630, 90));

        rightSidePanel.setBackground(new java.awt.Color(250, 249, 251));
        rightSidePanel.setLayout(new java.awt.CardLayout());
        jPanel8.add(rightSidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 1160, 750));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fireDepartmentPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fireDepartmentPanelMousePressed
        // TODO add your handling code here:
        checkEmergency();
    }//GEN-LAST:event_fireDepartmentPanelMousePressed

    private void goBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMousePressed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_goBackMousePressed

    private void checkEmergency() {
        
        fireDepartmentPanel.setBackground(new Color(213,230,249));

        FireDisplay pr=new FireDisplay (system, rightSidePanel,userAcc);

        rightSidePanel.add(pr);
        CardLayout layout = (CardLayout) rightSidePanel.getLayout();
        layout.next(rightSidePanel);
    
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fireDepartmentPanel;
    private javax.swing.JPanel goBack;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPanel rightSidePanel;
    private javax.swing.JLabel timeLabel1;
    // End of variables declaration//GEN-END:variables
}
