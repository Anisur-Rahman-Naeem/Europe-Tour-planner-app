package com.naeem.europetourplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView list;

    String[] CountryName;
    int[] images = {R.drawable.austria,R.drawable.belgium,R.drawable.croatia,R.drawable.czech_republic,R.drawable.denmark,R.drawable.estonia,R.drawable.finland,R.drawable.france,R.drawable.germany,R.drawable.greece,R.drawable.hungary,R.drawable.iceland,R.drawable.italy,R.drawable.latvia,R.drawable.liechtenstein,R.drawable.lithuania,R.drawable.luxembourg,R.drawable.malta,R.drawable.netherlands,R.drawable.norway,R.drawable.poland,R.drawable.portugal,R.drawable.slovakia,R.drawable.slovenia,R.drawable.spain,R.drawable.sweden,R.drawable.switzerland};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.nameDisplay);
        CountryName = getResources().getStringArray(R.array.CountryName);

        list.setAdapter(new CountryNameAdapter(MainActivity.this,CountryName,images));
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Redirecting you to the main website",Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity.this,Website.class);
                i.putExtra("countryInfo",CountryName[position]);
                startActivity(i);
            }
        });
    }


}