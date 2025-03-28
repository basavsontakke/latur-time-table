package com.example.laturtimetable;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MiddleActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_middle);


        Button btngolai;
        Button btngandhichauk;
        Button btnrenapurnaka;
        Button btncitybus;

        btngolai = findViewById(R.id.btngolai);
        btngandhichauk = findViewById(R.id.btngandhichauk);
        btnrenapurnaka = findViewById(R.id.btnrenapurnaka);
        btncitybus = findViewById(R.id.btncitybus);

        btngolai.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MiddleActivity.this, Golai.class);

                startActivity(intent);
                Toast.makeText(MiddleActivity.this, "Golai Timetable", Toast.LENGTH_SHORT).show();

            }
        });

        btngandhichauk.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MiddleActivity.this, Gandhichauk.class);

                startActivity(intent);
                Toast.makeText(MiddleActivity.this, "Gandhi chauk Timetable", Toast.LENGTH_SHORT).show();
            }
        });

        btnrenapurnaka.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MiddleActivity.this, Renapurnaka.class);

                startActivity(intent);

                Toast.makeText(MiddleActivity.this, "Renapur naka Timetable", Toast.LENGTH_SHORT).show();
            }
        });

        btncitybus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MiddleActivity.this, Citybus.class);
                startActivity(intent);

                Toast.makeText(MiddleActivity.this, "Citybus Timetable", Toast.LENGTH_SHORT).show();
            }
        });
    }
}