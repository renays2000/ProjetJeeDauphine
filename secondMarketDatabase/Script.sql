--<ScriptOptions statementTerminator=";"/>

CREATE TABLE users (
	id INT NOT NULL,
	identifiant VARCHAR(255) NOT NULL,
	motdepasse VARCHAR(255) NOT NULL,
	email VARCHAR(255) NOT NULL,
	PRIMARY KEY (id)
) ENGINE=InnoDB;

CREATE UNIQUE INDEX identifiant ON users (identifiant ASC);

