CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `dami-dev`.`user` (`id`, `name`, `password`, `email`) VALUES ('1', 'xht', 'xht', '1');
INSERT INTO `dami-dev`.`user` (`id`, `name`, `password`, `email`) VALUES ('2', 'san', 'san', '2');
