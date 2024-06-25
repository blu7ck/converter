package com.blu4ck.converter.lenght.service;

import com.blu4ck.converter.lenght.LenghtConverter;
import com.blu4ck.converter.lenght.model.LengthUnit;

public class LConverter implements LenghtConverter {
    @Override
    public double lengthConvert(double value, LengthUnit from, LengthUnit to) {
        if (from == null || to == null) {
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

        switch (to) {
            case KILOMETER:
                return meters / 1000;
            case CENTIMETER:
                return meters * 100;
            case MILLIMETER:
                return meters * 1000;
            case MILE:
                return meters / 1609.34;
            case YARD:
                return meters / 0.9144;
            case FOOT:
                return meters / 0.3048;
            case INCH:
                return meters / 0.0254;
            default:
                return meters;
        }
    }
}
