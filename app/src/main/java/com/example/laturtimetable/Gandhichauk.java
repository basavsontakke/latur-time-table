package com.example.laturtimetable;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;


public class Gandhichauk extends AppCompatActivity
{
    ListView listView;

    // To add Unlimited items we can use ArrayList
    ArrayList<String> arrGandhichauk = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gandhichauk);

        listView = findViewById(R.id.listgandhichauk);

        arrGandhichauk.add("");
        arrGandhichauk.add("▶ गंगापूर - मुरुड (Gangapur - Murud) ◀" + "\n \n" +" 1) 6:00 \t 2) 7:00 \t 3) 7:30 \t\n\n 4) 10:45 \t 5) 1:00 \t 6) 2:00 \t\n\n 7) 5:00 \t 8) 7:00" +"\n\n निवली मुक्काम (Nivali Stop)");
        arrGandhichauk.add("");
        arrGandhichauk.add("▶ बिंदगीहाळ (Bingihal) ◀" + "\n\n" + "1) 8:00 \t 2) 10:30 \t 3) 2:00 \t\n\n 4) 5:15 \t 5) 8:30 \t\n\n मुक्काम (Stop)");
        arrGandhichauk.add("");
        arrGandhichauk.add("▶ उजेड (Ujed) ◀" + "\n\n" + "1) 8:00  \t 2) 8:45 \t 3) 1:30 \t\n\n 4) 7:00 \t\n\n उजेड मुक्काम (Ujed Stop)");
        arrGandhichauk.add("");
        arrGandhichauk.add("▶ शिरोळ (Shirol) ◀" + "\n\n" +" 1) 6:30 \t 2) 8:00 \t 3) 9:00 \t\n\n 4) 10:00 \t 5) 11:45 \t 6) 1:15 \t\n\n 7) 2:30 \t 8) 4:30  \t 9) 5:00" +"\n\n मेहकर मुक्काम (Mehkar Stop)");
        arrGandhichauk.add("");
        arrGandhichauk.add("▶ शिरूर अनंतपाळ / वलांडी (Shirur Anantpal / Walandi) ◀" + "\n\n" +" 1) 7:30 \t 2) 10:00 \t 3) 2:00 " + "\n\n कानेगाव दे - 5:30 (Kanegaon at 5:30)");
        arrGandhichauk.add("");
        arrGandhichauk.add("▶ राणी अंकुलगा (Rani Ankulga) ◀" + "\n\n" +" 1) 9:00 \t 2) 1:15 \t 3) 6:15 "+"\n\n राणी अंकुलगा मुक्काम (Rani Ankulga Stop)");
        arrGandhichauk.add("");
        arrGandhichauk.add("▶ तूपडी निलंगा (Tupdi Nilanga) ◀" + "\n\n" +" 1) 7:00 \t 2) 10:00 \t 3) 2:00 \t\n\n 4) 5:00");
        arrGandhichauk.add("");
        arrGandhichauk.add("▶ राठोडा निलंगा (Rathoda Nilanga) ◀" + "\n\n" +" 1) 7:15 \t 2) 9:30 \t 3) 10:45 \t\n\n 4) 1:30 \t 5) 3:30 \t 6) 5:30 \t\n\n 7) 7:30"+"\n\n राठोडा मुक्काम (Rathoda Stop)");
        arrGandhichauk.add("");
        arrGandhichauk.add("▶ शेडोळ-निलंगा (Shedol-Nilanga) ◀" + "\n\n" +" 1) 10:00 \t 2) 3:30 \t 3) 8:30" +"\n\n नवरे किणी मुक्काम (Navare Kini Stop)");
        arrGandhichauk.add("");
        arrGandhichauk.add("▶ गोंद्री-औसा (Gondri-Ausa) ◀" + "\n\n" +" 1) 8:15 \t 2) 11:15 \t 3) 5:45");
        arrGandhichauk.add("");
        arrGandhichauk.add("▶ वांजरखेडा (Wanjarkheda) ◀" + "\n\n" +" 1) 8:00");
        arrGandhichauk.add("");
        arrGandhichauk.add("▶ येळे-औसा (Yele-Ausa) ◀" + "\n\n" +" 1) 9:00 \t 2) 12:00");

        CustomListAdapter adapter = new CustomListAdapter(this, arrGandhichauk);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l)
            {
                if(pos==1)
                {
                    Intent intent = new Intent(Gandhichauk.this, Mapsactivity.class);
                    intent.putExtra("l1","18.9878");
                    intent.putExtra("l2","76.5006");
                    intent.putExtra("title","गंगापूर-मुरुड");
                    startActivity(intent);
                }
                else if (pos==3)
                {
                    Intent intent = new Intent(Gandhichauk.this, Mapsactivity.class);
                    intent.putExtra("l1","17.7940");
                    intent.putExtra("l2","76.6506");
                    intent.putExtra("title","बिंदगीहाळ");
                    startActivity(intent);
                }
                else if (pos==5)
                {
                    Intent intent = new Intent(Gandhichauk.this, Mapsactivity.class);
                    intent.putExtra("l1","18.2745");
                    intent.putExtra("l2","76.8036");
                    intent.putExtra("title","उजेड");
                    startActivity(intent);
                }
                else if (pos==7)
                {
                    Intent intent = new Intent(Gandhichauk.this, Mapsactivity.class);
                    intent.putExtra("l1","16.7480");
                    intent.putExtra("l2","74.5909");
                    intent.putExtra("title","शिरोळ");
                    startActivity(intent);
                }
                else if (pos==9)
                {
                    Intent intent = new Intent(Gandhichauk.this, Mapsactivity.class);
                    intent.putExtra("l1","18.3369");
                    intent.putExtra("l2","76.8389");
                    intent.putExtra("title","शिरूर अनंतपाळ/वलांडी");
                    startActivity(intent);
                }
                else if (pos==11)
                {
                    Intent intent = new Intent(Gandhichauk.this, Mapsactivity.class);
                    intent.putExtra("l1","18.2462");
                    intent.putExtra("l2","76.8519");
                    intent.putExtra("title","राणी अंकुलगा");
                    startActivity(intent);
                }
                else if (pos==13)
                {
                    Intent intent = new Intent(Gandhichauk.this, Mapsactivity.class);
                    intent.putExtra("l1","18.2404");
                    intent.putExtra("l2","76.6846");
                    intent.putExtra("title","तूपडी निलंगा");
                    startActivity(intent);
                }
                else if (pos==15)
                {
                    Intent intent = new Intent(Gandhichauk.this, Mapsactivity.class);
                    intent.putExtra("l1","18.1964");
                    intent.putExtra("l2","76.7625");
                    intent.putExtra("title","राठोडा निलंगा");
                    startActivity(intent);
                }
                else if (pos==17)
                {
                    Intent intent = new Intent(Gandhichauk.this, Mapsactivity.class);
                    intent.putExtra("l1","18.1999");
                    intent.putExtra("l2","76.6470");
                    intent.putExtra("title","शेडोळ-निलंगा");
                    startActivity(intent);
                }
                else if (pos==19)
                {
                    Intent intent = new Intent(Gandhichauk.this, Mapsactivity.class);
                    intent.putExtra("l1","18.3153");
                    intent.putExtra("l2","76.6355");
                    intent.putExtra("title","गोंद्री-औसा");
                    startActivity(intent);
                }
                else if (pos==21)
                {
                    Intent intent = new Intent(Gandhichauk.this, Mapsactivity.class);
                    intent.putExtra("l1","18.5511");
                    intent.putExtra("l2","76.3579");
                    intent.putExtra("title","वांजरखेडा");
                    startActivity(intent);
                }
                else if (pos==23)
                {
                    Intent intent = new Intent(Gandhichauk.this, Mapsactivity.class);
                    intent.putExtra("l1","18.2348");
                    intent.putExtra("l2","76.6470");
                    intent.putExtra("title","येळे-औसा");
                    startActivity(intent);
                }
            }
        });


    }
}