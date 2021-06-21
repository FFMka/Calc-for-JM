public class SplitInputString {
    private static String strNum1;
    private static String strNum2;

    public static String getStrNum1(){
        return strNum1;
    }
    public static void setStrNum1(String str){
        SplitInputString.strNum1 = str;
    }

    public static String getStrNum2(){
        return strNum2;
    }
    public static void setStrNum2(String str){
        SplitInputString.strNum2 = str;
    }
    public static void splitInputString (String str){
        String[] array = str.split("[-+/*]");
        setStrNum1(array[0]);
        setStrNum2(array[1]);
    }
}
