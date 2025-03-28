package com.example.laturtimetable;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button btnTimetable;

        btnTimetable = findViewById(R.id.btnTimetable);

        btnTimetable.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, MiddleActivity.class);

                startActivity(intent);

                Toast.makeText(MainActivity.this, "List of Timetable", Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        if(item.getItemId()==R.id.close)
        {
            finish();
        }
        if(item.getItemId()==R.id.share)
        {
            Toast.makeText(this, "🌟 Application Sharing Information will declared soon 🌟", Toast.LENGTH_LONG).show();
        }
        if(item.getItemId()==R.id.aboutus)
        {
            Toast.makeText(this, "🌟 B.Raj Sontakke : 7841078165 🌟 Thank you 😊", Toast.LENGTH_LONG).show();
        }
        return true;
    }
}