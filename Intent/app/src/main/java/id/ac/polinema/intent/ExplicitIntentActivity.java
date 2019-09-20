package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ExplicitIntentActivity extends AppCompatActivity {

    private EditText ambil;
    private TextView tampil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        ambil = findViewById(R.id.input_name);
        tampil = findViewById(R.id.text_output);
    }

    public void submit(View view) {
        String text = ambil.getText().toString();
        if(text.equals("")){
            Toast.makeText(this, "Fill Form, Please", Toast.LENGTH_SHORT).show();
        }else{
            tampil.setText("Hello " + text + " ,Congratulation!");
        }
    }
}
