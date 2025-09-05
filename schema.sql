-- CREATE DATABASE
CREATE DATABASE equipment_management_system;
USE equipment_management_system;

-- CREATE TABLES

-- EQUIPMENT TABLE
CREATE TABLE Equipment (
    EquipmentId INT AUTO_INCREMENT PRIMARY KEY,
    EquipmentName VARCHAR(100) NOT NULL,
    EquipmentCode VARCHAR(50) UNIQUE NOT NULL,
    Quantity INT NOT NULL,
    Supplier VARCHAR(100),
    Office VARCHAR(100),
    PurchaseDate DATE,
    Condition VARCHAR(50),
    LastMaintenanceDate DATE
);

-- USERS TABLE
CREATE TABLE users {
    id INT AUTO_INCREMENT PRIMARY KEY,
    full_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    class VARCHAR(50),
    role ENUM('admin', 'user', 'it') DEFAULT 'it'
};

-- BORROW RECORDS TABLE
CREATE TABLE borrow_records (
    id INT AUTO_INCREMENT PRIMARY KEY,
    equipment_id INT NOT NULL,
    user_id INT NOT NULL,
    borrow_date DATETIME NOT NULL,
    expected_return_date DATETIME,
    actual_return_date DATETIME,
    status ENUM('active', 'returned', 'overdue') DEFAULT 'active',
    FOREIGN KEY (equipment_id) REFERENCES equipment(id),
    FOREIGN KEY (user_id) REFERENCES users(id)
);

-- CURRENT BORROWED EQUIPMENT
CREATE VIEW current_borrows AS
SELECT e.name AS equipment, u.full_name AS borrower, b.borrow_date, b.expected_return_date
FROM borrow_records b
JOIN equipment e ON b.equipment_id = e.id
JOIN users u ON b.user_id = user.id
WHERE b.status = 'active';