SET SERVEROUTPUT ON;
DECLARE
CURSOR UpdateLoanInterestRates IS
SELECT LoanID,
       InterestRate
FROM Loans
FOR UPDATE;
BEGIN
FOR rec IN UpdateLoanInterestRates LOOP
UPDATE Loans
SET InterestRate=rec.InterestRate+0.5
WHERE CURRENT OF UpdateLoanInterestRates;
DBMS_OUTPUT.PUT_LINE
(
'Loan '
||rec.LoanID||
' Updated'
);
END LOOP;
COMMIT;
END;
/