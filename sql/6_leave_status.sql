DROP TABLE LEAVE_STATUS;

CREATE TABLE LEAVE_STATUS
( 
ID INT PRIMARY KEY,
CODE VARCHAR(100) NOT NULL,
DESCRIPTION VARCHAR(100) NOT NULL,
ACTIVE TINYINT DEFAULT 1,
CONSTRAINT LEAVE_STATUS_CODE_UQ UNIQUE ( CODE )
);

INSERT INTO LEAVE_STATUS ( ID, CODE, DESCRIPTION)
VALUES 
( 1, 'APPLIED','Applied'),
( 2, 'APPROVED','Approved'),
( 3, 'REJECTED','Rejected'),
( 4, 'CANCELLED','Cancelled');

SELECT * FROM LEAVE_STATUS ;