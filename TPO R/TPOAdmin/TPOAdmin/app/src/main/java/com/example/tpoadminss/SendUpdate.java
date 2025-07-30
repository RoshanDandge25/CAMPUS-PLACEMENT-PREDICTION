package com.example.tpoadminss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class SendUpdate extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    Button update;
    List<UpdateData> myUpdateList;
    ProgressDialog progressDialog;
    MyAdapterUpload myAdapterUpload;

    private DatabaseReference databaseReference;
    private ValueEventListener eventListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_update);

        // ToolBar

        Toolbar toolbar = findViewById(R.id.toolBarSendUpdate);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Send Updates");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView1);
        update=(Button)findViewById(R.id.btnupload);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(SendUpdate.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("LOADING POSTS...");


        myUpdateList=new ArrayList<>();


        final MyAdapterUpload myAdapterUpload = new MyAdapterUpload(SendUpdate.this,myUpdateList);
        mRecyclerView.setAdapter(myAdapterUpload);

        databaseReference= FirebaseDatabase.getInstance().getReference().child("Updates");

        progressDialog.show();

        eventListener = databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange( DataSnapshot dataSnapshot) {

                myUpdateList.clear();

                for (DataSnapshot itemSnapshot : dataSnapshot.getChildren()) {

                    UpdateData updateData = itemSnapshot.getValue(UpdateData.class);
                    updateData.setKey(itemSnapshot.getKey());
                    myUpdateList.add(updateData);

                }

                myAdapterUpload.notifyDataSetChanged();
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled( DatabaseError databaseError) {

                progressDialog.dismiss();

            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SendUpdate.this,UploadUpdate.class));
            }
        });

    }
}