package converters;

public class KelvinConverter implements ConverterI {
    public float convertFromCelsius(float degree){
        return degree+273.15f;
    }
}
