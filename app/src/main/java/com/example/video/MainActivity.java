
package com.example.video;

        import android.support.v7.app.AppCompatActivity;

        import android.net.Uri;
        import android.os.Bundle;
        import android.widget.MediaController;
        import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = findViewById(R.id.videoview);
        String videopath = "android.resource://"+getPackageName()+"/"+R.raw.video;
        Uri uri= Uri.parse(videopath);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);


    }
}