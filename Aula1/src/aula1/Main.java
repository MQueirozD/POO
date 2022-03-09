package aula1;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int opc = 0;
        String ra, nome, curso;
        Aluno aluno = null;
        while (opc != 3) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menu:\n1 - Cadastrar\n2 - Mostrar\n3 - sair"));
            switch (opc) {
                case 1:
                    ra = JOptionPane.showInputDialog("Digite o RA");
                    nome = JOptionPane.showInputDialog("Digite o Nome");
                    curso = JOptionPane.showInputDialog("Digite o curso");
                    aluno = new Aluno();
                    aluno.setRa(ra);
                    aluno.setNome(nome);
                    aluno.setCurso(curso);
                    break;
                case 2:
                    if(aluno != null)
                        JOptionPane.showMessageDialog(null, aluno.imprimir());
                    else
                        JOptionPane.showMessageDialog
                            (null,"Nenhum aluno criado","Atenção",JOptionPane.WARNING_MESSAGE);
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(
                        null,"Opção inválida","Erro",JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }

}
