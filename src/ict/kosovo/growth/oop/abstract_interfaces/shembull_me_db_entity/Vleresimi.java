package ict.kosovo.growth.oop.abstract_interfaces.shembull_me_db_entity;

import java.time.LocalDateTime;

public class Vleresimi extends BaseAuditLog{
    private int studentId;
    private String lendaId;
    private int nota;

    private Studenti studenti;
    private Lenda lenda;

    public Vleresimi(int studentId, String lendaId, int nota, Studenti studenti, Lenda lenda
    ,String insertBy
    ) {
        super(insertBy, LocalDateTime.now());
        this.studentId = studentId;
        this.lendaId = lendaId;
        this.nota = nota;
        this.studenti = studenti;
        this.lenda = lenda;
    }

    public Vleresimi(int studentId, String lendaId, int nota, String insertBy) {
        this(studentId,lendaId,nota,null,null,insertBy);
//        this.studentId = studentId;
//        this.lendaId = lendaId;
//        this.nota = nota;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getLendaId() {
        return lendaId;
    }

    public void setLendaId(String lendaId) {
        this.lendaId = lendaId;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Studenti getStudenti() {
        return studenti;
    }

    public void setStudenti(Studenti studenti) {
        this.studenti = studenti;
    }

    public Lenda getLenda() {
        return lenda;
    }

    public void setLenda(Lenda lenda) {
        this.lenda = lenda;
    }

    @Override
    public void printLog() {
        System.out.println("Stundeti EMRI MBIEMRI ka hyre ne provim ne lenden LENDA dhe me daten KAQ nga profesori KY ka marre noten 10");
    }
}
