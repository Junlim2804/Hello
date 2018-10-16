package my.edu.taruc.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate=main() function
        super.onCreate(savedInstanceState);
        //R=resources class
        //layout=design of UI(a folder)
        setContentView(R.layout.activity_main);



    }

    public void showMessage(View view){
        TextView textViewMessage;
        textViewMessage=findViewById(R.id.textViewMessage);
        textViewMessage.setText("Hello,<your name here>");


    }
}
