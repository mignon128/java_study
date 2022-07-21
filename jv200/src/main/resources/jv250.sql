DROP TABLE Sample10;
CREATE TABLE Sample10 (
	no			INT(11)			DEFAULT NULL,
	name		VARCHAR(20)		DEFAULT NULL,
	birthday	DATE			DEFAULT NULL,
	address		VARCHAR(40)		DEFAULT NULL
);

SELECT * FROM Sample10;

INSERT INTO Sample10 VALUES (1, '유비', '1996-10-25', '대구 중구 반월당');
INSERT INTO Sample10 VALUES (2, '관우', '1997-11-10', '대구 중구 중앙로');
INSERT INTO Sample10 VALUES (3, '장비', '1998-12-30', '대구 중구 반월당');

DROP TABLE Customer;
CREATE TABLE Customer (
	cid			BIGINT			PRIMARY KEY	AUTO_INCREMENT,
	name		VARCHAR(20)		NOT NULL,
	ssn			VARCHAR(14)		NOT NULL,
	phone		VARCHAR(14)		NOT NULL,
	customerId	VARCHAR(16)		NOT NULL,
	passwd		VARCHAR(16)		NOT NULL,
	regDate		TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
) AUTO_INCREMENT = 1001;

ALTER TABLE Customer CHANGE customerId UserId VARCHAR(16) NOT NULL;

SELECT * FROM Customer;

INSERT INTO Customer (name, ssn, phone, customerId, passwd) VALUES ('유비', '901213-1234567', '010-2323-2323', 'java', '1111'),('관우', '971110-1234567', '010-1234-5678', 'html', '2222'),('장비', '981230-1234567', '010-5678-1234', 'jsp', '3333');

UPDATE Customer SET ssn ='901212-1234567', phone = '010-3434-7890' WHERE cid=1001;

DELETE FROM Customer WHERE cid = 1007;
DELETE FROM Customer WHERE cid = 1008;

UPDATE Customer SET cid = '1001' WHERE name = '유비';
UPDATE Customer SET cid = '1002' WHERE name = '관우';
UPDATE Customer SET cid = '1003' WHERE name = '장비';

DROP TABLE Account;
CREATE TABLE Account (
	aid				BIGINT		PRIMARY KEY AUTO_INCREMENT,
	accountNum		VARCHAR(11)	NOT NULL,			-- 111-11-1111
	balance			DOUBLE		NOT NULL	DEFAULT 0.0,
	interestRate	DOUBLE		NOT NULL	DEFAULT 0.0,
	overdraft		DOUBLE		NOT NULL	DEFAULT 0.0,
	accountType		CHAR(1)		NOT NULL	DEFAULT	'S',
	customerId		BIGINT		NOT NULL,
	regDate			TIMESTAMP	NOT NULL	DEFAULT CURRENT_TIMESTAMP,
	
	CONSTRAINT Account_customerId_FK FOREIGN KEY (customerId) REFERENCES Customer(cid)
)AUTO_INCREMENT = 3001;

SELECT * FROM Account;

DELETE FROM Customer WHERE cid = 1007;

INSERT INTO Account (accountNum, balance, interestRate, overdraft, customerId) VALUES ('111-12-1234', 3000.0, 0.0, 0.0, 1001);
INSERT INTO Account (accountNum, balance, interestRate, overdraft, customerId) VALUES ('111-34-7895', 5000.0, 0.0, 0.0, 1003);

SELECT * FROM Account, Customer WHERE Account.customerId = Customer.cid AND Customer.ssn = '901213-1234567';

SELECT * FROM Account a INNER JOIN Customer c ON a.customerId = c.cid;

SELECT * FROM Account a INNER JOIN Customer c ON a.customerId = c.cid WHERE c.ssn = '901213-1234567';

ALTER TABLE Customer CHANGE UserId userId VARCHAR(16)	NOT NULL;

--CREATE INDEX CustomerIndex ON Customer(ssn);
DROP TABLE UserTable;
CREATE TABLE UserTable (
	uid			BIGINT			PRIMARY KEY AUTO_INCREMENT,
	userId		VARCHAR(20)		NOT NULL,
	passwd		VARCHAR(16)		NOT NULL,
	userName	VARCHAR(16)		NOT NULL,
	ssn			VARCHAR(14)		NOT NULL,
	email		VARCHAR(20)		NOT NULL,
	addr		VARCHAR(20)		NOT NULL,
	regDate		TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
) AUTO_INCREMENT = 2001;

SELECT * FROM UserTable;