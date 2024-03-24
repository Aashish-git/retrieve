package com.example.retro;

import android.content.ClipData;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class  MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Ashish", "ashish@example.com", android.R.drawable.btn_star_big_on));
        items.add(new Item("John", "john@example.com", android.R.drawable.arrow_down_float));
        items.add(new Item("Emily", "emily@example.com", android.R.drawable.btn_star_big_on));
        items.add(new Item("Michael", "michael@example.com", android.R.drawable.btn_star_big_on));
        items.add(new Item("Sophia", "sophia@example.com", android.R.drawable.btn_star_big_on));
        items.add(new Item("William", "william@example.com", android.R.drawable.btn_star_big_on));
        items.add(new Item("Isabella", "isabella@example.com", android.R.drawable.btn_star_big_on));
        items.add(new Item("James", "james@example.com", android.R.drawable.btn_star_big_on));
        items.add(new Item("Olivia", "olivia@example.com", android.R.drawable.btn_star_big_on));
        items.add(new Item("Benjamin", "benjamin@example.com", android.R.drawable.btn_star_big_on));
        items.add(new Item("Charlotte", "charlotte@example.com", android.R.drawable.btn_star_big_on));
        items.add(new Item("Elijah", "elijah@example.com", android.R.drawable.btn_star_big_on));
        items.add(new Item("Amelia", "amelia@example.com", android.R.drawable.btn_star_big_on));
        items.add(new Item("Lucas", "lucas@example.com", android.R.drawable.btn_star_big_on));
        items.add(new Item("Mia", "mia@example.com", android.R.drawable.btn_star_big_on));
        items.add(new Item("Mason", "mason@example.com", android.R.drawable.btn_star_big_on));
        items.add(new Item("Harper", "harper@example.com", android.R.drawable.btn_star_big_on));
        items.add(new Item("Evelyn", "evelyn@example.com", android.R.drawable.btn_star_big_on));
        items.add(new Item("Oliver", "oliver@example.com", android.R.drawable.btn_star_big_on));
        items.add(new Item("Ava", "ava@example.com", android.R.drawable.btn_star_big_on));


        List<Item> items2 = new ArrayList<Item>();
        items.add(new Item("Ashish", "ashish@example.com", android.R.drawable.btn_star_big_on));
        items.add(new Item("John", "john@example.com", android.R.drawable.arrow_down_float));
        items.add(new Item("Emily", "emily@example.com", android.R.drawable.btn_star_big_on));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));


    }
}