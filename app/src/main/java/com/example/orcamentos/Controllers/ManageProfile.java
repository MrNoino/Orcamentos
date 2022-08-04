package com.example.orcamentos.Controllers;

import android.content.Context;
import android.os.Environment;

import com.example.orcamentos.Models.Profile;
import com.example.orcamentos.R;
import com.example.orcamentos.Utils.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ManageProfile {

    private Profile profile;

    private String fileName;

    public ManageProfile() {

        this.profile = new Profile();

        this.fileName = "Profile";

    }

    public Profile getProfile() {

        return this.profile;

    }

    public void setProfile(Profile profile) {

        this.profile = profile;

    }

    public boolean loadProfile(Context context){

        File file = new File(Environment.getExternalStorageDirectory() + "/" + context.getResources().getString(R.string.app_name) + "/" + fileName + ".dat");

        try {

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));

            this.profile = (Profile) objectInputStream.readObject();

            objectInputStream.close();

            return true;

        } catch (IOException | ClassNotFoundException e) {

            return false;

        }

    }

    public boolean saveProfile(Context context){

        File file = new File(Environment.getExternalStorageDirectory() + "/" + context.getResources().getString(R.string.app_name) + "/" + fileName + ".dat");

        try {

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));

            objectOutputStream.writeObject(this.profile);

            objectOutputStream.close();

            return true;

        } catch (IOException e) {

            return false;

        }

    }

}
