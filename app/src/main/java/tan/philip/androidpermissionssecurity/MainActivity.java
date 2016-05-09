package tan.philip.androidpermissionssecurity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String uid = new UniqueID().getID(getApplicationContext());
        Log.i("GOT ID", uid);

    }
}
