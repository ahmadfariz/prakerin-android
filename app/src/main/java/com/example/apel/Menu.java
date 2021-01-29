package com.example.apel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    public CardView card1, card2, card3, card4;

    Button btnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        card1 = (CardView) findViewById(R.id.c1);
        card2 = (CardView) findViewById(R.id.c2);
        card3 = (CardView) findViewById(R.id.c3);
        card4 = (CardView) findViewById(R.id.c4);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.c1 :
                i = new Intent(this,Profile.class);
                startActivity(i);
                break;
        }

        switch (v.getId()){
            case R.id.c2 :
                i = new Intent(this,ListMember.class);
                startActivity(i);
                break;
        }

        switch (v.getId()){
            case R.id.c3 :
                i = new Intent(this,History.class);
                startActivity(i);
                break;
        }

        switch (v.getId()){
            case R.id.c4 :
                i = new Intent(this,Exit.class);
                startActivity(i);
                break;
        }

    }
}