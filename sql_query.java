SELECT * FROM Customers;

SELECT Country FROM Customers;

SELECT DISTINCT Country FROM Customers;

SELECT COUNT(DISTINCT Country) FROM Customers;


//The WHERE clause is used to filter records.
//The WHERE clause is used to extract only those records that fulfill a specified condition.
SELECT * FROM Customers
WHERE Country='Mexico';


// SQL AND, OR and NOT Operators
SELECT * FROM Customers
WHERE Country='Germany' AND City='Berlin';

SELECT * FROM Customers
WHERE City='Berlin' OR City='München';

SELECT * FROM Customers
WHERE NOT Country='Germany';

//The ORDER BY keyword sorts the records in ascending order by default. To sort the records in descending order, use the DESC keyword.
SELECT * FROM Customers
ORDER BY Country DESC;

// AS 
SELECT 
   last_name, 
   first_name,
   point,
   (points + 10) * 100 AS 'discount factor'
   FROM Customers


// Insert
INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)
VALUES ('Cardinal', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', '4006', 'Norway');

INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)
VALUES ('Cardinal', 'Tom B. Erichsen', NULL, 'Stavanger', '4006', 'Norway');

/* NULL
A NULL value is different from a zero value
or a field that contains spaces. 
A field with a NULL value is one that has been left
blank during record creation! */

SELECT CustomerName, ContactName, Address
FROM Customers
WHERE Address IS NULL;

SELECT CustomerName, ContactName, Address
FROM Customers
WHERE Address IS NOT NULL;

//UPDATE
UPDATE Customers
SET ContactName = 'Alfred Schmidt', City= 'Frankfurt'
WHERE CustomerID = 1;

//update multiple records
UPDATE Customers
SET ContactName='Juan'
WHERE Country='Mexico';


//Delete
DELETE FROM Customers WHERE CustomerName='Alfreds Futterkiste';

// SQL TOP, LIMIT and ROWNUM Examples
SELECT TOP 3 * FROM Customers;
SELECT * FROM Customers LIMIT 3;
SELECT * FROM Customers WHERE ROWNUM <= 3;
SELECT TOP 50 PERCENT * FROM Customers;

//The MIN() function returns the smallest value of the selected column.
// The MAX() function returns the largest value of the selected column.
SELECT MIN(Price) AS SmallestPrice FROM Products;
SELECT MAX(Price) AS LargestPrice FROM Products;

/*
The COUNT() function returns the number of rows that matches a specified criterion.
The AVG() function returns the average value of a numeric column.
The SUM() function returns the total sum of a numeric column.
*/
SELECT COUNT(ProductID) FROM Products;
SELECT AVG(Price)FROM Products;
SELECT SUM(Quantity) FROM OrderDetails;


/*
LIKE Operator	Description
WHERE CustomerName LIKE 'a%'
	Finds any values that start with "a"
WHERE CustomerName LIKE '%a'
	Finds any values that end with "a"
WHERE CustomerName LIKE '%or%'	
    Finds any values that have "or" in any position
WHERE CustomerName LIKE '_r%'
	Finds any values that have "r" in the second position
WHERE CustomerName LIKE 'a_%'	
     Finds any values that start with "a" and are at least 2 characters in length
WHERE CustomerName LIKE 'a__%'	
     Finds any values that start with "a" and are at least 3 characters in length
WHERE ContactName LIKE 'a%o'	
    Finds any values that start with "a" and ends with "o"
*/
SELECT * FROM Customers WHERE City LIKE '%r%';


/*
Symbol	Description	Example
%	Represents zero or more characters	bl% finds bl, black, blue, and blob
_	Represents a single character	h_t finds hot, hat, and hit
[]	Represents any single character within the brackets	h[oa]t finds hot and hat, but not hit
^	Represents any character not in the brackets	h[^oa]t finds hit, but not hot and hat
-	Represents a range of characters	c[a-b]t finds cat and cbt

*/
//Using the [!charlist] Wildcard
// The two following SQL statements select all customers with a City NOT starting with "b", "s", or "p":
SELECT * FROM Customers WHERE City LIKE '[!bsp]%';



DDL:
// Create Database
CREATE DATABASE testDB;
// Drop Database
DROP DATABASE testDB;
//Back Database
BACKUP DATABASE testDB
TO DISK = 'D:\backups\testDB.bak';

//Create Table
CREATE TABLE Persons (
    PersonID int,
    LastName varchar(255),
    FirstName varchar(255),
    Address varchar(255),
    City varchar(255)
);

//drop table
DROP TABLE Shippers;

// truncate
TRUNCATE TABLE statement is used to delete the data inside a table, but not the table itself.
TRUNCATE TABLE table_name;

//Alter Table: adding column
ALTER TABLE Customers
ADD Email varchar(255);

//Alter Table: droping column
ALTER TABLE Customers
DROP COLUMN Email;



/*
The following constraints are commonly used in SQL:

NOT NULL - Ensures that a column cannot have a NULL value
UNIQUE - Ensures that all values in a column are different
PRIMARY KEY - A combination of a NOT NULL and UNIQUE. Uniquely identifies each row in a table
FOREIGN KEY - Uniquely identifies a row/record in another table
CHECK - Ensures that all values in a column satisfies a specific condition
DEFAULT - Sets a default value for a column when no value is specified
INDEX - Used to create and retrieve data from the database very quickly

*/

//NOT NULL
CREATE TABLE Persons (
    ID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255) NOT NULL,
    Age int
);

// UNIQUE
CREATE TABLE Persons (
    ID int NOT NULL UNIQUE,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int
);

//Primary Key  - MySQL
CREATE TABLE Persons (
    ID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    PRIMARY KEY (ID)
);

//Primary Key  - SQL / Oracle
CREATE TABLE Persons (
    ID int NOT NULL PRIMARY KEY,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int
);

//Foreign Key
CREATE TABLE Orders (
    OrderID int NOT NULL PRIMARY KEY,
    OrderNumber int NOT NULL,
    PersonID int FOREIGN KEY REFERENCES Persons(PersonID)
);

//remove Foreign key
ALTER TABLE Orders
DROP CONSTRAINT FK_PersonOrder;

// check
CREATE TABLE Persons (
    ID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int CHECK (Age>=18)
);

//Default
CREATE TABLE Persons (
    ID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    City varchar(255) DEFAULT 'Sandnes',
    OrderDate date DEFAULT GETDATE()
);

// Auto Increment
//In the example above, the starting value for IDENTITY is 1, and it will increment by 1 for each new record.
//Tip: To specify that the "Personid" column should start at value 10 and increment by 5, change it to IDENTITY(10,5)

CREATE TABLE Persons (
    Personid int IDENTITY(1,1) PRIMARY KEY,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int
);



// GROUP ... HAVING ....WHERE
SELECT Employees.LastName, COUNT(Orders.OrderID) AS NumberOfOrders
FROM Orders
INNER JOIN Employees ON Orders.EmployeeID = Employees.EmployeeID
WHERE LastName = 'Davolio' OR LastName = 'Fuller'
GROUP BY LastName
HAVING COUNT(Orders.OrderID) > 25