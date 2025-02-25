package com.example.e2_4;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    String text = "";
    boolean aditionClick ;
    boolean soutractionClick;
    boolean multiplicationClick;
    boolean divisionClick;
    int patate=0;

    Double reponse;

    private void buttonFalse(){
        aditionClick=false;
        soutractionClick=false;
        multiplicationClick=false;
        divisionClick=false;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        EditText editText=findViewById(R.id.editText);

        ImageButton[] buttonsNumber=new ImageButton[10];
        ImageButton buttonPlus=findViewById(R.id.buttonPlus);
        ImageButton buttonMoins=findViewById(R.id.buttonMoins);
        ImageButton buttonMultiple=findViewById(R.id.buttonMultiple);
        ImageButton buttonDivision=findViewById(R.id.buttonDivision);
        ImageButton buttonEffacer=findViewById(R.id.buttonEffacer);
        ImageButton buttonEqual=findViewById(R.id.buttonEqual);



        for(int i=0;i<buttonsNumber.length;i++){
            String str="button"+(i);

            int resId=getResources().getIdentifier(str,"id",getPackageName());

            buttonsNumber[i]=findViewById(resId);

            int finalI = i;
            buttonsNumber[i].setOnClickListener(view->{
                text += finalI;
                editText.setText(text);
            });
        }

        buttonPlus.setOnClickListener(view -> {
            if(!text.isEmpty()){
                text +="+";
                editText.setText(text);
                aditionClick=true;
            }else{
                Toast.makeText(this, "illegale", Toast.LENGTH_SHORT).show();
            }
        });
        buttonMoins.setOnClickListener(view->{
            if(!text.isEmpty()) {
                text += "―";
                editText.setText(text);
                soutractionClick = true;
            }else{
                Toast.makeText(this, "illegale", Toast.LENGTH_SHORT).show();
            }
        });
        buttonMultiple.setOnClickListener(view->{
            text +="X";
            editText.setText(text);
            multiplicationClick=true;
        });
        buttonDivision.setOnClickListener(view->{
            text +="/";
            editText.setText(text);
            divisionClick=true;
        });
        buttonEffacer.setOnClickListener(view->{
            text ="";
            editText.setText("");
        });
        buttonEqual.setOnClickListener(view->{
            if(multiplicationClick){
                reponse=Calcule.multiplication(text);
            }
            if(divisionClick){
                reponse=Calcule.division(text);
            }
            if(aditionClick){
                reponse= Calcule.Adition(text);
            }
            if(soutractionClick){
                reponse=Calcule.soustraction(text);
            }
            text="";
            text+=reponse;
            editText.setText(text);
            buttonFalse();
        });
    }
}

//Question: tableau string? pourquoi final?