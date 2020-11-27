package com.gabriel.apitestefinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.util.UUID;

public class actcadastro extends AppCompatActivity {

    private EditText mEditUsername;
    private EditText mEditEmail;
    private EditText mEditPassword;
    private Button mBtnEnter;
    private Button mBtnSelectedPhoto;


    private Uri mSelectedUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actcadastro);

        mEditUsername = findViewById(R.id.edit_username);
        mEditEmail = findViewById(R.id.edit_email);
        mEditPassword = findViewById(R.id.edit_password);
        mBtnEnter = findViewById(R.id.btn_enter);
        mBtnSelectedPhoto = findViewById(R.id.btn_selected_photo);
    }
}