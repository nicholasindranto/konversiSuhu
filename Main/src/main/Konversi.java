package main;

public class Konversi {
    float reamur, fahrenheit, kelvin;

    public Konversi(float suhu){
    	reamur = (4.0f * suhu) / 5.0f;
        fahrenheit = (9.0f * suhu) / 5.0f + 32.0f;
        kelvin = suhu + 273.15f;
        System.out.println("Suhu dalam : ");
        System.out.println("Celsius \t : " + suhu + " derajat Celsius");
        System.out.println("Reamur \t\t : " + reamur + " derajat Reamur");
        System.out.println("Fahrenheit \t : " + fahrenheit + " derajat Fahrenheit");
        System.out.println("Kelvin \t\t : " + kelvin + " Kelvin");

        if(suhu <= 0.0f){
            System.out.println("Kondisi Air Beku.");
        } else if(suhu >= 100.0f){
            System.out.println("Kondisi Air Mendidih.");
        } else {
            System.out.println("Kondisi Air Normal.");
        }
    }
}