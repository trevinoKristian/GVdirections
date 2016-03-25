package kmcbinc.gvdirections;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DictActivity extends AppCompatActivity {

    Button srch;
    EditText edit;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dict);

        srch = (Button) this.findViewById(R.id.dsearchButton);
        edit = (EditText) this.findViewById(R.id.dsearchField);
        title = (TextView) this.findViewById(R.id.dsearchTitle);

        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/font1.ttf");
        ((TextView)findViewById(R.id.dsearchButton)).setTypeface(custom_font);
        ((TextView)findViewById(R.id.dsearchField)).setTypeface(custom_font);
        ((TextView)findViewById(R.id.dsearchTitle)).setTypeface(custom_font);

        srch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent launchme = new Intent(DictActivity.this, DictionaryResultActivity.class);
                launchme.putExtra("searchTerm", edit.getText().toString());
                DictActivity.this.startActivity(launchme);
                startActivity(launchme);
            }
        });
    }
}
