package com.example.android.myquizapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int numberOfQuestions = 9;
    int correctlyAnsweredQuestions = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view) {

        RadioButton checkRadioButton1 = (RadioButton) findViewById(R.id.answer1b);
        boolean checked1 = checkRadioButton1.isChecked();
        checkRadioButton1.setTextColor(Color.BLACK);

        RadioButton checkRadioButton4 = (RadioButton) findViewById(R.id.answer4a);
        boolean checked4 = checkRadioButton4.isChecked();
        checkRadioButton4.setTextColor(Color.BLACK);

        RadioButton checkRadioButton7 = (RadioButton) findViewById(R.id.answer7a);
        boolean checked7 = checkRadioButton7.isChecked();
        checkRadioButton7.setTextColor(Color.BLACK);

        RadioButton checkRadioButtonOneA = (RadioButton) findViewById(R.id.answer1a);
        boolean checkedOneA = checkRadioButtonOneA.isChecked();
        checkRadioButtonOneA.setTextColor(Color.BLACK);

        RadioButton checkRadioButtonOneC = (RadioButton) findViewById(R.id.answer1c);
        boolean checkedOneC = checkRadioButtonOneC.isChecked();
        checkRadioButtonOneC.setTextColor(Color.BLACK);

        RadioButton checkRadioButtonOneD = (RadioButton) findViewById(R.id.answer1d);
        boolean checkedOneD = checkRadioButtonOneD.isChecked();
        checkRadioButtonOneD.setTextColor(Color.BLACK);

        RadioButton checkRadioButtonFourB = (RadioButton) findViewById(R.id.answer4b);
        boolean checkedFourB = checkRadioButtonFourB.isChecked();
        checkRadioButtonFourB.setTextColor(Color.BLACK);

        RadioButton checkRadioButtonFourC = (RadioButton) findViewById(R.id.answer4c);
        boolean checkedFourC = checkRadioButtonFourC.isChecked();
        checkRadioButtonFourC.setTextColor(Color.BLACK);

        RadioButton checkRadioButtonFourD = (RadioButton) findViewById(R.id.answer4d);
        boolean checkedFourD = checkRadioButtonFourD.isChecked();
        checkRadioButtonFourD.setTextColor(Color.BLACK);

        RadioButton checkRadioButtonSevenB = (RadioButton) findViewById(R.id.answer7b);
        boolean checkedSevenB = checkRadioButtonSevenB.isChecked();
        checkRadioButtonSevenB.setTextColor(Color.BLACK);

        RadioButton checkRadioButtonSevenC = (RadioButton) findViewById(R.id.answer7c);
        boolean checkedSevenC = checkRadioButtonSevenC.isChecked();
        checkRadioButtonSevenC.setTextColor(Color.BLACK);

        RadioButton checkRadioButtonSevenD = (RadioButton) findViewById(R.id.answer7d);
        boolean checkedSevenD = checkRadioButtonSevenD.isChecked();
        checkRadioButtonSevenD.setTextColor(Color.BLACK);

        if (checked1) {
            correctlyAnsweredQuestions++;
            checkRadioButton1.setTextColor(Color.GREEN);
        }

        if (checked4) {
            correctlyAnsweredQuestions++;
            checkRadioButton4.setTextColor(Color.GREEN);
        }

        if (checked7) {
            correctlyAnsweredQuestions++;
            checkRadioButton7.setTextColor(Color.GREEN);
        }

        if (checkedOneA) {
            checkRadioButtonOneA.setTextColor(Color.RED);
        }

        if (checkedOneC) {
            checkRadioButtonOneC.setTextColor(Color.RED);
        }

        if (checkedOneD) {
            checkRadioButtonOneD.setTextColor(Color.RED);
        }

        if (checkedFourB) {
            checkRadioButtonFourB.setTextColor(Color.RED);
        }

        if (checkedFourC) {
            checkRadioButtonFourC.setTextColor(Color.RED);
        }

        if (checkedFourD) {
            checkRadioButtonFourD.setTextColor(Color.RED);
        }

        if (checkedSevenB) {
            checkRadioButtonSevenB.setTextColor(Color.RED);
        }

        if (checkedSevenC) {
            checkRadioButtonSevenC.setTextColor(Color.RED);
        }

        if (checkedSevenD) {
            checkRadioButtonSevenD.setTextColor(Color.RED);
        }
    }

    public void checkBoxCheckedQuestionThree(View view) {

        CheckBox checkBoxOne = (CheckBox) findViewById(R.id.checkbox3a);
        boolean checkBoxStateOne = checkBoxOne.isChecked();
        checkBoxOne.setTextColor(Color.BLACK);

        CheckBox checkBoxTwo = (CheckBox) findViewById(R.id.checkbox3d);
        boolean checkBoxStateTwo = checkBoxTwo.isChecked();
        checkBoxTwo.setTextColor(Color.BLACK);

        CheckBox checkBoxThree = (CheckBox) findViewById(R.id.checkbox3f);
        boolean checkBoxStateThree = checkBoxThree.isChecked();
        checkBoxThree.setTextColor(Color.BLACK);

        CheckBox checkBoxFour = (CheckBox) findViewById(R.id.checkbox3b);
        boolean checkBoxStateFour = checkBoxFour.isChecked();
        checkBoxFour.setTextColor(Color.BLACK);

        CheckBox checkBoxFive = (CheckBox) findViewById(R.id.checkbox3c);
        boolean checkBoxStateFive = checkBoxFive.isChecked();
        checkBoxFive.setTextColor(Color.BLACK);

        CheckBox checkBoxSix = (CheckBox) findViewById(R.id.checkbox3e);
        boolean checkBoxStateSix = checkBoxSix.isChecked();
        checkBoxSix.setTextColor(Color.BLACK);

        if (checkBoxStateOne && checkBoxStateTwo && checkBoxStateThree && !checkBoxStateFour &&
                !checkBoxStateFive && !checkBoxStateSix) {
            correctlyAnsweredQuestions++;
        }

        if (checkBoxStateOne) {
            checkBoxOne.setTextColor(Color.GREEN);
        }

        if (checkBoxStateTwo) {
            checkBoxTwo.setTextColor(Color.GREEN);
        }

        if (checkBoxStateThree) {
            checkBoxThree.setTextColor(Color.GREEN);
        }

        if (checkBoxStateFour) {
            checkBoxFour.setTextColor(Color.RED);
        }

        if (checkBoxStateFive) {
            checkBoxFive.setTextColor(Color.RED);
        }

        if (checkBoxStateSix) {
            checkBoxSix.setTextColor(Color.RED);
        }
    }

    public void checkBoxCheckedQuestionSix(View view) {

        CheckBox checkBoxOne = (CheckBox) findViewById(R.id.checkbox6b);
        boolean checkBoxStateOne = checkBoxOne.isChecked();
        checkBoxOne.setTextColor(Color.BLACK);

        CheckBox checkBoxTwo = (CheckBox) findViewById(R.id.checkbox6c);
        boolean checkBoxStateTwo = checkBoxTwo.isChecked();
        checkBoxTwo.setTextColor(Color.BLACK);

        CheckBox checkBoxThree = (CheckBox) findViewById(R.id.checkbox6d);
        boolean checkBoxStateThree = checkBoxThree.isChecked();
        checkBoxThree.setTextColor(Color.BLACK);

        CheckBox checkBoxFour = (CheckBox) findViewById(R.id.checkbox6a);
        boolean checkBoxStateFour = checkBoxFour.isChecked();
        checkBoxFour.setTextColor(Color.BLACK);

        CheckBox checkBoxFive = (CheckBox) findViewById(R.id.checkbox6e);
        boolean checkBoxStateFive = checkBoxFive.isChecked();
        checkBoxFive.setTextColor(Color.BLACK);

        CheckBox checkBoxSix = (CheckBox) findViewById(R.id.checkbox6f);
        boolean checkBoxStateSix = checkBoxSix.isChecked();
        checkBoxSix.setTextColor(Color.BLACK);

        if (checkBoxStateOne && checkBoxStateTwo && checkBoxStateThree && !checkBoxStateFour &&
                !checkBoxStateFive && !checkBoxStateSix) {
            correctlyAnsweredQuestions++;
        }

        if (checkBoxStateOne) {
            checkBoxOne.setTextColor(Color.GREEN);
        }

        if (checkBoxStateTwo) {
            checkBoxTwo.setTextColor(Color.GREEN);
        }

        if (checkBoxStateThree) {
            checkBoxThree.setTextColor(Color.GREEN);
        }

        if (checkBoxStateFour) {
            checkBoxFour.setTextColor(Color.RED);
        }

        if (checkBoxStateFive) {
            checkBoxFive.setTextColor(Color.RED);
        }

        if (checkBoxStateSix) {
            checkBoxSix.setTextColor(Color.RED);
        }
    }

    public void checkBoxCheckedQuestionNine(View view) {

        CheckBox checkBoxOne = (CheckBox) findViewById(R.id.checkbox9a);
        boolean checkBoxStateOne = checkBoxOne.isChecked();
        checkBoxOne.setTextColor(Color.BLACK);

        CheckBox checkBoxTwo = (CheckBox) findViewById(R.id.checkbox9e);
        boolean checkBoxStateTwo = checkBoxTwo.isChecked();
        checkBoxTwo.setTextColor(Color.BLACK);

        CheckBox checkBoxThree = (CheckBox) findViewById(R.id.checkbox9f);
        boolean checkBoxStateThree = checkBoxThree.isChecked();
        checkBoxThree.setTextColor(Color.BLACK);

        CheckBox checkBoxFour = (CheckBox) findViewById(R.id.checkbox9b);
        boolean checkBoxStateFour = checkBoxFour.isChecked();
        checkBoxFour.setTextColor(Color.BLACK);

        CheckBox checkBoxFive = (CheckBox) findViewById(R.id.checkbox9c);
        boolean checkBoxStateFive = checkBoxFive.isChecked();
        checkBoxFive.setTextColor(Color.BLACK);

        CheckBox checkBoxSix = (CheckBox) findViewById(R.id.checkbox9d);
        boolean checkBoxStateSix = checkBoxSix.isChecked();
        checkBoxSix.setTextColor(Color.BLACK);

        if (checkBoxStateOne && checkBoxStateTwo && checkBoxStateThree && !checkBoxStateFour &&
                !checkBoxStateFive && !checkBoxStateSix) {
            correctlyAnsweredQuestions++;
        }

        if (checkBoxStateOne) {
            checkBoxOne.setTextColor(Color.GREEN);
        }

        if (checkBoxStateTwo) {
            checkBoxTwo.setTextColor(Color.GREEN);
        }

        if (checkBoxStateThree) {
            checkBoxThree.setTextColor(Color.GREEN);
        }

        if (checkBoxStateFour) {
            checkBoxFour.setTextColor(Color.RED);
        }

        if (checkBoxStateFive) {
            checkBoxFive.setTextColor(Color.RED);
        }

        if (checkBoxStateSix) {
            checkBoxSix.setTextColor(Color.RED);
        }
    }

    public void editTextIsCorrect(View view) {

        String correctAnswerTwo = getString(R.string.newdelhi);
        String correctAnswerFive = getString(R.string.rome);
        String correctAnswerEight = getString(R.string.capetown);

        EditText answerFieldTwo = (EditText) findViewById(R.id.edit_text_answer2);
        String answerTypedTwo = answerFieldTwo.getText().toString();
        answerFieldTwo.setTextColor(Color.BLACK);

        EditText answerFieldFive = (EditText) findViewById(R.id.edit_text_answer5);
        String answerTypedFive = answerFieldFive.getText().toString();
        answerFieldFive.setTextColor(Color.BLACK);

        EditText answerFieldEight = (EditText) findViewById(R.id.edit_text_answer8);
        String answerTypedEight = answerFieldEight.getText().toString();
        answerFieldEight.setTextColor(Color.BLACK);

        if (correctAnswerTwo.equals(answerTypedTwo)) {
            correctlyAnsweredQuestions++;
            answerFieldTwo.setTextColor(Color.GREEN);
        } else {
            answerFieldTwo.setTextColor(Color.RED);
        }

        if (correctAnswerFive.equals(answerTypedFive)) {
            correctlyAnsweredQuestions++;
            answerFieldFive.setTextColor(Color.GREEN);
        } else {
            answerFieldFive.setTextColor(Color.RED);
        }

        if (correctAnswerEight.equals(answerTypedEight)) {
            correctlyAnsweredQuestions++;
            answerFieldEight.setTextColor(Color.GREEN);
        } else {
            answerFieldEight.setTextColor(Color.RED);
        }
    }

    public void submitQuiz(View view) {

        onRadioButtonClicked(view);
        checkBoxCheckedQuestionThree(view);
        checkBoxCheckedQuestionSix(view);
        checkBoxCheckedQuestionNine(view);
        editTextIsCorrect(view);

        String resultMessage = null;

        if (correctlyAnsweredQuestions <= 3) {
            resultMessage = getString(R.string.result) + " " + correctlyAnsweredQuestions + "/" +
                    numberOfQuestions + "\n" + getString(R.string.tryagain);
        } else if (correctlyAnsweredQuestions <= 6) {
            resultMessage = getString(R.string.goodjob) + "\n" + getString(R.string.result) + " " +
                    correctlyAnsweredQuestions + "/" + numberOfQuestions;
        } else {
            resultMessage = getString(R.string.congratulations) + "\n" +
                    getString(R.string.result) + " " + correctlyAnsweredQuestions + "/" +
                    numberOfQuestions;
        }

        Toast toastMessage = Toast.makeText(this, resultMessage, Toast.LENGTH_LONG);
        toastMessage.setGravity(Gravity.CENTER, 0, 0);
        toastMessage.show();
        correctlyAnsweredQuestions = 0;
    }
}
