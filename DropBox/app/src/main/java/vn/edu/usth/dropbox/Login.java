package vn.edu.usth.dropbox;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;



public class Login extends Fragment {

    EditText mail;
    EditText pass;
    Button dangnhap;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_login, container, false);
         mail= view.findViewById(R.id.input_email);
         pass=view.findViewById(R.id.input_pass);
        dangnhap=view.findViewById(R.id.btnsignin2);
        addListener();

        return view;
    }

    private void addListener() {
        dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mail.getText().toString();
                pass.getText().toString();
                Log.d("checker",mail.getText().toString());
                Log.d("checker",pass.getText().toString());
                if (("thanhnt.usth@gmail.com".equals(mail.getText().toString()))&&("thanhnt".equals(pass.getText().toString()) )){
                    Toast.makeText(v.getContext(), "Login success", Toast.LENGTH_SHORT).show();
                    main_screen nextFrag = new main_screen();
                    getActivity().getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container, nextFrag)
                            .addToBackStack(null)
                            .commit();}
                else {
                    Toast.makeText(v.getContext(), " Login fail ", Toast.LENGTH_SHORT).show();

                }



            }

        });
    }


}
