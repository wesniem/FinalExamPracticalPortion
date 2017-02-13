package nyc.c4q.wesniemarcelin.finalexampractical.recyclerView;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import nyc.c4q.wesniemarcelin.finalexampractical.R;
import nyc.c4q.wesniemarcelin.finalexampractical.SettingsActivity;

/**
 * Created by wesniemarcelin on 2/12/17.
 */
public class ProfileViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView iconImage;
    TextView iconText;
    String toastMessage;
    View view;

    public ProfileViewHolder(View itemView) {
        super(itemView);
        iconImage = (ImageView) itemView.findViewById(R.id.icon_image);
        iconText = (TextView) itemView.findViewById(R.id.icon_text);
        itemView.setOnClickListener(this);
        view = itemView;
    }

    private void displayToast(String message) {
        Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }


    public void bind(int position) {
        switch (position) {
            case 1:
                toastMessage = "Selected Heart Activity";
                displayToast(toastMessage);
                break;
            case 2:
                toastMessage = "Selected Message Activity";
                displayToast(toastMessage);
                break;
            case 3:
                Intent intent = new Intent(itemView.getContext(), SettingsActivity.class);
                itemView.getContext().startActivity(intent);
                break;
            case 4:
                toastMessage = "Selected Logout Activity";
                displayToast(toastMessage);
                ((Activity) itemView.getContext()).finish();

        }
    }

    @Override
    public void onClick(View v) {

    }

//@Override
//public void onClick(View v){
////        switch (v.getId()){
////            case R.id.heart_button R.id.heart_text:
////                Toast.makeText(view.getContext(),"YOOOOO",Toast.LENGTH_SHORT).show();
////        }
//        int[]location=new int[2];
//        view.getLocationOnScreen(location);
//        int x=location[0];
//        int y=location[1];
//        }

}
