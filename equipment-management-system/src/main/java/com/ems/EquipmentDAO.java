package com.ems;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EquipmentDAO {
    private Connection connection;

    public EquipmentDAO(Connetion connection) {
        this.connection = connection;
    }

    /**
     * RETRIEVES ALL EQUIPMENT RECORDS FROM THE DATABASE
     * @return LIST OF EQUIPMENT OBJECTS
     * @throws SQLException IF A DATABASE ACCESS ERROR OCCURS
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
