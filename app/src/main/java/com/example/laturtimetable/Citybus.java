package com.example.laturtimetable;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class Citybus extends AppCompatActivity
{
    ListView listView;

    // To add Unlimited items we can use ArrayList
    ArrayList<String> arrCitybus = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_citybus);

        listView = findViewById(R.id.listcitybus);

        arrCitybus.add("▶ गोलाई पासून पुढचे ठिकाण (Routes from Golai) ◀");
        arrCitybus.add("");
        arrCitybus.add("▶ 12 नं पाटी (12 No. Pati) ◀" +"\n\n "+" 1) 7:20  \t 2) 8:00  \t 3) 8:40  \t 4) 9:00 \t\n\n  5) 9:20 \t 6) 10:00 \t 7) 10:40 \t 8) 11:00 \t\n\n  9) 11:20  \t 10) 12:00  \t 11) 12:40 \t 12) 1:00 \t\n\n  13) 1:20  \t 14) 2:00  \t 15) 2:40 \t 16) 3:00 \t\n\n 17) 3:20 \t 18) 4:00 \t 19) 4:40 \t 20) 5:00 \t\n\n  21) 5:20 \t 22) 6:00 \t 23) 6:40 \t 24) 7:00 \t\n\n  5) 7:30 \t 6) 8:00 \t"+"\n");
        arrCitybus.add("");
        arrCitybus.add("▶ खंडापूर (Khandapur) ◀" +"\n\n "+" 1) 7:40  \t 2) 9:40  \t 3) 11:40 \t\n\n  4) 1:40  \t  5) 3:40  \t 6) 5:40 "+"\n");
        arrCitybus.add("");
        arrCitybus.add("▶ हरंगुळ (Harangul) ◀" +"\n\n "+" 1) 8:20  \t 2) 10:20  \t 3) 12:20 \t\n\n  4) 2:20   \t 5) 4:20  \t 6) 6:20 "+"\n");
        arrCitybus.add("");
        arrCitybus.add("▶ मेडिकल कॉलेज (Medical College) ◀" +"\n\n "+" 1) 7:50 \t 2) 8:30 \t 3) 9:10 \t 4) 9:50 \t\n\n  5) 10:30 \t 6) 11:10 \t 7) 11:50 \t 8) 12:30 \t\n\n  9) 1:10 \t 10) 1:50 \t 11) 2:30 \t 12) 3:10 \t\n\n  13) 3:50  \t 14) 4:30 \t 15) 5:10 \t 16) 5:50 \t\n\n 17) 6:30"+"\n");
        arrCitybus.add("");
        arrCitybus.add("▶ गंगापूर (Gangapur) ◀" +"\n\n "+" 1) 7:40  2) 8:20  3) 9:00  4) 9:40 \t\n\n  5) 10:20  6) 11:00  7) 11:40  8) 12:20 \t\n\n  9) 1:00  10) 1:40  11) 2:20  12) 3:00 \t\n\n  13) 3:40  14) 4:20  15) 5:00  16) 5:40 \t\n\n 17) 6:20  18) 7:00  19) 7:20  20) 8:15"+"\n");
        arrCitybus.add("");
        arrCitybus.add("▶ धनेगाव (Dhanegaon) ◀" +"\n\n "+" 1) 8:10 \t 2) 10:10 \t 3) 12:10 \t 4) 2:10 \t\n\n  5) 4:10 \t 6) 6:10 \t 7) 8:10"+"\n");
        arrCitybus.add("");
        arrCitybus.add("▶ भातंगळी (Bhatangli) ◀" +"\n\n "+" 1) 7:50 \t 2) 8:30 \t 3) 9:15 \t 4) 10:05 \t\n\n  5) 11:00 \t 6) 11:40 \t 7) 12:45 \t 8) 1:30 \t\n\n  9) 2:15 \t 10) 3:00 \t 11) 4:00 \t 12) 5:00 \t\n\n  13) 6:00 \t 14) 8:00"+"\n");
        arrCitybus.add("");
        arrCitybus.add("▶ बाभळगाव (Babhalgaon) ◀" +"\n\n "+" 1) 8:40 \t 2) 10:00 \t 3) 11:20 \t 4) 12:40 \t\n\n  5) 2:00 \t 6) 3:20 \t 7) 4:40 \t 8) 6:00 \t\n\n  9) 7:20 \t"+"\n");
        arrCitybus.add("");

        CustomListAdapter adapter = new CustomListAdapter(this, arrCitybus);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l)
            {
                if(pos==2)
                {
                    Intent intent = new Intent(Citybus.this, Mapsactivity.class);
                    intent.putExtra("l1","18.3899");
                    intent.putExtra("l2","76.4676");
                    intent.putExtra("title","12 नं पाटी");
                    startActivity(intent);
                }
                else if (pos==4)
                {
                    Intent intent = new Intent(Citybus.this, Mapsactivity.class);
                    intent.putExtra("l1","18.3589");
                    intent.putExtra("l2","76.4925");
                    intent.putExtra("title","खंडापूर");
                    startActivity(intent);
                }
                else if (pos==6)
                {
                    Intent intent = new Intent(Citybus.this, Mapsactivity.class);
                    intent.putExtra("l1","18.4120");
                    intent.putExtra("l2","76.5040");
                    intent.putExtra("title","हरंगुळ");
                    startActivity(intent);
                }
                else if (pos==8)
                {
                    Intent intent = new Intent(Citybus.this, Mapsactivity.class);
                    intent.putExtra("l1","18.4296");
                    intent.putExtra("l2","76.5784");
                    intent.putExtra("title","मेडिकल कॉलेज");
                    startActivity(intent);
                }
                else if (pos==10)
                {
                    Intent intent = new Intent(Citybus.this, Mapsactivity.class);
                    intent.putExtra("l1","18.3445");
                    intent.putExtra("l2","76.5139");
                    intent.putExtra("title","गंगापूर");
                    startActivity(intent);
                }
                else if (pos==12)
                {
                    Intent intent = new Intent(Citybus.this, Mapsactivity.class);
                    intent.putExtra("l1","18.1952");
                    intent.putExtra("l2"," 76.9124");
                    intent.putExtra("title","धनेगाव");
                    startActivity(intent);
                }
                else if (pos==14)
                {
                    Intent intent = new Intent(Citybus.this, Mapsactivity.class);
                    intent.putExtra("l1","18.4376");
                    intent.putExtra("l2","76.6788");
                    intent.putExtra("title","भातंगळी");
                    startActivity(intent);
                }
                else if (pos==16)
                {
                    Intent intent = new Intent(Citybus.this, Mapsactivity.class);
                    intent.putExtra("l1","18.3797");
                    intent.putExtra("l2","76.6319");
                    intent.putExtra("title","बाभळगाव");
                    startActivity(intent);
                }
            }
        });
    }
}