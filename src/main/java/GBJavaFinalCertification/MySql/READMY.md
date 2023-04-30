# Итоговая аттестация
## Задание ##
### 1. В подключенном MySQL репозитории создать базу данных “Друзья человека”. <br>
   > __DROP DATABASE IF EXISTS__ Kennel; -- Удаляем БД, если она существует <br>
   __CREATE DATABASE IF NOT EXISTS__ Kennel; -- Создаю БД, если ее она не создана <br>
   __USE__ Kennel; <br>

   > __CREATE TABLE IF NOT EXISTS__ FriendsOfMan <br>
   ( <br>
   id __INT PRIMARY KEY AUTO_INCREMENT__, <br>
   dateOfBirth __DATE__, <br>
   nameAninal __VARCHAR(45) NOT NULL__, <br>
   commands __VARCHAR(45)__ <br>
   ); <br>

### 2. Создать таблицы с иерархией из диаграммы в БД. <br>

  > #### Создаем таблицу домашние питомцы
  > __CREATE TABLE IF NOT EXISTS__ Pet <br>
  ( <br>
  id __INT PRIMARY KEY AUTO_INCREMENT__, <br>
  dateOfBirth __DATE__, <br>
  nameAninal __VARCHAR(45) NOT NULL__, <br>
  commands __VARCHAR(45)__ <br>
  ); <br>

  > #### Создаем таблицу вьючные животные
  > __CREATE TABLE IF NOT EXISTS__ PackAnimal <br>
  ( <br>
  id __INT PRIMARY KEY AUTO_INCREMENT__, <br>
  dateOfBirth __DATE__, <br>
  nameAninal __VARCHAR(45) NOT NULL__, <br>
  commands __VARCHAR(45)__ <br>
  ); <br>

  > #### Создаем таблицу хомяки
  > __CREATE TABLE IF NOT EXISTS__ Hamster <br>
  ( <br>
  id __INT PRIMARY KEY AUTO_INCREMENT__, <br>
  dateOfBirth __DATE__, <br>
  nameAninal __VARCHAR(45) NOT NULL__, <br>
  commands __VARCHAR(45)__ <br>
  ); <br>
  
  > #### Создаем таблицу кошки
  > __CREATE TABLE IF NOT EXISTS__ Cat <br>
  ( <br>
  id __INT PRIMARY KEY AUTO_INCREMENT__, <br>
  dateOfBirth __DATE__, <br>
  nameAninal __VARCHAR(45) NOT NULL__, <br>
  commands __VARCHAR(45)__ <br>
  ); <br>

  > #### Создаем таблицу собаки
  > __CREATE TABLE IF NOT EXISTS__ Dog <br>
  ( <br>
  id __INT PRIMARY KEY AUTO_INCREMENT__, <br>
  dateOfBirth __DATE__, <br>
  nameAninal __VARCHAR(45) NOT NULL__, <br>
  commands __VARCHAR(45)__ <br>
  ); <br>

  > #### Создаем таблицу лошади
  > __CREATE TABLE IF NOT EXISTS__ Horse <br>
  ( <br>
  id __INT PRIMARY KEY AUTO_INCREMENT__, <br>
  dateOfBirth __DATE__, <br>
  nameAninal __VARCHAR(45) NOT NULL__, <br>
  commands __VARCHAR(45)__ <br>
  ); <br>

  > #### Создаем таблицу верблюды
  > __CREATE TABLE IF NOT EXISTS__ Camel <br>
  ( <br>
  id __INT PRIMARY KEY AUTO_INCREMENT__, <br>
  dateOfBirth __DATE__, <br>
  nameAninal __VARCHAR(45) NOT NULL__, <br>
  commands __VARCHAR(45)__ <br>
  ); <br>

  > #### Создаем таблицу ослы
  > __CREATE TABLE IF NOT EXISTS__ Donkey <br>
  ( <br>
  id __INT PRIMARY KEY AUTO_INCREMENT__, <br>
  dateOfBirth __DATE__, <br>
  nameAninal __VARCHAR(45) NOT NULL__, <br>
  commands __VARCHAR(45)__ <br>
  ); <br>

