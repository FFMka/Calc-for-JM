import java.util.Scanner;

public class Scan {
    private static String str;
    public static void scan(){
        System.out.println("Введите выражение");
        Scanner scan = new Scanner (System.in);
        setStr(scan.nextLine());
    }
    public static String getStr (){
        return Scan.str;
    }
    public static void setStr (String str){
        Scan.str = str;
    }

}
