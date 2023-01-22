package cc.ddrpa.chaparral.desensitizer;

public interface IDesensitizer<T> {
    T desensitize(T value);
}