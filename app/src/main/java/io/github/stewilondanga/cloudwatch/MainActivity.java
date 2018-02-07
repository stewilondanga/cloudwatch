package io.github.stewilondanga.cloudwatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createWeatherMessage();
    }

    /**
     * Create new message that specifies the city name and temperature.
     */
    private String createWeatherMessage() {
        return "Welcome to San Francisco where the temperature is 77 degrees";
    }
}
