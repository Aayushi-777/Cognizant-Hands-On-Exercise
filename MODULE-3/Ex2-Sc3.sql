CREATE OR REPLACE PROCEDURE AddNewCustomer
(
    p_ID NUMBER,
    p_Name VARCHAR2,
    p_DOB DATE,
    p_Balance NUMBER
)
IS
BEGIN
    INSERT INTO Customers
    (
        CustomerID,
        Name,
        DOB,
        Balance,
        LastModified
    )
    VALUES
    (
        p_ID,
        p_Name,
        p_DOB,
        p_Balance,
        SYSDATE
    );
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Customer Added');
EXCEPTION
    WHEN DUP_VAL_ON_INDEX THEN
        INSERT INTO ErrorLog(ErrorMessage,ErrorDate)
        VALUES('Duplicate Customer ID',SYSDATE);
        DBMS_OUTPUT.PUT_LINE('Customer already exists.');
    WHEN OTHERS THEN
        INSERT INTO ErrorLog(ErrorMessage,ErrorDate)
        VALUES(SQLERRM,SYSDATE);
END;
/