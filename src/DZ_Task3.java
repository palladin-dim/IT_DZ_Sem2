import java.io.FileNotFoundException;
public class DZ_Task3 {

        public static void main(String[] args) {
            try {
                int a = 90;
                int b = 3;
                System.out.println(a / b);
                printSum(23, 234);
                int[] abc = { 1, 2 };
                // Исправлено: доступ к элементу за пределами массива
                // должен быть обработан с помощью IndexOutOfBoundsException
                abc[2] = 9;
            } catch (ArithmeticException ex) {
                System.out.println("Ошибка при делении на ноль");
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Выход за пределы размера массива");
            } catch (Throwable ex) {
                System.out.println("Что-то пошло не так...");
            }
        }

        public static void printSum(Integer a, Integer b) {
            System.out.println(a + b);
        }
    }
