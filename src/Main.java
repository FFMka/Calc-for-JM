import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scan.scan();
        String pattern = ("\\d[+-/*]\\d");
        Pattern ptrn1 = Pattern.compile(pattern);
        Matcher matcher1 = ptrn1.matcher(Scan.getStr());
        String pattern2 = ("[IVX][+-/*][IVX]");
        Pattern ptrn2 = Pattern.compile(pattern2);
        Matcher matcher2 = ptrn2.matcher(Scan.getStr());
        if (matcher1.find()){
            SplitInputString.splitInputString(Scan.getStr());
            ParsArabianInput.getParsArabianInput();
            Calc.getCalc();
            OutPutArabianResult.out();
        }
        else if (matcher2.find()){
            SplitInputString.splitInputString(Scan.getStr());
            ConvertRomanToArabian.convert(SplitInputString.getStrNum1(), SplitInputString.getStrNum2());
            Calc.getCalc();
            if (Calc.getResult() < 0) {
                System.out.println("Невозможно записать отрицательный ответ");
                System.exit(0);
            }
            else if (Calc.getResult() == 0) {
                System.out.println("Невозможно записать ноль римскими цифрами");
                System.exit(0);
            }
            else System.out.println("Ваш ответ "+ ConvertResultToRoman.getConvertToRoman(Calc.getResult()));
        }
        else {
            System.out.println("Неверное выражение");
            System.exit(0);
        }

    }
}
