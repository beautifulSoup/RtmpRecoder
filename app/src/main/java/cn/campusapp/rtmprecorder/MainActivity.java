package cn.campusapp.rtmprecorder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static final String STREAM_URL = "rtmp://10.10.5.119/live/livestream";

    @OnClick(R.id.record_btn)
    void onRecordClick(){
        startActivity(RecordActivity.makeIntent(STREAM_URL));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    protected String getUrl(){
        return STREAM_URL;
    }
}
