package kr.hs.emirim.ganggangi.friendsimulator.haeunhong;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    void onClick(View view) {
        switch(view.getId()) {
            case R.id.button1:
                Toast.makeText(this, "My name is 옹아은.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this, "뿌엑", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(this, "하은이가 좋아하는 랜덤게임 무슨게임", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.makeText(this, "알려드립니다 지금부터 아침회화 방송을 시작하겠으니 학생들은 VCR채널을 41번으로 맞춰주시기 바랍니다", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Toast.makeText(this, "조식이 제일맛있어", Toast.LENGTH_SHORT).show();
                break;
            default:


        }
        if (view.getId()==R.id.button1)
    }
}
