package com.br.poli.datp.banco.dados;

import com.br.poli.datp.Disciplina;
import com.br.poli.datp.Horario;
import com.br.poli.datp.Materia;
import com.br.poli.datp.Professor;
import com.br.poli.datp.Sala;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConexaoSQLite {

    private static Connection conexao;

    //conecta a um banco de dados e cria um caso o mesmo não exista
    public boolean conectar() {

        try {

            //Cria o arquivo do Banco de Dados e salva na pasta dele (Banco de dados)
            String URL = "jdbc:sqlite:Banco de Dados/BD.db";

            //Inicia a conexão com o arquivo criado na String "URL"
            this.conexao = DriverManager.getConnection(URL);

            //Caso ele não onsiga se conectar, ele mostra uma mensagem de erro
        } catch (SQLException e) {

            System.err.println(e.getMessage());
            return false;
        }

        return true;

    }

    public boolean desconectar() {

        try {

            //Verifica se a conexão está fechada
            if (this.conexao.isClosed() == false) {

                this.conexao.close();//Se a conexão não estiver, ele fecha
            }

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            return false;
        }

        return true;
    }

    //Executa os Statements para o SQLite ser execultado
    public Statement criarStatement() {

        try {

            return this.conexao.createStatement();

        } catch (SQLException e) {
            return null;
        }

    }

    //retorna a Conexão
    public static Connection getConexao() {

        return conexao;
    }

    //cria o formato da tabela
    public void criarTabelaProfessor() {

        String SQL = "CREATE TABLE IF NOT EXISTS tbl_Disciplina"
                + "("
                + "Materia text PRIMARY KEY NOT NULL,"
                + "Professor text NOT NULL,"
                + "Sala text NOT NULL,"
                + "Bloco text NOT NULL,"
                + "Turma text,"
                + "Horario integer"
                + ");";

        //Executa o SQL de Criar Tabela
        boolean conectou = false;

        //Verifica se conectou
        try {

            conectou = conectar();

            //Caso ele tenha se conectado corretamente, ele cria um Statement
            Statement stmt = criarStatement();

            //O Statement criado é usado para executar o SQL  acima
            stmt.execute(SQL);

        } catch (SQLException e) {

            //Mensagem de erro na criação da tabela
        } finally {

            //A conexão só é fechado se ela tiver sido aberta
            if (conectou) {

                desconectar();
            }
        }
    }

    //Inserir os dados no banco de dados
    public void inserirDados(Disciplina disciplina) {

        try {

            //cria um Statement
            Statement s = conexao.createStatement();

            //insere os dados no Banco de Dados
            String SQLinsert = "INSERT INTO tbl_Disciplina ("
                    + "Materia,"
                    + "Professor,"
                    + "Sala,"
                    + "Bloco,"
                    + "Turma,"
                    + "Horario"
                    + ") VALUES ('" + disciplina.getMateria().getNomeMateria()
                    + "','" + disciplina.getProfessor().getNome()
                    + "','" + disciplina.getSala().getNomeDaSala()
                    + "','" + disciplina.getSala().getBloco()
                    + "','" + disciplina.getTurma()
                    + "','" + disciplina.getHorario().getHorario()
                    + "');";

            //Atualiza o Statement
            s.executeUpdate(SQLinsert);

            //Fecha o Statement
            s.close();

        } catch (SQLException e) {

            //Mostra a mensagem de erro
            e.printStackTrace();

        }

    }

    //mostra os dados do banco de dados
    public void mostrarBanco(Disciplina disciplina) {

        ResultSet rs = null;
        Statement statement = null;

        try {

            //Seleciona os dados do banco de dados tbl_Disciplia
            String query = "SELECT * FROM tbl_Disciplina;";

            statement = criarStatement();

            rs = statement.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getString("Materia") + " - "
                        + rs.getString("Professor") + " - "
                        + rs.getString("Sala") + " - "
                        + rs.getString("Bloco") + " - "
                        + rs.getString("Turma") + " - "
                        + rs.getString("Horario"));
                System.out.println("-------------------------------------------------------");

            }

        } catch (SQLException e) {

            e.printStackTrace();

        } finally {

            try {

                statement.close();

            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }

    }

    //Procura no banco de dados, pelo nome da materia 
    public void procurarMateria(Disciplina disciplina) {

        ResultSet rs = null;

        //ele seleciona todo o banco, vai na tabela tbl_disciplina e procura pela materia que o usuario digitou
        String SQL = "SELECT *"
                + " FROM tbl_Disciplina "
                + "WHERE Materia = '" + disciplina.getMateria().getNomeMateria() + "'";

        try {

            Statement st = conexao.createStatement();
            rs = st.executeQuery(SQL);

            //Mostra para o usuário, os dados da tabela que possuem a materia procurada
            while (rs.next()) {

                System.out.println(rs.getString("Materia") + " -- "
                        + rs.getString("Professor") + " -- "
                        + rs.getString("Sala") + " -- "
                        + rs.getString("Bloco") + " -- "
                        + rs.getString("Turma") + " -- "
                        + rs.getString("Horario"));
                System.out.println("-------------------------------------------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    //procura no banco de dados, pelo nome do professor
    public void procurarProfessor(Disciplina disciplina) {

        ResultSet rs = null;

        String SQL = "SELECT *"
                + " FROM tbl_Disciplina "
                + "WHERE Professor = '" + disciplina.getProfessor().getNome() + "'";

        try {

            Statement st = conexao.createStatement();
            rs = st.executeQuery(SQL);

            while (rs.next()) {

                System.out.println(rs.getString("Materia") + " -- "
                        + rs.getString("Professor") + " -- "
                        + rs.getString("Sala") + " -- "
                        + rs.getString("Bloco") + " -- "
                        + rs.getString("Turma") + " -- "
                        + rs.getString("Horario"));
                System.out.println("-------------------------------------------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    public void procurarTurma(Disciplina disciplina) {

        ResultSet rs = null;

        String SQL = "SELECT *"
                + " FROM tbl_Disciplina "
                + "WHERE Turma = '" + disciplina.getTurma() + "'";

        try {

            Statement st = conexao.createStatement();
            rs = st.executeQuery(SQL);

            while (rs.next()) {

                System.out.println(rs.getString("Materia") + " -- "
                        + rs.getString("Professor") + " -- "
                        + rs.getString("Sala") + " -- "
                        + rs.getString("Bloco") + " -- "
                        + rs.getString("Turma") + " -- "
                        + rs.getString("Horario"));
                System.out.println("-------------------------------------------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    public void procurarSala(Disciplina disciplina) {

        ResultSet rs = null;

        String SQL = "SELECT *"
                + " FROM tbl_Disciplina "
                + "WHERE Sala = '" + disciplina.getSala().getNomeDaSala() + "'";

        try {

            Statement st = conexao.createStatement();
            rs = st.executeQuery(SQL);

            while (rs.next()) {

                System.out.println(rs.getString("Materia") + " -- "
                        + rs.getString("Professor") + " -- "
                        + rs.getString("Sala") + " -- "
                        + rs.getString("Bloco") + " -- "
                        + rs.getString("Turma") + " -- "
                        + rs.getString("Horario"));
                System.out.println("-------------------------------------------------------");
            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
    
    
    public List<Disciplina> listar() {

        List<Disciplina> disciplina = new ArrayList<>();

        Statement st;
        ResultSet rs;
        
        
        try {
            
            
            st = conexao.createStatement();
            String sql = "SELECT * FROM tbl_Disciplina";
            rs = st.executeQuery(sql);

            while (rs.next()) {

                Professor p1 = new Professor(rs.getString("Professor"));
                Materia c1 = new Materia(rs.getString("Materia"));
                Sala s1 = new Sala(rs.getString("Sala"), rs.getString("Bloco"), true);
                Horario h1 = new Horario(rs.getString("Horario"));
                Disciplina d1 = new Disciplina(rs.getString("Turma"), p1, c1, s1, h1);
                
               disciplina.add(d1);
               
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return disciplina;

    }

}
