package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /* EJERCICIO 1 ------------------------------------------------------------------
        Filtrar números pares:
        Escribe un programa que tome una lista de números y filtre solo los números pares utilizando streams.*/

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> pares = numeros.stream()
                .filter(num -> num % 2 == 0 )
                .toList();

        System.out.println("1- Números pares " + pares);

        /* EJERCICIO 2 ------------------------------------------------------------------
        Elevar al cuadrado y sumar:
        Escribe un programa que tome una lista de números, eleve cada número al cuadrado y
        luego sume los resultados.*/

        List<Integer> numeros1 = Arrays.asList(1, 2, 3);
        int totalSumaCuadrado = numeros1.stream()
                .map(num -> num * num)
                .reduce(0, Integer::sum);

        System.out.println("2- Total de la suma de los cuadrados " + numeros1 + " " + totalSumaCuadrado);

                /*
                '.reduce()' toma dos parámetros:
                    1- El primer parámetro (0) es el valor inicial de la suma.
                    2- Función de reducción que se aplica a cada elemento del flujo

                 Sintaxis referencia a método
                        'Clase::método'

                    Donde 'Clase' es el nombre de la clase que contiene el método y 'método' es
                    el nombre del método al que estás haciendo referencia.

                    En el caso específico de 'Integer::sum', 'Integer' es la clase y 'sum' es un método
                    estático de esa clase. Este método estático 'sum' está definido en la clase 'Integer'
                    y se utiliza para sumar dos valores enteros y devolver el resultado.

                    'sum' es un método que toma dos parámetros enteros y devuelve otro entero.
                */

        /* EJERCICIO 3 ------------------------------------------------------------------
        Convertir a mayúsculas:
        Escribe un programa que tome una lista de strings y convierta cada string a mayúsculas.*/

        List<String> palabras = Arrays.asList("celular", "helado", "Pepe", "galletas", "dardo");
        List <String> palabrasMayusculas = palabras.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println("3- " + palabrasMayusculas);

        /* EJERCICIO 4 ------------------------------------------------------------------
        Filtrar números mayores que un valor dado:
        Escribe un programa que tome una lista de números y filtre solo los números mayores que un valor dado.*/

        int num = 5;
        List<Float> numeros3 = Arrays.asList(2.4f, 1f, -2f, 5.6f, 7f, 8.9f, 15f);
        List<Float> mayoresQue =  numeros3.stream()
                .filter(numero -> numero > num)
                .toList();

        System.out.println("4- Los números mayor a " + num + " son " + mayoresQue);

        /* EJERCICIO 5 ------------------------------------------------------------------
        Filtrar cadenas que contienen una letra específica:
        Escribe un programa que tome una lista de cadenas y filtre solo las cadenas que contienen
        una letra específica.*/
        List<String> cadenas = Arrays.asList("celular", "helado", "Pepe", "galletas", "dardo");

        List<String> contienen = cadenas.stream()
                .filter(palabra -> palabra.contains("e"))
                .filter(palabra -> palabra.contains("d"))
                .toList();

        System.out.println("5- " + contienen);

        /* EJERCICIO 6 ------------------------------------------------------------------
        Filtrar objetos por una condición específica:
        Supongamos que tienes una lista de objetos Persona y quieres filtrar solo las personas mayores de 18 años.*/

        class Persona {
            private String nombre;
            private short edad;
            public Persona(String nombre, short edad) {
                this.nombre = nombre;
                this.edad = edad;
            }
            public short getEdad() {
                return edad;
            }

            @Override
            public String toString() {
                return nombre;
            }
        }

        List<Persona> personas = Arrays.asList(
                new Persona("Juan", (short) 25),
                new Persona("María",(short) 17),
                new Persona("Pedro", (short) 30),
                new Persona("Laura", (short) 22)
        );

        List<Persona> mayores = personas.stream()
                .filter(persona -> persona.getEdad() >= 18)
                .toList();

        System.out.println("6- Los mayores de 18 años son " + mayores.toString());
    }
}