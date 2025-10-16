Class SalvarPagamento(){
    Public static void salvar(Pedido pedido){
         // 3. Responsabilidade: Salvar no banco
        repositorio.salvar(pedido);
    }
}