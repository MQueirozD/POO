package aula2listasimplesencadeada;

public class Main {

    public static void main(String[] args) {
        Lista lista = new Lista();
       // lista.adicionarNoInicio(1);
        //lista.adicionarNoInicio(2);
        //lista.adicionarNoInicio(3);
        lista.adicionarNoFinal(1);
        lista.adicionarNoFinal(2);
        lista.adicionarNoFinal(3);
        //lista.removerPrimeiroNodo();
        
        Nodo nodo = lista.getPrimeiroNodo();
        for (int i = 1; i <= lista.getQuantidadeNodo(); i++) {
            System.out.println(nodo.getDado());
            nodo = nodo.getProximo();
        }
        
        nodo = lista.buscarNodo(20);
        if(nodo != null)
            System.out.println(nodo.getDado());
        else
            System.out.println("valor não encontrado");
    }

}
