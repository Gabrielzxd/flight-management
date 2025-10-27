package aviacao.Utils;

import aviacao.Exceptions.CpfException;

public class Cpf {
    private String value;

    public Cpf(String value) throws CpfException {

        this.value = value;
    }

    private boolean isValid(String cpf) {
        if(cpf == null || cpf.length() != 11) {
            return false;
        }

        if(cpf.matches("(\\d)\\1{10}")){
            return false;
        }

        // terminar depois
    }
}
