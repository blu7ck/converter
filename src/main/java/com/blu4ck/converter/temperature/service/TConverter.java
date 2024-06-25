package com.blu4ck.converter.temperature.service;

import com.blu4ck.converter.temperature.TemperatureConverter;
import com.blu4ck.converter.temperature.model.TempUnit;

public class TConverter implements TemperatureConverter {
    @Override
    public double temperatureConvert(double value, TempUnit from, TempUnit to) {
        if (from == null || to == null) {
            throw new IllegalArgumentException("Invalid units for temperature conversion.");
        }

        double celsius = value;
        switch (from) {
            case FAHRENHEIT:
                celsius = (value - 32) * 5 / 9;
                break;
            case KELVIN:
                celsius = value - 273.15;
                break;
            default:
                break;
        }

        switch (to) {
            case FAHRENHEIT:
                return celsius * 9 / 5 + 32;
            case KELVIN:
                return celsius + 273.15;
            default:
                return celsius;
        }
    }
}
