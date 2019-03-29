package ru.avalon.java.dev.j10.labs.initialization;

import java.util.Random;
import ru.avalon.java.dev.j10.labs.Initializer;

/**
 * Инициализатор, выполняющий инициализацию массива
 * значениями последовательности случайных чисел.
 *
 * <p>Экземпляры класса можно использовать многократно для
 * инициализации любого числа массивов.
 *
 * <p>Диапазон, в пределах которого будут получены случайные
 * значения, передаётся в конструктор класса при
 * инициализации.
 */
public class RandomInitializer implements Initializer {
    
    private int minValue;
    private int maxValue;

    public RandomInitializer(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }
    
    

    /**
     * Выполняет инициализацию массива, значениями
     * последовательности случайных чисел.
     *
     * @param array массив, подлежащий инициализации
     */
    public void initialize(int[] array) {
        
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            
        
// Получаем случайное число в диапазоне от min до max (включительно)
       array[i] = minValue + rnd.nextInt(maxValue - minValue + 1);
        
        /*
         * TODO(Студент): Реализовать метод initialize класса RandomInitializer
         */
        }
    }
    
    
}
