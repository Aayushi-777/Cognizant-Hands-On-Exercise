CREATE OR REPLACE FUNCTION HasSufficientBalance
(
    p_AccountID NUMBER,
    p_Amount NUMBER
)
RETURN BOOLEAN
IS
    v_Balance NUMBER;
BEGIN
    SELECT Balance
    INTO v_Balance
    FROM Accounts
    WHERE AccountID=p_AccountID;
    IF v_Balance>=p_Amount THEN
        RETURN TRUE;
    ELSE
        RETURN FALSE;
    END IF;
EXCEPTION
WHEN NO_DATA_FOUND THEN
    RETURN FALSE;
END;
/

SET SERVEROUTPUT ON;
DECLARE
    v_Result BOOLEAN;
BEGIN
    v_Result:=HasSufficientBalance(1,500);
    IF v_Result THEN
        DBMS_OUTPUT.PUT_LINE('Sufficient Balance');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Insufficient Balance');
    END IF;
END;
/