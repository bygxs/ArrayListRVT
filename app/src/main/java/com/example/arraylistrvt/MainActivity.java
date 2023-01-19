package com.example.arraylistrvt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<PersonModel> personModels= new ArrayList<>();
    int [] personImages = {R.drawable.baseline_person_3_24,
                           R.drawable.baseline_directions_car_24,
                            R.drawable.baseline_pets_24};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);
        setUpPersonModels();

        PersonsRecyclerViewAdapter adapter = new PersonsRecyclerViewAdapter(this,personModels);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

    private void setUpPersonModels(){

        String [] persons = getResources().getStringArray(R.array.persons_names_full_txt);
        String [] cars = getResources().getStringArray(R.array.cars_names_full_txt);
        String [] pets = getResources().getStringArray(R.array.pets_names_full_txt);

        for (int i = 0; i < persons.length; i++) {
            personModels.add(new PersonModel(persons[i],cars[i],pets[i], personImages[i]));

            
        }

    }

}