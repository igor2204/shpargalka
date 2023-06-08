package com.example.shpargalka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.list);
        final String[] films = new String[] {"10 место", "9 место", "8 место", "7 место",
                "6 место", "5 место", "4 место", "3 место", "2 место", "1 место",};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, films);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, ten_mesto.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(MainActivity.this, nine_mesto.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(MainActivity.this, eight_mesto.class);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(MainActivity.this, seven_mesto.class);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(MainActivity.this, six_mesto.class);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(MainActivity.this, five_mesto.class);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(MainActivity.this, four_mesto.class);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(MainActivity.this, three_mesto.class);
                    startActivity(intent);

                }
                if (position == 8) {
                    Intent intent = new Intent(MainActivity.this, two_mesto.class);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(MainActivity.this, one_mesto.class);
                    startActivity(intent);

                }

            }
        });
    }
}