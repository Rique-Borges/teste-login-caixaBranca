import org.junit.Test;
import static org.junit.Assert.*;

public class TelaLoginTeste {
    @Test
    public void testeLoginComSucesso() {
        TelaDeLogin telaDeLogin = new TelaDeLogin();
        assertTrue(telaDeLogin.login("admin", "admin"));
    }

    @Test
    public void testeLoginFalho() {
        TelaDeLogin telaDeLogin = new TelaDeLogin();
        assertFalse(telaDeLogin.login("admin", "senhaerrada"));
    }

    @Test
    public void testeAdicionarUsuario() {
        TelaDeLogin telaDeLogin = new TelaDeLogin();
        telaDeLogin.adicionarUsuario("novousuario", "senha");
        assertTrue(telaDeLogin.login("novousuario", "senha"));
    }
}
