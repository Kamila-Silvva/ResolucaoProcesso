public class Inversão {

    public static void main(String[] args) {
        String str = "Exemplo";
        StringBuilder sb = new StringBuilder(str);
        String strInvertida = sb.reverse().toString();

        System.out.println("String original: " + str);
        System.out.println("String invertida: " + strInvertida);
    }
}
it config --global user.email "you@example.com"
  git config --global user.name "Your Name"