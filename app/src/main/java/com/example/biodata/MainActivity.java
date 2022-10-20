package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bTelepon, bAlamat, bEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bTelepon = findViewById(R.id.Telepon);
        bTelepon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String no="082323012220";
                Intent panggil = new Intent(Intent.ACTION_DIAL);
                panggil.setData(Uri.fromParts("tel", no, null));
                startActivity(panggil);
            }
        });

        bAlamat = findViewById(R.id.Alamat);
        bAlamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("geo:?q=-6.961903608395168, 109.65399044763191");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        bEmail = findViewById(R.id.Email);
        bEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "nibrasbahy@gmail.com"));
                startActivity(intent);
            }
        });


    }

}