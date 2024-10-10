package com.blu4ck.converter.lenght.controller;

import com.blu4ck.converter.history.model.HistoryEntry;
import com.blu4ck.converter.history.service.HistoryService;
import com.blu4ck.converter.lenght.LengthConverter;
import com.blu4ck.converter.lenght.model.LengthUnit;
import com.blu4ck.converter.lenght.service.LConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LengthController {

    private final HistoryService historyService;
    private final LengthConverter lConverter = new LConverter();

    public LengthController(HistoryService historyService) {
        this.historyService = historyService;
    }

    @GetMapping("/index/length")
    public double convertLength(@RequestParam double value,
                                @RequestParam LengthUnit from,
                                @RequestParam LengthUnit to) {

        double result = lConverter.lengthConvert(value, from, to);


        historyService.addEntry(value, from, to, result);

        return result;
    }

    @GetMapping("/length/history")
    public List<HistoryEntry> getConversionHistory() {
        return historyService.getHistory();
    }
}
