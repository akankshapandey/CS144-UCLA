/*Use database TEST*/
use TEST;

/* Creating table Actors*/
Create table Actors (Name varchar(40),Movie varchar(80),Year Integer, Role varchar(40));

/*Load actors.csv into table Actors*/
LOAD DATA LOCAL INFILE '~/data/actors.csv' INTO TABLE Actors fields terminated by ',' OPTIONALLY ENCLOSED BY '"';

/*Query: Give me the names of all the actors in movie 'Die Another Day'*/
Select Name from Actors where Movie='Die Another Day';

/*Drop table Actors*/
Drop table Actors;
