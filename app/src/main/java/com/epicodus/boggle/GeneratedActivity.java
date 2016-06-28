package com.epicodus.boggle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import butterknife.Bind;
import butterknife.ButterKnife;

public class GeneratedActivity extends AppCompatActivity {
    private static final String TAG = "GeneratedActivity CHECK";
    final ArrayList<String> inputArray = new ArrayList<String>();


    @Bind(R.id.check) Button mCheckButton;
    @Bind(R.id.letterOne) TextView mLetterOne;
    @Bind(R.id.letterTwo) TextView mLetterTwo;
    @Bind(R.id.letterThree) TextView mLetterThree;
    @Bind(R.id.letterFour) TextView mLetterFour;
    @Bind(R.id.letterFive) TextView mLetterFive;
    @Bind(R.id.letterSix) TextView mLetterSix;
    @Bind(R.id.letterSeven) TextView mLetterSeven;
    @Bind(R.id.letterEight) TextView mLetterEight;
    @Bind(R.id.inputOne) TextView mInputOne;
    @Bind(R.id.inputTwo) TextView mInputTwo;
    @Bind(R.id.inputThree) TextView mInputThree;
    @Bind(R.id.inputFour) TextView mInputFour;
    @Bind(R.id.inputFive) TextView mInputFive;
    @Bind(R.id.inputSix) TextView mInputSix;
    @Bind(R.id.inputSeven) TextView mInputSeven;
    @Bind(R.id.inputEight) TextView mInputEight;
    @Bind(R.id.scoreBox) TextView mScoreBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generated);
        ButterKnife.bind(this);
        mLetterOne.setText(randLetter());
        mLetterTwo.setText(randLetter());
        mLetterThree.setText(randVowel());
        mLetterFour.setText(randLetter());
        mLetterFive.setText(randLetter());
        mLetterSix.setText(randVowel());
        mLetterSeven.setText(randLetter());
        mLetterEight.setText(randLetter());

        mCheckButton.setOnClickListener(new View.OnClickListener() {
            int score = 0;
            @Override
            public void onClick(View view) {
                mInputOne.setText("");
                mInputTwo.setText("");
                mInputThree.setText("");
                mInputFour.setText("");
                mInputFive.setText("");
                mInputSix.setText("");
                mInputSeven.setText("");
                mInputEight.setText("");
                if(inputArray.size() > 7) {
                    mInputOne.setText(inputArray.get(0).toString());
                    mInputTwo.setText(inputArray.get(1).toString());
                    mInputThree.setText(inputArray.get(2).toString());
                    mInputFour.setText(inputArray.get(3).toString());
                    mInputFive.setText(inputArray.get(4).toString());
                    mInputSix.setText(inputArray.get(5).toString());
                    mInputSeven.setText(inputArray.get(6).toString());
                    mInputEight.setText(inputArray.get(7).toString());
                    Toast.makeText(GeneratedActivity.this, "+ 10 points", Toast.LENGTH_LONG).show();
                    score += 10;
                } else if(inputArray.size() > 6) {
                    mInputOne.setText(inputArray.get(0).toString());
                    mInputTwo.setText(inputArray.get(1).toString());
                    mInputThree.setText(inputArray.get(2).toString());
                    mInputFour.setText(inputArray.get(3).toString());
                    mInputFive.setText(inputArray.get(4).toString());
                    mInputSix.setText(inputArray.get(5).toString());
                    mInputSeven.setText(inputArray.get(6).toString());
                    Toast.makeText(GeneratedActivity.this, "+ 5 points", Toast.LENGTH_LONG).show();
                    score += 5;
                } else if(inputArray.size() > 5) {
                    mInputOne.setText(inputArray.get(0).toString());
                    mInputTwo.setText(inputArray.get(1).toString());
                    mInputThree.setText(inputArray.get(2).toString());
                    mInputFour.setText(inputArray.get(3).toString());
                    mInputFive.setText(inputArray.get(4).toString());
                    mInputSix.setText(inputArray.get(5).toString());
                    Toast.makeText(GeneratedActivity.this, "+ 4 points", Toast.LENGTH_LONG).show();
                    score += 4;
                } else if(inputArray.size() > 4) {
                    mInputOne.setText(inputArray.get(0).toString());
                    mInputTwo.setText(inputArray.get(1).toString());
                    mInputThree.setText(inputArray.get(2).toString());
                    mInputFour.setText(inputArray.get(3).toString());
                    mInputFive.setText(inputArray.get(4).toString());
                    Toast.makeText(GeneratedActivity.this, "+ 3 points", Toast.LENGTH_LONG).show();
                    score += 3;
                } else if(inputArray.size() > 3) {
                    mInputOne.setText(inputArray.get(0).toString());
                    mInputTwo.setText(inputArray.get(1).toString());
                    mInputThree.setText(inputArray.get(2).toString());
                    mInputFour.setText(inputArray.get(3).toString());
                    Toast.makeText(GeneratedActivity.this, "+ 2 points", Toast.LENGTH_LONG).show();
                    score += 2;
                } else if(inputArray.size() > 2) {
                    mInputOne.setText(inputArray.get(0).toString());
                    mInputTwo.setText(inputArray.get(1).toString());
                    mInputThree.setText(inputArray.get(2).toString());
                    Toast.makeText(GeneratedActivity.this, "+ 1 points", Toast.LENGTH_LONG).show();
                    score ++;
                }else{
                    Toast.makeText(GeneratedActivity.this, "Word Must Be Three Letters Long", Toast.LENGTH_LONG).show();
                }
                inputArray.clear();

                Log.d(TAG, "" + score + "");
                mScoreBox.setText("Score: " + score + "");
            }
        });

