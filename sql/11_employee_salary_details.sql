DROP TABLE EMPLOYEE_SALARY_DETAILS;

CREATE TABLE EMPLOYEE_SALARY_DETAILS ( 
ID INT PRIMARY KEY AUTO_INCREMENT, 
EMP_ID INT NOT NULL,
BASIC_PAY INT NOT NULL,
HRA INT NOT NULL,
CONVEYANCE INT NOT NULL,
SPECIAL_ALLOWANCE INT NOT NULL,
MEDICAL_INSURANCE INT NOT NULL,
CONSTRAINT EMPLOYEE_SALARY_DETAILS_EMP_ID_FK FOREIGN KEY ( EMP_ID)
REFERENCES EMPLOYEES( ID)
);

ALTER TABLE EMPLOYEE_SALARY_DETAILS ADD CONSTRAINT EMP_ID_UQ UNIQUE ( EMP_ID);

INSERT INTO EMPLOYEE_SALARY_DETAILS ( EMP_ID , BASIC_PAY,HRA,CONVEYANCE,SPECIAL_ALLOWANCE,MEDICAL_INSURANCE)
				VALUES ( 1, 10000,1000,1600,25000,1650)

SELECT * FROM EMPLOYEE_SALARY_DETAILS;

