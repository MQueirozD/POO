/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplointerface;

/**
 *
 * @author rafae
 */
public abstract class Aluno {
    private int ra;
    private String nome;

    public abstract double calcularMedia();
    public abstract String verificarAprovacao();
    
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String imprimir()
    {
        return "RA: " + ra + "\nNome: " + nome;
    }
    
}
