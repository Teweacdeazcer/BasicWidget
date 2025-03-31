package kr.ac.kopo.basicwidget;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView text1 = findViewById(R.id.text1);
        TextView text2 = findViewById(R.id.text2);
        TextView text3 = findViewById(R.id.text3);

        text1.setTextSize(20);
        text1.setTextColor(Color.MAGENTA);
        text1.setText("KoreaPolyTechCollege");

        text2.setTextSize(30);
        text2.setTextColor(Color.RED);
        text2.setText("인공지능소프트웨어과");

        text3.setText("SinglgLine속성SinglgLine속성SinglgLine속성SinglgLine속성SinglgLine속성SinglgLine속성SinglgLine속성SinglgLine속성");
        text3.setSingleLine();
    }
}