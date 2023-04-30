# Итоговая аттестация
## Задание ##
### 1.	Используя команду cat в терминале операционной системы Linux, создать два файла Домашние животные (заполнив файл собаками, кошками, хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и ослы), а затем объединить их. Просмотреть содержимое созданного файла. Переименовать файл, дав ему новое имя (Друзья человека). <br>
      
> __gb@gb-VirtualBox:$__ mkdir itog_attestation <br>
  __gb@gb-VirtualBox:$__ cd itog_attestation/ <br>
  __gb@gb-VirtualBox:/itog_attestation$__ cat > Pets <br>
  > - 1 dog 10.10.2022 GO
  > - 2 cat 10.10.2023 JUMP
  > - 3 hamster 14.12.2022 <br>
      
> __gb@gb-VirtualBox:/itog_attestation$__ cat > Pack_animals
  >  - 1 horse 12.11.2022 GO
  >  - 2 Camel 12.06.2023 STOP
  >  - 3 donkey 28.12.2022 RUN_AWAY <br>
      
> __gb@gb-VirtualBox:/itog_attestation$__ cat Pets Pack_animals > Friends_of_human <br>
  __gb@gb-VirtualBox:/itog_attestation$__ cat Friends_of_human
  >   - 1 dog 10.10.2022 GO
  >   - 2 cat 10.10.2023 JUMP
  >   - 3 hamster 14.12.2022 STOP
  >   - 1 horse 12.11.2022 GO
  >   - 2 Camel 12.06.2023 STOP
  >   - 3 donkey 28.12.2022 RUN_AWAY <br> 

### 2.	Создать директорию, переместить файл туда. <br>
> __gb@gb-VirtualBox:/itog_attestation$__ sudo mv Friends_of_human /home/gb/itog_attestation/new_Pets/ <br>
  __gb@gb-VirtualBox:/itog_attestation$__ cd new_Pets/ <br>
  __gb@gb-VirtualBox:~/itog_attestation/new_Pets$__ ls <br>
  >   - Friends_of_human <br>

### 3.	Подключить дополнительный репозиторий MySQL. Установить любой пакет из этого репозитория. Необходимо создать субд MySQL, где будет храниться информация по друзьям человека. <br>
### Подключаем репозиторий в контейнере:
>   __gb@gb-VirtualBox:~/itog_attestation/new_Pets$__ sudo docker run --name animals -e 
  >MYSQL_ROOT_PASSWORD=111 -d mysql:latest <br>

### 4.	Установить и удалить deb-пакет с помощью dpkg. <br>
> __gb@gb-VirtualBox:~/itog_attestation/new_Pets$__ sudo dkpg -i virtualbox-7.0_7.0.6-144176~Ubuntu~jammy_amd64.deb 
  <br>
  __gb@gb-VirtualBox:~/itog_attestation/new_Pets$__ sudo dkpg -r virtualbox-7.0

