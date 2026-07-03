ALTER TABLE Customers ADD IsVIP CHAR(1);
SET SERVEROUTPUT ON;
BEGIN
    FOR rec IN (SELECT CustomerID, Balance
                FROM Customers)
    LOOP
        IF rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'Y'
            WHERE CustomerID = rec.CustomerID;
            DBMS_OUTPUT.PUT_LINE(
                'Customer '
                || rec.CustomerID
                || ' promoted to VIP.'
            );
        ELSE
            UPDATE Customers
            SET IsVIP = 'N'
            WHERE CustomerID = rec.CustomerID;
        END IF;
    END LOOP;
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('VIP status updated.');
END;
/