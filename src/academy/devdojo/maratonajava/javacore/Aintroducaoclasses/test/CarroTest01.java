package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.marca = "Volkswagen";
        carro1.modelo = "Golf";
        carro1.ano = 2017;

        carro2.marca = "Chevrolet";
        carro2.modelo = "Camaro";
        carro2.ano = 2018;

        System.out.println("Marca:" + carro1.marca + "\nModelo:"+carro1.modelo+"\nAno:"+carro1.ano);
        System.out.println("Marca:" + carro2.marca + "\nModelo:"+carro2.modelo+"\nAno:"+carro2.ano);

    }
}
