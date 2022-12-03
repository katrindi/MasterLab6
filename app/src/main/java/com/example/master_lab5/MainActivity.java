package com.example.master_lab5;

import static com.example.master_lab5.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.example.master_lab5.utils.TextCounter;
import com.example.master_lab5.utils.WordsCounter;

public class MainActivity extends AppCompatActivity {

    Spinner spSelectionOptions;
    EditText edPhrase;
    TextView tvMain;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        this.edPhrase = findViewById(id.edPhrase);
        this.tvMain = findViewById(id.tvMain);

        this.spSelectionOptions = (Spinner) findViewById(id.spSelectionOptions);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                array.counter_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spSelectionOptions.setAdapter(adapter);
    }

    public void onBtnCountClick(View view) {
        if(TextUtils.isEmpty(edPhrase.getText().toString())){
            Toast.makeText(MainActivity.this,
                    "Empty field not allowed!",
                    Toast.LENGTH_SHORT).show();
        }
        else if(this.spSelectionOptions.getSelectedItem().toString().equals(getResources().getString(string.count_name))) {
            this.tvMain.setText(TextCounter.getCharsCount(this.edPhrase.getText().toString()));
        }
        else
            this.tvMain.setText(WordsCounter.getWordsCount(this.edPhrase.getText().toString()));
    }
}