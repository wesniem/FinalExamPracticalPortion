package nyc.c4q.wesniemarcelin.finalexampractical;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

import nyc.c4q.wesniemarcelin.finalexampractical.recyclerView.ProfileAdapter;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener{
    RecyclerView profileRv;
    ImageButton heartButton;
    ImageButton mailButton;
    ImageButton bookButton;
    ImageButton exitButton;
    String toastMessage;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_w_nav);
        heartButton = (ImageButton) findViewById(R.id.heart_button);
        mailButton = (ImageButton) findViewById(R.id.mail_button);
        bookButton = (ImageButton) findViewById(R.id.book_button);
        exitButton = (ImageButton) findViewById(R.id.exit_button);
        toastMessage = null;
        heartButton.setOnClickListener(this);
        mailButton.setOnClickListener(this);
        bookButton.setOnClickListener(this);
        exitButton.setOnClickListener(this);

        if(savedInstanceState == null){

        }
        profileRv = (RecyclerView)findViewById(R.id.nav_recycler);
        profileRv.setLayoutManager(new LinearLayoutManager(this));
        profileRv.setAdapter(new ProfileAdapter());
    }

    @Override
    public void onClick(View v) {
        ImageButton b = (ImageButton) v;
        switch (b.getId()){
            case R.id.heart_button:
                toastMessage = "Selected Heart Activity";
                displayToast(toastMessage);
                break;
            case R.id.mail_button:
                toastMessage = "Selected Message Activity";
                displayToast(toastMessage);
                break;
            case R.id.book_button:
                Intent intent = new Intent(v.getContext(), SettingsActivity.class);
                startActivity(intent);
                break;
            case R.id.exit_button:
                toastMessage = "Selected Logout Activity";
                displayToast(toastMessage);
                finish();

        }
    }

    private void displayToast(String message) {
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
    }
}
