package collections2_AdriánSánchez;

import java.util.HashMap;

public class MapaCursos {
    public static void main(String[] args) {
        HashMap<String, String> cursos = new HashMap<>();
        cursos.put("CIT", "Informàtica i Tecnologia");
        cursos.put("CHI", "Educació Infantil");
        cursos.put("MVS", "Sistemes de Vehicles");
        cursos.put("BTH", "Terapia de Bellesa");
        cursos.put("GDE", "Disseny Gràfic");

        System.out.println("Llista de cursos:");
        for (String codi : cursos.keySet()) {
            System.out.println(codi + " - " + cursos.get(codi));
        }

        System.out.println("\nCurs amb codi 'CHI': " + cursos.get("CHI"));
    }
}

