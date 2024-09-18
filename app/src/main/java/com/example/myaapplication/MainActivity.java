package com.example.myaapplication;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnItemClickListener {

    ArrayList<State> states = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.list);
        StateAdapter adapter = new StateAdapter(states, this); // Передаем текущую активность как слушателя
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        states.add(new State("Россия", "Москва", R.drawable.img));
        states.add(new State("Аргентина", "Буэнос-Айрес", R.drawable.img_1));
        states.add(new State("Колумбия", "Богота", R.drawable.img_2));
        states.add(new State("Уругвай", "Монтевидео", R.drawable.img_3));
        states.add(new State("Чили", "Сантьяго", R.drawable.img_4));
    }

    @Override
    public void onItemClick(State state) {
        // Отображение всплывающего сообщения с информацией о нажатом элементе
        Toast.makeText(this, "Страна: " + state.getName() + ", Столица: " + state.getCapital(), Toast.LENGTH_SHORT).show();
    }
}