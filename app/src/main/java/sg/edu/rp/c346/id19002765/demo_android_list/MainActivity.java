package sg.edu.rp.c346.id19002765.demo_android_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroid;
    ArrayList<String> androidList;
    ArrayAdapter<String> aaAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroid = findViewById(R.id.listViewAndroid);
        androidList = new ArrayList<>();

        androidList.add("Pie: 9.0");
        androidList.add("Oreo: 8.0 - 9.0");
        androidList.add("Nougat: 7.0 - 7.1.2");
        androidList.add("Marshmallow: 6.0 - 6.0.1");
        androidList.add("Lollipop: 5.0 - 5.1.1");
        androidList.add("KitKat: 4.4 - 4.4.4");
        androidList.add("Jelly Bean: 4.1 - 4.3.1");

        aaAndroid = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, androidList);
        lvAndroid.setAdapter(aaAndroid);
    }
}
