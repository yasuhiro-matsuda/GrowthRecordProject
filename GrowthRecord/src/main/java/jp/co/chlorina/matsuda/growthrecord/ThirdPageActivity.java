package jp.co.chlorina.matsuda.growthrecord;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ThirdPageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(this.getLocalClassName(), "onCreate");
        setContentView(R.layout.third_page);

        Button btnPrev = (Button)findViewById(R.id.btn_prev);
        btnPrev.setOnClickListener(
            new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("btnPrev", "onClick");
                    finish();
                }
            }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.d(this.getLocalClassName(), "onCreateOptionsMenu");
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
