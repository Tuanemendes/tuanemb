/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuanemb.dao;
import java.sql.ResultSet;
import java.util.ArrayList;
import tuanemb.factory.Conexao;
import tuanemb.model.Medico;

/**
 *
 * @author tuane
 */
public class MedicoDao extends Conexao{
    
    public String cadastrarMedico(Medico medico){
        try {
            String sentenca;
            sentenca = "INSERT INTO MEDICO VALUES (NULL,'" + medico.getNome() + "','" + medico.getEspecialidade()+ "'," + medico.getCrm()+ ",'" + medico.getCpf() + "')";
            return this.atualizarBanco(sentenca);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    public ArrayList listaMedicos(){
       
       try {
           ArrayList medicos = new ArrayList();
           String sentenca = "SELECT * FROM MEDICO ORDER BY IDMEDICO";
           ResultSet resultSet = this.getResultSet(sentenca);
           
           while(resultSet.next()) {
               Medico medico = new Medico();
               medico.setId(resultSet.getLong("IDMEDICO"));
               medico.setNome(resultSet.getString("NOME"));
               medico.setEspecialidade(resultSet.getString("ESPECIALIDADE"));
               medico.setCpf(resultSet.getString("CPF"));
               medico.setCrm(resultSet.getInt("CRM"));
               medicos.add(medico);
           }
           return medicos;
       } catch (Exception e) {
           System.out.println(e.getMessage());
           return null;
       }
    }
}
