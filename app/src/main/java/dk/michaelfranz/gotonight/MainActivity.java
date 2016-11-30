package dk.michaelfranz.gotonight;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText username = (EditText) findViewById(R.id.username);
        final EditText password = (EditText) findViewById(R.id.password);
        findViewById(R.id.loginButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validateCredentials(username.getText().toString(), password.getText().toString())){
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("KEY", username.getText().toString());
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Invalid credentials", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private boolean validateCredentials(String username, String password) {
        // TODO: Validate credentials
        return true;
    }
}
