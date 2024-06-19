package com.blu4ck.converter.temperature;

import com.blu4ck.converter.temperature.model.TempUnit;

public interface TemperatureConverter {
    double temperatureConvert(double value, TempUnit from, TempUnit to);
}
