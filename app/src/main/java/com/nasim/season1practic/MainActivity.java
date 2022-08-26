package com.nasim.season1practic;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageSlider imageSlider;
    ImageView  tamimiqbal,mushfique,mashrafi,mahamudullah,shakib,imageView;
    TextView    playerName,discription;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        imageSlider  =findViewById(R.id.image_slider);
        shakib       =findViewById(R.id.shakib);
        mahamudullah =findViewById(R.id.mahamudullah);
        mashrafi     =findViewById(R.id.mashrafi);
        mushfique    =findViewById(R.id.mushfique);
        tamimiqbal   =findViewById(R.id.tamimiqbal);
        imageView   =findViewById(R.id.imageView);
        playerName   =findViewById(R.id.playerName);
        discription   =findViewById(R.id.discription);





            // start coding

        ArrayList<SlideModel> imageList = new ArrayList<>();


        imageList.add(new SlideModel(R.drawable.shakib,null));
        imageList.add(new SlideModel(R.drawable.musfique,null));
        imageList.add(new SlideModel(R.drawable.mashrafi,null));
        imageList.add(new SlideModel(R.drawable.mahamudullah,null));
        imageList.add(new SlideModel(R.drawable.tamimiqbal,null));
        imageList.add(new SlideModel("https://www.wicketnrun.com/wp-content/uploads/2021/01/Bangladesh-cricket-team.jpg",null));
        imageList.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT_IxNQPwbbuTOsFfpvObMiAWMXv8pfq4uLbQ&usqp=CAU",null));

        imageSlider.setImageList(imageList);

            //   Auto ImageSlider Coding End




        String shakib_des = getString( R.string.shakib );
        String mashrafi_des = getString( R.string.mashrafi_des );
        String mahamudullah_des = getString( R.string.mahamudullah );
        String mushfiq_des = getString( R.string.mushfiq_des );
        String tamim_des = getString( R.string.tamim_des );



        shakib.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               imageView.setImageResource( R.drawable.shakib );
               playerName.setText( "SHAKIB-AL-HASAN" );
                discription.setText( shakib_des );

            }
        } );

        mahamudullah.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource( R.drawable.mahamudullah );
                playerName.setText( "MAHMUDULLAH RIHAD" );
                discription.setText( mahamudullah_des );

            }
        } );

        mashrafi.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource( R.drawable.mashrafi );
                playerName.setText( "MASHRAFI BIN MORTOZA" );
                discription.setText( mashrafi_des );

            }
        } );



        mushfique.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                discription.setText( "" );
                imageView.setImageResource( R.drawable.musfique );
                playerName.setText( "MUSHFIQUER RAHAIM" );
                discription.setText( mushfiq_des );

            }
        } );

        tamimiqbal.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource( R.drawable.tamimiqbal );
                playerName.setText( "TAMIM iQBAL" );
                discription.setText( tamim_des );

            }
        } );


    }
}