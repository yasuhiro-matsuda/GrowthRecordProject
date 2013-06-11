package jp.co.chlorina.matsuda.growthrecord;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(this.getLocalClassName(), "onCreate");
        setContentView(R.layout.activity_main);

        // ページ遷移のサンプル
        Button btnNext = (Button)findViewById(R.id.btn_next);
        btnNext.setOnClickListener(
            new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("btnNext", "onClick");
                    Intent intent = new Intent(MainActivity.this, SecondPageActivity.class);
                    startActivity(intent);
                }
            }
        );

        // ダウンロード機能のサンプル
        Button btnDownload = (Button)findViewById(R.id.btn_download);
        btnDownload.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d("btnDownload", "onClick");
                        Intent intent = new Intent(MainActivity.this, DownloadActivity.class);
                        startActivity(intent);
                    }
                }
        );

        // 終了ボタン
        Button btnExit = (Button)findViewById(R.id.btn_exit);
        btnExit.setOnClickListener(
            new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("btnExit", "onClick");
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
