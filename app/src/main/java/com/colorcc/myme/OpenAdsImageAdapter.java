package com.colorcc.myme;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by Tianjie Qin on 2017/4/19.
 */

public class OpenAdsImageAdapter extends RecyclerView.Adapter<OpenAdsImageAdapter.ViewHolder>   {

    private List<OpenAdsImage> imageList;

    public OpenAdsImageAdapter(List<OpenAdsImage> list) {
        imageList = list;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.open_screent_ads_layout, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        OpenAdsImage openAdsImage = imageList.get(position);
        holder.image.setImageResource(openAdsImage.getImageId());
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;

        public ViewHolder(View view) {
            super(view);
            image = (ImageView) view.findViewById(R.id.open_screen_ads_image);
        }
    }
}
