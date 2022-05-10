 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplointerface;

/**
 *
 * @author rafae
 */
public class AlunoGraduacao extends Aluno{
    private double n1, n2, n3, n4;
    
    @Override
    public double calcularMedia() {
        return (n1+n2+n3+n4)/4;
    }

    @Override
    public String verificarAprovacao() {
        if(calcularMedia() >= 5)
            return "Aprovado";
        return "Reprovado";
    }
     @Override
    public String imprimir(){
        return super.imprimir() + "\nSituação: " + verificarAprovacao();
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public double getN4() {
        return n4;
    }

    public void setN4(double n4) {
        this.n4 = n4;
    }
    
    
}
