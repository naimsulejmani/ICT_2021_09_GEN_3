package ict.kosovo.growth.oop.generics.html_select_example;

import java.util.ArrayList;
import java.util.List;

public class Select<T, U> {
    private Integer id;
    private String name;
    List<Option<T, U>> options;

    public Select(Integer id, String name) {
        this.id = id;
        this.name = name;
        options = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(T value, U text) {
        Option<T, U> newOption = new Option<>(value, text);
        options.add(newOption);
    }

    @Override
    public String toString() {
        String html = String.format("<select id='%s' name='%s'>%n", id, name);
        for (Option<T, U> option : options) {
            html += String.format("%s%n", option);
        }
        html += "</select>";
        return html;
    }
}
