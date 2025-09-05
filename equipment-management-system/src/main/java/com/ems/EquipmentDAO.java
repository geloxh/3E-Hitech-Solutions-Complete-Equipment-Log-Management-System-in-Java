package com.ems;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * DATA ACCESS OBJECT (DAO) FOR HANDLING DATABASE OPERATIONS RELATED TO EQUIPMENT.
 * THIS CLASS PROVIDES METHODS TO INTERACT WITH THE EQUIPMENT TABLE IN THE DATABASE.
 * 
 */

 /**
  * @author geloxh
  *
  */

public class EquipmentDAO {
    private Connection connection;

    /**
     * CONSTRUCTS AN EquipmentDAO WITH THE GIVEN DATABASE CONNECTION.
     * 
     * @param connection THE DATABASE CONNECTION TO BE USED FOR EQUIPMENT OPERATIONS.
     * 
     */
    public EquipmentDAO(Connetion connection) {
        this.connection = connection;
    }

    /**
     * RETRIEVES ALL EQUIPMENT RECORDS FROM THE DATABASE
     * @return LIST OF EQUIPMENT OBJECTS FROM THE DATABASE
     * @throws SQLException IF A DATABASE ACCESS ERROR OCCURS OR THIS METHOD IS CALLED ON A CLOSED CONNECTION
     * 
     */

    public List<Equipment> getAllEquipment() throws SQLException {

        List<Equipment> equipmentList = new ArrayList<>();
        String sql = "SELECT EquipmentID, EquipmentName, EquipmentCode, Quantity, Supplier, Office FROM Equipment";

        try (PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Equipment eq = new Equipment(
                        rs.getInt("EquipmentID"),
                        rs.getString("EquipmentName"),
                        rs.getString("EquipmentCode"),
                        rs.getInt("Quantity"),
                        rs.getString("Supplier"),
                        rs.getString("Office")
                    );
                    equipmentList.add(eq);
                }
            }
            return equipmentList;
    }
}
