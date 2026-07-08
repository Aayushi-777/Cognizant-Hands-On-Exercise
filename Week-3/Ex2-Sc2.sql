CREATE OR REPLACE PROCEDURE UpdateSalary
(
    p_EmpID NUMBER,
    p_Percentage NUMBER
)
IS
BEGIN
    UPDATE Employees
    SET Salary = Salary + Salary*p_Percentage/100
    WHERE EmployeeID = p_EmpID;
    IF SQL%ROWCOUNT = 0 THEN
        RAISE NO_DATA_FOUND;
    END IF;
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Salary Updated');
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        INSERT INTO ErrorLog(ErrorMessage,ErrorDate)
        VALUES('Employee ID not found',SYSDATE);
        DBMS_OUTPUT.PUT_LINE('Employee does not exist.');
    WHEN OTHERS THEN
        INSERT INTO ErrorLog(ErrorMessage,ErrorDate)
        VALUES(SQLERRM,SYSDATE);
END;
/