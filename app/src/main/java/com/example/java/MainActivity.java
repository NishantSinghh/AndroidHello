package com.example.java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button boxer1, boxer2, boxer3;
    Button kickBoxer1, kickBoxer2, kickBoxer3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boxer1 = findViewById(R.id.boxer1);
        boxer2 = findViewById(R.id.boxer2);
        boxer3 = findViewById(R.id.boxer3);
        kickBoxer1 = findViewById(R.id.kickboxer1);
        kickBoxer2 = findViewById(R.id.kickboxer2);
        kickBoxer3 = findViewById(R.id.kickboxer3);

        final Boxer bx = new Boxer();
        final KickBoxer kb = new KickBoxer();
//        View.OnClickListener listn = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(v.getId() == R.id.boxer1){
//                    Log.i("ButtonClick", "Boxer1 clicked");
//                    Toast.makeText(getApplicationContext(), "this is boxer : "+ bx.jabPunch(), Toast.LENGTH_SHORT).show();
//                }else if(v.getId() == R.id.boxer2){
//                    Toast.makeText(getApplicationContext(), "this is boxer : "+ bx.doubleKick(), Toast.LENGTH_SHORT).show();
//                }else if(v.getId() == R.id.boxer3){
//                    Toast.makeText(getApplicationContext(), "this is boxer : "+ bx.flyingKick(), Toast.LENGTH_SHORT).show();
//                }else if(v.getId() == R.id.kickboxer1){
//                    Toast.makeText(getApplicationContext(), "this is boxer : "+ kb.jabPunch(), Toast.LENGTH_SHORT).show();
//                }else if(v.getId() == R.id.kickboxer2){
//                    Toast.makeText(getApplicationContext(), "this is boxer : "+ kb.doubleKick(), Toast.LENGTH_SHORT).show();
//                }else if (v.getId() == R.id.kickboxer3){
//                    Toast.makeText(getApplicationContext(), "this is boxer : "+ kb.flyingKick(), Toast.LENGTH_SHORT).show();
//                }
//
//
//            }
//        };

        boxer1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "this is boxer : "+ bx.jabPunch(), Toast.LENGTH_SHORT).show();
            }
        });
        boxer2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "this is boxer : "+ bx.doubleKick(), Toast.LENGTH_SHORT).show();
            }
        });
        boxer3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "this is boxer : "+ bx.flyingKick(), Toast.LENGTH_SHORT).show();
            }
        });
        kickBoxer1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "this is boxer : "+ kb.jabPunch(), Toast.LENGTH_SHORT).show();
            }
        });
        kickBoxer2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "this is boxer : "+ kb.jabPunch(), Toast.LENGTH_SHORT).show();
            }
        });
        kickBoxer3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "this is boxer : "+ kb.flyingKick(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
