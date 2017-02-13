package nyc.c4q.wesniemarcelin.finalexampractical.recyclerView;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import nyc.c4q.wesniemarcelin.finalexampractical.R;

/**
 * Created by wesniemarcelin on 2/12/17.
 */

public class ProfileAdapter extends RecyclerView.Adapter<ProfileViewHolder> {
    private final int TYPE_HEART = 1;
    private final int TYPE_MAIL = 2;
    private final int TYPE_BOOK = 3;
    private final int TYPE_LOGOUT = 4;
    ImageView iconImage;
    TextView text;
    Context context;


    @Override
    public ProfileViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_item_layout, parent, false);
        iconImage = (ImageView) view.findViewById(R.id.icon_image);
        text = (TextView) view.findViewById(R.id.icon_text);
        context = parent.getContext();
        return new ProfileViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProfileViewHolder holder, int position) {

        holder.bind(position);
    }

    @Override
    public int getItemViewType(int position) {
        switch (position) {
            case TYPE_HEART:
                iconImage.setImageResource(R.drawable.heart_image);
//                iconImage.setImageDrawable(context.getResources().getDrawable(R.drawable.heart_image));
                text.setText(R.string.heart_button);
                break;
            case TYPE_MAIL:
                iconImage.setImageDrawable(context.getResources().getDrawable(R.drawable.mail_image));
                text.setText(R.string.mail_button);
                break;
            case TYPE_BOOK:
                iconImage.setImageDrawable(context.getResources().getDrawable(R.drawable.book_image));
                text.setText(R.string.book_button);
                break;
            case TYPE_LOGOUT:
                iconImage.setImageDrawable(context.getResources().getDrawable(R.drawable.x_image));
                text.setText(R.string.escape_button);
                break;
            default:
                return 0;
        }
        return 0;

    }

    @Override
    public int getItemCount() {
        return 5;
    }

}

