/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.autoresidence.residence.model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Lab-2
 */
@Entity
@Table(name="clientes")
public class Cliente {
    
    @Id
    @Column(name="cpf")
    private String cpf;
    
    @Column(name="nome")
    private String nome;
    
    @Column(name="endereco")
    private Endereco endereco;
    
    @Column(name="email")
    private String email;
    
    @Column(name="telefone")
    private String telefone;
    
    @Column(name="celaular")
    private String celular;

    /*
    public Cliente(String nome, String cpf, Endereco endereco, String email, String celular) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.celular = celular;
    }
*/

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", email=" + email + ", telefone=" + telefone + ", celular=" + celular + '}';
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
