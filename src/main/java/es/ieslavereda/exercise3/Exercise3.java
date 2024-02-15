package es.ieslavereda.exercise3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise3 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("alumnos_notas.txt"))){


        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
