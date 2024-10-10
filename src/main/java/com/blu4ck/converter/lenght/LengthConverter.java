package com.blu4ck.converter.lenght;

import com.blu4ck.converter.lenght.model.LengthUnit;

public interface LengthConverter {
    double lengthConvert(double value, LengthUnit from, LengthUnit to);
}
