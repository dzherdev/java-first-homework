package first.converters;

public class Converter {

    private ConverterI converter;

    public Converter(ConverterI converter){
        this.converter=converter;
    }

    public float covertFromCelsius(float degree){
        return this.converter.convertFromCelsius(degree);
    }

    public void setConverter(ConverterI converter){
        this.converter=converter;
    }

}
