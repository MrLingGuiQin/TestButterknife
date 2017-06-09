package qin.gui.ling.com.testbutterknife;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import qin.gui.ling.com.mylibrary.MainLibActivity;
import qin.gui.ling.com.mylibrary.ToastHelper;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button1)
    Button button1;
    @BindView(R.id.button2)
    Button button2;
    @BindView(R.id.button3)
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        button1.setText("按钮1");
        button2.setText("按钮2");
        button3.setText("按钮3");
    }


    @OnClick({R.id.button1, R.id.button2, R.id.button3})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                startActivity(new Intent(this, MainLibActivity.class));
                break;
            case R.id.button2:
                ToastHelper.showMsg(this, "button2");
                break;
            case R.id.button3:
                ToastHelper.showMsg(this, "button3");
                break;
        }
    }
}
