package first.converters;

public class FahrenheitConverter implements ConverterI {

    public float convertFromCelsius(float degree){
        return 9f/5f*(degree+32);
    }

}
