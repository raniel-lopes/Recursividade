package listEncadeada;

public class ListaEncadeada {
    private Celula primeiro;
    private Celula ultimo;
    private Celula posicaoAtual;

    // Método para adicionar um novo contato à lista encadeada
    public void adicionar(Contato valor) {
        Celula celula = new Celula();
        celula.setValor(valor);

        if (primeiro == null) {
            primeiro = celula;
            ultimo = celula;
        } else {
            ultimo.setProximo(celula);
            ultimo = celula;
        }
    }

    // Método para remover um contato pelo ID
    public boolean remover(Integer id) {
        if (primeiro == null) {
            return false;
        }

        if (primeiro.getValor().getId().equals(id)) {
            primeiro = primeiro.getProximo();
            if (primeiro == null) {
                ultimo = null;
            }
            return true;
        }

        Celula atual = primeiro;
        Celula anterior = null;

        while (atual != null && !atual.getValor().getId().equals(id)) {
            anterior = atual;
            atual = atual.getProximo();
        }

        if (atual == null) {
            return false;
        }

        anterior.setProximo(atual.getProximo());

        if (atual == ultimo) {
            ultimo = anterior;
        }
        return true;
    }

    // Método para verificar se há mais elementos na lista
    public boolean temProximo() {
        if (posicaoAtual == null) {
            posicaoAtual = primeiro;
            return posicaoAtual != null;
        } else {
            posicaoAtual = posicaoAtual.getProximo();
            return posicaoAtual != null;
        }
    }

    // Método para obter a célula atual
    public Celula getPosicaoAtual() {
        return posicaoAtual;
    }

    // Método para resetar o iterador para o início da lista
    public void resetarIterador() {
        posicaoAtual = null;
    }
}
