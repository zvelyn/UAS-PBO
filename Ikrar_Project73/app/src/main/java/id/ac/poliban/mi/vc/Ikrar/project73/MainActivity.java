package id.ac.poliban.mi.vc.Ikrar.project73;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        Button btn = (Button)findViewById(R.id.button);
        Button btn2 = (Button)findViewById(R.id.button2);
        btn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, LoginActivity.class)));
        btn2.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, SignUpActivity.class)));
    }
}