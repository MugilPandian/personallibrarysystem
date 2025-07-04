-- THis is the script for the inital creation of Database and the respective Tables configured

SHOW DATABASES;

-- Drop Database if it has been already created
DROP DATABASE IF EXISTS library;

-- Create Database "Library"
CREATE DATABASE Library;

-- Switch to the created Database "Library"
USE Library;

-- Create Books Table under Library Schema
CREATE TABLE Books(
  BookID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  Title VARCHAR(255) NOT NULL,
  ISBN VARCHAR(255) UNIQUE,
  AuthorID INT NOT NULL,
  GenreID INT NOT NULL,
  TotPages INT,
  Synopsis VARCHAR(255),
  ReleasedDate DATE,
  PurchasedDate DATE,
  PublisherID INT NOT NULL
);

-- Sample Data for Books Table
INSERT INTO 
	Books(Title,ISBN,AuthorID,GenreID,TotPages,Synopsis,ReleasedDate,PurchasedDate,PublisherID) 
VALUES
  ("Beloved","9781400033416",1,1,324,"A former enslaved woman is haunted by the ghost of her dead daughter in post-Civil War America, exploring trauma, memory, and motherhood.","1987-09-16","2012-09-17",1),
  ("Sula","9781400033430",2,2,192,"Two Black women grow up as friends in a small town but choose different fates, challenging social norms and personal bonds.","1973-11-01","2006-10-04",2),
  ("Dune","9780441172719",3,3,412,"In a desert planet ruled by prophecy and power, Paul Atreides rises as a messianic leader amid betrayal and ecological warfare.","1965-08-01","2015-09-01",3),
  ("Room","9780307743664",4,4,321," A mother and her 5-year-old son live in captivity. The story follows their emotional escape and adaptation to the outside world.","2010-09-13","2020-08-11",4),
  ("Carrie","978030774367",5,5,199,"A shy teen girl, tormented by peers and her religious mother, discovers telekinetic powers and unleashes chaos on prom night.","1974-04-05","2025-01-11",5);
  
-- Fetch the Data in Books Table
SELECT * FROM Library.Books;

-- Create Authors Table under Library Schema
CREATE TABLE Authors(
    AuthorID INT NOT NULL AUTO_INCREMENT,
    AuthorName VARCHAR(255) NOT NULL,
    Country VARCHAR(255),
    PRIMARY KEY (AuthorID)
);

---- Sample Data for Authors Table
INSERT INTO Authors
    (AuthorName,Country)
VALUES
    ("Toni Morrison", "UK"),
    ("Toni Morrison","UK"),
    ("Frank Herbert","US"),
    ("Emma Donoghue","Chicago"),
    ("Stephen King","Russia");

-- Fetch the Data in Authors Table
SELECT * FROM Library.Authors;

-- Create Publishers Table under Library Schema
CREATE TABLE Publishers(
    PublisherID INT NOT NULL AUTO_INCREMENT,      -- Unique identifier for each publisher
    PublisherName VARCHAR(255) NOT NULL,                   -- Publisher name
    PRIMARY KEY (PublisherID)                     -- Set PublisherID as Primary Key
);

-- Sample Data for Publishers Table
INSERT INTO Publishers
    (PublisherName)
VALUES
    ("Alfred A. Knopf"),
    ("Alfred A. Knopf"),
    ("Chilton Books"),
    ("Little, Brown and Company"),
    ("Doubleday");

-- Fetch the Data in Publishers Table
SELECT * FROM Library.Publishers;

-- Create Genres Table under Library Schema
CREATE TABLE Genres(
    GenreID INT NOT NULL AUTO_INCREMENT,          -- Unique identifier for each genre
    GenreName VARCHAR(255) NOT NULL,                  -- Genre name
    PRIMARY KEY (GenreID)                         -- Set GenreID as Primary Key
);

-- Sample Data for Genres Table
INSERT INTO Genres
    (GenreName)
VALUES
    ("Fiction"),
    ("Horror"),
    ("Comedy"),
    ("Drama"),
    ("Non-Fiction");

-- Fetch the Data in Genres Table
SELECT * FROM Library.Genres;
