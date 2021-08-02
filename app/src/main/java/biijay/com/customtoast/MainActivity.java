package biijay.com.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void btnPressed(View view) {
//        Toast.makeText(this,"Button clicked",Toast.LENGTH_SHORT).show();
   showCustomToast("Customized toast message");
    }
    public void showCustomToast(String string) {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout,(ViewGroup) findViewById(R.id.toast_root));

        TextView toastText = layout.findViewById(R.id.toast_text);
        toastText.setText(string);

    Toast toast = new Toast(getApplicationContext());
    toast.setGravity(Gravity.CENTER, 0, 0);
    toast.setDuration(Toast.LENGTH_SHORT);
    toast.setView(layout);
    toast.show();
    }


    public void androidPressed(View view) {
        ShowCustomAndroidToast("Hello Android");
    }
    public void ShowCustomAndroidToast(String strng) {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_android,(ViewGroup) findViewById(R.id.android_layout));
        TextView toastText = layout.findViewById(R.id.android_text);
        toastText.setText(strng);
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM,0,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
}
