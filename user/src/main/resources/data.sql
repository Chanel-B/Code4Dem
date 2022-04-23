CREATE TABLE Users ( id int, name varchar(255), userName varchar(255), email varchar(255), password varchar(255), confirmPassword varchar(255), comments_id int )
--INSERT INTO Users ( 1, 'bolo', 'usera', 'email@gmail.com', 'password1', 'password1', 1 );
--INSERT INTO Users ( 2, 'bob', 'uu', 'uul@gmail.com', 'password2', 'password2', 1 );
--INSERT INTO Users ( 3, 'lolo', "jo", 'ejol@gmail.com', 'password1', 'password1', 1 );
--INSERT INTO Users ( 4, 'roso', 'lod', 'elodl@gmail.com', 'password4', 'password4', 1 );


CREATE TABLE Comments ( id int, user_id int, comment varchar(255), articles_id int);
--INSERT INTO Comments ( 1, 1, 'this is good', 1 );
--INSERT INTO Comments ( 2, 2, 'this is nice', 1 );

CREATE TABLE Articles ( id int, name varchar(255), url varchar(255), shotDescription varchar(255), longDescription varchar(255), ratings int, comments_id int );
--INSERT INTO Comments ( 1, 1, 'this is good', 1 );
--INSERT INTO Comments ( 2, 2, 'this is nice', 1 );

