package ict.kosovo.growth.advance.reflections;

import java.lang.reflect.Field;
import java.time.LocalDate;

public class Profesori {
    private int id;
    private String name;
    private String surname;
    private LocalDate birthdate;

    public Profesori(int id, String name, String surname, LocalDate birthdate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public Profesori() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getSelectHtmlHelper() {
        String html = "<select>";
        Field[] fields = this.getClass().getDeclaredFields();
        for(Field field: fields) {
            html += String.format("<option value='%s'>%s</option>",field.getName(),
                    field.getName());
        }
        html+="</select>";
        return html;

    }
}
