public class StringWords {

    public static void main(String[] args) {
        String str = "I can program lots of things in Java";
        System.out.println(getSecondToLastWord(str));
    }

    public static String[] getStringArray(String string){
        return string.split("\\s");
    }

    public static String getSecondToLastWord(String str) {
        return getTheWordFromString(str, getStringArray(str).length - 1);
    }

    public static String getTheWordFromString(String str, int position) {
        return getStringArray(str)[position - 1];
    }
}
