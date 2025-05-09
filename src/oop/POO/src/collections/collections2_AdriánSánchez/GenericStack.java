package collections2_AdriánSánchez;
import java.util.ArrayList;

public class GenericStack<T> {
    private ArrayList<T> items;
    private int top;

    public GenericStack() {
        items = new ArrayList<>();
        top = 0;
    }

    public void push(T item) {
        items.add(item);
        top++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new GenericStackException("Error de subdesbordament");
        }
        top--;
        return items.remove(top);
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("S'ha tret: " + stack.pop());
            } catch (GenericStackException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static class GenericStackException extends RuntimeException {
        public GenericStackException(String message) {
            super(message);
        }
    }
}

