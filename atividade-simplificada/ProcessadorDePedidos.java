/**
 * ESTA É A CLASSE QUE VIOLA TODOS OS PRINCÍPIOS SOLID
 */
class ProcessadorDePedidos {
    // Violação do DIP: Depende diretamente da implementação concreta
    private MySQLRepositorio repositorio = new MySQLRepositorio();
    // 1. Responsabilidade: Calcular o total
    // Violação do SRP: Esta classe faz tudo
    //forma correta
    public void processar(Pedido pedido) {
         CalculadoraDePedidos c = new CalculadoraDePedidos();
         c.calcular(pedido);
        
        // 2. Responsabilidade: Processar o pagamento
        // Violação do OCP: Aberto para modificação quando um novo pagamento surgir
        Pagamento p = new Pagamento();
        p.pagar(pedido);

        // 3. Responsabilidade: Salvar no banco
        SalvarPedido s = new SalvarPedido();
        s.salvar(pedido);
        
        // 4. Responsabilidade: Enviar e-mail
        EnviarEmail e = new EnviarEmail();
        e.enviar(pedido);
        
    }
    
}