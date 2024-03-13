public class Inversão {

    public static void main(String[] args) {
        String str = "Exemplo";
        StringBuilder sb = new StringBuilder(str);
        String strInvertida = sb.reverse().toString();

        System.out.println("String original: " + str);
        System.out.println("String invertida: " + strInvertida);
    }
}
