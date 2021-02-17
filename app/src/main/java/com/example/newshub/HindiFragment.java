package com.example.newshub;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HindiFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HindiFragment extends Fragment {
ImageView virarjun,jansatta, patrika, dainikjagran,amarujala,punjabkesari,dainilbhasker,aajsmaj,ians,haribhoomi,lokmat,hindimilap,prabhatkhabar,livehindustan,samacharjagat;
TextView virarjun1,jansatta1, patrika1,dainik,amarujala1,punjabkesari1,dainikbhasker1,aajsmaj1,ians1,haribhoomi1,lokmat1,hindimilap1,prabhatkhabar1,livehindustan1,samacharjagat1;
       // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HindiFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HindiFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HindiFragment newInstance(String param1, String param2) {
        HindiFragment fragment = new HindiFragment();
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
        View v= inflater.inflate(R.layout.fragment_hindi, container, false);
     dainikjagran=v.findViewById(R.id.dainik);
dainik=v.findViewById(R.id.dainik1);
amarujala=v.findViewById(R.id.amarujala);
amarujala1=v.findViewById(R.id.Amarujala1);

        dainikbhasker1=v.findViewById(R.id.dainikbhasker1);
        dainilbhasker=v.findViewById(R.id.dainikbhasker);

        punjabkesari=v.findViewById(R.id.punjabkesari);
        punjabkesari1=v.findViewById(R.id.punjabkesari1);
        aajsmaj=v.findViewById(R.id.aajsmaj);
        aajsmaj1=v.findViewById(R.id.aajsmaj1);
        ians=v.findViewById(R.id.ians);
        ians1=v.findViewById(R.id.ians1);
        haribhoomi=v.findViewById(R.id.haribhoomi);
        haribhoomi1=v.findViewById(R.id.haribhoomi1);
        lokmat=v.findViewById(R.id.lokmat);
        lokmat1=v.findViewById(R.id.lokmat1);
        prabhatkhabar=v.findViewById(R.id.prabhatkhabar);
        prabhatkhabar1=v.findViewById(R.id.prabhatkhabar1);
        livehindustan=v.findViewById(R.id.livehindustan);
        livehindustan1=v.findViewById(R.id.livehindustan1);
        samacharjagat=v.findViewById(R.id.samacharjagat);
        samacharjagat1=v.findViewById(R.id.samacharjagat1);
        hindimilap=v.findViewById(R.id.hindimilap);
        hindimilap1=v.findViewById(R.id.hindimilap1);
        patrika=v.findViewById(R.id.patrika);
        patrika1=v.findViewById(R.id.patrika1);
        jansatta=v.findViewById(R.id.jansatta);
        jansatta1=v.findViewById(R.id.jansatta1);








        jansatta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Jansatta.class);
                startActivity(intent);
            }
        });

        jansatta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Jansatta.class);
                startActivity(intent);
            }
        });


        patrika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Patrika.class);
                startActivity(intent);
            }
        });
        patrika1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Patrika.class);
                startActivity(intent);
            }
        });



        hindimilap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),hindimilap.class);
                startActivity(intent);
            }
        });


        hindimilap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),hindimilap.class);
                startActivity(intent);
            }
        });
        samacharjagat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Samacharjagat.class);
                startActivity(intent);
            }
        });




        samacharjagat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Samacharjagat.class);
                startActivity(intent);
            }
        });





        livehindustan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),LiveHinustan.class);
                startActivity(intent);
            }
        });
        livehindustan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),LiveHinustan.class);
                startActivity(intent);
            }
        });




        prabhatkhabar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Prabhatkhabar.class);
                startActivity(intent);
            }
        });
        prabhatkhabar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Prabhatkhabar.class);
                startActivity(intent);
            }
        });





        lokmat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),LokmatTv.class);
                startActivity(intent);
            }
        });

       lokmat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),LokmatTv.class);
                startActivity(intent);
            }
        });








        haribhoomi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),HariBhoomi.class);
                startActivity(intent);
            }
        });

        haribhoomi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),HariBhoomi.class);
                startActivity(intent);
            }
        });




       ians.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Ianshindi.class);
                startActivity(intent);
            }
        });

       ians1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Ianshindi.class);
                startActivity(intent);
            }
        });






        dainikjagran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),DainikJagran.class);
                startActivity(intent);
            }
        });

        dainik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),DainikJagran.class);
                startActivity(intent);
            }
        });


        amarujala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Amarujala.class);
                startActivity(intent);
            }
        });

        amarujala1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Amarujala.class);
                startActivity(intent);
            }
        });



        punjabkesari1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Punjabkesari.class);
                startActivity(intent);
            }
        });

        punjabkesari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Punjabkesari.class);
                startActivity(intent);
            }
        });



     dainilbhasker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),DainikBhasker.class);
                startActivity(intent);
            }
        });

        dainikbhasker1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),DainikBhasker.class);
                startActivity(intent);
            }
        });


        aajsmaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),AajSmaj.class);
                startActivity(intent);
            }
        });

      aajsmaj1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),AajSmaj.class);
                startActivity(intent);
            }
        });








        return v;
    }
}