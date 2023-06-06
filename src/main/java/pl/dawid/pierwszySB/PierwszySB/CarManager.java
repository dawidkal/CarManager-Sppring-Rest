package pl.dawid.pierwszySB.PierwszySB;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//dodawanie do bina // adnotacja spring zarzadza kontekstem
  @Service  // programista widzi ze klasa z ta adnotacja swiadczy uslugi
//@controller - odpowiada za komunikacje np miedzy serwisami
// @RestController - komunikacja  w architekturze rest
// @Bean - ogolne adnotacje, chyba stosowanie niezalecane
// @Repository - operacje na danych    // @Component

public class CarManager {

    public List<Car> carList;

    public CarManager() {
        this.carList = new ArrayList<>();
        String model;
        String mark;
        carList.add(new Car(model = "Polo", mark = "vw"));
        carList.add(new Car(model = "Fiat", mark = "fso"));
        carList.add(new Car(model = "Audi80", mark = "audi"));
    }

    public boolean addCar(Car car) {
        return carList.add(car);
    }// po dodaniu zwraca true

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

}