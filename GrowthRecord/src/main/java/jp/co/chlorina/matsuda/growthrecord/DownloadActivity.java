package jp.co.chlorina.matsuda.growthrecord;

import jp.co.chlorina.matsuda.growthrecord.util.DownloadAsyncTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DownloadActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(this.getLocalClassName(), "onCreate");
        setContentView(R.layout.download_page);

        // ダウンロード開始ボタン
        Button btnDownload = (Button)findViewById(R.id.btn_download);
        btnDownload.setOnClickListener(
            new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("btnNext", "onClick");
                    new DownloadAsyncTask(DownloadActivity.this).execute("Param1");
                }
            }
        );

        // 戻るボタン
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
