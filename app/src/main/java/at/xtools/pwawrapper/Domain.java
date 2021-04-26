package at.xtools.pwawrapper;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.app.AlertDialog;
import android.widget.ImageView;
import android.widget.Toast;

public class Domain extends AppCompatActivity {

    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_domain);
        super.onCreate(savedInstanceState);

    }

    public void onClickButton(View view) {
        EditText mEdit = findViewById(R.id.edittext);

        String subDomain = mEdit.getText().toString();
        if (subDomain.length() > 0) {

            String url = String.format("https://%s.westnetmlp.com/", subDomain);


            Intent intent = new Intent(getBaseContext(), MainActivity.class);
            intent.putExtra("Website_url", url);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(),"Please input subdomain",
                    Toast.LENGTH_SHORT).show();
        }
    }
}