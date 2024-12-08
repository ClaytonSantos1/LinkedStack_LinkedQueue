package Etapa4;

public class PrincipalEtapa4 {
    public static void main(String[] args) {
        // Teste 1: Operações com Pilha (LinkedStack)
        System.out.println("Teste 1: Contagem de Elementos na Pilha (LinkedStack)");
        LinkedStack<Integer> pilha = new LinkedStack<>();

        // Verifica se a pilha está vazia
        System.out.println("Pilha está vazia? " + pilha.isEmpty());

        // Empilhando elementos
        try {
            pilha.push(10);
            pilha.push(20);
            pilha.push(30);
            System.out.println("Elemento no topo da pilha: " + pilha.top());
        } catch (OverflowException | UnderflowException e) {
            e.printStackTrace();
        }

        // Desempilhando um elemento
        try {
            System.out.println("Desempilhando: " + pilha.pop());
            System.out.println("Número de elementos na pilha: " + pilha.numElements());
        } catch (UnderflowException e) {
            e.printStackTrace();
        }

        System.out.println("---------------------------------------------------");

        // Teste 2: Operações com Fila (LinkedQueue)
        System.out.println("Teste 2: Verificação de Elementos na Fila (LinkedQueue)");
        LinkedQueue<Integer> queue = new LinkedQueue<>();

        // Verifica se a fila está vazia
        System.out.println("Fila está vazia? " + queue.isEmpty());

        // Enfileirando elementos
        try {
            queue.enqueue(100);
            queue.enqueue(200);
            queue.enqueue(300);
            System.out.println("Primeiro da fila: " + queue.front());
        } catch (OverflowException | UnderflowException e) {
            e.printStackTrace();
        }

        // Desenfileirando um elemento
        try {
            System.out.println("Desenfileirando: " + queue.dequeue());
            System.out.println("Número de elementos na fila: " + queue.numElements());
            System.out.println("Último da fila (back): " + queue.back());
        } catch (UnderflowException e) {
            e.printStackTrace();
        }

        System.out.println("---------------------------------------------------");
    }
}

