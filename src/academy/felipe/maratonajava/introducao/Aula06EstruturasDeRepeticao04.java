package academy.felipe.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condiçao valorParcela >= 1000
    public static void main(String[] args) {
        double valorCarro = 54000.0D;
        int valorParcela = 1000;
        int parcela = 0;
        for (double i = valorCarro; i > 0; i -= valorParcela) {
            parcela++;
        }
        System.out.println(parcela);
    }
}
