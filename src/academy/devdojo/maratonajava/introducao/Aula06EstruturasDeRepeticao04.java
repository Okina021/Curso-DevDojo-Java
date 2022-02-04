package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        //Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // condição que o valor da parcela tem que ser >= 1000
        double valorDoCarro = 30000;
        for (int parcela = 1; parcela <= valorDoCarro; parcela++) {
            double valorParcela = valorDoCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}