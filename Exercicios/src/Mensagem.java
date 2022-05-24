public class Mensagem {

    public static void mensagemBomDia() {
        System.out.println("Bom dia  <3");
    }

    public static void mensagemBoaTarde() {
        System.out.println("Boa tarde :)");
    }

    public static void mensagemBoaNoite() {
        System.out.println("Boa noite zzZ");
    }

    public static void mensagem(int hora) {
        if (hora<0 || hora>24){
            System.out.println("Hora inválida.");
        } else if (hora <= 12) {
            mensagemBomDia();
        } else if (hora <= 18) {
            mensagemBoaTarde();
        } else{
            mensagemBoaNoite();
        }
    }
}
