package academy.felipe.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double impostoQueDeveSerPago = 0;

        if (salarioAnual >= 0 && salarioAnual <= 34712) {
            impostoQueDeveSerPago = salarioAnual * 0.097;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            impostoQueDeveSerPago = salarioAnual * 0.3735;
        } else if (salarioAnual >= 68508) {
            impostoQueDeveSerPago = salarioAnual * 0.4950;
        } else {
            System.out.println("Dado Inválido");
        }
        System.out.println("Importo que deve ser Pago: " + impostoQueDeveSerPago);
    }
}
