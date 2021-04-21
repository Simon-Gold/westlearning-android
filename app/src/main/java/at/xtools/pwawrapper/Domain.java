package at.xtools.pwawrapper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class Domain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_domain);
        super.onCreate(savedInstanceState);

    }

    public void onClickButton(View view) {
        EditText mEdit = findViewById(R.id.edittext);
        String url = mEdit.getText().toString();

        Intent intent = new Intent(getBaseContext(), MainActivity.class);
        intent.putExtra("Website_url", url);
        startActivity(intent);
    }
}