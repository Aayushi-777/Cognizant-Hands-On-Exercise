CREATE OR REPLACE PACKAGE EmployeeManagement AS
PROCEDURE HireEmployee
(
p_ID NUMBER,
p_Name VARCHAR2,
p_Position VARCHAR2,
p_Salary NUMBER,
p_Department VARCHAR2
);
PROCEDURE UpdateEmployee
(
p_ID NUMBER,
p_Salary NUMBER
);
FUNCTION AnnualSalary
(
p_ID NUMBER
)
RETURN NUMBER;
END EmployeeManagement;
/

CREATE OR REPLACE PACKAGE BODY EmployeeManagement AS
PROCEDURE HireEmployee
(
p_ID NUMBER,
p_Name VARCHAR2,
p_Position VARCHAR2,
p_Salary NUMBER,
p_Department VARCHAR2
)
IS
BEGIN
INSERT INTO Employees
VALUES
(
p_ID,
p_Name,
p_Position,
p_Salary,
p_Department,
SYSDATE
);
END;
PROCEDURE UpdateEmployee
(
p_ID NUMBER,
p_Salary NUMBER
)
IS
BEGIN
UPDATE Employees
SET Salary=p_Salary
WHERE EmployeeID=p_ID;
END;
FUNCTION AnnualSalary
(
p_ID NUMBER
)
RETURN NUMBER
IS
v_Salary NUMBER;
BEGIN
SELECT Salary
INTO v_Salary
FROM Employees
WHERE EmployeeID=p_ID;
RETURN v_Salary*12;
END;
END EmployeeManagement;
/