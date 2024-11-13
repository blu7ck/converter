package com.blu4ck.converter.history;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class HistoryController {

    private final HistoryManager historyManager;

    @Autowired
    public HistoryController(HistoryManager historyManager) {
        this.historyManager = historyManager;
    }


    @GetMapping("/api/history")
    public List<HistoryRecord> getHistory() {
        return historyManager.getHistory();
    }
}
