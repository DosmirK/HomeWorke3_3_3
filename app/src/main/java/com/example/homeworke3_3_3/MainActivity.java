package com.example.homeworke3_3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvAnime;
    private ArrayList<String> animeList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        loadData();
        AnimeAdapter adapter = new AnimeAdapter(animeList);
        rvAnime.setAdapter(adapter);
    }

    private void loadData() {
        animeList.add("Наруто");
        animeList.add("Блич");
        animeList.add("Боруто");
        animeList.add("Токийский гуль");
        animeList.add("Токийские мстители");
        animeList.add("Доктер Стоун");
        animeList.add("Берсерк");
        animeList.add("Игра друзей");
        animeList.add("Хоримия");
        animeList.add("Монстер");
        animeList.add("Убийца гоблинов");
        animeList.add("Убийца Акаме");
        animeList.add("Атака титанов");
        animeList.add("Класс убийц");
        animeList.add("Класс превосходства");
        animeList.add("Боец Баки");
        animeList.add("Ангел по соседству");
        animeList.add("Притворная любовь");
        animeList.add("Детектив уже мёртв");
        animeList.add("Сага о Винланде");
    }

    private void initView() {
        rvAnime = findViewById(R.id.rv_anime);
    }
}