package br.edu.fatec.sjc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class NumberAscOrderTest {
    

    @Test
    public void testSortWithNumbers() throws StackFullException, StackEmptyException {
        CustomStack<Integer> stack = new CustomStack<>(7, value -> value);
        stack.push(100);
        stack.push(2);
        stack.push(50);
        stack.push(20);
        stack.push(35);
        stack.push(1);
        stack.push(5);
        
        NumberAscOrder<Integer> sorter = new NumberAscOrder<>(stack);
        List<Integer> sortedNumbers = sorter.sort();

        assertEquals(List.of(1,2,5,20,35,50,100), sortedNumbers);
    }

    @Test
    public void testSortWithEmptyStack() {
        CustomStack<Integer> stack = new CustomStack<>(7,value ->value);
        NumberAscOrder<Integer> sorter = new NumberAscOrder<>(stack);

        assertThrows(StackEmptyException.class, sorter::sort);
    }
}
