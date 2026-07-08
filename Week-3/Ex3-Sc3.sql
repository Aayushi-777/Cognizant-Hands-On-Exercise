CREATE OR REPLACE PROCEDURE TransferFunds
(
    p_FromAccount NUMBER,
    p_ToAccount NUMBER,
    p_Amount NUMBER
)
IS
    v_Balance NUMBER;
BEGIN
    SELECT Balance
    INTO v_Balance
    FROM Accounts
    WHERE AccountID=p_FromAccount
    FOR UPDATE;
    IF v_Balance<p_Amount THEN
        DBMS_OUTPUT.PUT_LINE('Insufficient Balance');
    ELSE
        UPDATE Accounts
        SET Balance=Balance-p_Amount
        WHERE AccountID=p_FromAccount;
        UPDATE Accounts
        SET Balance=Balance+p_Amount
        WHERE AccountID=p_ToAccount;
        COMMIT;
        DBMS_OUTPUT.PUT_LINE('Fund Transfer Successful');
    END IF;
EXCEPTION
WHEN NO_DATA_FOUND THEN
    DBMS_OUTPUT.PUT_LINE('Account Not Found');
WHEN OTHERS THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE(SQLERRM);
END;
/

BEGIN
    TransferFunds(1,2,500);
END;
/