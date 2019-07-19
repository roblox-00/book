package ketab.khoon.shoo;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemReselectedListener {


    FrameLayout FrameLayout;
    BottomNavigationView BottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setupViews();

BottomNavigationView.setOnNavigationItemReselectedListener(this);
    }

    private void setupViews() {
        FrameLayout = (FrameLayout) findViewById(R.id.frame_id);
        BottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_nav_id);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_id,new HomeFragment()).commit();



    }


    @Override
    public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
      int navID = menuItem.getItemId();

switch (navID){

    case R.id.home:

        getSupportFragmentManager().beginTransaction().replace(R.id.frame_id,new HomeFragment()).commit();

        break;
    case R.id.search:
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_id,new SearchFragment()).commit();
        break;
    case R.id.profile:
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_id,new ProfileFragment()).commit();
        break;

}



    }
}
