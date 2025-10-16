Class CalculadoraDePedidos(){
    public static void calcular(Pedido pedido){
        // 1. Responsabilidade: Calcular o total
        // Violação do SRP: Esta classe faz tudo
        double total = 0;
        for (Item item : pedido.getItens()) {
            total += item.getPreco();
        }
        System.out.println("Total do pedido: " + total);
    }
}