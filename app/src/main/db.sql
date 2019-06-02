CREATE TABLE `purchase`.`purchase` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `createat` DATE,
  `price` DECIMAL NOT NULL,
  `currency` VARCHAR(45) NOT NULL;
  
  PRIMARY KEY (`id`));