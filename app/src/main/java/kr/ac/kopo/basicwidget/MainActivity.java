package kr.ac.kopo.basicwidget;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edit1;
    TextView text1;
    TextView text2;
    TextView text3;
    TextView textResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);

            text1 = findViewById(R.id.text1);
            text2 = findViewById(R.id.text2);
            text3 = findViewById(R.id.text3);

            text1.setTextSize(20);
            text1.setTextColor(Color.MAGENTA);
            text1.setText("KoreaPolyTechCollege");

            text2.setTextSize(30);
            text2.setTextColor(Color.RED);
            text2.setText("인공지능소프트웨어과");

            text3.setText("SinglgLine속성SinglgLine속성SinglgLine속성SinglgLine속성SinglgLine속성SinglgLine속성SinglgLine속성SinglgLine속성");
            text3.setSingleLine(true);

            edit1 = findViewById(R.id.edit1);
            textResult = findViewById(R.id.textResult);
            Button btnResult = findViewById(R.id.btnResult);

            btnResult.setOnClickListener(btnListener);
        }
        View.OnClickListener btnListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String univName = edit1.getText().toString();
                String result = univName + "에 합격하신 것을 진심으로 축하드립니다.";
                 textResult.setText(result);
                 textResult.setTextColor(Color.rgb(128,65,217));
            }
        };
}