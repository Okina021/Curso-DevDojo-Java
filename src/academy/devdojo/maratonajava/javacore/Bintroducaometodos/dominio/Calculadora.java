package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(5 - 5);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

//    public double divideDoisNumeros(double num1, double num2) {
//        if (num1 == 0 || num2 == 0) {
//            return 0;
//        }
//        return (num1 / num2);
//    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        } else {
            return (num1 / num2);
        }
    }

//    public double divideDoisNumeros2(double num1, double num2) {
//        if (num1 != 0 || num2 != 0) {
//            return (num1 / num2);
//        }
//        return 0;
//    }

    public double divideDoisNumeros2(double num1, double num2) {
        if (num1 != 0 || num2 != 0) {
            return (num1 / num2);
        } else {
            return 0;
        }
    }
    public void divideDoisNumeros3
}