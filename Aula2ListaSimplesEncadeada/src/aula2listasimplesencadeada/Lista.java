package aula2listasimplesencadeada;

public class Lista {
    private Nodo primeiroNodo;
    private int quantidadeNodo = 0;
    
    public void adicionarNoInicio(float dado){
        Nodo novoNodo = new Nodo();
        novoNodo.setDado(dado);
        novoNodo.setProximo(getPrimeiroNodo());
        setPrimeiroNodo(novoNodo);
        quantidadeNodo++;
    }
    public void adicionarNoFinal(float dado){
        Nodo novoNodo = new Nodo();
        novoNodo.setDado(dado);
        if(getPrimeiroNodo() == null){
            setPrimeiroNodo(novoNodo);
        }
        else{
           Nodo nodoFinal = getPrimeiroNodo();
           while(nodoFinal.getProximo() != null){
               nodoFinal = nodoFinal.getProximo();
           }
           nodoFinal.setProximo(novoNodo);
        }
        quantidadeNodo++;
    }
    public void removerPrimeiroNodo(){
        if(getPrimeiroNodo() != null){
            Nodo nodo = getPrimeiroNodo();
            setPrimeiroNodo(nodo.getProximo());          
            quantidadeNodo--;
        }
    }
    public Nodo buscarNodo(float valor){
        Nodo nodo = getPrimeiroNodo();
        for (int i = 1; i < quantidadeNodo; i++) {
            if(nodo.getDado() == valor)
                return nodo;
            else
                nodo = nodo.getProximo();
        }
        return null;
    }
    
    public Nodo getPrimeiroNodo() {
        return primeiroNodo;
    }

    public void setPrimeiroNodo(Nodo primeiroNodo) {
        this.primeiroNodo = primeiroNodo;
    }

    public int getQuantidadeNodo() {
        return quantidadeNodo;
    }
    
}
