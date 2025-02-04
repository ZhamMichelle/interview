package kz.zhami.interview.thread;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

public class NonBlockingStack<T> {
    private final Semaphore semaphore = new Semaphore(1);
    private final AtomicReference<Element> head = new AtomicReference<>(null);

    NonBlockingStack<T> push(final T value) {
        final Element current = new Element();
        current.value = value;
        Element recent;
        do {
            recent = head.get();
            current.previous = recent;
        } while (!head.compareAndSet(recent, current));
        return this;
    }

    T pop() {
        Element result;
        Element previous;
        do {
            result = head.get();
            if (result == null) {
                return null;
            }
            previous = result.previous;
        } while (!head.compareAndSet(result, previous));
        return result.value;
    }

    private class Element {
        private T value;
        private Element previous;
    }
}
