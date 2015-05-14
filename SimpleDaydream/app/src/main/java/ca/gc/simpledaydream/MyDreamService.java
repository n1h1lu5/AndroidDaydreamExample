package ca.gc.simpledaydream;

import android.service.dreams.DreamService;
import android.widget.ImageView;

public class MyDreamService extends DreamService {

    @Override
    public void onAttachedToWindow () {
        super.onAttachedToWindow();

        setInteractive(false);
        setFullscreen(true);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.dream);

        setContentView(imageView);
    }
}
