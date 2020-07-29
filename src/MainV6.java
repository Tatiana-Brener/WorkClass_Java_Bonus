public class MainV6 {
    public static void main(String[] args) {
        BonusService bonusService = new BonusService()

//        подготоваливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

//        вызываем целевой метод:
        long actual = bonusService.calculate(amount, registered);

//        производим проверку (сравниваем ожидаемый и фактический):
//        если true -  то PASS
//        если false - то FALSE
        boolean passed = expected == actual;

//        выводим результат:
        System.out.println(passed);


    }
}


