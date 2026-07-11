CREATE OR REPLACE PACKAGE CustomerManagement AS
PROCEDURE AddCustomer
(
p_ID NUMBER,
p_Name VARCHAR2,
p_DOB DATE,
p_Balance NUMBER
);
PROCEDURE UpdateCustomer
(
p_ID NUMBER,
p_Balance NUMBER
);
FUNCTION GetCustomerBalance
(
p_ID NUMBER
)
RETURN NUMBER;
END CustomerManagement;
/

CREATE OR REPLACE PACKAGE BODY CustomerManagement AS
PROCEDURE AddCustomer
(
p_ID NUMBER,
p_Name VARCHAR2,
p_DOB DATE,
p_Balance NUMBER
)
IS
BEGIN
INSERT INTO Customers
VALUES
(
p_ID,
p_Name,
p_DOB,
p_Balance,
SYSDATE
);
END;
PROCEDURE UpdateCustomer
(
p_ID NUMBER,
p_Balance NUMBER
)
IS
BEGIN
UPDATE Customers
SET Balance=p_Balance
WHERE CustomerID=p_ID;
END;

FUNCTION GetCustomerBalance
(
p_ID NUMBER
)
RETURN NUMBER
IS
v_Balance NUMBER;
BEGIN
SELECT Balance
INTO v_Balance
FROM Customers
WHERE CustomerID=p_ID;
RETURN v_Balance;
END;
END CustomerManagement;
/