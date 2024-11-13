package com.blu4ck.converter.history;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class HistoryManager {
    private final List<String> history = new ArrayList<>();
    private final HistoryRecordRepository historyRecordRepository;

    @Autowired
    public HistoryManager(HistoryRecordRepository historyRecordRepository) {
        this.historyRecordRepository = historyRecordRepository;
    }
    public void addRecord(String record) {
        HistoryRecord historyRecord = new HistoryRecord(record);
        historyRecordRepository.save(historyRecord);
    }
    public List<HistoryRecord> getHistory() {
        return historyRecordRepository.findAll();
    }

        public void showHistory() {
        if (history.isEmpty()) {
            System.out.println("No conversion history.");
        } else {
            for (String record : history) {
                System.out.println(record);
            }
        }
    }
}
