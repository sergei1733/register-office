package edu.javacourse.register.domain;

import java.time.LocalDate;

public class MarriageCertificate {

    private Long MarriageCertificateId;
    private String number;
    private LocalDate issueDate;
    private PersonMale husband;
    private PersonFemale wife;
    private boolean active;
    private LocalDate endDate;

    public Long getMarriageCertificateId() {
        return MarriageCertificateId;
    }

    public void setMarriageCertificateId(Long marriageCertificateId) {
        MarriageCertificateId = marriageCertificateId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public PersonMale getHusband() {
        return husband;
    }

    public void setHusband(PersonMale husband) {
        this.husband = husband;
    }

    public PersonFemale getWife() {
        return wife;
    }

    public void setWife(PersonFemale wife) {
        this.wife = wife;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
