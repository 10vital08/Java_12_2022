// Составить частотный словарь элементов одномерного массива
// Частотный словарь содержит информацию о том, сколько раз встречается элемент входных данных.

package HomeWork_1;

import java.util.HashMap;
import java.util.Map;

public class program {

    // подсчёт количества вхождений и запись результата в словарь
    static Map<String, String> countNumbers(int[] arr) {
        int countNumber = 0;// счётчик вхождений
        Map<String, String> dictionary = new HashMap<String, String>();// объект коллекции (хэш-карта)

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    countNumber++;
                }
            }
            // Запись в коллекцию
            dictionary.put(Integer.toString(arr[i]), Integer.toString(countNumber));
            countNumber = 0;
        }
        return dictionary;
    }

    // печать коллекции
    static void printMap(Map<String, String> outMap) {
        for (Map.Entry<String, String> entry : outMap.entrySet())
            System.out.println(entry.getKey() + " встречается " + entry.getValue() + " раз");
    }

    public static void main(String[] args) {
        int[] array = new int[] { 1, 9, 9, 0, 2, 8, 0, 9 };

        Map<String, String> resultMap = countNumbers(array);
        printMap(resultMap);
    }
}
