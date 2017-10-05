package com.example.shivam.myapplication2a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    Spinner c;
    TextView t;
    HashMap x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c=(Spinner)findViewById(R.id.ch);
        t=(TextView)findViewById(R.id.text);
        Button b=(Button)findViewById(R.id.translate);
        x=new HashMap();
        x.put("Hello","Bonjour");
        x.put("Goodbye","Au Revoir");
        x.put("Good Evening","Bonsoir");
        x.put("Good Night","Bonne nuit");
        x.put("Please","S'il vous plaît");
        x.put("Thank you","Merci");
        x.put("Sorry","Pardon");
        x.put("It's okay", "Ça va");
        x.put("It's good","C'est bien");
        x.put("We","Nous");
        x.put("You","Vous");
        x.put("Mr.","Monsieur");
        x.put("Miss","Mademoiselle");
        x.put("Red","Rouge");
        x.put("Black","Noir");
        x.put("Blue","Bleu");
        x.put("Yellow","Jaune");
        x.put("Bread","Pain");
        x.put("Wine","Du vin");
        x.put("Chicken","poulet");
        x.put("Rice","Riz");
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String a=c.getSelectedItem().toString();
                if(x.containsKey(a))
                {
                    t.setText(x.get(a).toString());
                }
            }
        });

    }
}
