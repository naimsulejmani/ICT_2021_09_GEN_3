package ict.kosovo.growth.oop.generics.html_select_example;

public class Option<T,U> {
    private T value;
    private U text;

    public Option(T value, U text) {
        this.value = value;
        this.text = text;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public U getText() {
        return text;
    }

    public void setText(U text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("<option value=\"%s\">%s</option>",value,text);
    }
}
