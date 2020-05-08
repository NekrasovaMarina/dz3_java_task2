public class Main {
    /*
    Задача №2 - "Получи рубль за каждые 100!"
    Легенда
    Один из сотовых операторов решил сделать своим клиентам приятный бонус: если клиент пополняет счёт более чем на 1000 рублей,
    то сотовый оператор дарит ему по 1 рублю за каждые 100 рублей.
    Начальные данные: у клиента на счёте 100 рублей.
    Примеры:
    Клиент пополнил счёт на 100 рублей - бонусов нет, итоговая сумма на счету клиента - 200 рублей
    Клиент пополнил счёт на 1100 рублей - бонус равен 11 рублям, итоговая сумма на счету клиента - 1211 рублей
    Что вам нужно: создать приложение, выводящее итоговый бонус.
    Количество денег на текущем счёте клиента и сумму пополнения вы выбираете сами (сами создайте переменные, в которых эти данные будут храниться).
    Итого: у вас должен быть репозиторий на GitHub, в котором расположен ваш Java-код.
     */

    public static void main(String[] args) {
        int mobileAccount = 100; // счёт клиента сотового оператора = 100 рублей
        int amount = 2000; // сумма пополнения
        int bonus = 0;
        if (amount <= 1000) {
            System.out.println("Вы пополнили баланс на " + amount + " рублей. Ваш бонус = " + bonus + " рублей.");
        } else
        { System.out.println("Вы пополнили баланс на " + amount + " рублей. Ваш бонус = " + amount / 100 + " рублей.");
        }
    }
}
