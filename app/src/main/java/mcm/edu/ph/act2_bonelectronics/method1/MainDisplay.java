package mcm.edu.ph.act2_bonelectronics.method1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import mcm.edu.ph.act2_groupname.R;

public class MainDisplay extends AppCompatActivity implements View.OnClickListener{

    TextView textDisplay;
    Button btn1,btn2,btn3,btn4;
    int con=0;
    int con1, con1a;
    String conditionsMain = "You are inside a room with 4 doors in front of you, each door leads to another door. Your goal is to find the exit.";
    String txtdialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maindisplay);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        textDisplay = findViewById(R.id.txtDisplay);

        textDisplay.setText(conditionsMain);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }




    @Override
    public void onClick(View v){
        textDisplay = findViewById(R.id.txtDisplay);

        switch(v.getId()){
            case R.id.btn1:
                if (con > 0 && con1 > 0) { // a hacky condition to catch the 3rd condition layer,
                    con1a=1; //upon the 3rd condition layer, pushing button 1 sets your outcome to first choice
                    btn1.setEnabled(false); //disabling all the buttons after the final outcome
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    break; //break allows us to catch the condition without actually being caught by other conditions below
                }
                if(con > 0){con1= 1;break;}
                if(con == 0){con=1;}
                break;

            case R.id.btn2:
                if (con > 0 && con1 > 0) {
                    con1a=2;
                    btn1.setEnabled(false);
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    break;}
                if(con > 0){con1= 2;break;}
                if(con == 0){con=2;}
                break;

            case R.id.btn3:
                if (con > 0 && con1 > 0) {
                    con1a=3;
                    btn1.setEnabled(false);
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    break;}
                if(con > 0){con1= 3;break;}
                if(con == 0){con=3;}
                break;

            case R.id.btn4:
                if (con > 0 && con1 > 0 ) {
                    con1a=4;
                    btn1.setEnabled(false);
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    break;}
                if(con > 0){con1= 4;break;}
                if(con == 0){con=4;}
                break;
        }

        //The if-then conditions for storybuilding. Modify as you see fit.
        if(con==1){
            txtdialog = "Dialog for condition 1 Main Branch should appear here";
            if(con1== 1){
                txtdialog = "Dialog for condition 1 branch 1 should appear here";
                if(con1a == 1){
                    txtdialog = "Dialog for condition 1 branch 1-1 should appear here";
                }
                else if(con1a == 2){
                    txtdialog = "Dialog for condition 1 branch 1-2 should appear here";
                }
                else if(con1a == 3){
                    txtdialog = "Dialog for condition 1 branch 1-3 should appear here";
                }
                else if (con1a == 4){
                    txtdialog = "Dialog for condition 1 branch 1-4 should appear here";
                }
            }
            else if(con1 == 2) {
                txtdialog = "Dialog for condition 1 branch 2 should appear here";
                if (con1a == 1) {
                    txtdialog = "Dialog for condition 1 branch 2-1 should appear here";

                } else if (con1a == 2) {
                    txtdialog = "Dialog for condition 1 branch 2-2 should appear here";

                } else if (con1a == 3) {
                    txtdialog = "Dialog for condition 1 branch 2-3 should appear here";

                } else if (con1a == 4) {
                    txtdialog = "Dialog for condition 1 branch 2-4 should appear here";
                }
            }
            else if(con1 == 3){
                txtdialog = "Dialog for condition 1 branch 2 should appear here";
                if (con1a == 1) {
                    txtdialog = "Dialog for condition 1 branch 3-1 should appear here";

                } else if (con1a == 2) {
                    txtdialog = "Dialog for condition 1 branch 3-2 should appear here";

                } else if (con1a == 3) {
                    txtdialog = "Dialog for condition 1 branch 3-3 should appear here";

                } else if (con1a == 4){
                    txtdialog = "Dialog for condition 1 branch 3-4 should appear here";
                }
            }
            else if(con1 == 4){
                txtdialog = "Dialog for condition 1 branch 4 should appear here";
                if (con1a == 1) {
                    txtdialog = "Dialog for condition 1 branch 4-1 should appear here";

                } else if (con1a == 2) {
                    txtdialog = "Dialog for condition 1 branch 4-2 should appear here";

                } else if (con1a == 3) {
                    txtdialog = "Dialog for condition 1 branch 4-3 should appear here";

                } else if (con1a == 4){
                    txtdialog = "Dialog for condition 1 branch 4-4 should appear here";

                }
            }
        }

        else if(con==2){
            txtdialog = "Dialog for condition 2 Main Branch  should appear here";
            if(con1== 1){
                txtdialog = "Dialog for condition 2 branch 1 should appear here";
                if(con1a == 1){
                    txtdialog = "Dialog for condition 2 branch 1-1 should appear here";

                }
                else if(con1a == 2){
                    txtdialog = "Dialog for condition 2 branch 1-2 should appear here";
                }
                else if(con1a == 3){
                    txtdialog = "Dialog for condition 2 branch 1-3 should appear here";
                }
                else if (con1a == 4){
                    txtdialog = "Dialog for condition 2 branch 1-4 should appear here";
                }
            }
            else if(con1 == 2) {
                txtdialog = "Dialog for condition 2 branch 2 should appear here";
                if (con1a == 1) {
                    txtdialog = "Dialog for condition 2 branch 2-1 should appear here";

                } else if (con1a == 2) {
                    txtdialog = "Dialog for condition 2 branch 2-2 should appear here";

                } else if (con1a == 3) {
                    txtdialog = "Dialog for condition 2 branch 2-3 should appear here";

                } else if (con1a == 4){
                    txtdialog = "Dialog for condition 2 branch 2-4 should appear here";

                }
            }
            else if(con1 == 3){
                txtdialog = "Dialog for condition 2 branch 2 should appear here";
                if (con1a == 1) {
                    txtdialog = "Dialog for condition 2 branch 3-1 should appear here";

                } else if (con1a == 2) {
                    txtdialog = "Dialog for condition 2 branch 3-2 should appear here";

                } else if (con1a == 3) {
                    txtdialog = "Dialog for condition 2 branch 3-3 should appear here";
                } else if (con1a == 4){
                    txtdialog = "Dialog for condition 2 branch 3-4 should appear here";

                }
            }
            else if (con1 == 4){
                txtdialog = "Dialog for condition 2 branch 4 should appear here";
                if (con1a == 1) {
                    txtdialog = "Dialog for condition 2 branch 4-1 should appear here";
                } else if (con1a == 2) {
                    txtdialog = "Dialog for condition 2 branch 4-2 should appear here";

                } else if (con1a == 3) {
                    txtdialog = "Dialog for condition 2 branch 4-3 should appear here";

                } else if (con1a == 4) {
                    txtdialog = "Dialog for condition 2 branch 4-4 should appear here";
                }
            }
        }

        else if(con==3){
            txtdialog = "Dialog for condition 3 Main Branch should appear here";
            if(con1== 1){
                txtdialog = "Dialog for condition 3 branch 1 should appear here";
                if(con1a == 1){
                    txtdialog = "Dialog for condition 3 branch 1-1 should appear here";
                }
                else if(con1a == 2){
                    txtdialog = "Dialog for condition 3 branch 1-2 should appear here";
                }
                else if(con1a == 3){
                    txtdialog = "Dialog for condition 3 branch 1-3 should appear here";
                }
                else if (con1a == 4){
                    txtdialog = "Dialog for condition 3 branch 1-4 should appear here";
                }
            }
            else if(con1 == 2) {
                txtdialog = "Dialog for condition 3 branch 2 should appear here";
                if (con1a == 1) {
                    txtdialog = "Dialog for condition 3 branch 2-1 should appear here";
                } else if (con1a == 2) {
                    txtdialog = "Dialog for condition 3 branch 2-2 should appear here";
                } else if (con1a == 3) {
                    txtdialog = "Dialog for condition 3 branch 2-3 should appear here";
                } else if (con1a == 4){
                    txtdialog = "Dialog for condition 3 branch 2-4 should appear here";
                }
            }
            else if(con1 == 3){
                txtdialog = "Dialog for condition 3 branch 2 should appear here";
                if (con1a == 1) {
                    txtdialog = "Dialog for condition 3 branch 3-1 should appear here";
                } else if (con1a == 2) {
                    txtdialog = "Dialog for condition 3 branch 3-2 should appear here";
                } else if (con1a == 3) {
                    txtdialog = "Dialog for condition 3 branch 3-3 should appear here";
                } else if (con1a == 3){
                    txtdialog = "Dialog for condition 3 branch 3-4 should appear here";
                }
            }
            else if (con1 == 4){
                txtdialog = "Dialog for condition 3 branch 4 should appear here";
                if (con1a == 1) {
                    txtdialog = "Dialog for condition 3 branch 4-1 should appear here";
                } else if (con1a == 2) {
                    txtdialog = "Dialog for condition 3 branch 4-2 should appear here";
                } else if (con1a == 3) {
                    txtdialog = "Dialog for condition 3 branch 4-3 should appear here";
                } else if (con1a == 4){
                    txtdialog = "Dialog for condition 3 branch 4-4 should appear here";
                }
            }
        }
        else if(con == 4){
            txtdialog = "Dialog for condition 4 Main Branch should appear here";
            if(con1== 1){
                txtdialog = "Dialog for condition 4 branch 1 should appear here";
                if(con1a == 1){
                    txtdialog = "Dialog for condition 4 branch 1-1 should appear here";
                }
                else if(con1a == 2){
                    txtdialog = "Dialog for condition 4 branch 1-2 should appear here";
                }
                else if(con1a == 3){
                    txtdialog = "Dialog for condition 4 branch 1-3 should appear here";
                }
                else if (con1a == 4){
                    txtdialog = "Dialog for condition 4 branch 1-4 should appear here";
                }
            }
            else if(con1 == 2) {
                txtdialog = "Dialog for condition 4 branch 2 should appear here";
                if (con1a == 1) {
                    txtdialog = "Dialog for condition 4 branch 2-1 should appear here";
                } else if (con1a == 2) {
                    txtdialog = "Dialog for condition 4 branch 2-2 should appear here";
                } else if (con1a == 3) {
                    txtdialog = "Dialog for condition 4 branch 2-3 should appear here";
                } else if (con1a == 4){
                    txtdialog = "Dialog for condition 4 branch 2-4 should appear here";
                }
            }
            else if(con1 == 3){
                txtdialog = "Dialog for condition 4 branch 2 should appear here";
                if (con1a == 1) {
                    txtdialog = "Dialog for condition 4 branch 3-1 should appear here";
                } else if (con1a == 2) {
                    txtdialog = "Dialog for condition 4 branch 3-2 should appear here";
                } else if (con1a == 3) {
                    txtdialog = "Dialog for condition 4 branch 3-3 should appear here";
                } else if (con1a == 4){
                    txtdialog = "Dialog for condition 4 branch 3-4 should appear here";
                }
            }
            else if (con1 == 4){
                txtdialog = "Dialog for condition 4 branch 4 should appear here";
                if (con1a == 1) {
                    txtdialog = "Dialog for condition 4 branch 4-1 should appear here";
                } else if (con1a == 2) {
                    txtdialog = "Dialog for condition 4 branch 4-2 should appear here";
                } else if (con1a == 3) {
                    txtdialog = "Dialog for condition 4 branch 4-3 should appear here";
                } else if (con1a == 4){
                    txtdialog = "Dialog for condition 4 branch 4-4 should appear here";
                }
            }
        }
        textDisplay.setText(txtdialog);
    }

}