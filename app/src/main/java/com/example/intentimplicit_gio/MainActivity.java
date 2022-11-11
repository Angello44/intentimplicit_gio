package com.example.intentimplicit_gio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.os.Bundle;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editUrl;
    private EditText editLocation;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editUrl = findViewById(R.id.edit_url);
        editLocation = findViewById(R.id.edit_lokasi);
        editText = findViewById(R.id.edit_text);
    }
    public void openweb(View view) {
        String url = editUrl.getText().toString();
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
    public void openLocation(View view) {
        String lokasi = editLocation.getText().toString();
        Uri address = Uri.parse("geo:0,0?q="+lokasi);
        Intent intent = new Intent(Intent.ACTION_VIEW, address);
        startActivity(intent);
    }
    public void ShareText(View view) {
        String share = editText.getText().toString();
        ShareCompat.IntentBuilder
                .from(this)
                .setChooserTitle("Share text width :")
                .setText(share)
                .setType("text/plain")
                .startChooser();
    }
    public void Opensmk5(View view) {
        Uri mlebu = Uri.parse("https://www.smkn5solo.sch.id/");
        Intent intent = new Intent(Intent.ACTION_VIEW, mlebu);
        startActivity(intent);
    }
}