package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class QuizActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        questions();
        setNameOfPerson();

    }

    @SuppressLint("SetTextI18n")
    public void setNameOfPerson() {
        Intent name = getIntent();
        if (name != null) {
            String person = name.getStringExtra("name");
            TextView nameOfPerson = findViewById(R.id.nameOfUser);
            nameOfPerson.setText("Welcome, " + person);
        }
    }

    public void questions() {
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
        question9();
        question10();
        question11();
        question12();
    }

    public void question1() {
        TextView question = findViewById(R.id.question2);
        question.setText(R.string.question1);

        RadioButton r1 = findViewById(R.id.one1);
        RadioButton r2 = findViewById(R.id.one2);
        RadioButton r3 = findViewById(R.id.one3);
        RadioButton r4 = findViewById(R.id.one4);

        r1.setText(R.string.one1);
        r2.setText(R.string.one2);
        r3.setText(R.string.one3);
        r4.setText(R.string.one4);
    }

    public void question2() {
        TextView question = findViewById(R.id.question1);
        question.setText(R.string.question2);

        CheckBox r1 = findViewById(R.id.two1);
        CheckBox r2 = findViewById(R.id.two2);
        CheckBox r3 = findViewById(R.id.two3);
        CheckBox r4 = findViewById(R.id.two4);

        r1.setText(R.string.two1);
        r2.setText(R.string.two2);
        r3.setText(R.string.two3);
        r4.setText(R.string.two4);
    }

    public void question3() {
        TextView question = findViewById(R.id.question3);
        question.setText(R.string.question3);

        RadioButton r1 = findViewById(R.id.three1);
        RadioButton r2 = findViewById(R.id.three2);
        RadioButton r3 = findViewById(R.id.three3);
        RadioButton r4 = findViewById(R.id.three4);

        r1.setText(R.string.three1);
        r2.setText(R.string.three2);
        r3.setText(R.string.three3);
        r4.setText(R.string.three4);
    }

    public void question4() {
        TextView question = findViewById(R.id.question4);
        question.setText(R.string.question4);

        RadioButton r1 = findViewById(R.id.four1);
        RadioButton r2 = findViewById(R.id.four2);
        RadioButton r3 = findViewById(R.id.four3);
        RadioButton r4 = findViewById(R.id.four4);

        r1.setText(R.string.four1);
        r2.setText(R.string.four2);
        r3.setText(R.string.four3);
        r4.setText(R.string.four4);
    }

    public void question5() {
        TextView question = findViewById(R.id.question5);
        question.setText(R.string.question5);

        RadioButton r1 = findViewById(R.id.five1);
        RadioButton r2 = findViewById(R.id.five2);
        RadioButton r3 = findViewById(R.id.five3);
        RadioButton r4 = findViewById(R.id.five4);

        r1.setText(R.string.five1);
        r2.setText(R.string.five2);
        r3.setText(R.string.five3);
        r4.setText(R.string.five4);
    }

    public void question6() {
        TextView question = findViewById(R.id.question6);
        question.setText(R.string.question6);

        RadioButton r1 = findViewById(R.id.six1);
        RadioButton r2 = findViewById(R.id.six2);
        RadioButton r3 = findViewById(R.id.six3);
        RadioButton r4 = findViewById(R.id.six4);

        r1.setText(R.string.six1);
        r2.setText(R.string.six2);
        r3.setText(R.string.six3);
        r4.setText(R.string.six4);
    }

    public void question7() {
        TextView question = findViewById(R.id.question7);
        question.setText(R.string.question7);

        RadioButton r1 = findViewById(R.id.seven1);
        RadioButton r2 = findViewById(R.id.seven2);
        RadioButton r3 = findViewById(R.id.seven3);
        RadioButton r4 = findViewById(R.id.seven4);

        r1.setText(R.string.seven1);
        r2.setText(R.string.seven2);
        r3.setText(R.string.seven3);
        r4.setText(R.string.seven4);
    }

    public void question8() {
        TextView question = findViewById(R.id.question8);
        question.setText(R.string.question8);

        RadioButton r1 = findViewById(R.id.eight1);
        RadioButton r2 = findViewById(R.id.eight2);
        RadioButton r3 = findViewById(R.id.eight3);
        RadioButton r4 = findViewById(R.id.eight4);

        r1.setText(R.string.eight1);
        r2.setText(R.string.eight2);
        r3.setText(R.string.eight3);
        r4.setText(R.string.eight4);
    }

    public void question9() {
        TextView question = findViewById(R.id.question9);
        question.setText(R.string.question9);

        RadioButton r1 = findViewById(R.id.nine1);
        RadioButton r2 = findViewById(R.id.nine2);
        RadioButton r3 = findViewById(R.id.nine3);
        RadioButton r4 = findViewById(R.id.nine4);

        r1.setText(R.string.nine1);
        r2.setText(R.string.nine2);
        r3.setText(R.string.nine3);
        r4.setText(R.string.nine4);
    }

    public void question10() {
        TextView question = findViewById(R.id.question10);
        question.setText(R.string.question10);

        RadioButton r1 = findViewById(R.id.ten1);
        RadioButton r2 = findViewById(R.id.ten2);

        r1.setText(R.string.ten1);
        r2.setText(R.string.ten2);
    }

    public void question11() {
        TextView question = findViewById(R.id.question11);
        question.setText(R.string.question11);

        RadioButton r1 = findViewById(R.id.eleven1);
        RadioButton r2 = findViewById(R.id.eleven2);
        RadioButton r3 = findViewById(R.id.eleven3);
        RadioButton r4 = findViewById(R.id.eleven4);

        r1.setText(R.string.eleven1);
        r2.setText(R.string.eleven2);
        r3.setText(R.string.eleven3);
        r4.setText(R.string.eleven4);
    }

    public void question12() {
        TextView question = findViewById(R.id.question12);
        question.setText(R.string.question12);

        RadioButton r1 = findViewById(R.id.twelve1);
        RadioButton r2 = findViewById(R.id.twelve2);
        RadioButton r3 = findViewById(R.id.twelve3);
        RadioButton r4 = findViewById(R.id.twelve4);

        r1.setText(R.string.twelve1);
        r2.setText(R.string.twelve2);
        r3.setText(R.string.twelve3);
        r4.setText(R.string.twelve4);
    }


    public void checkQuestion1() {
        RadioButton r1 = findViewById(R.id.one1);
        if (r1.isChecked()) {
            score++;
        }
    }

    public void checkQuestion2() {

        CheckBox r1 = findViewById(R.id.two1);
        CheckBox r2 = findViewById(R.id.two2);
        CheckBox r3 = findViewById(R.id.two3);

        if (r1.isChecked() && r2.isChecked() && r3.isChecked()) {
            score++;
        }
    }

    public void checkQuestion3() {
        RadioButton r1 = findViewById(R.id.three1);
        if (r1.isChecked()) {
            score++;
        }
    }

    public void checkQuestion4() {
        RadioButton r4 = findViewById(R.id.four4);
        if (r4.isChecked()) {
            score++;
        }
    }

    public void checkQuestion5() {
        RadioButton r4 = findViewById(R.id.five4);
        if (r4.isChecked()) {
            score++;
        }
    }

    public void checkQuestion6() {
        RadioButton r4 = findViewById(R.id.six4);
        if (r4.isChecked()) {
            score++;
        }
    }

    public void checkQuestion7() {
        RadioButton r4 = findViewById(R.id.seven4);
        if (r4.isChecked()) {
            score++;
        }
    }

    public void checkQuestion8() {
        RadioButton r4 = findViewById(R.id.eight4);
        if (r4.isChecked()) {
            score++;
        }
    }

    public void checkQuestion9() {
        RadioButton r3 = findViewById(R.id.nine3);
        if (r3.isChecked()) {
            score++;
        }
    }

    public void checkQuestion10() {
        RadioButton r2 = findViewById(R.id.ten2);
        if (r2.isChecked()) {
            score++;
        }
    }

    public void checkQuestion11() {
        RadioButton r4 = findViewById(R.id.eleven4);
        if (r4.isChecked()) {
            score++;
        }
    }

    public void checkQuestion12() {
        RadioButton r4 = findViewById(R.id.twelve4);
        if (r4.isChecked()) {
            score++;
        }
    }

    public void checkQuestion13() {
        EditText ans = findViewById(R.id.edit_text_13);
        String answer = ans.getText().toString();
        if (answer.equalsIgnoreCase("yes")) {
            score++;
        }
    }

    public void verifyScore() {
        checkQuestion1();
        checkQuestion2();
        checkQuestion3();
        checkQuestion4();
        checkQuestion5();
        checkQuestion6();
        checkQuestion7();
        checkQuestion8();
        checkQuestion9();
        checkQuestion10();
        checkQuestion11();
        checkQuestion12();
        checkQuestion13();
    }

    public void reset() {
        score = 0;
    }

    public void finalSubmit(View view) {
        verifyScore();
        Toast.makeText(this, "Great job, Your Score is: " + score, Toast.LENGTH_SHORT).show();
        reset();
    }
}
