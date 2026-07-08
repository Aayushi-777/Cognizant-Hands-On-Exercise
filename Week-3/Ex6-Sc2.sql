SET SERVEROUTPUT ON;
DECLARE
CURSOR ApplyAnnualFee IS
SELECT AccountID
FROM Accounts
FOR UPDATE;
v_Fee NUMBER:=100;
BEGIN
FOR rec IN ApplyAnnualFee LOOP
UPDATE Accounts
SET Balance=Balance-v_Fee
WHERE CURRENT OF ApplyAnnualFee;
DBMS_OUTPUT.PUT_LINE
(
'Annual fee deducted from Account '
||rec.AccountID
);
END LOOP;
COMMIT;
END;
/