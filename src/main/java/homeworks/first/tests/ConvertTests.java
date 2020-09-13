package main.java.homeworks.first.tests;

import homeworks.first.converters.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConvertTests {
    private Converter converter;

    @BeforeEach
    public void beforeClass(){
        this.converter=new Converter(new СelsiusConverter());
    }

    @Test
    public void convertCelsiusToKelvinTest() {
        this.converter.setConverter(new KelvinConverter());
       float degree = this.converter.covertFromCelsius(10f);
       assertTrue(degree==283.15f);
    }

    @Test
    public void convertCelsiusToFahrenheitTest() {
        this.converter.setConverter(new FahrenheitConverter());
        float degree = this.converter.covertFromCelsius(10f);
        assertTrue(degree==75.6f);

    }

    @Test
    public void convertCelsiusToReomureTest() {
        this.converter.setConverter(new ReomureConverter());
        float degree = this.converter.covertFromCelsius(10f);
        assertTrue(degree==12.5f);
    }

}