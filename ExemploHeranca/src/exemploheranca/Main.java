package exemploheranca;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new PessoaFisica("Rafael", "123321", "teste@teste", "123"));
        pessoas.add(new PessoaJuridica("Empresa X", "2222", "xpto@teste", "333"));

        pessoas.forEach((x) -> {
            if (x instanceof PessoaFisica) {
                System.out.println(((PessoaFisica) x).imprimir());
            } else {
                System.out.println(((PessoaJuridica) x).imprimir());
            }
        });
    }

}
