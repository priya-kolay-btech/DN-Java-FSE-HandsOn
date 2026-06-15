-- ==========================================
-- Exercise 1: Control Structures
-- ==========================================

-- Scenario 1:
-- Apply 1% discount to loan interest rates
-- for customers above 60 years old

DECLARE
    CURSOR customer_cursor IS
        SELECT CustomerID, Age
        FROM Customers;

BEGIN
    FOR customer_rec IN customer_cursor LOOP

        IF customer_rec.Age > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = customer_rec.CustomerID;

        END IF;

    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Loan interest rates updated successfully.');

END;
/

-- ==========================================
-- Scenario 2:
-- Set VIP status for customers
-- with balance greater than 10000
-- ==========================================

DECLARE
    CURSOR customer_cursor IS
        SELECT CustomerID, Balance
        FROM Customers;

BEGIN
    FOR customer_rec IN customer_cursor LOOP

        IF customer_rec.Balance > 10000 THEN

            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = customer_rec.CustomerID;

        END IF;

    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('VIP customers updated successfully.');

END;
/

-- ==========================================
-- Scenario 3:
-- Print reminders for loans due
-- within the next 30 days
-- ==========================================

DECLARE
    CURSOR loan_cursor IS
        SELECT CustomerID,
               LoanID,
               DueDate
        FROM Loans
        WHERE DueDate BETWEEN SYSDATE AND SYSDATE + 30;

BEGIN
    FOR loan_rec IN loan_cursor LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan '
            || loan_rec.LoanID
            || ' for Customer '
            || loan_rec.CustomerID
            || ' is due on '
            || TO_CHAR(loan_rec.DueDate, 'DD-MON-YYYY')
        );

    END LOOP;

END;
/