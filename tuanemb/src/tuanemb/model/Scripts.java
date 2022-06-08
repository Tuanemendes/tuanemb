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
  * 
CREATE DATABASE tuanemb;
USE `tuanemb` ;

-- -----------------------------------------------------
-- Table `tuanemb`.`Medico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tuanemb`.`Medico` (
  `idMedico` INT NOT NULL AUTO_INCREMENT,
  `Nome` VARCHAR(100) NOT NULL,
  `Especialidade` VARCHAR(80) NOT NULL,
  `CRM` INT NOT NULL,
  `CPF` VARCHAR(14) NOT NULL,
  PRIMARY KEY (`idMedico`));

-- -----------------------------------------------------
-- Table `tuanemb`.`Paciente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tuanemb`.`Paciente` (
  `idPaciente` INT NOT NULL AUTO_INCREMENT,
  `Nome` VARCHAR(100) NOT NULL,
  `CPF` VARCHAR(14) NOT NULL,
  `Idade` INT NOT NULL,
  PRIMARY KEY (`idPaciente`));
  
-- -----------------------------------------------------
-- Table `tuanemb`.`Consulta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tuanemb`.`Consulta` (
  `idConsulta` INT NOT NULL AUTO_INCREMENT ,
  `Convenio` VARCHAR(80) NOT NULL,
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
