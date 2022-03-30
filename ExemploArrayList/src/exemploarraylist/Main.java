package exemploarraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
        Funcionario func;
        String nome, funcao, setor;
        int codigo;
        double salario;
        int opc = 0;

        while (opc != 4) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar"
                    + "\n2 - Mostrar todos\n3 - Mostrar Funcionário\n4 - Sair"));
            switch (opc) {
                case 1:
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Código"));
                    nome = JOptionPane.showInputDialog("Nome");
                    funcao = JOptionPane.showInputDialog("Função");
                    setor = JOptionPane.showInputDialog("Setor");
                    salario = Double.parseDouble(JOptionPane.showInputDialog("Salário"));
                    listaFuncionarios.add(new Funcionario(codigo, nome, setor, funcao, salario));
                    break;
                case 2:
                    String msg = "";
                    for (Funcionario funcionario : listaFuncionarios) {
                        msg += funcionario.imprimir() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case 3:
                    final int cod = Integer.parseInt(JOptionPane.showInputDialog("Código"));

                    // func = listaFuncionarios.stream()
                    //         .filter(x -> x.getCodigo() == cod).findFirst().get();
                    boolean encontrou = false;
                    for (Funcionario f : listaFuncionarios) {
                        if (f.getCodigo() == cod) {
                            encontrou = true;
                            JOptionPane.showMessageDialog(null, f.imprimir());
                        }
                    }
                    if(encontrou == false)
                        JOptionPane.showMessageDialog(null, "Nenhum registro encontrado");
                    break;
                case 4:
                    break;
            }
        }
    }

}
