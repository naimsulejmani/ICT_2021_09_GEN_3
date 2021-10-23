package ict.kosovo.growth.oop.abstract_interfaces.shembull_me_db_entity;

import ict.kosovo.growth.oop.class_and_object_2.DateTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class BaseAuditLog {
    private String insertBy;
    private LocalDateTime insertDate;
    private String updateBy;
    private LocalDateTime updateDate;
    private int updateNo=0;
    private String deleteBy;
    private LocalDateTime deleteDate;

    public BaseAuditLog(String insertBy, LocalDateTime insertDate, String updateBy, LocalDateTime updateDate, int updateNo, String deleteBy, LocalDateTime deleteDate) {
        this.insertBy = insertBy;
        this.insertDate = insertDate;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
        this.updateNo = updateNo;
        this.deleteBy = deleteBy;
        this.deleteDate = deleteDate;
    }

    public BaseAuditLog(String insertBy, LocalDateTime insertDate) {
        this.insertBy = insertBy;
        this.insertDate = insertDate;
    }

    public String getInsertBy() {
        return insertBy;
    }

    public void setInsertBy(String insertBy) {
        this.insertBy = insertBy;
    }

    public LocalDateTime getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(LocalDateTime insertDate) {
        this.insertDate = insertDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public int getUpdateNo() {
        return updateNo;
    }

    public void setUpdateNo(int updateNo) {
        this.updateNo = updateNo;
    }

    public String getDeleteBy() {
        return deleteBy;
    }

    public void setDeleteBy(String deleteBy) {
        this.deleteBy = deleteBy;
    }

    public LocalDateTime getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(LocalDateTime deleteDate) {
        this.deleteDate = deleteDate;
    }

    public abstract void printLog();
}
