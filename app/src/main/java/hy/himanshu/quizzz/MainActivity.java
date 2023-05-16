package hy.himanshu.quizzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;
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
        getQuizQuestion(quizModelArrayList);
        currentPos=random.nextInt(quizModelArrayList.size());
        setDataToViews(currentPos);
        opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quizModelArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(opt1.getText().toString().trim().toLowerCase()))

                {
                    currentscore++;
                }
                questionAttempted++;
                currentPos=random.nextInt(quizModelArrayList.size());
                setDataToViews(currentPos);
            }
        });

        opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quizModelArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(opt2.getText().toString().trim().toLowerCase()))

                {
                    currentscore++;
                }
                questionAttempted++;
                currentPos=random.nextInt(quizModelArrayList.size());
                setDataToViews(currentPos);

            }
        });
        opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quizModelArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(opt3.getText().toString().trim().toLowerCase()))

                {
                    currentscore++;
                }
                questionAttempted++;
                currentPos=random.nextInt(quizModelArrayList.size());
                setDataToViews(currentPos);

            }
        });
        opt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quizModelArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(opt4.getText().toString().trim().toLowerCase()))

                {
                    currentscore++;
                }
                questionAttempted++;
                currentPos=random.nextInt(quizModelArrayList.size());
                setDataToViews(currentPos);

            }
        });

    }

    private void setDataToViews(int currentPos) {

            questionNumber.setText("Questions Attempted: "+questionAttempted + "/4");
            question.setText(quizModelArrayList.get(currentPos).getQuestion());
            opt1.setText(quizModelArrayList.get(currentPos).getOption1());
            opt2.setText(quizModelArrayList.get(currentPos).getOption2());
            opt3.setText(quizModelArrayList.get(currentPos).getOption3());
            opt4.setText(quizModelArrayList.get(currentPos).getOption4());


    }

    private void getQuizQuestion(ArrayList<QuizModel> quizModelArrayList) {
       quizModelArrayList.add(new QuizModel("Who painted the Mona Lisa?","Leonardo da Vinci","Pablo Picasso","Vincent van Gogh","Michelangelo","Leonardo da Vinci"));
        quizModelArrayList.add(new QuizModel("What is the capital of Australia?","Sydney","Melbourne","Canberra","Perth","Canberra"));
        quizModelArrayList.add(new QuizModel("Which planet is known as the Red Planet?","Mars","Venus","Jupiter","Saturn","Mars"));
        quizModelArrayList.add(new QuizModel("Which famous scientist developed the theory of relativity?","Isaac Newton","Albert Einstein"," Galileo Galilei","Nikola Tesla","Albert Einstein"));


    }
}