public class ProcessadorPagamento {
    
    public static void processar(MetodoPagamento metodo, double valor) {
        System.out.println("--- Iniciando processamento ---");
        metodo.realizarPagamento(valor);
        System.out.println("--- Processamento concluído ---\n");
    }
}