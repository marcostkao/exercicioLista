package exercicio02;

import java.util.HashMap;
import java.util.Map;

public class ListaVazia {
    public static void main(String[] args) {
        Map<Integer> lista = new HashMap<Integer>();


        lista.put(1);
        lista.put(5);
        lista.put(6);
        lista.put(7);
        lista.put(8);
        lista.put(8);
        lista.put(8);

        for (Integer chave3 :lista.keySet()){
            Integer valor = lista.get(chave3);
            System.out.println(valor);
        }

    }
}
