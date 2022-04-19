package exemploheranca;

import java.nio.file.Files;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new PessoaFisica("Rafael", "123321", "teste@teste", "123"));
        pessoas.add(new PessoaJuridica("Empresa X", "2222", "xpto@teste", "333"));

        System.out.println(pessoas.get(0));
        
        pessoas.forEach((x) -> {
            System.out.println(x.imprimir());
        });
    }

}
