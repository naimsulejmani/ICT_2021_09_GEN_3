package ict.kosovo.growth.oop.abstract_interfaces.shembull_me_db_entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

/*
    Table:
        Id, name, surname, departament, registerdate,insertBy,insertDate,updateBy
        ,updateDate,updateNo, deleteBY, deleteDate...

        created_at, created_by, modified_at, modified_by,...removed_at, removed_by

 */
public class Studenti extends BaseAuditLog{
    private int id;
    private String name;
    private String surname;
    private String departament;
    private LocalDate registerDate;

    public Studenti(int id, String name, String surname, String departament, LocalDate registerDate,
                    String insertBy)
    {
        super(insertBy, LocalDateTime.now());
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.departament = departament;
        this.registerDate = registerDate;
    }

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

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public void printLog() {
        System.out.println("DO TE IMPLEMENTOHET LOGU PER KLASEN STUDENTI");
    }
}
