CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus
(
    p_Department Employees.Department%TYPE,
    p_BonusPercent NUMBER
)
IS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_BonusPercent/100)
    WHERE Department = p_Department;
    IF SQL%ROWCOUNT = 0 THEN
        DBMS_OUTPUT.PUT_LINE('No employees found.');
    ELSE
        COMMIT;
        DBMS_OUTPUT.PUT_LINE('Bonus Updated Successfully.');
    END IF;
END;
/

BEGIN
    UpdateEmployeeBonus('IT',10);
END;
/