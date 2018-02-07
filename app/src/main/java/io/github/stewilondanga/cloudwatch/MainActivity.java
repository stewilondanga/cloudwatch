package io.github.stewilondanga.cloudwatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createWeatherMessage(77, "San Francisco");
    }

    /**
     * Create new message that specifies the city name and temperature.
     *
     * @param temperature of the city
     * @param cityName is the name of the city
     */
    private String createWeatherMessage(int temperature, String cityName) {
        return "Welcome to " + cityName + "where the temperature is " + temperature + "degrees Farenheit";
    }
}
