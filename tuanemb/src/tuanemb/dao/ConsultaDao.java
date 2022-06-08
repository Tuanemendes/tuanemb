/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuanemb.dao;

import java.util.ArrayList;
import tuanemb.factory.Conexao;
import tuanemb.model.Consulta;
import java.sql.ResultSet;
import tuanemb.model.Medico;
import tuanemb.model.Paciente;
/**
 *
 * @author tuane
 */
public class ConsultaDao extends Conexao{
    
    public String cadastrarConsulta(Consulta consulta){
        
        try {
            String sentenca;
            sentenca = "INSERT INTO CONSULTA VALUES (NULL, '" + consulta.getConvenio() + "'," + consulta.getMedico().getId() + "," + consulta.getPaciente().getId() + ")";
            return this.atualizarBanco(sentenca);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
     public ArrayList listaConsulta(){
       
       try {
           ArrayList consultas = new ArrayList();
           String sentenca = "SELECT * FROM CONSULTA ORDER BY NOME";
           ResultSet resultSet = this.getResultSet(sentenca);
           
           while(resultSet.next()) {
               Consulta consulta = new Consulta();
               consulta.setId(resultSet.getLong("IDCONSULTA"));
               consulta.setConvenio(resultSet.getString("CONVENIO"));
               Medico medico = new Medico();
               medico.setId(resultSet.getLong("MEDICO_IDMEDICO"));
               Paciente paciente = new Paciente();
               paciente.setId(resultSet.getLong("PACIENTE_IDPACIENTE"));
               consultas.add(consulta);
           }
           return consultas;
       } catch (Exception e) {
           System.out.println(e.getMessage());
           return null;
       }
    }    
    
}
