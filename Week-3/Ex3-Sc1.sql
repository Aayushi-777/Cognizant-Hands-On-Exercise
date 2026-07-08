CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
IS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE UPPER(AccountType) = 'SAVINGS';
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Monthly interest applied successfully.');
END;
/

BEGIN
    ProcessMonthlyInterest;
END;
/