package com.widiarifki.newfunfacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FunFacts extends AppCompatActivity {

    public static final String TAG = FunFacts.class.getSimpleName();
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // We create activity, and hook it up into the main xml screen layout
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our view variables and attach them to the views in the layout through their IDs
        final RelativeLayout mainLayout = (RelativeLayout) findViewById(R.id.mainLayout);
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);

        // Create onClickListener for our button
        View.OnClickListener btnListener = new View.OnClickListener(){
            // When the button is tapped, we use our FactBook object to get answer from it
            public void onClick(View view){
                // Update layout background for each random fact
                int color = mColorWheel.getColor();
                mainLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);

                // Update new random fact to factLabel
                factLabel.setText(mFactBook.getFact());
            }
        };

        // attach onClickLIstener to Button
        showFactButton.setOnClickListener(btnListener);

        // add a simple toast when the app launch
        //Toast.makeText(this, "Yay, our activity was created!", Toast.LENGTH_LONG).show();
    }

}
