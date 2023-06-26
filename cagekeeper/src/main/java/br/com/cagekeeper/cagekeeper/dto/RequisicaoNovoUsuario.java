package br.com.cagekeeper.cagekeeper.dto;
import br.com.cagekeeper.cagekeeper.Usuario;
import br.com.cagekeeper.cagekeeper.dao.NewRepository;

public class RequisicaoNovoUsuario {
    private Long usuarioId;
    private String usuarioNome;
    private String usuarioPassword;
    private String usuarioDados;

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getUsuarioNome() {
        return usuarioNome;
    }

    public void setUsuarioNome(String usuarioNome) {
        this.usuarioNome = usuarioNome;
    }

    public String getUsuarioPassword() {
        return usuarioPassword;
    }

    public void setUsuarioPassword(String usuarioPassword) {
        this.usuarioPassword = usuarioPassword;
    }

    public String getUsuarioDados() {
        return usuarioDados;
    }

    public void setUsuarioDados(String usuarioDados) {
        this.usuarioDados = usuarioDados;
    }
    public Usuario toUsuario(NewRepository usuario){
        Usuario a = new Usuario();
        a.setNome(usuarioNome);
        a.setPassword(usuarioPassword);
        a.setDados(usuarioDados);
        return a;
    }

}
