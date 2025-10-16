Class Pagamento(){
    Public static void pagar(Pedido pedido){

         // 2. Responsabilidade: Processar o pagamento
        // Violação do OCP: Aberto para modificação quando um novo pagamento surgir

        if (pedido.getTipoPagamento().equals("cartao")) {
            System.out.println("Processando pagamento via Cartão de Crédito...");
            // Lógica específica para cartão
        } else if (pedido.getTipoPagamento().equals("boleto")) {
            System.out.println("Processando pagamento via Boleto Bancário...");
            // Lógica específica para boleto
        }
    }
}