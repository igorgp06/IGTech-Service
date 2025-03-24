package br.com.igsolutions.igTechService.model;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String cpf;
    private String number;

    public Client() {}

    public Client(String name, String cpf, String number) {
        this.name = name;
        this.cpf = cpf;
        this.number = number;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }
}
