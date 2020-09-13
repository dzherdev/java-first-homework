package homeworks.lists.grouping;

import homeworks.lists.grouping.entities.Car;
import homeworks.lists.grouping.entities.Model;
import homeworks.lists.grouping.entities.Type;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupCar {

    public static void main(String[] args) {
        Model modelLadaSedan= new Model("Лада");
        Model modelLadaHetch= new Model("Лада");
        Model modelMersedes= new Model("Мерседес");
        Model modelBMV= new Model("Бмв");
        Model modelPesho= new Model("Пежо");
        Model modelFord= new Model("Форд");
        Model modelTayota= new Model("Тойота");

        Type typeSedan= new Type("Седан",1);
        Type typeHetch= new Type("Хэтчбек",2);
        Type typeCross= new Type("Кроссовер",3);

        List<Car> cars=new ArrayList<>();
        cars.add(new Car(modelLadaSedan,typeSedan));
        cars.add(new Car(modelLadaHetch,typeHetch));
        cars.add(new Car(modelMersedes,typeSedan));
        cars.add(new Car(modelBMV,typeCross));
        cars.add(new Car(modelFord,typeHetch));
        cars.add(new Car(modelPesho,typeCross));
        cars.add(new Car(modelTayota,typeSedan));

        
        Map<Type,List<Car>> groupCar= cars.stream().collect(Collectors.groupingBy(
            (item)->item.getType()
        ));

        groupCar.forEach((type,item)-> System.out.println(type.toString()+item));

    }
}
