package com.blu4ck.converter.history.service;

import com.blu4ck.converter.history.model.HistoryEntry;
import com.blu4ck.converter.lenght.model.LengthUnit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HistoryService {

    private final List<HistoryEntry> history = new ArrayList<>();

    public void addEntry(double value, LengthUnit from, LengthUnit to, double result) {
        HistoryEntry entry = new HistoryEntry(value, from, to, result);
        history.add(entry);
    }

    public List<HistoryEntry> getHistory() {
        return history;
    }
}
