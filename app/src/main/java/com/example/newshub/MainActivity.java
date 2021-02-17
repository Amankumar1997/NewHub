package com.example.newshub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.viewpager.widget.ViewPager;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    FirebaseAuth firebaseAuth;
ViewPager viewPager;
TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.viewpager);


        firebaseAuth= FirebaseAuth.getInstance();

        tabLayout.addTab(tabLayout.newTab().setText("ENGLISH"));
        tabLayout.addTab(tabLayout.newTab().setText("HINDI"));
        tabLayout.addTab(tabLayout.newTab().setText("LIVE"));
        tabLayout.setTabTextColors(ColorStateList.valueOf(Color.YELLOW));
tabLayout.setBackgroundColor(Color.DKGRAY);

        MyAdapter adapter=new MyAdapter(this,getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

       tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
           @Override
           public void onTabSelected(TabLayout.Tab tab) {

               viewPager.setCurrentItem(tab.getPosition());
           }

           @Override
           public void onTabUnselected(TabLayout.Tab tab) {

           }

           @Override
           public void onTabReselected(TabLayout.Tab tab) {

           }
       });





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.optionmenu,menu);
        

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
         super.onOptionsItemSelected(item);

         switch (item.getItemId())
         {

             
             case R.id.about:
                 Intent intent1=new Intent(MainActivity.this,About.class);
                 startActivity(intent1);
               break;
             case R.id.logout:
 AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
 alert.setTitle("LogOut");
 alert.setMessage("you wants to logout");
 alert.setPositiveButton("yes", new DialogInterface.OnClickListener() {
     @Override
     public void onClick(DialogInterface dialog, int which) {
         firebaseAuth.signOut();
         Intent intent=new Intent(MainActivity.this,Login.class);
         startActivity(intent);
         Toast.makeText(MainActivity.this, "Logout", Toast.LENGTH_SHORT).show();
     }
 });
 alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
     @Override
     public void onClick(DialogInterface dialog, int which) {
dialog.dismiss();
     }
 });
 alert.show();
                 break;
             case R.id.exit:

                 AlertDialog.Builder adb=new AlertDialog.Builder(MainActivity.this);
                 adb.setTitle("Exit");

                 adb.setMessage("you wants sure to exit");
                 adb.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialog, int which) {
                         finishAffinity();
                     }
                 });
               adb.setNegativeButton("No", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {
                       dialog.cancel();;
                   }
               });
               adb.show();
                 break;
             default:
                 return false;

         }


        return true;
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }

}