//        mInputOne.setText(inputArray.get(0).toString());

        mLetterOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String iOne = mLetterOne.getText().toString();
                inputArray.add(iOne);
                String x = inputArray.toString();
                Log.d(TAG, x);
            }
        });
        mLetterTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String iOne = mLetterTwo.getText().toString();
                inputArray.add(iOne);
                String x = inputArray.toString();
                Log.d(TAG, x);
            }
        });
        mLetterThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String iOne = mLetterThree.getText().toString();
                inputArray.add(iOne);
                String x = inputArray.toString();
                Log.d(TAG, x);
            }
        });
        mLetterFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String iOne = mLetterFour.getText().toString();
                inputArray.add(iOne);
                String x = inputArray.toString();
                Log.d(TAG, x);
            }
        });
        mLetterFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String iOne = mLetterFive.getText().toString();
                inputArray.add(iOne);
                String x = inputArray.toString();
                Log.d(TAG, x);
            }
        });
        mLetterSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String iOne = mLetterSix.getText().toString();
                inputArray.add(iOne);
                String x = inputArray.toString();
                Log.d(TAG, x);
            }
        });mLetterSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String iOne = mLetterSeven.getText().toString();
                inputArray.add(iOne);
                String x = inputArray.toString();
                Log.d(TAG, x);
            }
        });
        mLetterEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String iOne = mLetterEight.getText().toString();
                inputArray.add(iOne);
                String x = inputArray.toString();
                Log.d(TAG, x);
                Log.d("TEST", inputArray.get(0).toString());
            }
        });



    }
    public String randLetter(){
        String letter;
        Random r = new Random();
        int n = r.nextInt(26);
        String[] alphabet = new String[]{"A","B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        letter = alphabet[n];
        //Log.v(TAG, letter);
        return letter;
    }
    public String randVowel() {
        String vowel;
        Random r = new Random();
        int n = r.nextInt(5);
        String[] vowels = new String[]{"A", "E", "I", "O", "U"};
        vowel = vowels[n];
        //Log.v(TAG, letter);
        return vowel;
    }
}
