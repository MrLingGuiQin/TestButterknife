package qin.gui.ling.com.mylibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainLibActivity extends AppCompatActivity {

    @BindView(R2.id.textView1)
    TextView textView1;
    @BindView(R2.id.textView2)
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lib);
        ButterKnife.bind(this);
        textView1.setText("文本1");
        textView2.setText("文本2");
    }
}