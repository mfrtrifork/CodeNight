package dk.michaelfranz.gotonight;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private boolean state = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView welcomeText = (TextView) findViewById(R.id.welcome);

        Intent intent = getIntent();
        final String username = intent.getStringExtra("KEY");

        welcomeText.setText("Welcome " + username);

        final ImageView lightBulb = (ImageView) findViewById(R.id.light_bulb);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(state){
                    lightBulb.setImageDrawable(ContextCompat.getDrawable(Main2Activity.this, R.drawable.light_bulb_off));
                } else {
                    lightBulb.setImageDrawable(ContextCompat.getDrawable(Main2Activity.this, R.drawable.light_bulb_on));
                }
                state = !state;
            }
        });
    }
}
