import br.com.alura.exercicio.calculo.ConversorTemperaturaPadrao;

public class Principal {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();

        conversor.setCelsius(40);
        conversor.celsiusParaFahrenheit();

        conversor.setFahrenheit(104);
        conversor.fahrenheitParaCelsius();
    }
}
