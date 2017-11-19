package com.example.ray.testave;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText editText3;
    EditText editText4;
    EditText editText5;
    EditText editText6;
    EditText editText7;
    EditText editText8;
    EditText editText ;
    EditText editText2;
    TextView sougou;
    int number = 8;
    TextView kagaku;
    TextView kokugo;
    TextView kotenn;
    TextView seibutu;
    TextView sekaishi;
    TextView nihonnshi;
    TextView math;
    TextView english;
    int goukei;
    int something;
    int something2;
    int something3;
    int something4;
    int something5;
    int something6;
    int something7;
    int something8;
    TextView ave;
    String str1;
    String str2;
    String str3;
    String str4;
    String str5;
    String str6;
    String str7;
    String str8;
    int last;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        kokugo = ((TextView)findViewById(R.id.kokugo));
        kotenn = ((TextView)findViewById(R.id.kotenn));
        math = ((TextView)findViewById(R.id.math));
        english = ((TextView)findViewById(R.id.english));
        kagaku = ((TextView)findViewById(R.id.kagaku));
        seibutu = ((TextView)findViewById(R.id.seibutu));
        sekaishi = ((TextView)findViewById(R.id.sekaishi));
        nihonnshi = ((TextView)findViewById(R.id.nihonnshi));


        kokugo.setText("国語");
        kotenn.setText("古典");
        sekaishi.setText("世界史");
        seibutu.setText("生物");
        nihonnshi.setText("日本史");
        english.setText("英語");
        math.setText("数学");
        kagaku.setText("化学");

    }

    public void botan (View view){

        editText = ((EditText) findViewById(R.id.editText));
        editText2 = ((EditText) findViewById(R.id.editText2));
        editText3 = ((EditText) findViewById(R.id.editText3));
        editText4 = ((EditText) findViewById(R.id.editText4));
        editText5 = ((EditText) findViewById(R.id.editText5));
        editText6 = ((EditText) findViewById(R.id.editText6));
        editText7 = ((EditText) findViewById(R.id.editText7));
        editText8 = ((EditText) findViewById(R.id.editText8));

        str1 = editText.getText().toString();
        str2 = editText2.getText().toString();
        str3 = editText3.getText().toString();
        str4 = editText4.getText().toString();
        str5 = editText5.getText().toString();
        str6 = editText6.getText().toString();
        str7 = editText7.getText().toString();
        str8 = editText8.getText().toString();

        something8 = Integer.parseInt(str8);
        something7 = Integer.parseInt(str7);
        something6 = Integer.parseInt(str6);
        something5 = Integer.parseInt(str5);
        something4 = Integer.parseInt(str4);
        something3 = Integer.parseInt(str3);
        something2 = Integer.parseInt(str2);
        something  = Integer.parseInt(str1);
        goukei = something + something2 + something3 + something4 + something5 + something6 + something7 + something8;

        sougou = (TextView) findViewById(R.id.sougou);
        sougou.setText(String.valueOf("Totalscore:" + goukei));

        last=goukei/number;
        ave = (TextView) findViewById(R.id.ave);
        ave.setText(String.valueOf("average:" + last));
    }

    //editTextの数字を
}
