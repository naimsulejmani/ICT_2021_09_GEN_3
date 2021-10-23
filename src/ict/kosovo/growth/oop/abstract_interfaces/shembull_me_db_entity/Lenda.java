package ict.kosovo.growth.oop.abstract_interfaces.shembull_me_db_entity;

import java.time.LocalDateTime;

public class Lenda extends BaseAuditLog {
    private String id;
    private String name;

    public Lenda(String id, String name, String insertBy) {
        super(insertBy, LocalDateTime.now());
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printLog() {
        System.out.printf("Lenda: %d - %s -> e insertuar me %s nga %s", id, name, getInsertDate(), getInsertBy());
    }
}
