/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplointerface;

/**
 *
 * @author rafae
 */
public class AlunoPosGraduacao extends Aluno{
    private double n1, n2;
    
    @Override
    public double calcularMedia() {
        return (n1+n2)/2;
    }

    @Override
    public String verificarAprovacao() {
        if(calcularMedia() >= 6)
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
    
}
