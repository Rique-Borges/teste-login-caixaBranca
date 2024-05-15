/*
 * Esta classe é uma tela de login simples que permite aos usuários fazer login e adicionar novos usuários.
 */
import java.util.HashMap;
import java.util.Map;

public class TelaDeLogin {
    private Map<String, String> bancoDeUsuarios;

    /*
     * Construtor que inicializa o bancoDeUsuarios com dois usuários padrão.
     */
    public TelaDeLogin() {
        bancoDeUsuarios = new HashMap<>();
        bancoDeUsuarios.put("admin", "admin");
        bancoDeUsuarios.put("usuario", "usuario");
    }

    /*
     * Método que verifica se o nome de usuário e a senha estão corretos.
     * 
     * @param username O nome de usuário do usuário.
     * 
     * @param password A senha do usuário.
     * 
     * @return True se o nome de usuário e a senha estiverem corretos, false caso contrário.
     */
    public boolean login(String username, String password) {
        if (bancoDeUsuarios.containsKey(username)) {
            String senhaArmazenada = bancoDeUsuarios.get(username);
            if (senhaArmazenada.equals(password)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /*
     * Método que adiciona um novo usuário ao bancoDeUsuarios.
     * 
     * @param username O nome de usuário do novo usuário.
     * 
     * @param password A senha do novo usuário.
     */
    public void adicionarUsuario(String username, String password) {
        bancoDeUsuarios.put(username, password);
    }
}
