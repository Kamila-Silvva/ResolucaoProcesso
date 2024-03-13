public class NumerosNaturias {
    public static void main(String[] args) {
        int ultimoElemento = 36; 
        int proximoElemento = (int) Math.sqrt(ultimoElemento) + 1; 

        proximoElemento = proximoElemento * proximoElemento; 

        System.out.println("Próximo elemento: " + proximoElemento);
    }

}
