/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SysAdmin;

import UserInterface.user.EmergencyReport;
import Utility.MapCoordinates;
import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import static com.teamdev.jxbrowser.engine.RenderingMode.HARDWARE_ACCELERATED;
import com.teamdev.jxbrowser.view.swing.BrowserView;
import java.awt.Component;
import java.awt.CardLayout;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//import javax.swing.SwingUtilities;

/**
 *
 * @author azizvohra
 */
public class MapViewr extends javax.swing.JPanel {

    /**
     * Creates new form MapViewr
     */   //Browser browser;
    JPanel userProcessContainer;
    MapCoordinates locationPoint;
    Browser browser;

    public MapViewr(JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        locationPoint = new MapCoordinates();
        EngineOptions options
                = EngineOptions.newBuilder(HARDWARE_ACCELERATED).licenseKey("1BNDHFSC1G2HE4F9XRJJFQ2YTJU7NQLOVUMD0I8ERIS91V4X8YW7HI9ILGATUEM2BAB27E").build();
        Engine engine = Engine.newInstance(options);
        browser = engine.newBrowser();
        BrowserView view = BrowserView.newInstance(browser);
        browser.navigation().loadUrl("https://www.google.com/maps");

        mapCanvas.add(view, "a");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        setLocationBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mapCanvas = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane1.setPreferredSize(new java.awt.Dimension(1160, 750));

        jPanel1.setBackground(new java.awt.Color(250, 249, 251));
        jPanel1.setForeground(new java.awt.Color(25, 56, 82));

        setLocationBtn.setBackground(new java.awt.Color(153, 153, 255));
        setLocationBtn.setFont(new java.awt.Font("SF Pro Text", 1, 12)); // NOI18N
        setLocationBtn.setForeground(new java.awt.Color(255, 255, 255));
        setLocationBtn.setText("Set Location");
        setLocationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setLocationBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setLocationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1057, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(setLocationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(35, 35, 35))
        );

        jSplitPane1.setTopComponent(jPanel1);

        mapCanvas.setBackground(new java.awt.Color(255, 255, 255));
        mapCanvas.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(mapCanvas);

        add(jSplitPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 980));
    }// </editor-fold>//GEN-END:initComponents

    private void setLocationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setLocationBtnActionPerformed
