CREATE TABLE if not exists items(
    id int auto_increment primary key NOT NULL,
    title varchar(512) NOT NULL,
    description varchar (4000)
);