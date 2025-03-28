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


public class Golai extends AppCompatActivity
{
    ListView listView;

    // To add Unlimited items we can use ArrayList
    ArrayList<String> arrGolai = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_golai);


        listView = findViewById(R.id.listgolai);

        arrGolai.add("");
        arrGolai.add("▶ आर्वी (Arvi)◀" +"\n\n "+" 1) 5:30 "+"\n");
        arrGolai.add("");
        arrGolai.add("▶ अहमदपूर (Ahmadpur)◀" +"\n\n "+" सकाळी 6 ते सायंकाळी 8 प्रत्येक 20 मिनिटाला "+"\n");
        arrGolai.add("");
        arrGolai.add("▶  अक्कलकोट (Akkalkot)◀" +"\n\n "+" 1) 1:00  \t 2) 3:00 \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ अकलूज (Akluj)◀" +"\n\n "+" 1) 1:00  \t 2) 2:45 \t"+"\n\n  टेम्भूर्णी मार्ग");
        arrGolai.add("");
        arrGolai.add("▶ अकोला (Akola)◀" +"\n\n "+" 1) 9:15  \t 2) 10:30 \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ अमरावती (Amravati)◀" +"\n\n "+" 1) 5:00  \t 2) 8:15 "+"\n\n  अहमदपूर, नांदेड, हंगोली, वाशीम, मंगरुळपीर, कारंजा, बडनेरा मार्ग");
        arrGolai.add("");
        arrGolai.add("▶ औसा (Ausa)◀" +"\n\n"+" सकाळी 6 ते सायंकाळी 8.30 प्रत्येक 30 मिनिटाला");
        arrGolai.add("");
        arrGolai.add("▶ बारामती (Baramati)◀" +"\n\n"+" 1) 3:00 "+"\n");
        arrGolai.add("");
        arrGolai.add("▶ बार्शी (Barshi)◀" +"\n\n "+" 1) 4:00  \t 2) 6:00 "+"\n");
        arrGolai.add("");
        arrGolai.add("▶  बंदा -Sleeper (Banda Sleeper)◀" +"\n\n"+" 1) 3:00 "+"\n\n   औसा, तुळजापूर, सोलापूर, पंढरपूर, सांगोला, मिरज, सांगली, जयसिंगपूर, कोल्हापूर, फोडा, कणकवली, ओरोस, कुदळ, सावंतवाडी मार्ग");
        arrGolai.add("");
        arrGolai.add("▶ भोकर (Bhokar)◀" +"\n\n "+" 1) 8:00  \t 2) 9:30  \t 3) 9:45  \t 4) 11:45 \t\n\n 5) 12:45 \t 6) 1:00 \t 7) 1:45 \t 8) 6:15 \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ भूम (Bhoom)◀" +"\n\n "+" 1) सायंकाळी 5:00" +"\n");
        arrGolai.add("");
        arrGolai.add("▶ बोरिवली (Borivali)◀" +"\n\n "+" 1) सायंकाळी 7:00" +"\n");
        arrGolai.add("");
        arrGolai.add("▶ चिपळूण खेड (Chiplun Khed) ◀" +"\n\n "+" 1) 9:15" +"\n");
        arrGolai.add("");
        arrGolai.add("▶ हदगांव (Hadgaon)◀" +"\n\n "+" 1) 9:30  \t 2) 9:45  \t 3) 11:00  \t 4) 12:15 \t\n\n  5) 1:00  \t 6) 2:30  \t 7) 3:00  \t 8) 10:45 "+"\n");
        arrGolai.add("");
        arrGolai.add("▶ हिंगोली (Hingoli)◀" +"\n\n "+" 1) 12:30 " +"\n");
        arrGolai.add("");
        arrGolai.add("▶ लचलकरंजी (Lachalkaranji)◀" +"\n\n "+" 1) 7:00 " +"\n\n तुळजापूर, सोलापूर, सांगोला, मिरज मार्ग");
        arrGolai.add("");
        arrGolai.add("▶ जळगाव (Jalgaon)◀" +"\n\n "+" 1) सायंकाळी 8:00 " +"\n");
        arrGolai.add("");
        arrGolai.add("▶ जत (Jath)◀" +"\n\n "+" 1) 10:45  \t 2) 1:30 "+"\n");
        arrGolai.add("");
        arrGolai.add("▶ कळन (kalan)◀" +"\n\n "+" 1) 9:00 " +"\n\n अंबाजोगाई, केज, मांजरसुबा मार्ग");
        arrGolai.add("");
        arrGolai.add("▶ कणकवली (Kankavli)◀" +"\n\n "+" 1) 7:45  \t 2) 9:30  \t 3) 4:00" +"\n");
        arrGolai.add("");
        arrGolai.add("▶ कराड (Karad)◀" +"\n\n "+" 1) 6:00  \t 2) 7:00 \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ करमाळा (Karmala)◀" +"\n\n "+" 1) 2:45 " +"\n");
        arrGolai.add("");
        arrGolai.add("▶ कोल्हापूर- बार्शी मार्ग (Kolhapur- Barshi Maarg)◀" +"\n\n "+" 1) 8:30  \t 2) 11:00 \t"+"\n\n बार्शी, कुर्डुवाडी, पंढरपूर, मिरज, सांगली, जयसिंगपूर मार्ग");
        arrGolai.add("");
        arrGolai.add("▶ कोल्हापूर - सोलापूर मार्ग (Kolhapur- Solapur Maarg)◀" +"\n\n "+" 1) 10:45  \t 2) 11:30 \t"+"\n\n औसा, तुळजापूर, सोलापूर, पंढरपूर, सांगोला, मिरज, सांगली, जयसिंगपूर मार्ग");
        arrGolai.add("");
        arrGolai.add("▶ कोल्हापूर - Sleeper (Kolhapur- Sleeper)◀" +"\n\n "+"सायंकाळी \t 1) 8:30  \t 2) 9:30  \t 3) 10:05" +"\n\n औसा, तुळजापूर, सोलापूर, पंढरपूर, सांगोला, मिरज, सांगली मार्ग");
        arrGolai.add("");
        arrGolai.add("▶ कुर्डुवाडी (Kurduwadi)◀" +"\n\n "+"सायंकाळी \t 1) 4:45 " +"\n");
        arrGolai.add("");
        arrGolai.add("▶ माहूर (Mahur)◀" +"\n\n "+"सकाळी \t 1) 5:00  \t 2) 1:30  \t 3) 2:00" +"\n");
        arrGolai.add("");
        arrGolai.add("▶ मंगळवेढा (Mangalvdha)◀" +"\n\n"+"1) 12:30 "+"\n");
        arrGolai.add("");
        arrGolai.add("▶ मुखेड (Mukhed)◀" +"\n\n "+" 1) 7:30  \t 2) 8:00  \t 3) 10:00  \t 4) 12:30 \t\n\n  5) 2:15  \t 6) 3:30  \t 7) 5:45  \t 8) 6:15 "+"\n");
        arrGolai.add("");
        arrGolai.add("▶ मुंबई सेंट्रल (Mumbai Central)◀" +"\n\n "+"1) 10:00  \t 2) 10:45  \t 3) 6:15 \t 4) 7:10" +"\n\n  पुणे, लोणावळा,  पनवेल, वाशी, मैत्री पार्क, कुर्ला, नेहरू नगर, दादर मार्ग");
        arrGolai.add("");
        arrGolai.add("▶ नागपूर (nagpur)◀" +"\n\n "+" 1) 12:45  \t 2) 6:15 " +"\n\n पुसद, यवतमाळ, वर्धा मार्ग");
        arrGolai.add("");
        arrGolai.add("▶ नालासुपारा (Nalasupara)◀" +"\n\n "+"1) 9:45  \t" +"\n\n मुरुड, धोंकी, हडपसर, स्वारगेट, न्यू शिवाजीनगर वाकडेवाडी मार्ग");
        arrGolai.add("");
        arrGolai.add("▶ नांदेड (Nanded)◀" +"\n\n"+"सकाळी 6 ते सायंकाळी 6:30 प्रत्येक 30 मिनिटाला \t 2) 7:30 \t 9:30 "+"\n\n अहमदपूर मार्ग");
        arrGolai.add("");
        arrGolai.add("▶ निलंगा (Nilanga)◀" +"\n\n"+"सकाळी 6 ते सायंकाळी 8:30 प्रत्येक 15 मिनिटाला \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶  उस्मानाबाद - धाराशिव (Usmanabad - Dharashiv)◀" +"\n\n"+"सकाळी 6 ते सायंकाळी 8:30 प्रत्येक 30 मिनिटाला \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ पलूस (Palus)◀" +"\n\n"+"1) 10:15 "+"\n");
        arrGolai.add("");
        arrGolai.add("▶ पंढरपूर (pandharpur)◀" + "\n \n" +" 1) 7:45 \t 2) 11:30 \t 3) 12:15 \t 4) 1:00 \t 5) 3:00 \t 6) 3:30 \t\n\n 7) 3:45 \t 8) 4:30 \t 9) 5:00 \t 10) 7:00 \t 11) 11:30 \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ परांडा (Paranda)◀" +"\n\n"+"1) 7:45 \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ पुणे वल्लभनगर (pune Vallabhnagar)◀"+"\n\n "+"सकाळी \t 1) 5:30  \t 2) 6:00  \t 3) 6:30  \t 4) 7:00 \t  5) 7:15  \t 6) 7:30  \t\n\n 7) 8:30  \t 8) 8:30 \t 9) 9:00 \t 10) 9:30 \t 11) 9:45 \t 12) 10:00 \t\n\n 13) 10:30  \t 14) 11:00  \t 15) 11:30  \t 16) 12:00 \t  17) 12:30  \t 18) 1:00  \t\n\n 19) 1:30  \t 20) 1:45 \t 21) 2:00 \t 22) 2:30 \t 23) 3:30 \t 24) 4:00 \t\n\n 25) 4:30  \t 26) 5:30 \t 27) 7:00 \t 28) 8:00 \t 29) 8:30 \t 30) 9:00 \t\n\n 31) 9:30 \t 32) 10:00 \t सायंकाळी \t 33) 11:00"+"\n\n मुरुड, धोंकी, हडपसर, स्वारगेट न्यू शिवाजीनगर वाकडेवाडी मार्ग");
        arrGolai.add("");
        arrGolai.add("▶ पुसद (Pusad)◀" +"\n\n"+"1) 5:45 "+"\n\n चाकूर, अहमदपूर, हदगांव, उमरखेड मार्ग");
        arrGolai.add("");
        arrGolai.add("▶ रत्नागिरी (Ratnagiri)◀" +"\n\n"+"सकाळी \t 1) 9:30 \t 2) 5:30 "+"\n");
        arrGolai.add("");
        arrGolai.add("▶ सांगली (Sangli)◀" +"\n\n"+" 1) 7:00 \t 2) 2:00 "+"\n\n औसा, मिरज, विश्राम बाग मार्ग");
        arrGolai.add("");
        arrGolai.add("▶ सातारा (Satara)◀" +"\n\n "+" 1) 6:00  \t 2) 7:00  बार्शी \t 3) 7:00  सोलापूर  \t 4) 10:00 \t\n\n  5) 11:00  \t 6) 1:45"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ सोलापूर (Solapur)◀" +"\n\n "+" 1) 7:35  \t 2) 8:35 \t 3) 10:05 \t 4) 3:05"+"\n\n तुळजापूर मार्ग");
        arrGolai.add("");
        arrGolai.add("▶ उदगीर (Udgir)◀" +"\n\n"+"सकाळी 6 ते सायंकाळी 8 पर्यंत प्रत्येक 15 मिनिटाला, 9:00 आणी 10:00"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ उमरगा (Umarga)◀" +"\n\n"+" सकाळी 5:30 ते सायंकाळी 7 पर्यंत प्रत्येक 30 मिनिटाला आणी 8:30 \n"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ वसई (Vasai)◀" +"\n\n"+"1) 8:15 "+"\n\n  बार्शी, कुर्डुवाडी, इंदापूर, स्वारगेट, ठाणे रेल्वे स्टेशन मार्ग");
        arrGolai.add("");
        arrGolai.add("▶ वसमत (Vasmat)◀" +"\n\n"+"1) 7:15 "+"\n");
        arrGolai.add("");
        arrGolai.add("▶ विटा (Vita)◀" +"\n\n "+" 1) 9:30  \t 2) 10:30 \t 3) 11:30"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ विठ्ठलवाडी (Vitthalwadi)◀" +"\n\n"+"1) 9:00 "+"\n\n  मुरुड येडशी,स्वारगेट पुणे, पनवेल, डोंबिवली, कल्याण मार्ग");
        arrGolai.add("");
        arrGolai.add("▶ वाई (Vaai)◀" +"\n\n"+"1) 7:00 "+"\n");
        arrGolai.add("");
        arrGolai.add("▶ यवतमाळ (Yavatmal)◀" +"\n\n"+"1) 9:45 "+"\n\n नांदेड, पुसद मार्ग");
        arrGolai.add("");
        arrGolai.add("▶ बस्वकल्याण-निजामबाद-बिदर (Baswkalyan-Nijamabad-Bidar)◀" +"\n\n "+" 1) 5:30  \t 2) 7:30 \t 3) 12:00 \t\n\n 4) 1:00 \t 5) 4:00 "+"\n");
        arrGolai.add("");
        arrGolai.add("▶ बेळगांव (Belgaon)◀" +"\n\n "+" 1) 5:30  \t 2) 4:30 \t 3) 7:30"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ चितापूर (Chitapur)◀" +"\n\n"+"1) 9:45 "+"\n");
        arrGolai.add("");
        arrGolai.add("▶  हैद्राबाद निलंगा मार्ग (Haidrabad Nilanga Route)◀" +"\n\n "+" 1) 6:30  \t 2) 10:00 \t 3) 12:30 \t\n\n सायंकाळी \t4) 9:30 \t 5) 11:00 \t शिवशानी (Rs.700) "+"\n\n औसा, निलंगा, लिंगामापल्ली मार्ग");
        arrGolai.add("");
        arrGolai.add("▶ कलबुर्गी (Kalburgi)◀" + "\n\n" +"सकाळी \t1) 5:30 \t 2) 8:15 \t 3) 9:00 \t 4) 9:45 \t 5) 10:00 \t 6) 11:30 \t\n\n 7) 12:15 \t 8) 12:30 \t 9) 1:30 \t 10) 2:00 \t 11) 3:00 \t 12) 3:30 \t 13)सायंकाळी 10:30 "+"\n\n औसा, कळबूरगी मार्ग");
        arrGolai.add("");
        arrGolai.add("▶ निझामबाद (Nijamabad)◀" +"\n\n "+" 1) 7:00  \t 2) 12:15 \t 3) 2:15 \t 4) 3:15 \t"+"\n\n चाकूर, शिरूर ताजबंद मार्ग");
        arrGolai.add("");
        arrGolai.add("▶ माकेगांव-लहानेवाडी (Makegaon-lahanewadi)◀" +"\n\n "+" 1) 7:15  \t 2) 9:15 \t 3) 3:30 \t 4) 5:15 \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ आनंदवाडी - जाणवळ (Anandwadi - Janwal)◀" +"\n\n "+" 1) 7:30  \t 2) 1:15 \t 3) 3:15 \t 4) 5:00 \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ डिगोळ-वांगदारी (Digol - Vangdari)◀" +"\n\n "+" 1) 8:00  \t 2) 5:00 \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ घाटनांदूर Ghatnandur◀" +"\n\n "+" 1) 8:30  \t 2) 3:00 \t सायंकाळी \t3) 7:15 गरसोळ\t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ ताटापूर (Tatapur)◀" +"\n\n "+" 1) 8:45  \t 2) 1:30 \t सायंकाळी\t3) 7:45 \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ मोठेगाव (Mothegaon)◀" +"\n\n "+" 1) 9:15  \t 2) 3:30 \t सायंकाळी\t3)  6:30 विलेगाव\t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ मुसळेवाडी (Musalewadi)◀" +"\n\n "+" 1) 8:15  \t 2) 2:00 \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ खरोळा- चिकातना (Kharola- Chikatana)◀" +"\n\n "+" 1) 10:30  \t 2) 1:00 \t 3) 4:30 \t सायंकाळी \t4) 9:00  \t चिकातना\t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ पाणगाव - किनगाव (Pangaon - Kingaon)◀" + "\n\n" +"सकाळी\t1) 7:45 \t 2) 9:00 \t 3)9:45 \t 4) 10:00 \t 5) 10:15 \t 6) 5:15 \t\n\n सायंकाळी \t 7) 5:30 \t 8) 6:00 \t 9) 7:30 \t कोळगाव"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ टाकली (Takli)◀" + "\n\n" +"सकाळी\t1) 6:30 \t 2) 8:00 \t 3) 10:00 \t 4) 12:00 \t 5) 2:00 \t 6) 4:00 \t\n\n सायंकाळी \t 7) 6:00 \t 8) 8:00 \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ कळंब (Kalamb)◀" +"\n\n "+"सकाळी\t 1) 6:15  \t 2) 6:45  \t 3) 7:15  \t 4) 7:45 \t  5) 8:15  \t 6) 8:45  \t\n 7) 9:15  \t 8) 9:45 \t 9) 11:15 \t 10) 12:15 \t 11) 12:45 \t 12) 1:15 \t\n\n 13) 1:45  \t 14) 2:15  \t 15) 2:45  \t 16) 4:15 \t 17) 5:15 \t18) 5:45  \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ शिराढोण (Shiradhon)◀" +"\n\n "+"सायंकाळी\t1) 6:15  \t 2) 6:45 \t 3) 7:15 \t 4) 7:45 \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ पोहरेगाव- सिंदफळ (Pohregaon- Sindphal)◀" +"\n\n "+"सकाळी\t 1) 7:15  \t 2) 9:45  \t 3) 2:00  \t 4) 4:30 \t  5) 7:30  \t "+"\n");
        arrGolai.add("");
        arrGolai.add("▶ लातूर भोकरंबा निवाडा मार्ग (Latur Bhokramba Nivada Route)◀" +"\n\n "+"1) 9:15  \t 2) 10:30 \t 3) 2:30 \t 4) 5:30 \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ खलंगरी (Khalangari)◀" +"\n\n "+"1) 10:30  \t 2) 3:00 \t 3) 4:00 \t सायंकाळी\t4) 7:15 \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ जाधला - झरी (Jadhla - Zari)◀" +"\n\n "+"1) 8:00  \t 2) 10:15 \t सायंकाळी\t3) 4:45 \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ हिंगणगाव- वडवळ (Hingangaon- Vadval)◀" +"\n\n "+"1) 7:30  \t 2) 8:45 \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ नागठाणा (Nagthana)◀" +"\n\n "+"सायंकाळी\t1) 4:00  \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ हिंगणगाव (Hingangaon)◀" +"\n\n "+"सायंकाळी \t1) 5:30  \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ मोलवन (Molvan)◀" +"\n\n "+"1) 9:30  \t सायंकाळी\t2) 6:00 \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ अल्माला (Almala)◀" +"\n\n "+"1) 7:30  \t 2) 10:45 \t सायंकाळी\t3) 5:30 \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ नींतूर -पानगाव /जिनगाव (Nintur -Pangaon /Jingaon)◀" +"\n\n "+"1) 7:45  \t सायंकाळी\t2) 4:45 \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ परभणी - धर्मापुरी (Parbhani Dharmapuri)◀" +"\n\n "+"सकाळी \t1) 6:00  \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ किनगाव (Kingaon)◀" +"\n\n "+"1) 7:45  \t 2) 4:45 \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ अहमदपूर कारेपूर मार्ग (Ahamadpur Karepur Route)◀" +"\n\n "+"1) 6:15  \t 2) 10:30 \t सायंकाळी\t3) 4:00 \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ खालांगी (Khalangi)◀" +"\n\n "+"सायंकाळी \t1) 7:15  \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ केंद्रेवाडी (Kendrewadi)◀" +"\n\n "+"सायंकाळी \t1) 7:15  \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ शिवनखेड किनगाव (Shivankhed Kingaon)◀" +"\n\n "+"1) 7:30  \t 2) 2:00 \t सायंकाळी\t3) 7:45 \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ परभणी (Parbhani)◀" +"\n\n "+" 6:00 ते 4:30 प्रत्येक 30 मिनिटाला \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ अंबाजोगाई (Ambajogai)◀" +"\n\n "+" सकाळी 6:15 ते सायंकाळी 6:45 प्रत्येक 15 मिनिटाला \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ छत्रपती संभाजी नगर ( औरंगाबाद ) (Chatrapati Sambhaji Nagar)◀" +"\n\n "+"सकाळी\t 1) 5:00  \t 2) 5:15  \t 3) 5:45  \t 4) 6:30 \t  5) 8:00  \t 6) 8:00  \t\n 7) 8:45  \t 8) 9:30 \t 9) 10:45 \t 10) 11:00 \t 11) 12:30 \t 12) 1:15 \t\n\n 13) 2:00  \t 14) 3:30  \t 15) 4:15  \t 16) 5:45 \t  सायंकाळी\t17) 7:15 \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ छत्रपती संभाजी नगर ( औरंगाबाद ) शिवशाही (Chatrapati Sambhaji Nagar)◀" +"\n\n "+"1) 7:15  \t 2) 2:45 \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ परळी (Parli)◀" +"\n\n "+"सकाळी\t 1) 8:30  \t 2) 9:30  \t 3) 9:45  \t 4) 10:00 \t  5) 10:15  \t 6)12:30  \t\n\n 7) 1:00  \t 8) 1:30 \t 9) 3:15 \t 10) 3:30 \t सायंकाळी\t11) 4:00 \t 12) 4:15 \t\n\n 13) 5:30  \t 14) 6:45  \t 15) 7:00  \t 16) 7:30 \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ माजलगाव (Majalgaon)◀" +"\n\n "+"सकाळी\t 1) 7:45  \t 2) 10:15  \t 3) 10:30  \t 4) 11:15 \t  5) 11:30  \t 6) 12:30  \t\n\n 7) 1:15  \t 8) 2:00 \t 9) 2:45 \t 10) 4:45 \t सायंकाळी\t11) 5:45 \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ जिंतूर (Jintur)◀" +"\n\n "+"सकाळी\t 1) 11:15  \t 2) 1:15  \t 3) 5:00  \t सायंकाळी \t4) 6:00 \t "+"\n");
        arrGolai.add("");
        arrGolai.add("▶ कलमनुरी (Kalamnuri)◀" +"\n\n "+"सकाळी\t 1) 5:00  \t 2) 7:45  \t 3) 10:30  \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ जालना (Jalna)◀" +"\n\n "+"\t 1) 1:30  \t 2) 3:30  \t 3) 4:30  \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ बीड (Beed)◀" +"\n\n "+"\t 1) 9:15  \t 2) 12:30  \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ पठारी (Pathari)◀" +"\n\n "+"\t 1) 10:30  \t 2) 1:15  \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ हिंगोली (Hingoli)◀" +"\n\n "+"\t 1) 12:45  \t 2) 12:30  \t 3) 3:00  \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ नाशिक (Nashik)◀" +"\n\n "+"\t सकाळी\t1) 7:00  \t सायंकाळी\t 2) 5:00  \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ जळगाव (Jalgaon)◀" +"\n\n "+"\t 1) 8:45  \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶  जळगाव ( seater Sleeper ) (Jalgaon)◀" +"\n\n "+"\t सायंकाळी\t1) 8:15  \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ कल्याण (kalyan)◀"  +"\n\n "+"\t 1) 9:00  \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ पाटोदा (Patoda)◀" +"\n\n "+"\t 1) 6:00  \t 2) 6:30  \t 3) 12:30 आष्टी \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ यावळ (Yaval)◀" +"\n\n "+"\t 1) 7:00  \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ धुळे (Dhule)◀" +"\n\n "+"\t 1) 7:00  \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ बुलढाणा (Buldhana)◀" +"\n\n "+"\t 1) 7:15  \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶  मेहकर (Mehkar)◀" +"\n\n "+"\t 1) 8:15  \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ सेलू (Selu)◀" +"\n\n "+"\t 1) 7:45  \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ रिसोड (Risod)◀" +"\n\n "+"\t 1) 8:45  \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ शिर्डी (Shirdi)◀" +"\n\n "+"\t 1) 10:00  \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ गंगापूर (Gangapur)◀"  +"\n\n "+"\t 1) 11:45  \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ परतुर (Partur)◀" +"\n\n "+"\t 1) 12:45  \t"+"\n");
        arrGolai.add("");
        arrGolai.add("▶ नागपूर (Nagpur)◀" +"\n\n "+"\t सायंकाळी\t1) 6:30 \t"+"\n");


        CustomListAdapter adapter = new CustomListAdapter(this, arrGolai);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l)
            {
                if(pos==1)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.4293");
                    intent.putExtra("l2","76.5633");
                    intent.putExtra("title","आर्वी");
                    startActivity(intent);
                }
                else if(pos==3)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.7019");
                    intent.putExtra("l2","76.9358");
                    intent.putExtra("title","अहमदपूर");
                    startActivity(intent);
                }
                else if(pos==5)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","17.5265");
                    intent.putExtra("l2","76.8940");
                    intent.putExtra("title","अक्कलकोट");
                    startActivity(intent);
                }
                else if(pos==7)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","17.8913");
                    intent.putExtra("l2","75.0274");
                    intent.putExtra("title","अकलूज");
                    startActivity(intent);
                }
                else if(pos==9)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","20.7002");
                    intent.putExtra("l2","76.9982");
                    intent.putExtra("title","अकोला");
                    startActivity(intent);
                }
                else if(pos==11)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","20.9320");
                    intent.putExtra("l2","77.7523");
                    intent.putExtra("title","अमरावती");
                    startActivity(intent);
                }
                else if(pos==13)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.4088");
                    intent.putExtra("l2","76.5735");
                    intent.putExtra("title","औसा");
                    startActivity(intent);
                }
                else if(pos==15)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.1517");
                    intent.putExtra("l2","74.5773");
                    intent.putExtra("title","बारामती");
                    startActivity(intent);
                }
                else if(pos==17)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.2340");
                    intent.putExtra("l2","75.6956");
                    intent.putExtra("title","बार्शी");
                    startActivity(intent);
                }
                else if(pos==19)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.4088");
                    intent.putExtra("l2","76.5735");
                    intent.putExtra("title","बंदा");
                    startActivity(intent);
                }
                else if(pos==21)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","19.2240");
                    intent.putExtra("l2","77.6673");
                    intent.putExtra("title","भोकर");
                    startActivity(intent);
                }
                else if(pos==23)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.4609");
                    intent.putExtra("l2","75.6614");
                    intent.putExtra("title","भूम");
                    startActivity(intent);
                }
                else if(pos==25)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","19.2312");
                    intent.putExtra("l2","72.8546");
                    intent.putExtra("title","बोरिवली");
                    startActivity(intent);
                }
                else if(pos==27)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","17.5335");
                    intent.putExtra("l2","73.5087");
                    intent.putExtra("title","चिपळूण खेड");
                    startActivity(intent);
                }
                else if(pos==29)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","19.4968");
                    intent.putExtra("l2","77.1645");
                    intent.putExtra("title","हदगांव");
                    startActivity(intent);
                }
                else if(pos==31)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","19.7173");
                    intent.putExtra("l2","77.1487");
                    intent.putExtra("title","हिंगोली");
                    startActivity(intent);
                }
                else if(pos==33)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","16.7318");
                    intent.putExtra("l2","74.4343");
                    intent.putExtra("title","इचलकरंजी");
                    startActivity(intent);
                }
                else if(pos==35)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","21.0077");
                    intent.putExtra("l2","75.5626");
                    intent.putExtra("title","जळगाव");
                    startActivity(intent);
                }
                else if(pos==37)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","16.9159");
                    intent.putExtra("l2","75.2108");
                    intent.putExtra("title","जत");
                    startActivity(intent);
                }
                else if(pos==39)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.6721");
                    intent.putExtra("l2","76.0436");
                    intent.putExtra("title","कळन");
                    startActivity(intent);
                }
                else if(pos==41)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","16.2717");
                    intent.putExtra("l2","73.7089");
                    intent.putExtra("title","कणकवली");
                    startActivity(intent);
                }
                else if(pos==43)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","17.2855");
                    intent.putExtra("l2","74.1852");
                    intent.putExtra("title","कराड");
                    startActivity(intent);
                }
                else if(pos==45)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.2519");
                    intent.putExtra("l2","75.1094");
                    intent.putExtra("title","करमाळा");
                    startActivity(intent);
                }
                else if(pos==47)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","16.7050");
                    intent.putExtra("l2","74.2433");
                    intent.putExtra("title","कोल्हापूर- बार्शी मार्ग");
                    startActivity(intent);
                }
                else if(pos==49)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","16.7050");
                    intent.putExtra("l2","74.2433");
                    intent.putExtra("title","कोल्हापूर - सोलापूर मार्ग");
                    startActivity(intent);
                }
                else if(pos==51)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","16.7050");
                    intent.putExtra("l2","74.2433");
                    intent.putExtra("title","कोल्हापूर - Sleeper");
                    startActivity(intent);
                }
                else if(pos==53)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.0825");
                    intent.putExtra("l2","75.3557");
                    intent.putExtra("title","कुर्डुवाडी");
                    startActivity(intent);
                }
                else if(pos==55)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","19.8813");
                    intent.putExtra("l2","77.1375");
                    intent.putExtra("title","माहूर");
                    startActivity(intent);
                }
                else if(pos==57)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","17.5116");
                    intent.putExtra("l2","75.8841");
                    intent.putExtra("title","मंगळवेढा");
                    startActivity(intent);
                }
                else if(pos==59)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.7561");
                    intent.putExtra("l2","77.3673");
                    intent.putExtra("title","मुखेड");
                    startActivity(intent);
                }
                else if(pos==61)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.9647");
                    intent.putExtra("l2","72.8258");
                    intent.putExtra("title","मुंबई सेंट्रल");
                    startActivity(intent);
                }
                else if(pos==63)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","21.1458");
                    intent.putExtra("l2","79.0882");
                    intent.putExtra("title","नागपूर");
                    startActivity(intent);
                }
                else if(pos==65)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","19.4258");
                    intent.putExtra("l2","72.9219");
                    intent.putExtra("title","नालासुपारा");
                    startActivity(intent);
                }
                else if(pos==67)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","19.1383");
                    intent.putExtra("l2","77.3210");
                    intent.putExtra("title","नांदेड");
                    startActivity(intent);
                }
                else if(pos==69)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.1162");
                    intent.putExtra("l2","76.5473");
                    intent.putExtra("title","निलंगा");
                    startActivity(intent);
                }
                else if(pos==71)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.1867");
                    intent.putExtra("l2","76.0410");
                    intent.putExtra("title","उस्मानाबाद - धाराशिव");
                    startActivity(intent);
                }
                else if(pos==73)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","16.9547");
                    intent.putExtra("l2","74.4376");
                    intent.putExtra("title","पलूस");
                    startActivity(intent);
                }
                else if(pos==75)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","17.6805");
                    intent.putExtra("l2","75.3557");
                    intent.putExtra("title","पंढरपूर");
                    startActivity(intent);
                }
                else if(pos==77)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.2667");
                    intent.putExtra("l2","75.4500");
                    intent.putExtra("title","परांडा");
                    startActivity(intent);
                }
                else if(pos==79)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.5204");
                    intent.putExtra("l2","73.8567");
                    intent.putExtra("title","पुणे वल्लभनगर");
                    startActivity(intent);
                }
                else if(pos==81)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","19.9162");
                    intent.putExtra("l2","77.8054");
                    intent.putExtra("title","पुसद");
                    startActivity(intent);
                }
                else if(pos==83)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","16.9902");
                    intent.putExtra("l2","73.3120");
                    intent.putExtra("title","रत्नागिरी");
                    startActivity(intent);
                }
                else if(pos==85)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","16.8524");
                    intent.putExtra("l2","74.5815");
                    intent.putExtra("title","सांगली");
                    startActivity(intent);
                }
                else if(pos==87)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","17.6805");
                    intent.putExtra("l2","74.0183");
                    intent.putExtra("title","सातारा");
                    startActivity(intent);
                }
                else if(pos==89)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","17.6599");
                    intent.putExtra("l2","75.9064");
                    intent.putExtra("title","सोलापूर");
                    startActivity(intent);
                }
                else if(pos==91)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.3978");
                    intent.putExtra("l2","77.1173");
                    intent.putExtra("title","उदगीर");
                    startActivity(intent);
                }
                else if(pos==93)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","17.8346");
                    intent.putExtra("l2","76.6180");
                    intent.putExtra("title","उमरगा");
                    startActivity(intent);
                }
                else if(pos==95)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","19.3919");
                    intent.putExtra("l2","72.8397");
                    intent.putExtra("title","वसई");
                    startActivity(intent);
                }
                else if(pos==97)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","19.1647");
                    intent.putExtra("l2","77.1367");
                    intent.putExtra("title","वसमत");
                    startActivity(intent);
                }
                else if(pos==99)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","17.2724");
                    intent.putExtra("l2","74.5400");
                    intent.putExtra("title","विटा");
                    startActivity(intent);
                }
                else if(pos==101)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","17.3850");
                    intent.putExtra("l2","73.8219");
                    intent.putExtra("title","विठ्ठलवाडी");
                    startActivity(intent);
                }
                else if(pos==103)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","17.9567");
                    intent.putExtra("l2","73.8915");
                    intent.putExtra("title","वाई");
                    startActivity(intent);
                }
                else if(pos==105)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","20.3888");
                    intent.putExtra("l2","78.1204");
                    intent.putExtra("title","यवतमाळ");
                    startActivity(intent);
                }
                else if(pos==107)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","17.9307");
                    intent.putExtra("l2","77.5300");
                    intent.putExtra("title","बस्वकल्याण");
                    startActivity(intent);
                }
                else if(pos==109)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","15.8497");
                    intent.putExtra("l2","74.5138");
                    intent.putExtra("title","बेळगांव");
                    startActivity(intent);
                }
                else if(pos==111)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","17.3589");
                    intent.putExtra("l2","76.6209");
                    intent.putExtra("title","चितापूर");
                    startActivity(intent);
                }
                else if(pos==113)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","17.3660");
                    intent.putExtra("l2","78.4760");
                    intent.putExtra("title","हैद्राबाद");
                    startActivity(intent);
                }
                else if(pos==115)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","17.3297");
                    intent.putExtra("l2","76.8343");
                    intent.putExtra("title","कलबुर्गी");
                    startActivity(intent);
                }
                else if(pos==117)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.6720");
                    intent.putExtra("l2","78.0938");
                    intent.putExtra("title","निझामबाद");
                    startActivity(intent);
                }
                else if(pos==119)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.6697");
                    intent.putExtra("l2","76.6918");
                    intent.putExtra("title","माकेगांव-लहानेवाडी");
                    startActivity(intent);
                }
                else if(pos==121)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.6721");
                    intent.putExtra("l2","76.7279");
                    intent.putExtra("title","आनंदवाडी - जाणवळ");
                    startActivity(intent);
                }
                else if(pos==123)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.3929");
                    intent.putExtra("l2","76.9124");
                    intent.putExtra("title","डिगोळ-वांगदारी");
                    startActivity(intent);
                }
                else if(pos==125)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.7333");
                    intent.putExtra("l2","76.5553");
                    intent.putExtra("title","घाटनांदूर");
                    startActivity(intent);
                }
                else if(pos==127)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.6343");
                    intent.putExtra("l2","76.5300");
                    intent.putExtra("title","ताटापूर");
                    startActivity(intent);
                }
                else if(pos==129)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.5893");
                    intent.putExtra("l2","76.4042");
                    intent.putExtra("title","मोठेगाव");
                    startActivity(intent);
                }
                else if(pos==131)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.5470");
                    intent.putExtra("l2","76.4621");
                    intent.putExtra("title","मुसळेवाडी");
                    startActivity(intent);
                }
                else if(pos==133)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.6512");
                    intent.putExtra("l2","76.6435");
                    intent.putExtra("title","खरोळा- चिकातना");
                    startActivity(intent);
                }
                else if(pos==135)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.7188");
                    intent.putExtra("l2","76.7668");
                    intent.putExtra("title","पाणगाव - किनगाव");
                    startActivity(intent);
                }
                else if(pos==137)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.6234");
                    intent.putExtra("l2","76.5987");
                    intent.putExtra("title","टाकली");
                    startActivity(intent);
                }
                else if(pos==139)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.0825");
                    intent.putExtra("l2","76.5198");
                    intent.putExtra("title","कळंब");
                    startActivity(intent);
                }
                else if(pos==141)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.5893");
                    intent.putExtra("l2","76.5831");
                    intent.putExtra("title","शिराढोण");
                    startActivity(intent);
                }
                else if(pos==143)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.5470");
                    intent.putExtra("l2","76.4621");
                    intent.putExtra("title","पोहरेगाव- सिंदफळ");
                    startActivity(intent);
                }
                else if(pos==145)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.5811");
                    intent.putExtra("l2","76.4505");
                    intent.putExtra("title","लातूर भोकरंबा निवाडा मार्ग");
                    startActivity(intent);
                }
                else if(pos==147)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.6243");
                    intent.putExtra("l2","76.7279");
                    intent.putExtra("title","खलंगरी");
                    startActivity(intent);
                }
                else if(pos==149)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.6123");
                    intent.putExtra("l2","76.6234");
                    intent.putExtra("title","जाधला - झरी");
                    startActivity(intent);
                }
                else if(pos==151)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.5893");
                    intent.putExtra("l2","76.5831");
                    intent.putExtra("title","हिंगणगाव- वडवळ");
                    startActivity(intent);
                }
                else if(pos==153)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.6234");
                    intent.putExtra("l2","76.5987");
                    intent.putExtra("title","नागठाणा");
                    startActivity(intent);
                }
                else if(pos==155)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.5893");
                    intent.putExtra("l2","76.5831");
                    intent.putExtra("title","हिंगणगाव");
                    startActivity(intent);
                }
                else if(pos==157)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.6123");
                    intent.putExtra("l2","76.6234");
                    intent.putExtra("title","मोलवन");
                    startActivity(intent);
                }
                else if(pos==159)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.5893");
                    intent.putExtra("l2","76.5831");
                    intent.putExtra("title","अल्माला");
                    startActivity(intent);
                }
                else if(pos==161)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.6721");
                    intent.putExtra("l2","76.7279");
                    intent.putExtra("title","नींतूर -पानगाव /जिनगाव");
                    startActivity(intent);
                }
                else if(pos==163)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","19.2615");
                    intent.putExtra("l2","76.7744");
                    intent.putExtra("title","परभणी - धर्मापुरी");
                    startActivity(intent);
                }
                else if(pos==165)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.7188");
                    intent.putExtra("l2","76.7668");
                    intent.putExtra("title","किनगाव");
                    startActivity(intent);
                }
                else if(pos==167)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.7062");
                    intent.putExtra("l2","76.9384");
                    intent.putExtra("title","अहमदपूर कारेपूर मार्ग");
                    startActivity(intent);
                }
                else if(pos==169)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.6243");
                    intent.putExtra("l2","76.7279");
                    intent.putExtra("title","खालांगी");
                    startActivity(intent);
                }
                else if(pos==171)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.6123");
                    intent.putExtra("l2","76.6234");
                    intent.putExtra("title","केंद्रेवाडी");
                    startActivity(intent);
                }
                else if(pos==173)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.7188");
                    intent.putExtra("l2","76.7668");
                    intent.putExtra("title","शिवनखेड किनगाव");
                    startActivity(intent);
                }
                else if(pos==175)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","19.2615");
                    intent.putExtra("l2","76.7744");
                    intent.putExtra("title","परभणी");
                    startActivity(intent);
                }
                else if(pos==177)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.7133");
                    intent.putExtra("l2","76.3728");
                    intent.putExtra("title","अंबाजोगाई");
                    startActivity(intent);
                }
                else if(pos==179)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","19.8762");
                    intent.putExtra("l2","75.3433");
                    intent.putExtra("title","छत्रपती संभाजी नगर ( औरंगाबाद )");
                    startActivity(intent);
                }
                else if(pos==181)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","19.8762");
                    intent.putExtra("l2","75.3433");
                    intent.putExtra("title","छत्रपती संभाजी नगर ( औरंगाबाद ) शिवशाही");
                    startActivity(intent);
                }
                else if(pos==183)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.8477");
                    intent.putExtra("l2","76.3614");
                    intent.putExtra("title","परळी");
                    startActivity(intent);
                }
                else if(pos==185)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","19.1387");
                    intent.putExtra("l2","76.5574");
                    intent.putExtra("title","माजलगाव");
                    startActivity(intent);
                }
                else if(pos==187)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","19.6147");
                    intent.putExtra("l2","77.1489");
                    intent.putExtra("title","जिंतूर");
                    startActivity(intent);
                }
                else if(pos==189)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","19.6736");
                    intent.putExtra("l2","77.1084");
                    intent.putExtra("title","कलमनुरी");
                    startActivity(intent);
                }
                else if(pos==191)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","19.8447");
                    intent.putExtra("l2","75.8816");
                    intent.putExtra("title","जालना");
                    startActivity(intent);
                }
                else if(pos==193)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.9891");
                    intent.putExtra("l2","75.7601");
                    intent.putExtra("title","बीड");
                    startActivity(intent);
                }
                else if(pos==195)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.8521");
                    intent.putExtra("l2","75.9724");
                    intent.putExtra("title","पठारी");
                    startActivity(intent);
                }
                else if(pos==197)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","19.7173");
                    intent.putExtra("l2","77.1487");
                    intent.putExtra("title","हिंगोली");
                    startActivity(intent);
                }
                else if(pos==199)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","20.0059");
                    intent.putExtra("l2","73.7897");
                    intent.putExtra("title","नाशिक");
                    startActivity(intent);
                }
                else if(pos==201)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","21.0077");
                    intent.putExtra("l2","75.5626");
                    intent.putExtra("title","जळगाव");
                    startActivity(intent);
                }
                else if(pos==203)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","21.0077");
                    intent.putExtra("l2","75.5626");
                    intent.putExtra("title","जळगाव ( seater Sleeper )");
                    startActivity(intent);
                }
                else if(pos==205)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","19.2403");
                    intent.putExtra("l2","73.1305");
                    intent.putExtra("title","कल्याण");
                    startActivity(intent);
                }
                else if(pos==207)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","18.9547");
                    intent.putExtra("l2","75.3425");
                    intent.putExtra("title","पाटोदा");
                    startActivity(intent);
                }
                else if(pos==209)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","21.1679");
                    intent.putExtra("l2","75.0286");
                    intent.putExtra("title","यावळ");
                    startActivity(intent);
                }
                else if(pos==211)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","20.9042");
                    intent.putExtra("l2","74.7749");
                    intent.putExtra("title","धुळे");
                    startActivity(intent);
                }
                else if(pos==213)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","20.5287");
                    intent.putExtra("l2","76.1843");
                    intent.putExtra("title","बुलढाणा");
                    startActivity(intent);
                }
                else if(pos==215)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","20.1041");
                    intent.putExtra("l2","76.5673");
                    intent.putExtra("title","मेहकर");
                    startActivity(intent);
                }
                else if(pos==217)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","19.4589");
                    intent.putExtra("l2","76.9373");
                    intent.putExtra("title","सेलू");
                    startActivity(intent);
                }
                else if(pos==219)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","20.2488");
                    intent.putExtra("l2","76.7873");
                    intent.putExtra("title","रिसोड");
                    startActivity(intent);
                }
                else if(pos==221)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","19.7645");
                    intent.putExtra("l2","74.4773");
                    intent.putExtra("title","शिर्डी");
                    startActivity(intent);
                }
                else if(pos==223)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","19.6769");
                    intent.putExtra("l2","75.0105");
                    intent.putExtra("title","गंगापूर");
                    startActivity(intent);
                }
                else if(pos==225)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","19.2707");
                    intent.putExtra("l2","76.2208");
                    intent.putExtra("title","परतुर");
                    startActivity(intent);
                }
                else if(pos==227)
                {
                    Intent intent = new Intent(Golai.this, Mapsactivity.class);
                    intent.putExtra("l1","21.1458");
                    intent.putExtra("l2","79.0882");
                    intent.putExtra("title","नागपूर");
                    startActivity(intent);
                }
            }
        });

    }
}