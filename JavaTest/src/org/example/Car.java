package org.example;

public class Car {

    //var
    private String brand;
    private String model;
    private int year;

    //method

    // Getter Setter
    public String getBrand()
    {
        return this.brand;
    }
    public void setBrand(String value)
    {
        this.brand = value;
    }

    public String getModel()
    {
        return this.model;
    }
    public void setModel(String value)
    {
        this.model = value;
    }

    public int getYear()
    {
        return this.year;
    }
    public void setYear(int value)
    {
        this.year = value;
    }

    public void move()
    {
        System.out.println("자동차가 움직입니다.");
    }

    public void stop()
    {
        System.out.println("자동차가 정지합니다.");
    }


}
