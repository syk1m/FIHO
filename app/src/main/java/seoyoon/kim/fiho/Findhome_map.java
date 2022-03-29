package seoyoon.kim.fiho;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

//기본적으로 class를 잡아주는 역
public class Findhome_map extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.findhome_map);

        //[Type] [variable] = [value];
        //Button var = findViewById(R.id.[내가 쓸 component의 id]);
        ImageButton btn = findViewById(R.id.profilebtn);

        //button을 눌렀을 때 일어나는 일을 'event'라고 부르고, 그 event를 조정 하는 것을 'handling'한다고 표현해
        //button을 눌렀을 때의 event handle 하는 code를 쓸건데, 외울 필요는 없어. 어디에서 handling 하는 지만 알면 돼
        //먼저, 우리가 쓸 Button을 앞으로 code에서는 btn 으로 쓸 수 있어 (28줄에서 define 해두었기 때문에)
        //그리고 그 btn에서 일어나는 일 중 하나이기 때문에 btn.function() 형식으로 쓸거야 (.을 쓴다는 것이 point야)

        btn.setOnClickListener(new View.OnClickListener() { //btn한테 달린 clicklistener, 이 format은 복붙해서 쓰면 돼. 문법이 복잡해서 설명은 지금 안할게.
            @Override
            public void onClick(View v) {
                //이 안에다가 event를 넣어줄거야

                //event 1. page 넘어가기
                //android studio 에서 page 사이의 일을 'intent'라고 불러
                //우리가 지금 발생시켜야 할 intent는 현재 page와 버튼을 눌렀을 때 이동할 page야.
                //현재 page는 Main.class 가 가지고 있고 (17번째 줄)
                //가야할 page는 Test.class가 가지고 있다고 할게.
                //Intent를 정의 할거야, intent = 페이지 사이의 event
                //Intent var = new Intent ([지금 class].this, [가야할 class].class);
                Intent it = new Intent(Findhome_map.this, Profile.class);

                //이제 앞에서 정의한 intent를 시작할거야, 함수를 사용해서(17번째 줄처럼)
                startActivity(it);
                //끝!
                //+ 만약에 page가 넘어가고 현재 있는 page는 끝내고 싶다면
                finish();
                //finish()를 안쓰면, page가 넘어 갔다가 '뒤로가기'를 하면 이전 페이지로 떠'
                //backarrow는 finish 없어도 됨

                //event 2. textView 바꾸기 (다른 component 응용가능!)
                /*
                 * TextView tv = findViewById(R.id.tvId);
                 * tv.setText("hello world!); 클릭을 하면 textview에 나타날 새로운 문자
                 * */
            }
        });
    }
}

