CREATE TABLE Category(
	cid			BIGINT			PRIMARY KEY AUTO_INCREMENT,
	cname 		VARCHAR(20)		NOT NULL,
	regDate   	TIMESTAMP		NOT NULL   DEFAULT CURRENT_TIMESTAMP
	
)AUTO_INCREMENT = 1001;

DROP TABLE Category;
SELECT * FROM Category;

CREATE TABLE Menu(
   mid      	BIGINT			PRIMARY KEY AUTO_INCREMENT,
   cid   		BIGINT			NOT NULL,
   menuname		VARCHAR(20)		NOT NULL,
   menuPrice	DOUBLE			NOT NULL,
   menuSize		VARCHAR(20)		NOT NULL,
   menuKcal		DOUBLE			NOT NULL,
   menuCount	INT				NOT NULL,
   imgName		VARCHAR(20)		NULL,
   regDate   	TIMESTAMP		NOT NULL   DEFAULT CURRENT_TIMESTAMP,
	
   CONSTRAINT Menu_cid_FK FOREIGN KEY(cid) REFERENCES Category(cid)
)AUTO_INCREMENT = 3001;

SELECT * FROM Menu;
SELECT count(*) FROM Menu;
DROP TABLE Menu;
