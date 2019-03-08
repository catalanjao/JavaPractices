INSERT INTO users (id, ds_name, ds_lastname, age)
VALUES (1, 'User1', 'Apellido', 7),
       (2, 'User2', 'Apellido', 6),
       (3, 'User3', 'Apellido', 5),
       (4, 'User4', 'Apellido', 4),
       (5, 'User5', 'Apellido', 3),
       (6, 'User6', 'Apellido', 2),
       (7, 'User7', 'Apellido', 1);


commit;
select count(*) from users;

alter sequence users_id_seq restart with 10;