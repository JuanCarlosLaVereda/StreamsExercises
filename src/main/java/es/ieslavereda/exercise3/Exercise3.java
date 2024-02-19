package es.ieslavereda.exercise3;

import java.io.*;
import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        Map<String, Integer> alumnosNotas = new HashMap<>();


        try (BufferedReader br = new BufferedReader(new FileReader("alumnos_notas.txt"))){
            String copia;
            String alumno;

            while ((copia = br.readLine())!=null){
                String[] copiaArray = copia.split(" ");
                alumno = copiaArray[0] + " " + copiaArray[1];
                Integer notaMedia = 0;
                for (int i = 2; i <copiaArray.length ; i++) {
                    notaMedia += Integer.parseInt(copiaArray[i]);
                }
                notaMedia = notaMedia/(copiaArray.length-2);
                alumnosNotas.put(alumno, notaMedia);
            }
            Set<String> alumnos = new HashSet<>(alumnosNotas.keySet());

            System.out.println(alumnos.stream()
                    .sorted()
            );

            System.out.println(alumnosNotas);
            List<Map.Entry<String,Integer>> listaMapa = new ArrayList<>(alumnosNotas.entrySet());
            listaMapa.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));
            listaMapa.forEach(System.out::println);

        } catch (IOException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
