-- CREATE DATABASE
CREATE DATABASE equipment_management_system;
USE equipment_management_system;

-- CREATE TABLES

-- EQUIPMENT TABLE
CREATE TABLE equipment (
    id INT AUTO_INCREMENT PRIMARY KEY,
    code VARCHAR(50) UNIQUE NOT NULL,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    supplier VARCHAR(100),
    classroom VARCHAR(50),
    status ENUM('available', 'borrowed', 'maintenance') DEFAULT 'available'
);
-- USERS TABLE
CREATE TABLE users {
    id INT AUTO_INCREMENT PRIMARY KEY,
    full_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
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

/**
 * SAMPLE DATA
 */

-- SAMPLE EQUIPMENT
INSERT INTO equipment (code, name, description, office)
VALUES ('E01', 'Laptop', 'Acer I5', "3E-Hitech");

-- SAMPLE USER
INSERT INTO users (full_name, email, class, role)
VALUES ('Patrick Santos', 'patrick.santos@3ehitech.com', '3E-Hitech', 'Sales Manager');