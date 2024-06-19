package com.blu4ck.converter.temperature.service;

import com.blu4ck.converter.temperature.TemperatureConverter;
import com.blu4ck.converter.temperature.model.TempUnit;

public class TConverter implements TemperatureConverter {
        @Override
        public double temperatureConvert(double value, TempUnit from, TempUnit to) {
            if (from == null || to == null) {
                throw new IllegalArgumentException("Invalid units for temperature conversion.");
            }

            double celsius = switch (from) {
                case FAHRENHEIT -> (value - 32) * 5 / 9;
                case KELVIN -> value - 273.15;
                default -> value;
            };

            return switch (to) {
                case FAHRENHEIT -> celsius * 9 / 5 + 32;
                case KELVIN -> celsius + 273.15;
                default -> celsius;
            };
        }
    }

