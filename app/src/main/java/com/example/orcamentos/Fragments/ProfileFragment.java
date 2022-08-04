package com.example.orcamentos.Fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.orcamentos.Controllers.ManageProfile;
import com.example.orcamentos.R;
import com.example.orcamentos.Utils.Utilities;
import com.google.android.material.snackbar.Snackbar;

public class ProfileFragment extends Fragment {

    private String fileName;

    private ManageProfile manageProfile;

    private EditText input_company_name, input_owner_name, input_contact, input_email, input_address, input_postal_code, input_location;

    private Button btn_update;

    public ProfileFragment() {

        fileName = "Profile";

        manageProfile = null;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        Utilities.createFilesDir(view.getContext());

        manageProfile = new ManageProfile();

        input_company_name = view.findViewById(R.id.input_company_name);

        input_owner_name = view.findViewById(R.id.input_owner_name);

        input_contact = view.findViewById(R.id.input_company_contact);

        input_email = view.findViewById(R.id.input_company_email);

        input_address = view.findViewById(R.id.input_company_address);

        input_postal_code = view.findViewById(R.id.input_company_postal_code);

        input_location = view.findViewById(R.id.input_company_location);

        getProfile(view.getContext());

        btn_update = view.findViewById(R.id.btn_update);

        btn_update.setOnClickListener(l->{

            setProfile(view, view.getContext());

        });

        return view;

    }

    public void getProfile(Context context){


        this.manageProfile.loadProfile(context);

        if(this.manageProfile.getProfile() != null){

            input_company_name.setText(this.manageProfile.getProfile().getName());

            input_owner_name.setText(this.manageProfile.getProfile().getOwner());

            input_contact.setText(this.manageProfile.getProfile().getContact());

            input_email.setText(this.manageProfile.getProfile().getEmail());

            input_address.setText(this.manageProfile.getProfile().getAddress());

            input_postal_code.setText(this.manageProfile.getProfile().getPostalCode());

            input_location.setText(this.manageProfile.getProfile().getLocation());

        }


    }

    public void setProfile(View view, Context context){

        this.manageProfile.getProfile().setName(input_company_name.getText().toString());

        this.manageProfile.getProfile().setOwner(input_owner_name.getText().toString());

        this.manageProfile.getProfile().setContact(input_contact.getText().toString());

        this.manageProfile.getProfile().setEmail(input_email.getText().toString());

        this.manageProfile.getProfile().setAddress(input_address.getText().toString());

        this.manageProfile.getProfile().setPostalCode(input_postal_code.getText().toString());

        this.manageProfile.getProfile().setLocation(input_location.getText().toString());

        if(this.manageProfile.saveProfile(context)){

            Utilities.displaySnackBar(view, getString(R.string.label_successfully_updated), Snackbar.ANIMATION_MODE_SLIDE, getString(R.string.label_ok), l->{

                Utilities.removeSnackBar();

            });

        }else{

            Utilities.displaySnackBar(view, getString(R.string.label_not_updated), Snackbar.ANIMATION_MODE_SLIDE, getString(R.string.label_ok), l->{

                Utilities.removeSnackBar();

            });

        }


    }

}