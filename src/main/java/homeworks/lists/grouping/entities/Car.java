package homeworks.lists.grouping.entities;

public class Car {
    private Model model;
    private Type type;

    public Car(Model model,Type type){
        this.model=model;
        this.type=type;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
            "model=" + model.toString() +
            ", type=" + type.toString() +
            '}';
    }
}
