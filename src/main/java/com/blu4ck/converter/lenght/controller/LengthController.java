package com.blu4ck.converter.lenght.controller;
import com.blu4ck.converter.lenght.LenghtConverter;
import com.blu4ck.converter.lenght.model.LengthUnit;
import com.blu4ck.converter.lenght.service.LConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



    @RestController
    public class LengthController {

        private final LenghtConverter lConverter = new LConverter();

        @GetMapping("/index/length")
        public double convertLength(@RequestParam double value,
                                    @RequestParam LengthUnit from,
                                    @RequestParam LengthUnit to) {
            return lConverter.lengthConvert(value, from, to);
        }
    }

