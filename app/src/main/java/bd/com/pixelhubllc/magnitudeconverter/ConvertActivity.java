package bd.com.pixelhubllc.magnitudeconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ConvertActivity extends AppCompatActivity  {

    private String recvalue1, recvalue2;
    TextView recTextView1, recTextView2;
    private LinearLayout linearLayout1, linearLayout2;
    private EditText editText1, editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert);

        recTextView1 = findViewById(R.id.recvalue1);
        recTextView2 = findViewById(R.id.recvalue2);
        linearLayout1 = findViewById(R.id.linearlayout1);
        linearLayout2 = findViewById(R.id.linearlayout2);
        editText1 = findViewById(R.id.edittext1);
        editText2 = findViewById(R.id.edittext2);

        String valueone = getIntent().getStringExtra("VALUEONE").toString();
        String valuetwo = getIntent().getStringExtra("VALUETWO").toString();

        if (valueone=="Numeric" && valuetwo == "Alphabetic"){
//            recTextView1.setText(valueone);
//            recTextView2.setText(valuetwo);
            editText1.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_NORMAL);
            editText2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_NORMAL);

        } else if(valueone=="Alphabetic" && valuetwo == "Numeric"){
//            recTextView1.setText(valueone);
//            recTextView2.setText(valuetwo);
            editText1.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_NORMAL);
            editText2.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_NORMAL);
        } else if(valueone=="Alphabetic" && valuetwo == "Alphabetic"){
//            recTextView1.setText(valueone);
//            recTextView2.setText(valuetwo);
            editText1.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_NORMAL);
            editText2.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_TEXT_VARIATION_NORMAL);
        }  else if(valueone=="Numeric" && valuetwo == "Numeric") {
//            recTextView1.setText(valueone);
//            recTextView2.setText(valuetwo);
            editText1.setInputType(InputType.TYPE_CLASS_NUMBER);
            editText2.setInputType(InputType.TYPE_CLASS_NUMBER);
        }

        recTextView1.setText(valueone);
        recTextView2.setText(valuetwo);


    }
}
