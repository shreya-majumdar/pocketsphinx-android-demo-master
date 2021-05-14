package edu.cmu.pocketsphinx.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class QuitPopup extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quit_popup);

    }

    public void yes(View v) {
        Toast toast1 = Toast.makeText(getApplicationContext(), "You pressed the YES Button", Toast.LENGTH_LONG);
        toast1.show();

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent); //originally commented out to test other things without it
    }

    public void no(View v) {
        Toast toast2 = Toast.makeText(getApplicationContext(), "You pressed the NO Button", Toast.LENGTH_LONG);
        toast2.show();

        Intent intent = new Intent(this, StepActivity.class);
        startActivity(intent); //originally commented out to test other things without it
    }
}