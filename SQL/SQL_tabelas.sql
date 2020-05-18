create database VMPerUse;
CREATE TABLE IF NOT EXISTS `vmPerUse`.`tbl_usuario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `racf` VARCHAR(6) NOT NULL COMMENT 'Será uma das chaves de acesso ao sistema.',
  `email` VARCHAR(100) NOT NULL COMMENT 'será uma das chaves de acesso ao sistema.',
  `funcional` VARCHAR(9) NOT NULL,
  `senha` VARCHAR(12) NULL,
  `nome` VARCHAR(100) NULL,
  `departamento` VARCHAR(100) NULL,
  `cargo` VARCHAR(50) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  UNIQUE INDEX `racf_UNIQUE` (`racf` ASC) VISIBLE,
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
  UNIQUE INDEX `funcional_UNIQUE` (`funcional` ASC) VISIBLE);

INSERT INTO `vmperuse`.`tbl_usuario`
(`id`,
`racf`,
`email`,
`funcional`,
`senha`,
`nome`,
`departamento`,
`cargo`)
VALUES
(null,
'test003',
'test003@itau-unibanco.com.br',
'001112225',
'1234',
'teste003 da silva',
'Operação Distribuida',
'Operador');
