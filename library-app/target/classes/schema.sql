drop table if exists Book;  
drop table if exists Borrower;
create table Book(
BookID INT AUTO_INCREMENT  PRIMARY KEY,  
BookName VARCHAR(50) NOT NULL,  
BookAuthor VARCHAR(50) NOT NULL,
ISBNNumber INT NOT NULL  
);

create table Borrower(
BorrowerID INT AUTO_INCREMENT  PRIMARY KEY,  
BorrowerName VARCHAR(50) NOT NULL,  
BookAuthor VARCHAR(50) NOT NULL,
ISBNNumber INT NOT NULL  
);