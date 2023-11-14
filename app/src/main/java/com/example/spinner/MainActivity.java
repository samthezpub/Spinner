package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Находим Spinner в макете
        Spinner spinner = findViewById(R.id.spinner);

        String[] items = {"Москва", "Албания", "Киев", /* Добавь свои элементы */};
        // Создаем ArrayAdapter с данными из ресурсов
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.spinner_items,
                android.R.layout.simple_spinner_item
        );

        // Устанавливаем layout для выпадающего списка
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Применяем адаптер к Spinner
        spinner.setAdapter(adapter);
    }
}