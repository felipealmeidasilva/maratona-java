package academy.felipe.maratonajava.javacore.Aintroducaoclasses.test;

import academy.felipe.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {

    public static void main(String[] args) {
        Carro delrey = new Carro();
        Carro corsa = new Carro();

        delrey.nome = "Del Rey";
        delrey.ano = 1990;
        delrey.modelo = "Sedan";

        corsa.nome = "Corsa";
        corsa.modelo = "Hatch";
        corsa.ano = 2009;

        System.out.println(delrey.nome + " " + delrey.modelo + " " + delrey.ano);
        System.out.println(corsa.nome + " " + corsa.modelo + " " + corsa.ano);
    }


}
