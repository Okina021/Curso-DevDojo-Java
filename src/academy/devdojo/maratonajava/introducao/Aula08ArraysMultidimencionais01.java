package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimencionais01 {
    public static void main(String[] args) {
        //1,2,3,4,5 Meses
        //31,28,31,30
        int[][] dias = new int[3][3];
        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[0][2] = 3;

        dias[1][0] = 4;
        dias[1][1] = 5;
        dias[1][2] = 6;

        dias[2][0] = 0;
        dias[2][1] = 0;
        dias[2][2] = 0;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                if (dias[i][j] != 0)
                System.out.println("dias na posição ["+ i + "]["+j+"] " +dias[i][j]);
            }
        }
        System.out.println("------------------------------------------\nForEach");
        for (int[] arrayBase:dias
             ) {
            for (int num : arrayBase){
                System.out.println(num);
            }
        }
    }
}
