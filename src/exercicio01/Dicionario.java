package exercicio01;


import java.util.HashMap;
import java.util.HashSet;

import java.util.Map;
import java.util.Set;

public class Dicionario {
    public static void main(String[] args) {
        //01
        Map<Integer, String> dicionario1 = new HashMap();

        dicionario1.put(0, "ovos");
        dicionario1.put(1, "Agua");
        dicionario1.put(2,"Escopeta");
        dicionario1.put(3,"Cavalo");
        dicionario1.put(4,"Dentista");
        dicionario1.put(5,"Foto");

        for (Integer chave :dicionario1.keySet()){
            String valor = dicionario1.get(chave);
            System.out.println(valor);

        }

        System.out.println("--------------------------------");
        //02
        Map<String, String> apelido = new HashMap<>();
        apelido.put("Joao", "Juan, Fisura, Maromba");
        apelido.put("Miguel", "Night Watch, Bruce Wayne, Tampinha");
        apelido.put("Maria", "Wonder Woman, Mary, Marilene");
        apelido.put("Lucas", "Lukinha, Jorge, George");

        for (String chave2 :apelido.keySet()){
            String valor = apelido.get(chave2);
            System.out.println(valor);
        }





    }







}
