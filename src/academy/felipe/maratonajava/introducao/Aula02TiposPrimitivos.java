package academy.felipe.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L;
        long numeroGrande = 100000;
        double salarioDouble = 2000D;
        double salarioFloat = 2500F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 83;

        String nome = "Goku"; // nao tem limite

        System.out.println("A idade é " + idade);
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println("Oi, meu nome é: "+ nome);

    }
}
