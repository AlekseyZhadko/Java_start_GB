# В подключенном MySQL репозитории создать базу данных “Друзья человека” Имеется в виду внутри БД создать таблицу, которая будет так называться
DROP DATABASE IF EXISTS Kennel; -- Удаляем БД, если она существует
CREATE DATABASE IF NOT EXISTS Kennel; -- Создаю БД, если ее она не создана
USE Kennel;

# Создать таблицы с иерархией из диаграммы в БД
# Заполнить низкоуровневые таблицы именами(животных), командами которые они выполняют и датами рождения Вы создаете в бд таблицы, например "Лошади" и 
# указываете там столбцы id, name и тд, и тп. Заполняете их с помощью INSERT
# Создаем таблицу друзья человека
CREATE TABLE IF NOT EXISTS FriendsOfMan
(
	id INT PRIMARY KEY AUTO_INCREMENT,
    dateOfBirth DATE,
    nameAninal VARCHAR(45) NOT NULL,
    commands VARCHAR(45)
);

# Создаем таблицу домашние питомцы
CREATE TABLE IF NOT EXISTS Pet
(
	id INT PRIMARY KEY AUTO_INCREMENT,
    dateOfBirth DATE,
    nameAninal VARCHAR(45) NOT NULL,
    commands VARCHAR(45)
);

# Создаем таблицу вьючные животные
CREATE TABLE IF NOT EXISTS PackAnimal
(
	id INT PRIMARY KEY AUTO_INCREMENT,
    dateOfBirth DATE,
    nameAninal VARCHAR(45) NOT NULL,
    commands VARCHAR(45)
);

# Создаем таблицу хомяки
CREATE TABLE IF NOT EXISTS Hamster 
(
	id INT PRIMARY KEY AUTO_INCREMENT,
    dateOfBirth DATE,
    nameAninal VARCHAR(45) NOT NULL,
    commands VARCHAR(45)
);

# Заполняем таблицу хомяки
INSERT INTO Hamster (dateOfBirth, nameAninal, commands)
VALUES
	('2015-10-12','Rick','Go, Jump'),
    ('2018-05-05','Martin','Stand up, Jump'),
	('2019-12-01','Rocki','Go, Stand up');

SELECT * FROM Hamster;

# Создаем таблицу кошки
CREATE TABLE IF NOT EXISTS Cat
(
	id INT PRIMARY KEY AUTO_INCREMENT,
    dateOfBirth DATE,
    nameAninal VARCHAR(45) NOT NULL,
    commands VARCHAR(45)
);

# Заполняем таблицу кошки
INSERT INTO Cat (dateOfBirth, nameAninal, commands)
VALUES
	('2018-11-15','Musya','Run away, Jump'),
    ('2008-05-07','Bars','Stand up, Jump'),
	('2009-12-09','Nick','Go, Stop');

SELECT * FROM Cat;

# Создаем таблицу собаки
CREATE TABLE IF NOT EXISTS Dog
(
	id INT PRIMARY KEY AUTO_INCREMENT,
    dateOfBirth DATE,
    nameAninal VARCHAR(45) NOT NULL,
    commands VARCHAR(45)
);

# Заполняем таблицу собаки
INSERT INTO Dog (dateOfBirth, nameAninal, commands)
VALUES
	('2023-02-15','Lord','Run away, Jump'),
    ('2022-07-05','Marli','Stand up, Jump'),
	('2021-12-09','Anet','Go, Stop');

SELECT * FROM Dog;

# Создаем таблицу лошади
CREATE TABLE IF NOT EXISTS Horse
(
	id INT PRIMARY KEY AUTO_INCREMENT,
    dateOfBirth DATE,
    nameAninal VARCHAR(45) NOT NULL,
    commands VARCHAR(45)
);

# Заполняем таблицу лошади
INSERT INTO Horse (dateOfBirth, nameAninal, commands)
VALUES
	('2023-06-12','Varyag','Run away, Stop'),
    ('2022-05-01','Amanda','Stand up, Jump'),
	('2021-10-14','Anet','Stop');

