public class Main {
    public static void main(String[] args) {
        int count = 200; // Начальный баланс на счету
        int addCount = 1010; // Сумма на которую пополнили счет
        int bonus; // Обьявление переменной бонус
        if (addCount > 1000) {
            bonus = addCount / 100; // Расчет бонусов при пополнение более чем на 1000
        } else bonus = 0; // Кол-во бонусов при пополнение на 1000 и меньше
        count = count + addCount + bonus; // Сумма баланса
        System.out.println("Баланс счета: " + count + ", из них бонусов: " + bonus);
    }
}
