package com.ems;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory

/**
 * @author geloxh
 */

public class EquipmentManagementSystem {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(EquipmentManagementSystem.class);
    
    /**
     * @param args the command line arguments
     */

     public static void main(String[] args) {
        // TODO code application logic here
        Login a = new Login();
        JavaConnectionDataBase jcD = new JavaConnectionDataBase();

        if (jcD.connectToDataBase() == null) {
            JOptionPane.showMessageDialog(null, "Cannot connect to database");
            LOGGER.error("Failed to connect to database");
        } else {
            a.setVisible(true);
            LOGGER.info("Application started successfully");
        } try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                UIManager.setLookAndFeel("com.jtattoo.plaf.acrypl.AcryplLookAndFeel");
            }
        }
        catch (Exception e) {
            LOGGER.warn("Could not set JTattoo look and feel. ", e);
        }
     }
}
