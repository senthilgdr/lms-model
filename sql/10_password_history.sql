DROP TABLE PASSWORD_HISTORY;

CREATE TABLE PASSWORD_HISTORY( ID INT PRIMARY KEY AUTO_INCREMENT,EMP_ID INT NOT NULL,OLD_PASSWORD VARCHAR(100) NOT NULL ,
NEW_PASSWORD VARCHAR(100) NOT NULL,CREATED_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
CONSTRAINT PASSWORD_HISTORY_EMP_ID_FK FOREIGN KEY ( EMP_ID) REFERENCES EMPLOYEES(ID));

INSERT INTO PASSWORD_HISTORY ( EMP_ID, OLD_PASSWORD,NEW_PASSWORD,CREATED_DATE)
VALUES 
( 1, "pass","pass1",now());


SELECT * FROM PASSWORD_HISTORY ;