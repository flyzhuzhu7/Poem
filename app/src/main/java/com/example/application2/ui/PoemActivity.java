package com.example.application2.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.application2.R;

public class PoemActivity extends AppCompatActivity {

    public static final String POEM_TITLE = "poem_title";
    public static final String POEM_WRITER = "poem_writer";
    public static final String POEM_CONTENT = "poem_content";
    public static final String POEM_REMARK = "poem_remark";
    public static final String POEM_APPRECIATION = "poem_appreciation";
    public static final String POEM_TRANSLATION = "poem_translation";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem);
        Intent intent = getIntent();
        TextView title = findViewById(R.id.title);
        TextView writer = findViewById(R.id.writer);
        TextView content = findViewById(R.id.content);
        TextView remark = findViewById(R.id.remark);
        TextView appreciation = findViewById(R.id.appreciation);
        TextView translation = findViewById(R.id.translation);
        title.setText(intent.getStringExtra(POEM_TITLE));
        writer.setText(intent.getStringExtra(POEM_WRITER));
        content.setText(intent.getStringExtra(POEM_CONTENT));
        remark.setText(intent.getStringExtra(POEM_REMARK));
        appreciation.setText(intent.getStringExtra(POEM_APPRECIATION));
        translation.setText(intent.getStringExtra(POEM_TRANSLATION));
    }
}