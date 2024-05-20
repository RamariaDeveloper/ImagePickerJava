package com.example.imagepickerjava.contract;

import android.graphics.Bitmap;

public interface MainContract {

    interface View {
        void displayImage(Bitmap image);
        void showCameraPermissionGranted();
        void showCameraPermissionDenied();
        void openGallery();
        void openCamera();
    }

    interface Presenter {
        void onGalleryButtonClicked();
        void onCameraButtonClicked();
        void onPermissionsResult(int requestCode, int[] grantResults);
        void onGalleryImageSelected(Bitmap image);
        void onCameraImageTaken(Bitmap image);
    }
}
