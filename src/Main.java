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
        if (matcher1.find()){                                   //Проверяем строку по шаблону на наличие арабских цифр
            SplitInputString.splitInputString(Scan.getStr());   //Делим строку с разделителем [-+/*] на 2 значения String
            ParsArabianInput.getParsArabianInput();             //Парсим полученные String значения в int
            Calc.getCalc();                                     //Считаем выражение
            OutPutArabianResult.out();                          //Выводим результат в консоль
        }
        else if (matcher2.find()){                              //Проверяем строку по шаблону на наличие римских цифр
            SplitInputString.splitInputString(Scan.getStr());   //Делим строку с разделителем [-+/*] на 2 значения String
            ConvertRomanToArabian.convert(SplitInputString.getStrNum1(), SplitInputString.getStrNum2()); //Конвертируем полученные римские цифры в арабские
            Calc.getCalc();                                     //Считаем выражение
            if (Calc.getResult() < 0) {
                System.out.println("Невозможно записать отрицательный ответ");
                System.exit(0);
            }
            else if (Calc.getResult() == 0) {
                System.out.println("Невозможно записать ноль римскими цифрами");
                System.exit(0);
            }
            else System.out.println("Ваш ответ "+ ConvertResultToRoman.getConvertToRoman(Calc.getResult())); //Выводим результат на экран, предварительно конвертируя в римские цифры
        }
        else {
            System.out.println("Неверное выражение");
            System.exit(0);
        }

    }
}
