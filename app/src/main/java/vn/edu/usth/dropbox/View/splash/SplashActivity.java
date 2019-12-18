package vn.edu.usth.dropbox.View.splash;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


import vn.edu.usth.dropbox.Author.Author;
import vn.edu.usth.dropbox.R;
import vn.edu.usth.dropbox.View.authen.Author;

/**
 *
 */

public class SplashActivity extends Activity {

    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashActivity.this, Author.class);
                startActivity(intent);
                finish();
            }
        },2000);

    }
}