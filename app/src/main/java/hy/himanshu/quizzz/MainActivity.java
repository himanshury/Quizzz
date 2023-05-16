package hy.himanshu.quizzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView question,questionNumber;
    private Button opt1,opt2,opt3,opt4;
    private ArrayList<QuizModel> quizModelArrayList;

    Random random;
    int currentscore = 0, questionAttempted = 1, currentPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question = findViewById(R.id.Question);
        questionNumber = findViewById(R.id.QuestionAttempt);
        opt1 = findViewById(R.id.idBtnOption1);
        opt2 = findViewById(R.id.idBtnOption2);
        opt3 = findViewById(R.id.idBtnOption3);
        opt4= findViewById(R.id.idBtnOption4);

        quizModelArrayList = new ArrayList<>();
        random= new Random();
        getQuizQuestion();

    }

    private void getQuizQuestion() {
        
    }
}