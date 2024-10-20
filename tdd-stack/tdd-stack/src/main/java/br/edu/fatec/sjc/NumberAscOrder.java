package br.edu.fatec.sjc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberAscOrder <T extends Number> {
    private CustomStack<T> stack;

    public NumberAscOrder(CustomStack<T> stack) {
        this.stack = stack;
    }

    public List<T> sort() throws StackEmptyException {
        if (stack.isEmpty()) {
            throw new StackEmptyException("A pilha está vazia.");
        }
        
        List<T> sortedNumbers = new ArrayList<>();
        while (!stack.isEmpty()) {
            sortedNumbers.add(stack.pop());
        }
        
        Collections.sort(sortedNumbers, (a, b) -> Double.compare(a.doubleValue(), b.doubleValue()));
        
        return sortedNumbers;
    }
}
