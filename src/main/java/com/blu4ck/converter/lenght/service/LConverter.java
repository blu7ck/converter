package com.blu4ck.converter.lenght.service;

import com.blu4ck.converter.history.HistoryManager;
import com.blu4ck.converter.lenght.LengthConverter;
import com.blu4ck.converter.lenght.model.LengthUnit;

public class LConverter implements LengthConverter {
    private final HistoryManager historyManager;

    public LConverter(HistoryManager historyManager) {
        this.historyManager = historyManager;
    }

    @Override
    public double lengthConvert(double value, LengthUnit from, LengthUnit to) {
        if (from == null || to == null || value < 0) {
            throw new IllegalArgumentException("Invalid units for length conversion.");
        }

        double meters = value;
        switch (from) {

            case KILOMETER:
                meters = value * 1000;
                break;
            case CENTIMETER:
                meters = value / 100;
                break;
            case MILLIMETER:
                meters = value / 1000;
                break;
            case MILE:
                meters = value * 1609.34;
                break;
            case YARD:
                meters = value * 0.9144;
                break;
            case FOOT:
                meters = value * 0.3048;
                break;
            case INCH:
                meters = value * 0.0254;
                break;
            default:
                break;
        }

        double result = switch (to) {
            case KILOMETER -> meters / 1000;
            case CENTIMETER -> meters * 100;
            case MILLIMETER -> meters * 1000;
            case MILE -> meters / 1609.34;
            case YARD -> meters / 0.9144;
            case FOOT -> meters / 0.3048;
            case INCH -> meters / 0.0254;
            default -> meters;

        };

        String record = "Converted " + value + " " + from + " to " + result + " " + to;
        historyManager.addRecord(record);

        return result;
    }
}
