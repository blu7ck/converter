package com.blu4ck.converter.temperature.controller;
import com.blu4ck.converter.temperature.TemperatureConverter;
import com.blu4ck.converter.temperature.model.TempUnit;
import com.blu4ck.converter.temperature.service.TConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController {

        private final TemperatureConverter tConverter = new TConverter();

        @GetMapping("/convert/temperature")
        public double convertTemperature(@RequestParam double value,
                                         @RequestParam TempUnit from,
                                         @RequestParam TempUnit to) {
            return tConverter.temperatureConvert(value, from, to);
        }
    }

