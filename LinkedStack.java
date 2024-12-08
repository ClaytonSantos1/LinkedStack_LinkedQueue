package Etapa4;

public class LinkedStack<E> implements Stack<E> {
    private Node<E> top;
    private int tamanho;

    public LinkedStack(){
        top = null;
        tamanho = 0;
    }

    @Override
    public boolean isEmpty() {
        return top == null; 
    }

    @Override
    public boolean isFull() {
        return false; // Não há limite de tamanho
    }

    @Override
    public int numElements() {
        return tamanho;
    }

    @Override
    public void push(E element) throws OverflowException {
        Node<E> newNode = new Node<>(element);
        newNode.setNext(top);
        top = newNode;
        tamanho++;
    }

    @Override
    public E pop() throws UnderflowException {
        if (isEmpty()) {
            throw new Etapa3.UnderflowException();
        }
        E data = top.getData();
        top = top.getNext();
        tamanho--;
        return data;
    }

    @Override
    public E top() throws UnderflowException {
        if (isEmpty()) {
            throw new UnderflowException();
        }
        return top.getData();
    }
    
}
