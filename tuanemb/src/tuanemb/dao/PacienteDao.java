/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuanemb.dao;

import java.util.ArrayList;
import tuanemb.factory.Conexao;
import tuanemb.model.Paciente;
import java.sql.ResultSet;

/**
 *
 * @author tuane
 */
public class PacienteDao extends Conexao{
    
    public String cadastrarPaciente(Paciente paciente){
        try {
            String sentenca;
            sentenca = "INSERT INTO PACIENTE VALUES (NULL,'" + paciente.getNome() + "','" + paciente.getCpfPaciente()+ "'," + paciente.getIdade()+ ")";
            return this.atualizarBanco(sentenca);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
     
    public ArrayList listaPacientes(){
       
       try {
           ArrayList pacientes = new ArrayList();
           String sentenca = "SELECT * FROM PACIENTE ORDER BY NOME";
           ResultSet resultSet = this.getResultSet(sentenca);
           
           while(resultSet.next()) {
               Paciente paciente = new Paciente();
               paciente.setId(resultSet.getLong("IDPACIENTE"));
               paciente.setNome(resultSet.getString("NOME"));
               paciente.setCpfPaciente(resultSet.getString("CPF"));
               paciente.setIdade(resultSet.getInt("IDADE"));
               pacientes.add(paciente);
           }
           return pacientes;
       } catch (Exception e) {
           System.out.println(e.getMessage());
           return null;
       }
    }    
}
