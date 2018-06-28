/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author JoaoPirolo
 */
public class Usuario {
    private String codUsuario;
    private String cpf;
    private String nome;
    private String sobrenome;
    private String tipoUsuario;
    private String senha;

    public Usuario(String codUsuario,String cpf, String nome, String sobrenome, String tipoUsuario, String senha) {
        this.codUsuario = codUsuario;
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tipoUsuario = tipoUsuario;
        this.senha = senha;
    }

    public Usuario() {
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }
     public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

   
    
}
    

    