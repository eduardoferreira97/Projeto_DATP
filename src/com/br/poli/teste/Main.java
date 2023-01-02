package com.br.poli.teste;

import com.br.poli.datp.banco.dados.ConexaoSQLite;
import com.br.poli.datp.Disciplina;
import com.br.poli.datp.Horario;
import com.br.poli.datp.Materia;
import com.br.poli.datp.Professor;
import com.br.poli.datp.Sala;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException{
        
        Professor p1 = new Professor("Aderito");
        Materia c1 = new Materia("ED");
        Sala s1 = new Sala("LPI 1", "B",true);
        Horario h1 = new Horario("07:10 - 08:50");
        Disciplina d1 = new Disciplina("VX", p1, c1, s1,h1);
        
        ConexaoSQLite c = new ConexaoSQLite();
        
        c.conectar();
        c.procurarProfessor(d1);
    }
}
