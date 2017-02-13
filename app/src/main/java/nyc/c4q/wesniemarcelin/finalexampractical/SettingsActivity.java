package nyc.c4q.wesniemarcelin.finalexampractical;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import nyc.c4q.wesniemarcelin.finalexampractical.recyclerView.SettingsAdapter;

/**
 * Created by wesniemarcelin on 2/12/17.
 */
public class SettingsActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_layout);
        recyclerView = (RecyclerView) findViewById(R.id.number_rv);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new SettingsAdapter());
    }
}
