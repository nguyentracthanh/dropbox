//package vn.edu.usth.dropbox.View.authen;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.app.ProgressDialog;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.CheckBox;
//import android.widget.EditText;
//import android.widget.TextView;
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;
//
//import vn.edu.usth.dropbox.DropboxActivity;
//import vn.edu.usth.dropbox.R;
//import vn.edu.usth.dropbox.model.request.User;
//
//public class Signup extends DropboxActivity {
//
//    Button btnSignup;
//    EditText editFirtname, editLastname, editEmail, editPassword;
//    CheckBox checkBox;
//    TextView sigin_text;
//    Integer id;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_signup);
//        btnSignup=findViewById(R.id.btnSignup);
//        editFirtname=findViewById(R.id.edit_first_name);
//        editLastname=findViewById(R.id.edit_last_name);
//        editEmail=findViewById(R.id.edit_email);
//        editPassword=findViewById(R.id.edit_password);
//        sigin_text=findViewById(R.id.sign_in_text);
//        FirebaseDatabase database=FirebaseDatabase.getInstance();
//        final DatabaseReference table_user=database.getReference("User");
//        btnSignup.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//
//                final ProgressDialog mDialog=new ProgressDialog(Signup.this);
//                mDialog.setMessage("Please waiting...");
//                mDialog.show();
//                table_user.addListenerForSingleValueEvent(new ValueEventListener(){
//
//                    @Override
//                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                        if (dataSnapshot.child(editEmail.getText().toString()).exists()){
//                            mDialog.dismiss();
//                        }
//                        else {
//                            mDialog.dismiss();
//                            User user=new User(editFirtname.getText().toString(),editLastname.getText().toString(),
//                                    editEmail.getText().toString(),editPassword.getText().toString());
//                            table_user.child(editPhone.getText().toString()).setValue(user);
//                            finish();
//                        }
//                    }
//
//                    @Override
//                    public void onCancelled(@NonNull DatabaseError databaseError) {
//
//                    }
//                });
//
//
//
//            }
//        });
//
//    }
//    // Firebase
//
//
//
//
//
//}
