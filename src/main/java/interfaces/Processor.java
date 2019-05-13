package interfaces;

public interface Processor<T,R> {
    R process(T input);
}
