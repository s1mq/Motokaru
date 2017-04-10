package com.example.android.motokarudrivingschool;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.example.android.motokarudrivingschool.R.array.emails;
import static com.example.android.motokarudrivingschool.R.string.email;
import static com.example.android.motokarudrivingschool.R.string.motokaru;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openEmail(View view){

        Resources res = getResources();
        String[] recipients = res.getStringArray(R.array.emails);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, ("A-category Driving School"));
        intent.putExtra(Intent.EXTRA_EMAIL, (recipients));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
