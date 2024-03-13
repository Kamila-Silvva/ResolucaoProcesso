public class Interruptor {

    public static void main(String[] args) {
 
        boolean lampada1Acesa = false;
        boolean lampada2Acesa = false;
        boolean lampada3Acesa = false;

      
        ligarInterruptor(1);
        esperar(60); 
        ligarInterruptor(2);
        esperar(30); 
        desligarInterruptor(2);


        if (lampada1Acesa && lampada1Quente()) {
            System.out.println("Interruptor 1 controla Lâmpada 1");
        } else if (lampada1Acesa) {
            System.out.println("Interruptor 3 controla Lâmpada 1");
        } else {
            System.out.println("Interruptor 2 controla Lâmpada 1");
        }

        if (lampada2Acesa) {
            System.out.println("Interruptor 2 controla Lâmpada 2");
        } else {
            System.out.println("Interruptor 1 ou 3 controla Lâmpada 2");
        }

        if (lampada3Acesa) {
            System.out.println("Interruptor 3 controla Lâmpada 3");
        } else {
            System.out.println("Interruptor 1 ou 2 controla Lâmpada 3");
        }
    }

    private static void ligarInterruptor(int numero) {
    }

    private static void desligarInterruptor(int numero) {
    }

    private static void esperar(int segundos) {
    }

    private static boolean lampada1Quente() {

        return true;
    }
}
