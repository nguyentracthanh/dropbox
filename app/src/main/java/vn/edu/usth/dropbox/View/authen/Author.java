package vn.edu.usth.dropbox.View.authen;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import vn.edu.usth.dropbox.R;

public class Author extends AppCompatActivity {
    Button btn_signup;
    TextView btn_signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.author_activity);
//        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
//                .requestEmail()
//                .build();
        btn_signup= findViewById(R.id.btnSignup);
        btn_signin= findViewById(R.id.text_signin);
        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(v.getContext(), "SignUp new account", Toast.LENGTH_SHORT).show();
                SignUp signup_fragment=new SignUp();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, signup_fragment)
                        .addToBackStack(null)
                        .commit();

            }

        });

        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(v.getContext(), "SignIn", Toast.LENGTH_SHORT).show();
                SignIn login_Fragment=new SignIn();
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
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}