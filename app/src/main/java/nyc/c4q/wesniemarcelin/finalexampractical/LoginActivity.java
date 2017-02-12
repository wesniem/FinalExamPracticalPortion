package nyc.c4q.wesniemarcelin.finalexampractical;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static nyc.c4q.wesniemarcelin.finalexampractical.R.styleable.View;

public class LoginActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button submit;
    String mUsername;
    String mPassword;
    String wrongUser;
    String wrongPass;
    String wrongInputs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        submit = (Button) findViewById(R.id.submit_button);
        submitClicked();
    }

    private void submitClicked() {
        submit.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          mUsername = username.getText().toString();
                                          mPassword = password.getText().toString();
                                          wrongUser = "Enter a Username";
                                          wrongPass = "Enter a Password";
                                          wrongInputs = "Enter both Username & Password";

                                          if (mUsername.matches("")) {
                                              Toast.makeText(v.getContext(), wrongUser, Toast.LENGTH_SHORT).show();
                                          } else if (mPassword.matches("")) {
                                              Toast.makeText(v.getContext(), wrongPass, Toast.LENGTH_SHORT).show();
                                          }
//                                          else if(mUsername.matches("") && mPassword.matches("")){
//                                              Toast.makeText(v.getContext(), wrongInputs,Toast.LENGTH_SHORT).show();
//                                          }
                                          else{
                                              Intent intent = new Intent(v.getContext(), ProfileActivity.class);
                                              startActivity(intent);
                                          }
                                      }
                                  });
    }
}



//            private void checkUser() {
//        mUsername = username.getText().toString();
//        mPassword = password.getText().toString();
//        wrongUser = "Enter a Username";
//        wrongPass = "Enter a Password";
//
//        if (mUsername.matches("") || mPassword.matches("")) {
//
//            switch (v.getId()) {
//                case R.id.username:
//                    Toast.makeText(this, wrongUser, Toast.LENGTH_SHORT).show();
//                    break;
//                case R.id.password:
//                    Toast.makeText(this, wrongPass, Toast.LENGTH_SHORT).show();
//            }
//        }

//                else{
//                    Intent intent = new Intent(this, ProfileActivity.class);
//                    startActivity(intent);
//                }
//                break;

//            if (mPassword.matches("")) {
//                Toast.makeText(this, wrongPass, Toast.LENGTH_SHORT).show();
//            }
//            }


