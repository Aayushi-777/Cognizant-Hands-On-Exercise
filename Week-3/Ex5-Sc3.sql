CREATE OR REPLACE TRIGGER CheckTransactionRules
BEFORE INSERT
ON Transactions
FOR EACH ROW
DECLARE
    v_Balance NUMBER;
BEGIN
    SELECT Balance
    INTO v_Balance
    FROM Accounts
    WHERE AccountID = :NEW.AccountID;
    IF UPPER(:NEW.TransactionType)='WITHDRAWAL' THEN
        IF :NEW.Amount > v_Balance THEN
            RAISE_APPLICATION_ERROR
            (
            -20001,
            'Insufficient Balance'
            );
        END IF;
    ELSIF UPPER(:NEW.TransactionType)='DEPOSIT' THEN
        IF :NEW.Amount<=0 THEN
            RAISE_APPLICATION_ERROR
            (
            -20002,
            'Deposit must be positive'
            );
        END IF;
    END IF;
END;
/