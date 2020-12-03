package com.abishek534.fragmentcommunication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements BlankFragment.ButtonClickInterface {

    private Button btn;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        textView = findViewById(R.id.text_view);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                BlankFragment blankFragment = new BlankFragment();
                blankFragment.setStyle(DialogFragment.STYLE_NO_FRAME,R.style.dialog);
                blankFragment.show(getSupportFragmentManager(),"blankFragment");
            }
        });
    }

    @Override
    public void buttonClickListener(String text) {
        textView.setText(text);
    }
}