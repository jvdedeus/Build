import org.example.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteBuilderTest {

    @Test
    void deveRetornarExcecaoParaClienteSemEmail() {
        try {
            ClienteBuilder clienteBuilder = new ClienteBuilder();
            Cliente cliente = clienteBuilder
                    .setNome("Cliente 1")
                    .setCpf("123243543534")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Email inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaClienteSemNome() {
        try {
            ClienteBuilder clienteBuilder = new ClienteBuilder();
            Cliente cliente = clienteBuilder
                    .setCpf("123243543534")
                    .setEmail("cliente1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarClienteValido() {
        ClienteBuilder clienteBuilder = new ClienteBuilder();
        Cliente cliente = clienteBuilder
                .setNome("Cliente 1")
                .setEmail("cliente1@email.com")
                .build();

        assertNotNull(cliente);
    }
}
