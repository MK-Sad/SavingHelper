DROP TABLE IF EXISTS ACCOUNT;

CREATE TABLE ACCOUNT (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user VARCHAR(25) NOT NULL,
    balance INT DEFAULT 0
    );

INSERT INTO ACCOUNT (user, balance) VALUES
	('Monika', '163425'),
	('Robert', '327931'),
	('Ernest', '43572'),
	('Elena', '1201');