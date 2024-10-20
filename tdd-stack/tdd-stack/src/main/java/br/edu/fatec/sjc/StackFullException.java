package br.edu.fatec.sjc;

public class StackFullException extends Exception {

    public StackFullException() {
        super("A pilha está cheia.");
    }

    public StackFullException(String message) {
        super(message);
    }
}
