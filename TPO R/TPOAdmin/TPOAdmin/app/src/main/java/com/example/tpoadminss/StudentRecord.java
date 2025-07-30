package com.example.tpoadminss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class StudentRecord extends AppCompatActivity  {

    private RecyclerView mRecyclerView;

    List<StudentData> myStudentList;
    StudentData mStudentData;
    MyAdapter myAdapter;

    ProgressDialog progressDialog;

    private DatabaseReference databaseReference;
    private ValueEventListener eventListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_record);

        Toolbar toolbar = findViewById(R.id.toolBarStudentsRecord);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Students Record");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(StudentRecord.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("LOADING STUDENTS DATA...");

        myStudentList=new ArrayList<>();

        final MyAdapter myAdapter = new MyAdapter(StudentRecord.this,myStudentList);
        mRecyclerView.setAdapter(myAdapter);

        databaseReference= FirebaseDatabase.getInstance().getReference().child("StudentRegister");

        progressDialog.show();



        eventListener = databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange( DataSnapshot dataSnapshot) {

                myStudentList.clear();

                for (DataSnapshot itemSnapshot : dataSnapshot.getChildren()) {

                    StudentData studentData = itemSnapshot.getValue(StudentData.class);
                    studentData.setKey(itemSnapshot.getKey());
                    myStudentList.add(studentData);

                }

                myAdapter.notifyDataSetChanged();

                progressDialog.dismiss();


            }

            @Override
            public void onCancelled( DatabaseError databaseError) {

                progressDialog.dismiss();

            }
        });


    }

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_bar_menu,menu);
        MenuItem menuItem=menu.findItem(R.id.searchstudentdata);
        SearchView searchView=(SearchView)menuItem.getActionView();
        searchView.setOnQueryTextListener(this);
        return true;
    }

 */

    /*
    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {

        if(!s.toString().toLowerCase().isEmpty()){
            search(s.toString());
        }
        else
        {

        }
        return true;
    }

    private void search(String s) {

        Query query= databaseReference.orderByChild("se")
                .startAt(s);
        // .endAt(s+ "\uf8ff");

        query.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if(dataSnapshot.hasChildren())
                {

                    myStudentList.clear();
                    for (DataSnapshot dss : dataSnapshot.getChildren())
                    {
                        final StudentData studentData = dss.getValue(StudentData.class);
                        myStudentList.add(studentData);
                    }

                    myAdapter = new MyAdapter(getApplicationContext(),myStudentList);
                    mRecyclerView.setAdapter(myAdapter);
                    myAdapter.notifyDataSetChanged();

                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }

     */


}