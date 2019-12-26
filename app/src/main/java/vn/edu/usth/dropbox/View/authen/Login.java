package vn.edu.usth.dropbox.View.authen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.dropbox.core.v2.users.FullAccount;

import vn.edu.usth.dropbox.DropboxActivity;
import vn.edu.usth.dropbox.DropboxClientFactory;
import vn.edu.usth.dropbox.R;

public class Login extends DropboxActivity {
    Button btnSignin;
    EditText editmail,editpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editmail=findViewById(R.id.input_email);
        editpass=findViewById(R.id.input_pass);
        btnSignin=findViewById(R.id.btnsignin2);
        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DropboxActivity.startOAuth2Authentication(Login.this, getString(R.string.app_key), null);

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
    @Override
    protected void loadData() {
        new GetCurrentAccountTask(DropboxClientFactory.getClient(), new GetCurrentAccountTask.Callback() {
            @Override
            public void onComplete(FullAccount result) {
                ((TextView) findViewById(R.id.mailAuthor)).setText(result.getEmail());
                ((TextView) findViewById(R.id.nameAuthor)).setText(result.getName().getDisplayName());
                ((TextView) findViewById(R.id.typeAccount)).setText(result.getAccountType().name());
            }

            @Override
            public void onError(Exception e) {
                Log.e(getClass().getName(), "Failed to get account details.", e);
            }
        }).execute();
    }
}
