package first.converters;

public class ReomureConverter implements ConverterI {
    public float convertFromCelsius(float degree){
        return degree*1.25f;
    }
}
