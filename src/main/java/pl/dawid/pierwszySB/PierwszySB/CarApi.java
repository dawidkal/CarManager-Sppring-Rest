package pl.dawid.pierwszySB.PierwszySB;

//import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // spring przeszukuje klasy widzi adnotacje trafia do kontekstu jako bean i tworzy instancje
public class CarApi {

    //wstrzykiwanie  do konstruktora -metoda zalecana
    @Autowired
    public CarApi(CarManager carManager) {

        this.carManager = carManager;
    }

    public CarManager getCarManager() {

        return carManager;
    }

//    @Autowired  // wstrzykiwanie setter
//    public void setCarManager(CarManager carManager) {
//        this.carManager = carManager;
//

    //  @Autowired  // sprawdza czy jest zarzadzana klasa i wstrzykuje ja tu, samodzielnie nie tworzymy obiektow
    // zalenosci mozna wstrzykiwac do pola, setera, konstruktora
    //@Autowired //tu wstrzykiwanie do pola
    private CarManager carManager;


    @GetMapping("/dodaj") // sciezka do podania w host
    public int Dodaj() {

        int wynik = 2 + 2;
        return wynik;
    }

    @GetMapping("/tekst") // sciezka do podania w host
    public String Main() {
        return "Pierwsza aplikacja SpringBoot :)";

    }

    // metoda pobierania samochodow
    @GetMapping("/getCars") // sciezka do podania w host, wielkosc liter w przegladarce ma znaczenie
    public List<Car> getCars() {
        return carManager.getCarList();
    }

    // m dodawania
    @PostMapping("/addCar") // sciezka do podania w host

    public Boolean addCars(@RequestBody Car car) {
        return carManager.addCar(car); //jak jest @RestController nie musi byc @RequestBody

        //public Boolean addCars( Car car) {
        //return carManager.addCar(car);
    }
    //RequestBody aby moc sie posluzyc formatem text json w postman

}
