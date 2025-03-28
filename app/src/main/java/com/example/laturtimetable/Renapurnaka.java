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


public class Renapurnaka extends AppCompatActivity
{
    ListView listView;

    // To add Unlimited items we can use ArrayList
    ArrayList<String> arrRenapurnaka = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_renapurnaka);

        listView = findViewById(R.id.listrenapurnaka);

        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ गंगाखेड (Gangakhed) ◀" + "\n \n" +" 1) 6:15 \t 2) 9:45 \t 3) 12:15 \t\n\n 4) 4:15 " +"\n\n धर्मापुरी मार्ग (Via Dharmapuri)");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ जिंतूर (Jintur) ◀" + "\n \n" +" 1) 6:15 " +"\n\n पाणगाव - किनगाव मार्ग (Via Pangaon - Kingaon)");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ लहानेवाडी - माकेगाव (Lahanewadi - Makegaon) ◀" +" \n \n" + " 1) 6:30 \t 2) 4:45 " +"\n\n रेणापूर - पाणगाव मार्ग (Via Renapur - Pangaon)");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ किनगाव (Kingaon) ◀" + "\n \n" +" 1) 8:00 \t 2) 1:30 \t 3) 5:00 "+"\n\n पाणगाव - कोष्टगाव मार्ग (Via Pangaon - Koshtgaon)");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ अहमदपूर (Ahmadpur) ◀" + "\n \n" +" 1) 6:30 \t 2) 9:30 \t 3) 10:45 \t\n\n 4) 4:15 " +"\n\n कारेपूर मार्ग (Via Karepur)");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ पोहरेगाव (Pohregaon) ◀" + "\n \n" +" 1) 7:30 \t 2) 10:00 \t 3) 02:15 \t\n\n 4) 4:45 \t 5) 7:45"+"\n");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ भोकरंबा (Bhokramba) ◀" + "\n \n" +" 1) 6:45 \t 2) 10:45 \t 3) 2:30 \t\n\n 4) 5:00 " +"\n");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ मोटेगाव (Motegaon) ◀" + "\n \n" +" 1) 9:30 \t 2) 1:00 \t 3) 6:00 "+"\n");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ डिगोळ-वांगदरी (Digol-Wangdari) ◀" +" \n \n" + " 1) 8:15 \t 2) 5:15 " +"\n");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ घाटनांदूर (Ghatnandhur) ◀" +" \n \n" + " 1) 8:45 \t 2) 2:15 " +"\n\n गरसुळी मार्ग (Via Garsuli)");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ तत्तापूर (Tattapur) ◀" + "\n \n" +" 1) 9:00 \t 2) 1:45 \t 3) 8:00 "+"\n\n रेणापूर- कामखेडा मार्ग (Via Renapur - Kamkheda)");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ खलंगरी (Khalangri) ◀" + "\n \n" +" 1) 6:15 \t 2) 8:15 \t 3) 3:45 \t\n\n 4) 7:30 " +"\n");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ जानवळ (Janwal) ◀" + "\n \n" +" 1) 7:45 \t 2) 3:30 "+"\n");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ खरोळा (Kharola) ◀" + "\n \n" +" 1) 10:30 \t 2) 1:30 \t 3) 8:30 \t\n\n 4) 10:45 " +"\n");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ पिंपळदरी (Pimpaldari) ◀" + "\n \n" +" 1) 9:00 \t 2) 6:00 "+"\n");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ बागझरी (Bagzari) ◀" + "\n \n" +" 1) 9:15 \t 2) 5:15 "+"\n");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ कावळवाडी (Kawalwadi) ◀" + "\n \n" +" 1) सायंकाळी (Evening) 5:30"+"\n\n");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ औसा-खरोळा (Ausa-Kharola) ◀" + "\n \n" +" 1) 7:15 \t 2) 9:15 \t 3) 4:15 \t\n\n 4) 7:15 " +"\n\n कासारखेडा मार्ग (Via Kasarkheda)");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ छत्रपती संभाजीनगर (Chhatrapati Sambhajinagar) ◀" + "\n \n" +" 1) 5:15 \t 2) 5:30 \t 3) 6:00 \t 4) 7:00 \t 5) 8:00 \t 6) 9:00 \t\n\n 7) 9:30 \t 8) 10:00 \t 9) 10:30 \t 10) 11:00 \t 11) 11:45 \t 12) 1:15 \t\n\n 13) 2:00 \t 14) 2:45 \t 15) 3:30 \t 16) 4:15 \t 17) 5:00 \t 18) 5:45 \t\n\n 19) 7:15 "+"\n");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ धुळे (Dhule) ◀" +"\n\n सकाळी (Morning) 7:00 \n");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ परभणी (Parbhani) ◀" + "\n \n" +" 1) 5:30 \t 2) 6:00 \t 3) 6:30 \t 4) 7:00 \t 5) 7:30 \t 6) 8:00 \t\n\n 7) 8:30 \t 8) 9:00 \t 9) 9:30 \t 10) 10:00 \t 11) 12:00 \t 12) 1:30 \t\n\n 13) 2:00 \t 14) 2:30 \t 15) 3:00 \t 16) 3:30 \t 17) 4:30 \t 18) 5:30 \t\n\n 19) 6:00 "+"\n");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ कळमनुरी (Kalmuri) ◀" + "\n \n" +" 1) 5:00 \t 2) 7:45 \t 3) 9:45 "+"\n\n परभणी हिंगोली मार्ग (Via Parbhani Hingoli)");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ हिंगोली (Hingoli) ◀" + "\n \n" +" 1) 12:45 \t 2) 12:30 \t 3) 3:00 "+"\n\n परभणी मार्ग (Via Parbhani)");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ मेहकर (Mehkar) ◀" + "\n \n" +" 1) 8:15"+"\n\n परभणी जिंतूर मार्ग (Via Parbhani Jintur)");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ रिसोड (Risod) ◀" + "\n\n 1) 8:45 "+"\n\n परभणी जिंतूर मार्ग (Via Parbhani Jintur)");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ नागपूर (Nagpur) ◀" + "\n\n 1) सायंकाळी (Evening) 6:30 "+"\n\n परभणी हिंगोली मार्ग (Via Parbhani Hingoli)");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ नाशिक (Nashik) ◀" + "\n\n" +" 1) 7:00 \t 2) 5:00" +"\n\n अहमदनगर संगमनेर मार्ग (Via Ahmadnagar Sangamner)");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ कल्याण (Kalyan) ◀" + "\n\n" +" 1) 9:00"+"\n\n अहमदनगर मार्ग (Via Ahmadnagar)");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ शिर्डी (Shirdi) ◀" + "\n\n" +" 1) 10:00"+"\n\n अहमदनगर मार्ग (Via Ahmadnagar)"+"\n\n आष्टी (Ashti) 1) 12.30");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ पुणे (Pune) ◀" + "\n\n" +" 1) 6:30"+"\n\n जामखेड-अहमदनगर मार्ग (Via Jamkhed-Ahmadnagar)");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ यावल (Yawal) ◀" +"\n\n" +" 1) 7:00"+"\n\n जालना जळगाव मार्ग (Via Jalna Jalgaon)");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ जळगाव (Jalgaon) ◀" + "\n\n" +" 1) 8:45 \t 2) 8:15" +"\n\n बीड जालना मार्ग (Via Beed Jalna)");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ बुलढाणा (Buldhana) ◀" +"\n\n" +" 1) 7:15"+"\n\n जालना चिखली मार्ग (Via Jalna Chikhli)");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ सेलू (Selu) ◀" +"\n\n" +" 1) 7:45"+"\n\n सोनपेठ पाथरी मार्ग (Via Sonpeth Pathri)");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ पाथरी मानवत (Pathri Manwat) ◀" + "\n\n" +" 1) 10:30 \t 2) 1:15" +"\n");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ परतुर (Partur) ◀" +"\n\n" +" 1) 12:45"+"\n\n परभणी सेलू मार्ग (Via Parbhani Selu)\n");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ माजलगाव (Majalgaon) ◀" + "\n \n" +" 1) 7:45 \t 2) 10:15 \t 3) 10:30 \t 4) 11:15 \t 5) 11:30 \t 6) 12:30 \t\n\n 7) 1:15 \t 8) 2:00 \t 9) 2:45 \t 10) 4:45 \t 11) 5:45 \n");
        arrRenapurnaka.add("");
        arrRenapurnaka.add("▶ परळी अंबाजोगाई (Parali Ambajogai) ◀" + "\n \n"+"सकाळी 5 ते सायंकाळी 7 पर्यंत दर 30 मिनिटांनी (Every 30 minutes from 5 AM to 7 PM)\n");

        CustomListAdapter adapter = new CustomListAdapter(this, arrRenapurnaka);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l)
            {
                if(pos==1)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","18.9664");
                    intent.putExtra("l2","76.7481");
                    intent.putExtra("title","गंगाखेड");
                    startActivity(intent);
                }
               else if(pos==3)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","19.6087");
                    intent.putExtra("l2","76.6846");
                    intent.putExtra("title","जिंतूर");
                    startActivity(intent);
                }
                else if(pos==5)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","18.6697");
                    intent.putExtra("l2","76.6918");
                    intent.putExtra("title","लहानेवाडी - माकेगाव");
                    startActivity(intent);
                }
                else if(pos==7)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","18.7188");
                    intent.putExtra("l2","76.7668");
                    intent.putExtra("title","किनगाव");
                    startActivity(intent);
                }
                else if(pos==9)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","18.7188");
                    intent.putExtra("l2","76.7668");
                    intent.putExtra("title","किनगाव");
                    startActivity(intent);
                }
                else if(pos==11)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","18.7062");
                    intent.putExtra("l2","76.9384");
                    intent.putExtra("title","अहमदपूर");
                    startActivity(intent);
                }
                else if(pos==13)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","18.5470");
                    intent.putExtra("l2","76.4621");
                    intent.putExtra("title","पोहरेगाव");
                    startActivity(intent);
                }
                else if(pos==15)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","18.5811");
                    intent.putExtra("l2","76.4505");
                    intent.putExtra("title","भोकरंबा");
                    startActivity(intent);
                }
                else if(pos==17)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","18.5893");
                    intent.putExtra("l2","76.4042");
                    intent.putExtra("title","मोटेगाव");
                    startActivity(intent);
                }
                else if(pos==19)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","18.3929");
                    intent.putExtra("l2","76.9124");
                    intent.putExtra("title","डिगोळ-वांगदरी");
                    startActivity(intent);
                }
                else if(pos==21)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","18.7333");
                    intent.putExtra("l2","76.5553");
                    intent.putExtra("title","घाटनांदूर");
                    startActivity(intent);
                }
                else if(pos==23)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","18.6343");
                    intent.putExtra("l2","76.5300");
                    intent.putExtra("title","तत्तापूर");
                    startActivity(intent);
                }
                else if(pos==25)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","18.6243");
                    intent.putExtra("l2","76.7279");
                    intent.putExtra("title","खलंगरी");
                    startActivity(intent);
                }
                else if(pos==27)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","18.6512");
                    intent.putExtra("l2","76.6435");
                    intent.putExtra("title","खरोळा");
                    startActivity(intent);
                }
                else if(pos==29)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","18.5893");
                    intent.putExtra("l2","76.5831");
                    intent.putExtra("title","पिंपळदरी");
                    startActivity(intent);
                }
                else if(pos==31)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","18.6234");
                    intent.putExtra("l2","76.5987");
                    intent.putExtra("title","बागझरी");
                    startActivity(intent);
                }
                else if(pos==33)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","18.6123");
                    intent.putExtra("l2","76.6234");
                    intent.putExtra("title","कावळवाडी");
                    startActivity(intent);
                }
                else if(pos==35)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","18.4271");
                    intent.putExtra("l2","76.5129");
                    intent.putExtra("title","औसा-खरोळा");
                    startActivity(intent);
                }
                else if(pos==37)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","19.8762");
                    intent.putExtra("l2","75.3433");
                    intent.putExtra("title","छत्रपती संभाजीनगर");
                    startActivity(intent);
                }
                else if(pos==39)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","20.9042");
                    intent.putExtra("l2","74.7749");
                    intent.putExtra("title","धुळे");
                    startActivity(intent);
                }
                else if(pos==41)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","19.2615");
                    intent.putExtra("l2","76.7744");
                    intent.putExtra("title","परभणी");
                    startActivity(intent);
                }
                else if(pos==43)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","19.0615");
                    intent.putExtra("l2","76.9099");
                    intent.putExtra("title","कळमनुरी");
                    startActivity(intent);
                }
                else if(pos==45)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","19.7173");
                    intent.putExtra("l2","77.1487");
                    intent.putExtra("title","हिंगोली");
                    startActivity(intent);
                }
                else if(pos==47)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","20.5496");
                    intent.putExtra("l2","76.5507");
                    intent.putExtra("title","मेहकर");
                    startActivity(intent);
                }
                else if(pos==49)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","19.6087");
                    intent.putExtra("l2","76.7281");
                    intent.putExtra("title","जिंतूर");
                    startActivity(intent);
                }
                else if(pos==51)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","19.9647");
                    intent.putExtra("l2","76.7867");
                    intent.putExtra("title","रिसोड");
                    startActivity(intent);
                }
                else if(pos==53)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","21.1458");
                    intent.putExtra("l2","79.0882");
                    intent.putExtra("title","नागपूर");
                    startActivity(intent);
                }
                else if(pos==55)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","19.9975");
                    intent.putExtra("l2","73.7898");
                    intent.putExtra("title","नाशिक");
                    startActivity(intent);
                }
                else if(pos==57)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","19.2403");
                    intent.putExtra("l2","73.1305");
                    intent.putExtra("title","कल्याण");
                    startActivity(intent);
                }
                else if(pos==59)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","19.7645");
                    intent.putExtra("l2","74.3777");
                    intent.putExtra("title","शिर्डी");
                    startActivity(intent);
                }
                else if(pos==61)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","18.5204");
                    intent.putExtra("l2","73.8567");
                    intent.putExtra("title","पुणे");
                    startActivity(intent);
                }
                else if(pos==63)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","21.1679");
                    intent.putExtra("l2","75.7145");
                    intent.putExtra("title","यावल");
                    startActivity(intent);
                }
                else if(pos==65)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","21.0077");
                    intent.putExtra("l2","75.5626");
                    intent.putExtra("title","जळगाव");
                    startActivity(intent);
                }
                else if(pos==67)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","20.5284");
                    intent.putExtra("l2","76.1842");
                    intent.putExtra("title","बुलढाणा");
                    startActivity(intent);
                }
                else if(pos==69)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","19.4597");
                    intent.putExtra("l2","76.5921");
                    intent.putExtra("title","सेलू");
                    startActivity(intent);
                }
                else if(pos==71)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","19.2585");
                    intent.putExtra("l2","76.4577");
                    intent.putExtra("title","पाथरी मानवत");
                    startActivity(intent);
                }
                else if(pos==73)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","19.2968");
                    intent.putExtra("l2","76.2153");
                    intent.putExtra("title","परतुर");
                    startActivity(intent);
                }
                else if(pos==75)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","19.1590");
                    intent.putExtra("l2","76.5574");
                    intent.putExtra("title","माजलगाव");
                    startActivity(intent);
                }
                else if(pos==77)
                {
                    Intent intent = new Intent(Renapurnaka.this, Mapsactivity.class);
                    intent.putExtra("l1","18.9687");
                    intent.putExtra("l2","76.2584");
                    intent.putExtra("title","परळी अंबाजोगाई");
                    startActivity(intent);
                }

            }
        });
    }
}