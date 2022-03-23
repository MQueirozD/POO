package aula2ex1;

import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class Main {

    public static void main(String[] args) {
        int opc = 0;
        String nome,cpf;
        Object[] arraySexo = {"Feminino","Masculino"};
        int idade;
        char sexo;
        Pessoa pessoa = null;
        while(opc !=3){
            opc = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Criar Pessoa\n2 - Mostrar Pessoa\n3 - Sair"));
            
            switch (opc) {
                case 1:    
                    nome = JOptionPane.showInputDialog("Digite o nome");
                    cpf = JOptionPane.showInputDialog("Digite o CPF");
                    idade = Integer.parseInt(JOptionPane.showInputDialog(
                                                            "Digite a idade"));
                    sexo = JOptionPane.showInputDialog(null,
                            "Selecione o sexo","Selecione",
                            JOptionPane.INFORMATION_MESSAGE,null,
                            arraySexo,arraySexo[0]).toString().charAt(0);
                    pessoa = new Pessoa();
                    pessoa.setCpf(cpf);
                    pessoa.setIdade(idade);
                    pessoa.setNome(nome);
                    pessoa.setSexo(sexo);
                    break;
                case 2:
                    if(pessoa != null)
                        JOptionPane.showMessageDialog(null, pessoa.imprimir());
                    else
                        JOptionPane.showMessageDialog(null,
                       "Nenhuma pessoa cadastrada", "Erro",JOptionPane.ERROR_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Tchau!!!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida","Atenção",
                        JOptionPane.WARNING_MESSAGE);
                    break;
            }
        }
    }

}
