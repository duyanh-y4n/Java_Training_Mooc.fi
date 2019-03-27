public class StringUtils {
    public static boolean included(String source, String searched){
        return source.toUpperCase().trim().contains(searched.toUpperCase().trim());
    }
}
