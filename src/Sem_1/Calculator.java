package Sem_1;

import static org.assertj.core.api.Assertions.*;
public class Calculator {

    public static void main(String[] args) { // тесты
        //валидные значения
        assertThat(Calculator.calculatingDiscount(100, 10)).isEqualTo(90.0);
        //% больше 100
        assertThatThrownBy(() -> Calculator.calculatingDiscount(500,10000)).isInstanceOf(ArithmeticException.class).hasMessage("% скидки не может быть более 100");
        //проверка на отрицательные числа - процент
        assertThatThrownBy(() -> Calculator.calculatingDiscount(500,-10)).isInstanceOf(ArithmeticException.class).hasMessage("Скидка не может быть меньше нуля");
        //проверка на отрицательные числа - сумма
        assertThatThrownBy(() -> Calculator.calculatingDiscount(-500,10)).isInstanceOf(ArithmeticException.class).hasMessage("Сумма не может быть меньше нуля");
        //проверка суммы на ноль
        assertThat(Calculator.calculatingDiscount(0, 10)).isEqualTo(0);
        //проверка % на ноль
        assertThat(Calculator.calculatingDiscount(10, 0)).isEqualTo(10);
    }

    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;

}

// В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки.
// Ваша задача - проверить этот метод с использованием библиотеки AssertJ. Если метод calculateDiscount получает недопустимые аргументы,
// он должен выбрасывать исключение ArithmeticException. Не забудьте написать тесты для проверки этого поведения.

    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        if (discountAmount < 0) {
            throw new ArithmeticException("Скидка не может быть меньше нуля");
        }
        if (discountAmount > 100){
            throw new ArithmeticException("% скидки не может быть более 100");
        }
        if (purchaseAmount < 0){
            throw new ArithmeticException("Сумма не может быть меньше нуля");
        }
         return purchaseAmount - (purchaseAmount * discountAmount) / 100;
    }

}
