package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;
import ru.avalon.java.dev.j10.labs.sort.ShellSort;

public class Main {
    

    public static void main(String[] args) {
        //0. Создать массив из 20 целых чисел и адресовать
	 //        его с сохранить ссылку в переменную array.
        int[] array = new int[20];     
        Initializer initializer = new FibonacciInitializer();
        //1. Проинициализировать массив значениями
	   //     последовательности чисел Фибоначчи.
        initializer.initialize(array);
        //2. Найти сумму элементов массива.
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            //array[i] = array[i - 1] + array[i - 2];
            sum += array[i]; // sum = sum + array[i];
            
        }
        System.out.println(sum);
        //3. Проинициализировать массив последовательностью
	     //   случайных чисел в диапазоне от -50 до 50.
              initializer = new RandomInitializer(-50, 50);
               initializer.initialize(array);
               for (int i = 0; i < array.length; i++) {
            
           
             System.out.println("Генерация случайных чисел в диапозоне от -50 до 50 - " + array[i]);
             
             
             
        }
        
         //4. Отсортировать массив с использованием
	   //  *    пузырьковой сортировки. 
           Sort sort = new BubbleSort();
           sort.sort(array);
           for (int i = 0; i < array.length; i++) {
            
           
             System.out.println("Сортировка пузырьком - " + array[i]);
             
             
             
        }
          initializer = new RandomInitializer(-50, 50);
               initializer.initialize(array);
               for (int i = 0; i < array.length; i++) {
            
           
             System.out.println("Генерация случайных чисел в диапозоне от -50 до 50 - " + array[i]);
             
             
             
        } 
          sort = new SelectionSort();
          sort.sort(array);
          for (int i = 0; i < array.length; i++) {
            
           
             System.out.println("Сортировка выбором  - " + array[i]);
             
             
             
        }
             
           initializer = new RandomInitializer(-50, 50);
               initializer.initialize(array);
               for (int i = 0; i < array.length; i++) {
            
           
             System.out.println("Генерация случайных чисел в диапозоне от -50 до 50 - " + array[i]);
             
             
             
        }   
                sort = new ShellSort();
          sort.sort(array);
          for (int i = 0; i < array.length; i++) {
            
           
             System.out.println("Сортировка Шелла  - " + array[i]);
             
             
             
        }
        
        
	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Создать массив из 20 целых чисел и адресовать
	     *    его с сохранить ссылку в переменную array.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
    }
}
