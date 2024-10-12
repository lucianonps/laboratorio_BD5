package com.example.Calculadoraa;

public class Funcionario {
    private String nome;
    private String email;
    private Double salarioBase;
    private Cargo cargo;

    public Funcionario(Cargo cargo, String email, String nome, Double salarioBase) {
        this.cargo = cargo;
        this.email = email;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    
    
}