### 3. Заполнить низкоуровневые таблицы именами(животных), командами которые они выполняют и датами рождения.

  > #### Заполняем таблицу хомяки <br>
  > __INSERT INTO__ Hamster (dateOfBirth, nameAninal, commands) <br>
  __VALUES__ <br>
  ('2015-10-12','Rick','Go, Jump'), <br>
  ('2018-05-05','Martin','Stand up, Jump'), <br>
  ('2019-12-01','Rocki','Go, Stand up'); <br>

  > ##### Заполняем таблицу кошки
  > __INSERT INTO__ Cat (dateOfBirth, nameAninal, commands) <br>
  __VALUES__ <br>
  ('2018-11-15','Musya','Run away, Jump'), <br>
  ('2008-05-07','Bars','Stand up, Jump'), <br>
  ('2009-12-09','Nick','Go, Stop'); <br>

  > #### Заполняем таблицу собаки
  > __INSERT INTO__ Dog (dateOfBirth, nameAninal, commands) <br>
  __VALUES__ <br>
  ('2023-02-15','Lord','Run away, Jump'), <br>
  ('2022-07-05','Marli','Stand up, Jump'), <br>
  ('2021-12-09','Anet','Go, Stop'); <br>

  > #### Заполняем таблицу лошади
  > __INSERT INTO__ Horse (dateOfBirth, nameAninal, commands) <br>
  __VALUES__ <br>
  ('2023-06-12','Varyag','Run away, Stop'), <br>
  ('2022-05-01','Amanda','Stand up, Jump'), <br>
  ('2021-10-14','Anet','Stop'); <br>

  > #### Заполняем таблицу верблюды
  > __INSERT INTO__ Camel (dateOfBirth, nameAninal, commands) <br>
  __VALUES__ <br>
  ('2023-08-08','Pol','Run away, Stop'), <br>
  ('2021-08-01','Simba','Stand up, Jump'), <br>
  ('2022-04-24','Misti','Stop, Run away'); <br>

  > #### Заполняем таблицу ослы
  > __INSERT INTO__ Donkey (dateOfBirth, nameAninal, commands) <br>
  __VALUES__ <br>
  ('2022-03-23','Dora','Run away, Stand up'), <br>
  ('2021-08-01','Simba','Stop, Jump'), <br>
  ('2022-04-24','Perl','Stop, Run away'); <br>

### 4. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу. 

  > __DELETE FROM__ Camel __WHERE__ id > 0; <br>
  __SELECT * FROM__ Camel; <br>

  > #### Объединяем таблицы лошади, и ослы в одну таблицу.
  > __CREATE TABLE__ PackAnimalNew (id __INT NOT NULL AUTO_INCREMENT PRIMARY KEY__) <br>
  __SELECT__  nameAninal, commands, dateOfBirth <br>
  __FROM__ Horse __UNION__ <br> 
  __SELECT__  nameAninal, commands, dateOfBirth <br>
  __FROM__ Donkey; <br>
  
### 5. Создать новую таблицу “молодые животные” в которую попадут все животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью до месяца подсчитать возраст животных в новой таблице.

  > ### Объединяем таблицы Кошки, Собаки и Хомяки в таблицу домашние животные
  > __INSERT INTO__ Pet (nameAninal, commands, dateOfBirth) <br>
  __SELECT__  nameAninal, commands, dateOfBirth <br>
  __FROM__ Cat __UNION__ <br>
  __SELECT__  nameAninal, commands, dateOfBirth <br>
  __FROM__ Dog __UNION__ <br>
  __SELECT__  nameAninal, commands, dateOfBirth <br>
  __FROM__ Hamster; <br>

  > ### Объединяем таблицы Домашние животные и Вьючные животные в таблицу Друзья человека
  > __INSERT INTO__ FriendsOfMan (nameAninal, commands, dateOfBirth) <br>
  __SELECT__  nameAninal, commands, dateOfBirth <br>
  __FROM__ Pet __UNION__ <br>
  __SELECT__  nameAninal, commands, dateOfBirth <br>
  __FROM__ PackAnimalNew; <br>

  > ### Создаем таблицу молодые животные
  > __CREATE TABLE__ YoungAnimals (id __INT NOT NULL AUTO_INCREMENT PRIMARY KEY__) <br>
  __SELECT__ nameAninal, commands, dateOfBirth, <br>
  __round__((__year__(__current_date()__) - __year__(dateOfBirth)) + (__month__(__current_date()__ - __month__(dateOfBirth)))/10, 2) __AS__ age <br>
  __FROM__ FriendsOfMan <br>
  __WHERE round__((__year__(__current_date()__) - __year__(dateOfBirth)) + (__month__(__current_date()__ - __month__(dateOfBirth)))/10, 2) > 1 <br>
  __AND round__((__year__(__current_date()__) - __year__(dateOfBirth)) + (__month__(__current_date()__ - __month__(dateOfBirth)))/10, 2) < 3; <br>
  
### 6. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на прошлую принадлежность к старым таблицам. <br>

  > __CREATE TABLE__ NewFriendsOfMan (id __INT NOT NULL AUTO_INCREMENT PRIMARY KEY__) <br>
  __SELECT__  nameAninal, commands, dateOfBirth, <br>
  'cat' __AS__ oldTable <br>
  __FROM__ Cat __UNION__ <br>
  __SELECT__  nameAninal, commands, dateOfBirth, <br>
  'dog' __AS__ oldTable <br>
  __FROM__ Dog __UNION__ <br>
  __SELECT__  nameAninal, commands, dateOfBirth, <br>
  'hamster' __AS__ oldTable <br>
  __FROM__ Hamster __UNION__ <br>
  __SELECT__  nameAninal, commands, dateOfBirth, <br>
  'horse' __AS__ oldTable <br>
  __FROM__ Horse __UNION__ <br>
  __SELECT__  nameAninal, commands, dateOfBirth, <br>
  'donkey' __AS__ oldTable <br>
  __FROM__ Donkey; <br>

### __SQL File Прилагается в текущей директории__