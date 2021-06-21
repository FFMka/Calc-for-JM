public class Calc {
    private static int result;
    private final static int addition = Scan.getStr().indexOf("+");
    private final static int subtraction = Scan.getStr().indexOf("-");
    private final static int multiplication = Scan.getStr().indexOf("*");
    private final static int division = Scan.getStr().indexOf("/");

    public static int getResult (){
        return result;
    }


    public static void getCalc(){
        if (addition !=-1){
            result = ConvertRomanToArabian.getNum1() + ConvertRomanToArabian.getNum2();
        }
        else if (subtraction !=-1) {
            result = ConvertRomanToArabian.getNum1() - ConvertRomanToArabian.getNum2();
        }
        else if (multiplication !=-1) {
            result = ConvertRomanToArabian.getNum1() * ConvertRomanToArabian.getNum2();
        }
        else if (division !=-1) {
            if (ConvertRomanToArabian.getNum2() == 0) {
                System.out.println("На ноль делить нельзя");
                System.exit(0);
            }
            else result = ConvertRomanToArabian.getNum1() / ConvertRomanToArabian.getNum2();
        }
        else {
            System.out.println("Неверное выражение");
            System.exit(0);
        }
    }
}
