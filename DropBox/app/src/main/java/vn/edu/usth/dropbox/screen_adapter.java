//package vn.edu.usth.dropbox;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.LinearLayout;
//
//import androidx.annotation.NonNull;
//import androidx.viewpager.widget.PagerAdapter;
//
//public class screen_adapter extends PagerAdapter {
//    private LayoutInflater inflater;
//
//    @Override
//
//    public int getCount() {
//        return 3;
//    }
//
//    @Override
//    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
//        return view.equals(object);
//    }
//
//    @NonNull
//    @Override
//    public Object instantiateItem(@NonNull ViewGroup container, int position) {
//
//        View view= inflater.inflate(R.layout.fragment_recent, container, false);
//        LinearLayout recent=view.findViewById(R.id.ln_container);
//
//        View view2=inflater.inflate(R.layout.fragment_shared, container, false);
//        LinearLayout shared=view2.findViewById(R.id.ln_container);
//
//        View view3=inflater.inflate(R.layout.fragment_starred, container, false);
//        LinearLayout starred=view3.findViewById(R.id.ln_container);
//
//        container.addView(recent);
//        container.addView(shared);
//        container.addView(starred);
//        return super.instantiateItem(container, position);
//    }
//    @Override
//    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
//        super.destroyItem(container, position, object);
//    }
//}
