package io.atlasmap.core.issue;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TargetClass {

    private int targetInteger;
    private String targetFirstName;
    private String targetLastName;
    private String targetName;
    private Date targetDate;
    private List<Item> targetList = new LinkedList<>();

    public int getTargetInteger() {
        return targetInteger;
    }

    public TargetClass setTargetInteger(int targetInteger) {
        this.targetInteger = targetInteger;
        return this;
    }

    public String getTargetFirstName() {
        return targetFirstName;
    }

    public TargetClass setTargetFirstName(String targetFirstName) {
        this.targetFirstName = targetFirstName;
        return this;
    }

    public String getTargetLastName() {
        return targetLastName;
    }

    public TargetClass setTargetLastName(String targetLastName) {
        this.targetLastName = targetLastName;
        return this;
    }

    public String getTargetName() {
        return targetName;
    }

    public TargetClass setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public TargetClass setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
        return this;
    }

    public List<Item> getTargetList() {
        return targetList;
    }

    public TargetClass setTargetList(List<Item> targetList) {
        this.targetList = targetList;
        return this;
    }

}
