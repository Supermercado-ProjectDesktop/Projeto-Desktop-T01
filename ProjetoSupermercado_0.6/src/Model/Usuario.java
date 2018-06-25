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
    private String nome;
    private String sobrenome;
    private String password;
    private String cpf;
    private String endereco;
    private String cidade;
    private String email;
    private String telefone;
    private String celular;

    public Usuario(String codUsuario, String nome, String sobrenome, String password, String cpf, String endereco, String cidade, String email, String telefone, String celular) {
        this.codUsuario = codUsuario;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.password = password;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cidade = cidade;
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

 
    
}
    

    