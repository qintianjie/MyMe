package com.colorcc.myme;

/**
 * Created by Tianjie Qin on 2017/4/20.
 */

public class OpenAdsImage {

    private String imageFileName;
    private int imageId;

    public OpenAdsImage(String imageFileName, int imageId) {
        this.imageFileName = imageFileName;
        this.imageId = imageId;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
