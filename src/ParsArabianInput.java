public class ParsArabianInput {
    public static void getParsArabianInput () throws NumberFormatException {
        try {


            int num1 = Integer.parseInt(SplitInputString.getStrNum1());
            int num2 = Integer.parseInt(SplitInputString.getStrNum2());

            if (num1 >= 0 && num1 <= 10 && num2 >= 0 && num2 <= 10) {
                ConvertRomanToArabian.setNum1(num1);
                ConvertRomanToArabian.setNum2(num2);
            } else {
                System.out.println("Неверное выражение");
                System.exit(0);
            }
        } catch (NumberFormatException e) {
            System.out.println("Используйте только положительные числа или ноль");
            System.exit(0);
        }
    }
}
