package vn.edu.usth.dropbox;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn_signup;
    TextView btn_signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("onCreate","The weather is being created");

        setContentView(R.layout.activity_main);
//        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
//                .requestEmail()
//                .build();
        btn_signup= findViewById(R.id.btnSignup);
        btn_signin= findViewById(R.id.text_signin);
        addListener();

    }

    private void addListener() {
        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(v.getContext(), "Create new account", Toast.LENGTH_SHORT).show();
                Create signup_fragment=new Create();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, signup_fragment)
                        .addToBackStack(null)
                        .commit();

            }

        });

        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(v.getContext(), "Login", Toast.LENGTH_SHORT).show();
                Login login_Fragment=new Login();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, login_Fragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("abc","The weather is being started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("abc","The weather is being stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("abc","The weather is being destroyed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("abc","The weather is being paused");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("abc","The weather is being resumed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("abc","The weather is being restarted");
    }
}