package georgyhristov.xyz.fitster365;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    private Button trainerButton;
    private Button traineeButton;
    private TextView textView;
    private TextView textView2;
    private Typeface font;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        trainerButton = (Button) findViewById(R.id.trainerButton);
        traineeButton = (Button) findViewById(R.id.traineeButton);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        String fontLocation = "fonts/PoiretOne-Regular.ttf";
        font = Typeface.createFromAsset(getAssets(),fontLocation);

        textView.setTypeface(font);
        textView2.setTypeface(font);
        traineeButton.setTypeface(font);
        trainerButton.setTypeface(font);



        trainerButton.setOnClickListener(trainerListener);
        traineeButton.setOnClickListener(traineeListener);
    }

    private View.OnClickListener trainerListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toasty.error(MainActivity.this, "This is an error toast.", Toast.LENGTH_SHORT, true).show();
        }
    };

    private View.OnClickListener traineeListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toasty.error(MainActivity.this, "This is an error toast.", Toast.LENGTH_SHORT, true).show();
        }
    };

}
