package com.aubbsapps.funnyfacts;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CoolFactsActivity4 extends Activity {

    private FactBook4 mFactBook = new FactBook4();
    private Colorwheel mColorwheel = new Colorwheel();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cool_facts4);
        // Intent intent = new Intent(this, MainMenuActivity.class);
        //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        // startActivity(intent);


        //Decalre our veiw varibles and assign them the views from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextview);
        final Button showfactButton = (Button) findViewById(R.id.factButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = mFactBook.getFact();

                //updates our label with a fact
                factLabel.setText(fact);
                int color = mColorwheel.getColor();
                //updating the background with new colors
                relativeLayout.setBackgroundColor(color);
                //updating text color with new colors
                showfactButton.setTextColor(color);


            }


        };
        showfactButton.setOnClickListener(listener);


    }



// not using this code  for the menu bar

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.funnyfactsmain, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
