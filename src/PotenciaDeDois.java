public class PotenciaDeDois {

    public static void main(String[] args) {
        int base = 2; // Base da potência
        int expoente = 6; // Expoente real (6 para 2^6 = 64)
        int proximoElemento = (int) Math.pow(base, expoente + 1); // Lógica: base elevado ao expoente + 1

        System.out.println("Próximo elemento: " + proximoElemento);
    }
}
