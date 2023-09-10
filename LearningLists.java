package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class lists {
    public static void main(String[] args) {
        List<String> listNames = new ArrayList<>();
        listNames.add(0, "#00");
        listNames.add("Gabriel");
        listNames.add("Maria");
        listNames.add("João");
        listNames.add("Pedro");
        listNames.add("José");

        for (String nome : listNames){
            System.out.println(nome);
        }
        System.out.println("---------------------");

        listNames.removeIf(name -> name.charAt(0) == 'M');
        for(String name : listNames){
            System.out.println(name);
        }
        System.out.println("-----------------");
        List<String> result = listNames.stream().filter(names -> names.charAt(0) == 'G').toList();

        for (String name : result){
            System.out.println(name);
        }
        System.out.println("---------------------------------");

        String name = listNames.stream().filter(n -> n.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);

    }
}
