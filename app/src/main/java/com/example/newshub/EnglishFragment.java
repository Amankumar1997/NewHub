package com.example.newshub;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EnglishFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EnglishFragment extends Fragment {
ImageView hindustantimes,dailypoineer,deccanherald, usatoday,buisnessstandard,timesofindia,thestatesman,thehindu,tribuneindia,indianexpress,freepressjournal,centralchronical,asianage,telegraphindia;
TextView hindustantimes1,dailypoineer1,deccanherald1,usatoday1,buisnessstandard1,timesofindia1,thestatesman1,thehindu1,tribuneindia1,indianexpress1,freepressjournal1,centralchronical1,asianage1,telegraphindia1;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public EnglishFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EnglishFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EnglishFragment newInstance(String param1, String param2) {
        EnglishFragment fragment = new EnglishFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_english, container, false);

       usatoday=v.findViewById(R.id.usatoday);
       usatoday1=v.findViewById(R.id.usatoday1);
       buisnessstandard=v.findViewById(R.id.buisnesstandard);
       buisnessstandard1=v.findViewById(R.id.buisnesstandard1);
       timesofindia=v.findViewById(R.id.timesofindia);
       timesofindia1=v.findViewById(R.id.timesofindia1);
      thestatesman=v.findViewById(R.id.thestatesman);
      thestatesman1=v.findViewById(R.id.thestatesman1);
      thehindu=v.findViewById(R.id.thehindu);
      thehindu1=v.findViewById(R.id.thehindu1);
      tribuneindia=v.findViewById(R.id.tribuneindia);
      tribuneindia1=v.findViewById(R.id.tribuneindia1);
      indianexpress=v.findViewById(R.id.indianexpress);
      indianexpress1=v.findViewById(R.id.indianexpress1);
      freepressjournal=v.findViewById(R.id.freepressjournal);
      freepressjournal1=v.findViewById(R.id.freepressjournal1);
      centralchronical1=v.findViewById(R.id.centralchronicle1);
      centralchronical=v.findViewById(R.id.centralchronicle);
      asianage=v.findViewById(R.id.asianage);
      asianage1=v.findViewById(R.id.asianage1);
      telegraphindia=v.findViewById(R.id.telegraphindia);
      telegraphindia1=v.findViewById(R.id.telegraphindia1);
      deccanherald=v.findViewById(R.id.deccanherald);
      deccanherald1=v.findViewById(R.id.deccanherald1);
      deccanherald1=v.findViewById(R.id.deccanherald1);
      dailypoineer=v.findViewById(R.id.dailypoineer);
      dailypoineer1=v.findViewById(R.id.dailypoineer1);
      hindustantimes=v.findViewById(R.id.hindustantimes);
      hindustantimes1=v.findViewById(R.id.hindustantimes1);
ImageView deccanchronicle=v.findViewById(R.id.deccanchronicle);
TextView deccanchronicle1=v.findViewById(R.id.deccanchronicle1);


       deccanchronicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),DeccanChronicle.class);
                startActivity(intent);
            }
        });
       deccanchronicle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),DeccanChronicle.class);
                startActivity(intent);
            }
        });

        hindustantimes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),HindustanTimes.class);
                startActivity(intent);
            }
        });

        hindustantimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),HindustanTimes.class);
                startActivity(intent);
            }
        });

        dailypoineer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),DailyPoineer.class);
                startActivity(intent);
            }
        });
        dailypoineer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),DailyPoineer.class);
                startActivity(intent);
            }
        });
        deccanherald1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),DeccanHerald.class);
                startActivity(intent);
            }
        });

        deccanherald.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),DeccanHerald.class);
                startActivity(intent);
            }
        });

       telegraphindia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),TeleGraphIndia.class);
                startActivity(intent);
            }
        });
       telegraphindia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),TeleGraphIndia.class);
                startActivity(intent);
            }
        });


        asianage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),AsianAge.class);
                startActivity(intent);
            }
        });
        asianage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),AsianAge.class);
                startActivity(intent);
            }
        });


        centralchronical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),CentralChronicle.class);
                startActivity(intent);
            }
        });
        centralchronical1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),CentralChronicle.class);
                startActivity(intent);
            }
        });


        freepressjournal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),FreePressJournal.class);
                startActivity(intent);
            }
        });
        freepressjournal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),FreePressJournal.class);
                startActivity(intent);
            }
        });


        indianexpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),IndianExpress.class);
                startActivity(intent);
            }
        });
        indianexpress1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),IndianExpress.class);
                startActivity(intent);
            }
        });


        tribuneindia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),TribuneIndia.class);
                startActivity(intent);
            }
        });
        tribuneindia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),TribuneIndia.class);
                startActivity(intent);
            }
        });
        thehindu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),TheHindu.class);
                startActivity(intent);
            }
        });
        thehindu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),TheHindu.class);
                startActivity(intent);
            }
        });
        thestatesman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),TheStatesman.class);
                startActivity(intent);
            }
        });
        thestatesman1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),TheStatesman.class);
                startActivity(intent);
            }
        });

        timesofindia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Timesofindia.class);
                startActivity(intent);
            }
        });
        timesofindia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Timesofindia.class);
                startActivity(intent);
            }
        });

        usatoday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),UsaTodayNews.class);
                startActivity(intent);
            }
        });
        usatoday1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),UsaTodayNews.class);
                startActivity(intent);
            }
        });
        buisnessstandard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),BuisnessStandard.class);
                startActivity(intent);
            }
        });
        buisnessstandard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),BuisnessStandard.class);
                startActivity(intent);
            }
        });
        return v;
    }
}