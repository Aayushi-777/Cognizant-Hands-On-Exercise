CREATE OR REPLACE PROCEDURE SafeTransferFunds
(
    p_FromAccount NUMBER,
    p_ToAccount NUMBER,
    p_Amount NUMBER
)
IS
    v_balance NUMBER;
BEGIN
    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_FromAccount
    FOR UPDATE;
    IF v_balance < p_Amount THEN
        RAISE_APPLICATION_ERROR(-20001,
        'Insufficient Balance');
    END IF;
    UPDATE Accounts
    SET Balance = Balance - p_Amount
    WHERE AccountID = p_FromAccount;
    UPDATE Accounts
    SET Balance = Balance + p_Amount
    WHERE AccountID = p_ToAccount;
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Transfer Successful');
EXCEPTION
    WHEN OTHERS THEN
        INSERT INTO ErrorLog(ErrorMessage,ErrorDate)
        VALUES(SQLERRM,SYSDATE);
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE(SQLERRM);
END;
/