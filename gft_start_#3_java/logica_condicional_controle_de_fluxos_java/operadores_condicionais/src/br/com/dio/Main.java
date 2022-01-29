package br.com.dio;

public class Main {

    public static void main(String[] args) {
        boolean f1 = false;
        boolean f2 = false;
        boolean t1 = true;
        boolean t2 = true;

        // || apenas um precisa ser verdadeiro
        System.out.println(f1||f2);// F F = F
        System.out.println(t1||f2);// V F = V

        // && ambos devem ser verdadeiros
        System.out.println(t1&&t2);// V V = V
        System.out.println(t1&&f2);// V F = F

        //^ eles devem ser diferentes
        System.out.println(t1^t2);// V V = F
        System.out.println(t1^f2);// V F = V

    }
}
