package listEncadeada;

public class TestaListaEncadeada {
    public static void main(String[] args) {
        TestaListaEncadeada testaListaEncadeada = new TestaListaEncadeada();
        ListaEncadeada listaEncadeada = new ListaEncadeada();

        // Adicionando contatos
        testaListaEncadeada.addContato(listaEncadeada);
        System.out.println("Todos os contatos foram adicionados");

        // Exibindo os contatos antes da remoção
        System.out.println("Os contatos são: ");
        listaEncadeada.resetarIterador(); // Resetando antes da iteração
        while (listaEncadeada.temProximo()) {
            System.out.println(listaEncadeada.getPosicaoAtual().getValor().getNome());
        }

        // Removendo um contato
        System.out.println("Removendo contato com ID 3 (ISABEL)");
        boolean removido = listaEncadeada.remover(3);
        System.out.println("Contato removido? " + removido);

        // Exibindo a lista após remoção
        System.out.println("Lista após remoção: ");
        listaEncadeada.resetarIterador(); // Resetando antes da nova iteração
        while (listaEncadeada.temProximo()) {
            System.out.println(listaEncadeada.getPosicaoAtual().getValor().getNome());
        }
    }

    // Método para adicionar contatos à lista encadeada
    public void addContato(ListaEncadeada listaEncadeada) {
        Contato contato1 = new Contato(1, "DERIC", "deric@ucsal.br");
        Contato contato2 = new Contato(2, "DIEGO", "diego@ucsal.br");
        Contato contato3 = new Contato(3, "ISABEL", "isabel@ucsal.br");
        Contato contato4 = new Contato(4, "ARTHUR", "arthur@ucsal.br");
        Contato contato5 = new Contato(5, "MIGUEL", "miguel@ucsal.br");
        Contato contato6 = new Contato(6, "ANDERSON", "anderson@ucsal.br");
        Contato contato7 = new Contato(7, "VITOR", "vitor@ucsal.br");
        Contato contato8 = new Contato(8, "RODRIGO", "rodrigo@ucsal.br");
        Contato contato9 = new Contato(9, "PEDRO", "pedro@ucsal.br");

        // Adicionando contatos à lista encadeada
        listaEncadeada.adicionar(contato1);
        listaEncadeada.adicionar(contato2);
        listaEncadeada.adicionar(contato3);
        listaEncadeada.adicionar(contato4);
        listaEncadeada.adicionar(contato5);
        listaEncadeada.adicionar(contato6);
        listaEncadeada.adicionar(contato7);
        listaEncadeada.adicionar(contato8);
        listaEncadeada.adicionar(contato9);
    }
}