//        // TODO add your handling code here:
        try {
//
            if (browser.url() != null) {
                System.out.println(browser.url());
                String[] a = browser.url().split("!3d", 0);
                String[] b = a[1].split("!4d");
                System.out.println("Lat" + b[0] + "  " + "Lon" + b[1]);
                double lat = Double.parseDouble(b[0]);
                double lon = Double.parseDouble(b[1]);
                locationPoint.setLatitudeCoordinate(lat);
                locationPoint.setLongitudeCoordinate(lon);
            }
            System.out.println("Lat" + locationPoint.getLatitudeCoordinate() + locationPoint.getLongitudeCoordinate());
            userProcessContainer.remove(this);

            Component[] componentArray = userProcessContainer.getComponents();
            System.out.println(userProcessContainer.getComponent(componentArray.length - 1) + "component");
            if (userProcessContainer.getComponent(componentArray.length - 1) instanceof PandemicRegistration) {
                PandemicRegistration orgManagement = (PandemicRegistration) userProcessContainer.getComponent(componentArray.length - 1);
                orgManagement.populateLongituteLatitude(locationPoint);
            } else if (userProcessContainer.getComponent(componentArray.length - 1) instanceof PharmacyRegistration) {
                PharmacyRegistration pharmaRegistration = (PharmacyRegistration) userProcessContainer.getComponent(componentArray.length - 1);
                pharmaRegistration.populateLongituteLatitude(locationPoint);
            } else if (userProcessContainer.getComponent(componentArray.length - 1) instanceof PoliceRegistration) {
                PoliceRegistration policeRegistration = (PoliceRegistration) userProcessContainer.getComponent(componentArray.length - 1);
                policeRegistration.populateLongituteLatitude(locationPoint);
            } else if (userProcessContainer.getComponent(componentArray.length - 1) instanceof FireDepartmentRegistration) {
                FireDepartmentRegistration fireDept = (FireDepartmentRegistration) userProcessContainer.getComponent(componentArray.length - 1);
                fireDept.populateLongituteLatitude(locationPoint);
            } else if (userProcessContainer.getComponent(componentArray.length - 1) instanceof BloodRegistration) {
                BloodRegistration fireDept = (BloodRegistration) userProcessContainer.getComponent(componentArray.length - 1);
                fireDept.populateLongituteLatitude(locationPoint);
            } else if (userProcessContainer.getComponent(componentArray.length - 1) instanceof EmergencyReport) {
                EmergencyReport emergencyReport = (EmergencyReport) userProcessContainer.getComponent(componentArray.length - 1);
                emergencyReport.populateLongituteLatitude(locationPoint);
            } else {
                System.out.println("ELSE LOCATION " + componentArray.length);
                System.out.println("ELSE CONTAINER " + userProcessContainer.toString());
            }

//            if (userProcessContainer.getComponent(componentArray.length - 1) instanceof EmergencyManageOrganizationJPanel) {
//                EmergencyManageOrganizationJPanel orgManagement = (EmergencyManageOrganizationJPanel) userProcessContainer.getComponent(componentArray.length - 1);
//                orgManagement.populateLongituteLatitude(locationPoint);
//            }else if (userProcessContainer.getComponent(componentArray.length - 1) instanceof IncidentManagerManageOrganizationJPanel) {
//                IncidentManagerManageOrganizationJPanel orgManagement = (IncidentManagerManageOrganizationJPanel) userProcessContainer.getComponent(componentArray.length - 1);
//                orgManagement.populateLongituteLatitude(locationPoint);
//            }else if (userProcessContainer.getComponent(componentArray.length - 1) instanceof VoluntaryOperatingUnitManageOrganizationsJPanel) {
//                VoluntaryOperatingUnitManageOrganizationsJPanel orgManagement = (VoluntaryOperatingUnitManageOrganizationsJPanel) userProcessContainer.getComponent(componentArray.length - 1);
//                orgManagement.populateLongituteLatitude(locationPoint);
//            }else if (userProcessContainer.getComponent(componentArray.length - 1) instanceof UserRegistrationJPanel) {
//                UserRegistrationJPanel orgManagement = (UserRegistrationJPanel) userProcessContainer.getComponent(componentArray.length - 1);
//                orgManagement.populateLongituteLatitude(locationPoint);
//            }else if(userProcessContainer.getComponent(componentArray.length - 1) instanceof ReportingAdminManageSceneJPanel){
//                ReportingAdminManageSceneJPanel reportingComponent = (ReportingAdminManageSceneJPanel) userProcessContainer.getComponent(componentArray.length - 1);
//                reportingComponent.populateLongituteLatitude(locationPoint);
//            }else if(userProcessContainer.getComponent(componentArray.length - 1) instanceof IndividualAdminManageSceneJPanel){
//                IndividualAdminManageSceneJPanel reportingComponent = (IndividualAdminManageSceneJPanel) userProcessContainer.getComponent(componentArray.length - 1);
//                reportingComponent.populateLongituteLatitude(locationPoint);
//            }else if(userProcessContainer.getComponent(componentArray.length - 1) instanceof HospitalAdminManageSceneJPanel){
//                HospitalAdminManageSceneJPanel reportingComponent = (HospitalAdminManageSceneJPanel) userProcessContainer.getComponent(componentArray.length - 1);
//                reportingComponent.populateLongituteLatitude(locationPoint);
//            }else if(userProcessContainer.getComponent(componentArray.length - 1) instanceof NGOAdminManageSceneJPanel){
//                NGOAdminManageSceneJPanel reportingComponent = (NGOAdminManageSceneJPanel) userProcessContainer.getComponent(componentArray.length - 1);
//                reportingComponent.populateLongituteLatitude(locationPoint);
//            }else if(userProcessContainer.getComponent(componentArray.length - 1) instanceof CompanyAdminManageSceneJPanel){
//                CompanyAdminManageSceneJPanel reportingComponent = (CompanyAdminManageSceneJPanel) userProcessContainer.getComponent(componentArray.length - 1);
//                reportingComponent.populateLongituteLatitude(locationPoint);
//            }else{
//                System.out.println("ELSE LOCATION " + componentArray.length);
//                System.out.println("ELSE CONTAINER " + userProcessContainer.toString());
//            }
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Set Position first");
        }

    }//GEN-LAST:event_setLocationBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel mapCanvas;
    private javax.swing.JButton setLocationBtn;
    // End of variables declaration//GEN-END:variables
}
