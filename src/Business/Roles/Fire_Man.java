/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.EcoSystem;
import Business.UserAcc.UserAcc;
import UserInterface.user.UserAreaJPanel;
import javax.swing.JPanel;
/**
 *
 * @author altaf
 */


public class Fire_Man {
     public JPanel createWorkArea(JPanel userProcessContainer, 
             UserAcc account,
             EcoSystem business) {
        return new UserAreaJPanel(userProcessContainer, account, business);
    }
     
     //fire_man driver file ,returns to userareaJpanel
}
