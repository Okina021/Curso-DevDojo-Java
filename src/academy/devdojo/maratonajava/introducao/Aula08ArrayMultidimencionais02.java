package academy.devdojo.maratonajava.introducao;

public class Aula08ArrayMultidimencionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

//        arrayInt[0] = new int[]{1,2};
//        arrayInt[1] = new int[]{3,4,5};
//        arrayInt[2] = new int[]{6,7,8,9,10,11};

        int[][] arrayInt2 = {{1, 2}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

//        for (int[] arrayBase :
//                arrayInt) {
//            for (int num :
//                    arrayBase) {
//                System.out.println(num);
//            }
//        }
        for (int i = 0; i < arrayInt2.length; i++) {
            System.out.println("\n------------");
            for (int j = 0; j < arrayInt2[i].length; j++) {
                System.out.print(arrayInt2[i][j] + " ");
            }
        }
    }
}
