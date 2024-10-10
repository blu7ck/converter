package com.blu4ck.converter.history.model;

import com.blu4ck.converter.lenght.model.LengthUnit;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class HistoryEntry {
    private double value;
    private LengthUnit from;
    private LengthUnit to;
    private double result;
    private LocalDateTime timestamp;

    public HistoryEntry(double value, LengthUnit from, LengthUnit to, double result) {
        this.value = value;
        this.from = from;
        this.to = to;
        this.result = result;
        this.timestamp = LocalDateTime.now();
    }

}
