package task3.model;

import lombok.Getter;
import lombok.NonNull;

import java.util.Arrays;

@Getter
public class MinMax<T extends Number> {
    private final T[] arrayOfNumbers;

    public MinMax(@NonNull T[] array) {
//        Objects.requireNonNull(array);
        if (array.length == 0) {
            throw new IllegalArgumentException("array is empty");
        }
        this.arrayOfNumbers = array;
    }

    public T getMax() {
        Arrays.sort(arrayOfNumbers);
        return arrayOfNumbers[arrayOfNumbers.length - 1];
    }

    public T getMin() {
        Arrays.sort(arrayOfNumbers);
        return arrayOfNumbers[0];
    }
}
