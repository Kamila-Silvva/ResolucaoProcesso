public class NumerosPares {
    public static void main(String[] args) {
        int ultimoElemento = 64; 
        int proximoElemento = (int) Math.sqrt(ultimoElemento) + 2; 

        proximoElemento = proximoElemento * proximoElemento; 

        System.out.println("Próximo elemento: "  + proximoElemento);
    }
}
