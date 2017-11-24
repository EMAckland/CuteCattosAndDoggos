package emily.ackland.student.curtin.edu.au.myapplication;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import emily.ackland.student.curtin.edu.au.myapplication.R;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{
    private ImageView img;
    private Button button;
    private List<Integer> images = new ArrayList<Integer>();
    private int idx = 1;
    private int maxIdx = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.doghug);
        images.add(R.drawable.doghug);
        images.add(R.drawable.catboyes);
    }
    public void buttonPress(android.view.View myView) {

        img.setImageResource(images.get(idx));
        if (idx == maxIdx) {
            idx = 0;
        }else {
            idx++;
        }
    }
}
