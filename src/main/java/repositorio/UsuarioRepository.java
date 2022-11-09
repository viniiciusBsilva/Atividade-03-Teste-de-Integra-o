package repositorio;

import modelo.Usuario;

public interface UsuarioRepository {

    Usuario buscaPorNome(String string);

    void salva(Usuario usuario);

    void exclui(Usuario usuario);

    void atualiza(Usuario usuario);

}
