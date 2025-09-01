package com.ems;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 * @author geloxh
 */

public class EquipmentManagementSystem {
    /**
     * @param args the command line arguments
     */

     public static void main(String[] args) {
        // TODO code application logic here
        Login a = new Login();
        JavaConnectionDataBase jcD = new JavaConnectionDataBase();
        jcD.connectToDataBase();
        if (jcD.connectToDataBase() == null) {
            JOptionPane.showMessageDialog(null, "Cannot connect to database");
        } else {
            a.setVisible(true);
        } try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                UIManager.setLookAndFeel("com.jtattoo.plaf.acrypl.AcryplLookAndFeel");
            }
        }
        catch (Exception e) {
            
        }
     }
}
