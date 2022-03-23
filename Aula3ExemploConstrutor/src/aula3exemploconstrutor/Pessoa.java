package aula3exemploconstrutor;

public class Pessoa {

    private String cpf;
    private String nome;
    private String carteiraMotorista;
    
    public Pessoa(){}
        
    public Pessoa(String cpf){
        this();
        this.cpf = cpf;
    }
    public Pessoa(String cpf, String nome){
        this(cpf);
        this.nome = nome;
    }
    public Pessoa(String cpf, String nome, String carteiraMotorista){
        this(cpf,nome);
        this.carteiraMotorista = carteiraMotorista;
    }
    
    public String imprimir(){
        return "CPF: " + cpf +"\nNome: " + nome +
                "\nCarteiro Motorista: " + carteiraMotorista;        
    }

    public String getCarteiraMotorista() {
        return carteiraMotorista;
    }

    public void setCarteiraMotorista(String carteiraMotorista) {
        this.carteiraMotorista = carteiraMotorista;
    }
    
}
