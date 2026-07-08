SET SERVEROUTPUT ON;
DECLARE
CURSOR GenerateMonthlyStatements IS
SELECT AccountID,
       TransactionID,
       TransactionDate,
       Amount,
       TransactionType
FROM Transactions
WHERE TRUNC(TransactionDate,'MM') = TRUNC(SYSDATE,'MM');
rec GenerateMonthlyStatements%ROWTYPE;
BEGIN
OPEN GenerateMonthlyStatements;
LOOP
FETCH GenerateMonthlyStatements
INTO rec;
EXIT WHEN GenerateMonthlyStatements%NOTFOUND;
DBMS_OUTPUT.PUT_LINE
(
'Account : '||rec.AccountID||
' Transaction : '||rec.TransactionID||
' Date : '||rec.TransactionDate||
' Amount : '||rec.Amount||
' Type : '||rec.TransactionType
);
END LOOP;
CLOSE GenerateMonthlyStatements;
END;
/