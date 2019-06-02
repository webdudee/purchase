1. Відвідайте https://github.com/webdudee/purchase і клонуйте проект.
2. Імпортуйте проект в середу розробки
3. Створіть БД в MYSQL із назвою purchase.
4. Виконайте файл app/src/main/bd.sql 

/ або 
CREATE TABLE `purchase`.`purchase` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `createat` DATE,
  `price` DECIMAL NOT NULL,
  `currency` VARCHAR(45) NOT NULL;
  PRIMARY KEY (`id`));
  
5. Зайдіть app/com.purchase.app/AppApplication, та виконайте як JavaApplication.
6. Відкрийте Postman
https://gyazo.com/173ccdb9d04d865f9f6d35de509dbe84
7. URL - http://localhost:8080/purchase, method Post, body 
{
"name" : "Tommy", 
"price" : 2.67,
"currency" : "USD"
    }
добавляє покупку.
https://gyazo.com/260f8aa80dcd3280d69a805c6403ae85
8. URL - http://localhost:8080/purchases method Get, сортує покупки по даті.
https://gyazo.com/257fbc01716f2bfdc63ff991c8fe98cd
9. URL - http://localhost:8080/purchasess/2019-06.01, method Delete, PathVariable 2019-06.01 видаляє за вказану дату до наступної дати.
https://gyazo.com/c50ce4de169aa633d9c3e136517d2b5f 
та
https://gyazo.com/5ac0122f3252cb60050862106b32da5f
10. Fixer.io, як ви можете бачити із скріншотів, API fixer.IO успішно прив'язаний до Purchase REST API.
На жаль, в free version немає можливості змінити BASE(валюту конвертації), єдину валюту яку можна конвертувати це EUR.