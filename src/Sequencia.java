public class Sequencia {
    public static void main(String[] args) {
    String ultimoElemento = "d19"; 
        int numeroDecimal = Integer.parseInt(ultimoElemento.substring(1)); 
        String proximoElemento;

        if (numeroDecimal == 19) {
            proximoElemento = "200"; 
        } else {
            proximoElemento = "d" + (numeroDecimal + 1); 
        }

        System.out.println("Próximo elemento: " + proximoElemento);
    }
}
