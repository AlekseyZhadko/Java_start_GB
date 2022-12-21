package GBJavaExceptions.Seminar2.Task1;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

public class Task1 {
    String str;

    public Task1(String str) {
        this.str = str;
    }

    public boolean CheckNumberForFloat() {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
