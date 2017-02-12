package nyc.c4q.wesniemarcelin.finalexampractical.recyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import nyc.c4q.wesniemarcelin.finalexampractical.R;

/**
 * Created by wesniemarcelin on 2/12/17.
 */
public class ProfileViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView iconImage;
    TextView iconText;
    View view;

    public ProfileViewHolder(View itemView) {
        super(itemView);
        iconImage = (ImageView) itemView.findViewById(R.id.icon_image);
        iconText = (TextView) itemView.findViewById(R.id.icon_text);
        itemView.setOnClickListener(this);
        view = itemView;
    }

    public void bind(int position) {

    }

    @Override
    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.heart_button R.id.heart_text:
//                Toast.makeText(view.getContext(),"YOOOOO",Toast.LENGTH_SHORT).show();
//        }
    }
}
