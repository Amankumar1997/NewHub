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
 * Use the {@link LiveFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LiveFragment extends Fragment {
ImageView aajtak,abp,indiatv,republictv,ndtv,bloomberg,mirrornow,etnow,timesnow,rstv,moneycontrol,zeenews,jantv,newsnation,wion;
TextView aajtak1,abp1,indiatv1,republictv1,ndtv1,bloomberg1,mirrornow1,etnow1,timesnow1,rstv1,moneycontrol1,zeenews1,jantv1,newsnation1,wion1;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public LiveFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LiveFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LiveFragment newInstance(String param1, String param2) {
        LiveFragment fragment = new LiveFragment();
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
       View v=inflater.inflate(R.layout.fragment_live, container, false);
       aajtak=v.findViewById(R.id.aajtak);
       aajtak1=v.findViewById(R.id.aajtak1);
       abp=v.findViewById(R.id.abp);
       abp1=v.findViewById(R.id.abp1);
indiatv=v.findViewById(R.id.indiatv);
indiatv1=v.findViewById(R.id.indiatv1);
republictv=v.findViewById(R.id.republictv);
republictv1=v.findViewById(R.id.republictv1);
ndtv=v.findViewById(R.id.ndtv);
ndtv1=v.findViewById(R.id.ndtv1);
bloomberg=v.findViewById(R.id.bloomberg);
bloomberg1=v.findViewById(R.id.bloomberg1);
mirrornow=v.findViewById(R.id.mirrornow);
mirrornow1=v.findViewById(R.id.mirrornow1);
etnow=v.findViewById(R.id.etnow);
etnow1=v.findViewById(R.id.etnow1);
timesnow=v.findViewById(R.id.timesnow);
timesnow1=v.findViewById(R.id.timesnow1);
rstv=v.findViewById(R.id.rstv);
rstv1=v.findViewById(R.id.rstv1);
moneycontrol=v.findViewById(R.id.moneycontrol);
moneycontrol1=v.findViewById(R.id.moneycontrol1);
zeenews=v.findViewById(R.id.zeenews);
zeenews1=v.findViewById(R.id.zeenews1);
jantv=v.findViewById(R.id.jantv);
jantv1=v.findViewById(R.id.jantv1);
newsnation=v.findViewById(R.id.newsnation);
newsnation1=v.findViewById(R.id.newsnation1);
wion=v.findViewById(R.id.wion);
wion1=v.findViewById(R.id.wion1);


       wion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),WionNews.class);
                startActivity(intent);
            }
        });
 wion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),WionNews.class);
                startActivity(intent);
            }
        });

        newsnation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),NewsNation.class);
                startActivity(intent);
            }
        });
        newsnation1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),NewsNation.class);
                startActivity(intent);
            }
        });
        jantv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),JanTv.class);
                startActivity(intent);
            }
        });
        jantv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),JanTv.class);
                startActivity(intent);
            }
        });
        zeenews1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),ZeeNews.class);
                startActivity(intent);
            }
        });
        zeenews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),ZeeNews.class);
                startActivity(intent);
            }
        });

        moneycontrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),MoneyControl.class);
                startActivity(intent);
            }
        });
        moneycontrol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),MoneyControl.class);
                startActivity(intent);
            }
        });

        rstv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),RajyasabhaTv.class);
                startActivity(intent);
            }
        });
        rstv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),RajyasabhaTv.class);
                startActivity(intent);
            }
        });

        timesnow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),TimesNow.class);
                startActivity(intent);
            }
        });

        timesnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),TimesNow.class);
                startActivity(intent);
            }
        });
        etnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),EtNow.class);
                startActivity(intent);
            }
        });
        etnow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),EtNow.class);
                startActivity(intent);
            }
        });


        mirrornow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Mirrornow.class);
                startActivity(intent);
            }
        });
 mirrornow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Mirrornow.class);
                startActivity(intent);
            }
        });


        bloomberg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Bloombergquint.class);
                startActivity(intent);
            }
        });

        bloomberg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Bloombergquint.class);
                startActivity(intent);
            }
        });

        ndtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),NdtvLive.class);
                startActivity(intent);
            }
        });
        ndtv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),NdtvLive.class);
                startActivity(intent);
            }
        });
        republictv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),RepublicBharatlive.class);
                startActivity(intent);
            }
        });
        republictv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),RepublicBharatlive.class);
                startActivity(intent);
            }
        });

        indiatv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),IndiaTvNewsLive.class);
                startActivity(intent);
            }
        });
        indiatv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),IndiaTvNewsLive.class);
                startActivity(intent);
            }
        });


        abp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),AbpLive.class);
                startActivity(intent);
            }
        });
        abp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),AbpLive.class);
                startActivity(intent);
            }
        });



       aajtak.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(getActivity(),AajTaklive.class);
               startActivity(intent);
           }
       });
 aajtak1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(getActivity(),AajTaklive.class);
               startActivity(intent);
           }
       });


        return v;
    }
}