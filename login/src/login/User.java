package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Classe para operacoes de login de usuario.
 * Esta classe permite conectar-se a um banco de dados e verificar as credenciais do usuario.
 * 
 * @author Henrique Ribeiro Borges
 * @version 1.0
 */
public class User {

    /**
     * Conectar ao banco de dados.
     * 
     * @return A conexao estabelecida com o banco de dados.
     */
    public Connection conectarBD() {
        Connection conn = null;
        try {
            // Carregar o driver JDBC
            Class.forName("com.mysql.Driver.Manager").newInstance();
            // URL de conexao com o banco de dados
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            // Estabelecer conexao
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            // Lidar com excecoes
        }
        return conn;
    }

    // Variaveis de instancia
    /** Nome do usuario. */
    public String nome = "";
    /** Resultado da verificacao de usuario. */
    public boolean result = false;

    /**
     * Verificar se o usuario existe no banco de dados e se as credenciais estao corretas.
     * 
     * @param login O nome de usuario.
     * @param senha A senha do usuario.
     * @return true se o usuario foi encontrado e as credenciais estao corretas, false caso contrario.
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = "";
        Connection conn = conectarBD();

        // INSTRUCAO SQL
        sql += "SELECT nome FROM usuarios ";
        sql += "WHERE login = '" + login + "' ";
        sql += "AND senha = '" + senha + "'";

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                // Se encontrou o usuario, atribuir o nome e definir o resultado como verdadeiro
                nome = rs.getString("nome");
                result = true;
            }
        } catch (Exception e) {
            // Lidar com excecoes
        }
        return result;
    }
}
