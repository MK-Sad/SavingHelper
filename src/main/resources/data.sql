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

DROP TABLE IF EXISTS ACCOUNT_TRANSACTION;

CREATE TABLE ACCOUNT_TRANSACTION (
    id INT AUTO_INCREMENT PRIMARY KEY,
    date DATE NOT NULL,
    user VARCHAR(25) NOT NULL,
    amount INT DEFAULT 0,
    current_account_balance INT DEFAULT 0,
    category VARCHAR(25) NOT NULL,
    description VARCHAR(25) NOT NULL
    );

