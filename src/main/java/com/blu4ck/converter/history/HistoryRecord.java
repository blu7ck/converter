package com.blu4ck.converter.history;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Setter;


@Entity
public class HistoryRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private String record;

    public HistoryRecord() {}

    public HistoryRecord(String record) {
        this.record = record;
    }

    public Long getId() {
        return id;
    }

    public String getRecord() {
        return record;
    }

}
