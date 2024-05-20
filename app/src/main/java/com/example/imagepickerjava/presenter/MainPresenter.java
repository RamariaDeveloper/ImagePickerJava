package com.example.imagepickerjava.presenter;

import android.content.pm.PackageManager;
import android.graphics.Bitmap;

import com.example.imagepickerjava.contract.MainContract;
import com.example.imagepickerjava.model.ImageModel;

public class MainPresenter implements MainContract.Presenter {

    public static final int CAMERA_PERMISSION_REQUEST_CODE = 101;

    private MainContract.View view;
    private ImageModel imageModel;

    public MainPresenter(MainContract.View view, ImageModel imageModel) {
        this.view = view;
        this.imageModel = imageModel;
    }

    @Override
    public void onGalleryButtonClicked() {
        view.openGallery();
    }

    @Override
    public void onCameraButtonClicked() {
        view.openCamera();
    }

    @Override
    public void onPermissionsResult(int requestCode, int[] grantResults) {
        if (requestCode == CAMERA_PERMISSION_REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                view.showCameraPermissionGranted();
            } else {
                view.showCameraPermissionDenied();
            }
        }
    }

    @Override
    public void onGalleryImageSelected(Bitmap image) {
        view.displayImage(image);
    }

    @Override
    public void onCameraImageTaken(Bitmap image) {
        view.displayImage(image);
    }
}
