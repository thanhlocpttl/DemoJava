package com.example.springdeploy.model;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(schema = "public", name = "accounts")
public class Accounts {
    @Id
    @Column(name = "id_account")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAccount;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

    public Long getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(Long idAccount) {
        this.idAccount = idAccount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Accounts(Long idAccount, String username, String password) {
        this.idAccount = idAccount;
        this.username = username;
        this.password = password;
    }
    public Accounts(){

    }
}
