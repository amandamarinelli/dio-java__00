public class Emprestimo {

    public static double getTaxaTresParcelas() {
        return 0.45;
    }

    public static double getTaxaDuasParcelas() {
        return 0.3;
    }

    public static void calcular(double valor, int parcelas) {
        double valorFinal = 0;

        if (parcelas == 1) {
            valorFinal = valor;
        } else if (parcelas == 2) {
            valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("O valor final a ser pago é: R$" + valorFinal);
        } else if (parcelas == 3) {
            valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("O valor final a ser pago é: R$" + valorFinal);
        } else {
            System.out.println("Não é possível para esse número de parcelas.");
        }

    }
}
