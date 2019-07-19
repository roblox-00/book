package ketab.khoon.shoo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class BooksActivity extends AppCompatActivity {


    private static final String LOGIN = "login";
    boolean isLOGIN = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);


        getData();
        if (isLOGIN) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {


                    Intent intent = new Intent(BooksActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();


                }
            }, 4000);

        } else {

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {


                    Intent intent = new Intent(BooksActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();


                }
            }, 4000);
        }


    }


    private void getData() {

        SharedPreferences sharedPreferences = getSharedPreferences(LOGIN, MODE_PRIVATE);
        isLOGIN = sharedPreferences.getBoolean("ISLOGIN", false);
    }
}
