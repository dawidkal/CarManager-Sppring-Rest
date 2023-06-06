package pl.dawid.pierwszySB.PierwszySB;

public class Car {
    private String model; //pola
    private String mark;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    //konstruktor
    public Car(String model, String mark) {
        this.model = model;
        this.mark = mark;
    }
    //konstruktor bezparametrowy bo inaczej json w postman ma problem, json wymaga geterow i seterow dla wszytkich pol
    public Car() {
    }
}