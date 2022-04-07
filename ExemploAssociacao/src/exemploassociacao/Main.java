package exemploassociacao;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        ArrayList<Curso> cursos = new ArrayList<>();
        int opc = 0;
        String nome, ra, msg="";
        int codigo, ch;
        Curso cursoSelecionado = null;
        while (opc != 6) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1 - Criar Curso\n"
                    + "2 - Criar Aluno\n"
                    + "3 - Remover Aluno\n"
                    + "4 - Mostrar todos os cursos\n"
                    + "5 - Mostrar alunos de um curso\n"
                    + "6 - Sair"));
            if(opc == 2 || opc == 3 || opc == 5){
                cursoSelecionado = buscarCurso(cursos);
                if(cursoSelecionado == null)
                    continue;
            }

            switch (opc) {
                case 1:
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Código"));
                    nome = JOptionPane.showInputDialog("Nome");
                    ch = Integer.parseInt(JOptionPane.showInputDialog("CH"));
                    cursos.add(new Curso(codigo,nome,ch));
                    break;
                case 2:
                    ra = JOptionPane.showInputDialog("RA");
                    nome = JOptionPane.showInputDialog("Nome");
                    cursoSelecionado.inserirAluno(new Aluno(ra,nome));
                    break;
                case 3:
                    ra = JOptionPane.showInputDialog("Selecione um aluno por RA:\n"+
                                                    cursoSelecionado.imprimirCompleto());
                    for(Aluno a : cursoSelecionado.getAlunos()){
                        if(a.getRa().equals(ra)){
                            cursoSelecionado.removerAluno(a);
                        }
                    }
                    break;
                case 4:
                    for(Curso c : cursos){
                        msg += c.imprimir() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, cursoSelecionado.imprimirCompleto());
                    break;
                case 6:
                    break;
                default:
                    break;
            }
        }
    }

    private static Curso buscarCurso(ArrayList<Curso> cursos) {
        String msg = "Selecione o curso pelo código:\n";
        for(Curso c : cursos){
            msg += c.imprimir() + "\n";
        }
        int cod = Integer.parseInt(JOptionPane.showInputDialog(msg));
        for(Curso c : cursos){
            if(c.getCodigo() == cod)
                return c;
        }
        return null;
    }

}
