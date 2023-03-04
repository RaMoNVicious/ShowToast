package ua.edu.sumdu.showtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private CheckBox
            mChkChocolate,
            mChkSprinkles,
            mChkCrashedNuts,
            mChkCherries,
            mChkOrioCookie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mChkChocolate = findViewById(R.id.chk_chocolate);
        mChkSprinkles = findViewById(R.id.chk_sprinkles);
        mChkCrashedNuts = findViewById(R.id.chk_crashed_nuts);
        mChkCherries = findViewById(R.id.chk_cherries);
        mChkOrioCookie = findViewById(R.id.chk_orio_cookie);
    }

    public void OnSubmit(View view) {
        List<String> result = new ArrayList<>();

        if (mChkChocolate.isChecked()) {
            result.add(getString(R.string.choice_chocolate));
        }
        if (mChkSprinkles.isChecked()) {
            result.add(getString(R.string.choice_sprinkles));
        }
        if (mChkCrashedNuts.isChecked()) {
            result.add(getString(R.string.choice_crashed_nuts));
        }
        if (mChkCherries.isChecked()) {
            result.add(getString(R.string.choice_cherries));
        }
        if (mChkOrioCookie.isChecked()) {
            result.add(getString(R.string.choice_orio_cookie));
        }

        Toast.makeText(
                this,
                getString(
                        R.string.choice_result,
                        result.isEmpty() ? "NONE" : String.join(", ", result)
                ),
                Toast.LENGTH_LONG
        ).show();
    }
}