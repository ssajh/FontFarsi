package com.example.ssaj.fontfarsi;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.btn1);
        final Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/BMitra.ttf");
        button.setTypeface(typeface);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(MainActivity.this, "سلام دوستان", Toast.LENGTH_LONG);
                View view1 = toast.getView();

                //To change the Background of Toast
                view1.setBackgroundColor(Color.TRANSPARENT);
                TextView text = (TextView) view1.findViewById(android.R.id.message);

                //Shadow of the Text Color
                final Typeface typefaceToast = Typeface.createFromAsset(getAssets(),"fonts/Ferdosi.ttf");

               // text.setShadowLayer(0, 0, 0, Color.TRANSPARENT);
                text.setTextColor(Color.YELLOW);
                text.setTextSize(30);
                text.setTypeface(typefaceToast);
                toast.show();

            }
        });
    }
    protected void attachBaseContext(Context newBase)
    {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
