CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment
(
    p_LoanAmount NUMBER,
    p_InterestRate NUMBER,
    p_Years NUMBER
)
RETURN NUMBER
IS
    v_EMI NUMBER;
    r NUMBER;
    n NUMBER;
BEGIN
    r:=p_InterestRate/(12*100);
    n:=p_Years*12;
    v_EMI:=(p_LoanAmount*r*POWER((1+r),n))
          /(POWER((1+r),n)-1);
    RETURN ROUND(v_EMI,2);
END;
/

SET SERVEROUTPUT ON;
DECLARE
    v_EMI NUMBER;
BEGIN
    v_EMI:=CalculateMonthlyInstallment
    (
        500000,
        8,
        10
    );
    DBMS_OUTPUT.PUT_LINE('Monthly EMI = '||v_EMI);
END;
/