package es.ieslavereda.exercise2;

import java.io.*;

public class Exercise2 {
    public static void main(String[] args) {
        //Hazlo con un reader
        try (BufferedReader br = new BufferedReader(new FileReader("numeros.txt"))){
            String copia = br.readLine();
            int copiaInt = Integer.parseInt(copia);
            int maximo = copiaInt;
            int minimo = copiaInt;

            while ((copia=br.readLine()) != null){
                copiaInt = Integer.parseInt(copia);
                if (maximo < copiaInt){
                    maximo = copiaInt;
                }
                if (minimo > copiaInt){
                    minimo = copiaInt;
                }
            }
            System.out.println("Maximo: " + maximo);
            System.out.println("Minimo: " + minimo);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
