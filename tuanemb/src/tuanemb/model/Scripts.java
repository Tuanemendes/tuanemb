/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuanemb.model;

/**
 *
 * @author tuane
 */
public class Scripts {
 /**   
CREATE SCHEMA IF NOT EXISTS `tuanemb`;
USE `tuanemb` ;

-- -----------------------------------------------------
-- Table `tuanemb`.`Medico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tuanemb`.`Medico` (
  `idMedico` INT NOT NULL,
  `Nome` VARCHAR(80) NULL,
  `Especialidade` VARCHAR(60) NULL,
  `CRM` INT(15) NULL,
  `CPF` VARCHAR(11) NULL,
  PRIMARY KEY (`idMedico`));

-- -----------------------------------------------------
-- Table `tuanemb`.`Paciente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tuanemb`.`Paciente` (
  `idPaciente` INT NOT NULL,
  `Nome` VARCHAR(80) NULL,
  `CPF` VARCHAR(11) NULL,
  `Idade` INT(3) NULL,
  PRIMARY KEY (`idPaciente`));

-- -----------------------------------------------------
-- Table `tuanemb`.`Consulta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tuanemb`.`Consulta` (
  `idConsulta` INT NOT NULL,
  `Convenio` VARCHAR(45) NULL,
  `Medico_idMedico` INT NOT NULL,
  `Paciente_idPaciente` INT NOT NULL,
  PRIMARY KEY (`idConsulta`),
  INDEX `fk_Consulta_Medico_idx` (`Medico_idMedico` ASC) VISIBLE,
  INDEX `fk_Consulta_Paciente1_idx` (`Paciente_idPaciente` ASC) VISIBLE,
  CONSTRAINT `fk_Consulta_Medico`
    FOREIGN KEY (`Medico_idMedico`)
    REFERENCES `tuanemb`.`Medico` (`idMedico`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Consulta_Paciente1`
    FOREIGN KEY (`Paciente_idPaciente`)
    REFERENCES `tuanemb`.`Paciente` (`idPaciente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION); 
**/
}
