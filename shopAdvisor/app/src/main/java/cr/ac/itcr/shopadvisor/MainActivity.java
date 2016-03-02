package cr.ac.itcr.shopadvisor;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "asd", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Intent i =  new Intent(MainActivity.this,DashboardTest.class);
                i.putExtra("message","data1");
                startActivity(i);
            }
        });
    }

    @Override
    protected void onStop() {
        Log.d("Method", "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("Method", "onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        Log.d("Method", "onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("Method", "onPause");
        super.onPause();
    }

    @Override
    protected void onStart() {
        Log.d("Method", "onStart");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.d("Method", "onRestart");
        super.onRestart();
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
