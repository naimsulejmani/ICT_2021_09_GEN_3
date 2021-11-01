package ict.kosovo.growth.advance.nested_class.method_refrencing;

public class TextFilter {
    public static boolean remove(String text) {
        return text.startsWith("remove");
    }

    public int sortText(String text1, String text2) {
        return text1.compareToIgnoreCase(text2);
    }
}
