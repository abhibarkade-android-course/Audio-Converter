package com.abhi.videoplayer;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        videoView = findViewById(R.id.video);

        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.sample);

        MediaController controller = new MediaController(this);
        controller.setAnchorView(videoView);

        videoView.setMediaController(controller);

        videoView.start();

        // CHecking for Github
    }
}