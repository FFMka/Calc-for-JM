public class ConvertRomanToArabian {
    private static int num1;
    private static int num2;

    public static int getNum1() {
        return num1;
    }

    public static void setNum1(int num1) {
        ConvertRomanToArabian.num1 = num1;
    }

    public static int getNum2() {
        return num2;
    }

    public static void setNum2(int num2) {
        ConvertRomanToArabian.num2 = num2;
    }

    public static void convert(String str1, String str2) {
        switch (str1) {
            case ("I"): setNum1(1);
                break;
            case ("II"): setNum1(2);
                break;
            case ("III"): setNum1(3);
                break;
            case ("IV"): setNum1(4);
                break;
            case ("V"): setNum1(5);
                break;
            case ("VI"): setNum1(6);
                break;
            case ("VII"): setNum1(7);
                break;
            case ("VIII"): setNum1(8);
                break;
            case ("IX"): setNum1(9);
                break;
            case ("X"): setNum1(10);
                break;
            default:
                System.out.println("Неверное выражение");
                System.exit(0);
        }
        switch (str2) {
            case ("I"): setNum2(1);
                break;
            case ("II"): setNum2(2);
                break;
            case ("III"): setNum2(3);
                break;
            case ("IV"): setNum2(4);
                break;
            case ("V"): setNum2(5);
                break;
            case ("VI"): setNum2(6);
                break;
            case ("VII"): setNum2(7);
                break;
            case ("VIII"): setNum2(8);
                break;
            case ("IX"): setNum2(9);
                break;
            case ("X"): setNum2(10);
                break;
            default:
                System.out.println("Неверное выражение");
                System.exit(0);


        }
    }
}
