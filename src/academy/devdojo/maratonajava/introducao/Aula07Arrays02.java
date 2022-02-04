package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte,short,int,long, float e double é 0
        //char '\u0000' ' '
        //boolean false
        //String null
        String[] nomes = new String[4];
        nomes[0] = "Gustavo";
        nomes[1] = "Guilherme";
        nomes[2] = "Laercio";
        nomes[3] = "Rosana";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
