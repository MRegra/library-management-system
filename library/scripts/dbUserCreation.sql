CREATE USER 'librarian'@'localhost' IDENTIFIED BY 'password123';
CREATE DATABASE IF NOT EXISTS library;
GRANT ALL PRIVILEGES ON library.* TO 'librarian'@'localhost';
ALTER USER 'librarian'@'localhost' IDENTIFIED WITH mysql_native_password BY 'password123';