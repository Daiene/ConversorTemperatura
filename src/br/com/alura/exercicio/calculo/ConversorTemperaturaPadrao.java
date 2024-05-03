package br.com.alura.exercicio.calculo;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    double celsius;
    double fahrenheit;

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }


    @Override
    public void celsiusParaFahrenheit() {
        double conversor = celsius*((double) 9/5)+32;
        System.out.println(celsius + " celsius para fahrenheit é: " + conversor);
    }

    @Override
    public void fahrenheitParaCelsius() {
        double conversor = (fahrenheit-32)*((double) 5/9);
        System.out.println(fahrenheit + " fahrenheit para celsius é: " + conversor);
    }
}
