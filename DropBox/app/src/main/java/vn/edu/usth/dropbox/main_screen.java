package vn.edu.usth.dropbox;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;


public class main_screen extends Fragment {
//    private ViewPager recent;
    ImageView menu;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_main_screen, container, false);
//        initView(view);
        menu=view.findViewById(R.id.menu_click);
        addListener();
        return view;
    }
    private void addListener(){
        menu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Menu menu_fragment = new Menu();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.ln_container, menu_fragment)
                        .addToBackStack(null)
                        .commit();
                }
            }
        );
    }
//    private void initView(View v) {
//        recent=v.findViewById(R.id.viewpg);
//        screen_adapter adapter=new screen_adapter();
//        recent.setAdapter(adapter);
//    }

}