SELECT * FROM Horse;

# Создаем таблицу верблюды
CREATE TABLE IF NOT EXISTS Camel
(
	id INT PRIMARY KEY AUTO_INCREMENT,
    dateOfBirth DATE,
    nameAninal VARCHAR(45) NOT NULL,
    commands VARCHAR(45)
);

# Заполняем таблицу верблюды
INSERT INTO Camel (dateOfBirth, nameAninal, commands)
VALUES
	('2023-08-08','Pol','Run away, Stop'),
    ('2021-08-01','Simba','Stand up, Jump'),
	('2022-04-24','Misti','Stop, Run away');

SELECT * FROM Camel;

# Создаем таблицу ослы
CREATE TABLE IF NOT EXISTS Donkey
(
	id INT PRIMARY KEY AUTO_INCREMENT,
    dateOfBirth DATE,
    nameAninal VARCHAR(45) NOT NULL,
    commands VARCHAR(45)
);

# Заполняем таблицу ослы
INSERT INTO Donkey (dateOfBirth, nameAninal, commands)
VALUES
	('2022-03-23','Dora','Run away, Stand up'),
    ('2021-08-01','Simba','Stop, Jump'),
	('2022-04-24','Perl','Stop, Run away');

SELECT * FROM Donkey;

# Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой питомник на зимовку. 
DELETE FROM Camel WHERE id > 0;
SELECT * FROM Camel;

# Объединить таблицы лошади, и ослы в одну таблицу.
CREATE TABLE PackAnimalNew (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY)
SELECT  nameAninal, commands, dateOfBirth
FROM Horse UNION
SELECT  nameAninal, commands, dateOfBirth
FROM Donkey;

SELECT * FROM PackAnimalNew;

# Создать новую таблицу “молодые животные” в которую попадут все животные старше 1 года, но младше 3 лет и в отдельном столбце 
# с точностью до месяца подсчитать возраст животных в новой таблице
INSERT INTO Pet (nameAninal, commands, dateOfBirth)
SELECT  nameAninal, commands, dateOfBirth
FROM Cat UNION
SELECT  nameAninal, commands, dateOfBirth
FROM Dog UNION
SELECT  nameAninal, commands, dateOfBirth
FROM Hamster;

SELECT * FROM Pet;

INSERT INTO FriendsOfMan (nameAninal, commands, dateOfBirth)
SELECT  nameAninal, commands, dateOfBirth
FROM Pet UNION
SELECT  nameAninal, commands, dateOfBirth
FROM PackAnimalNew;

SELECT * FROM FriendsOfMan;

CREATE TABLE YoungAnimals (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY)
SELECT nameAninal, commands, dateOfBirth,
	round((year(current_date()) - year(dateOfBirth)) + (month(current_date() - month(dateOfBirth)))/10, 2) AS age
FROM FriendsOfMan
WHERE round((year(current_date()) - year(dateOfBirth)) + (month(current_date() - month(dateOfBirth)))/10, 2) > 1 
	AND round((year(current_date()) - year(dateOfBirth)) + (month(current_date() - month(dateOfBirth)))/10, 2) < 3;

SELECT * FROM YoungAnimals;

# Объединить все таблицы в одну, при этом сохраняя поля, указывающие на прошлую принадлежность к старым таблицам.
CREATE TABLE NewFriendsOfMan (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY)
SELECT  nameAninal, commands, dateOfBirth,
        'cat' AS oldTable
FROM Cat UNION
SELECT  nameAninal, commands, dateOfBirth,
        'dog' AS oldTable
FROM Dog UNION
SELECT  nameAninal, commands, dateOfBirth,
        'hamster' AS oldTable
FROM Hamster UNION
SELECT  nameAninal, commands, dateOfBirth,
        'horse' AS oldTable
FROM Horse UNION
SELECT  nameAninal, commands, dateOfBirth,
        'donkey' AS oldTable
FROM Donkey;

SELECT * FROM NewFriendsOfMan;