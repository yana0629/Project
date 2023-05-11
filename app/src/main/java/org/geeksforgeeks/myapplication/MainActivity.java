package org.geeksforgeeks.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView result;
    private EditText first;

    @SuppressLint({"WrongViewCast", "ResourceType"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button searchButton = findViewById(R.id.button);
        result = findViewById(R.id.result);
        first = findViewById(R.id.first);

        View.OnClickListener onClickListener = view -> {

                String string = first.getText().toString();
                int i = Integer.parseInt(string);

                String binary = Integer.toBinaryString(i);
                result.setText(binary);
        };
        searchButton.setOnClickListener(onClickListener);
    }
}