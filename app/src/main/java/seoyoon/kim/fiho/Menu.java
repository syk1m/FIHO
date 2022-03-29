package seoyoon.kim.fiho;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.menu);

        //[Type] [variable] = [value];
        //Button var = findViewById(R.id.[내가 쓸 component의 id]);
        TextView mfhome= findViewById(R.id.fhomebtn);

        //button을 눌렀을 때 일어나는 일을 'event'라고 부르고, 그 event를 조정 하는 것을 'handling'한다고 표현해
        //button을 눌렀을 때의 event handle 하는 code를 쓸건데, 외울 필요는 없어. 어디에서 handling 하는 지만 알면 돼
        //먼저, 우리가 쓸 Button을 앞으로 code에서는 btn 으로 쓸 수 있어 (28줄에서 define 해두었기 때문에)
        //그리고 그 btn에서 일어나는 일 중 하나이기 때문에 btn.function() 형식으로 쓸거야 (.을 쓴다는 것이 point야)

        mfhome.setOnClickListener(new View.OnClickListener() { //btn한테 달린 clicklistener, 이 format은 복붙해서 쓰면 돼. 문법이 복잡해서 설명은 지금 안할게.
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Menu.this,Findhome_map.class);
                startActivity(it);
                finish();
            }
        });

        TextView mfhope = findViewById(R.id.fhopebtn);

        mfhope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Menu.this,Findhope.class);
                startActivity(it);
                finish();
            }
        });

        });
    }
}

