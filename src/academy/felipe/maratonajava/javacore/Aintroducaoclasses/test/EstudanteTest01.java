package academy.felipe.maratonajava.javacore.Aintroducaoclasses.test;

import academy.felipe.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        estudante01.nome = "Felipe";
        estudante01.idade = 20;
        estudante01.sexo = 'M';
        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);
    }
}
