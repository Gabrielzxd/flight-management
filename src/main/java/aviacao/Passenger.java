package aviacao;

import aviacao.Utils.Cpf;

public class Passenger {
    private String name;
    private Cpf cpf;

    public Passenger(String name, Cpf cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public void setCpf(Cpf cpf) {
        this.cpf = cpf;
    }
}
