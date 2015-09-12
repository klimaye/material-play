package com.limayeapps.material_play;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        CollapsingToolbarLayout cToolBar =
                (CollapsingToolbarLayout)findViewById(R.id.collapsableToolBar);
        cToolBar.setTitle("Watch me Collapse");
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam viverra sapien eu ante consectetur hendrerit. Quisque elementum bibendum volutpat. Maecenas consequat sapien dui, eget interdum mi porta sit amet. Sed eleifend magna pulvinar, faucibus ante vitae, porta sapien. Maecenas porta lobortis leo a viverra. Ut dignissim dignissim ex, non mattis ex blandit vitae. Curabitur nec fermentum risus, vitae iaculis nisi. Aliquam erat volutpat. Pellentesque commodo posuere venenatis. Donec tempus scelerisque auctor. In hac habitasse platea dictumst. Aliquam id dignissim dui. Curabitur vulputate nunc vitae orci ultrices, pellentesque mattis sapien laoreet. Nam mollis aliquam nulla vel cursus.\n" +
                "\n" +
                "Integer aliquam congue nulla, et interdum lorem. Vivamus consequat dolor purus, ut condimentum ante pellentesque placerat. Duis sem eros, tincidunt sit amet ornare et, gravida sed velit. Aliquam cursus, arcu ac venenatis gravida, augue purus imperdiet arcu, elementum facilisis nibh libero vitae magna. Sed volutpat sapien eu dolor ornare malesuada. Aenean aliquet elit et nulla placerat, et dapibus libero imperdiet. Vivamus erat elit, malesuada ullamcorper rhoncus eget, dignissim eget nulla. Pellentesque quis ligula porta, maximus urna sed, euismod ex. Etiam iaculis, quam id cursus accumsan, tortor velit malesuada risus, nec congue dolor arcu at diam. Vivamus venenatis felis sit amet ultricies vehicula.\n" +
                "\n" +
                "Duis vitae orci dolor. Curabitur orci metus, egestas eu ultrices ac, rhoncus vel ex. Aliquam erat volutpat. Donec in gravida mi, ac luctus tortor. In vitae massa nisi. Sed ut lobortis justo, ut suscipit massa. Ut interdum risus tempor, interdum arcu id, vestibulum lorem. Ut tristique justo aliquam, egestas mi non, consectetur purus. Fusce facilisis neque id odio finibus pulvinar. Proin imperdiet felis eu risus imperdiet, quis lacinia mauris aliquet. Sed pretium eget augue et blandit.\n" +
                "\n" +
                "Praesent sit amet orci urna. Proin venenatis est vel vehicula imperdiet. Pellentesque nibh lacus, rutrum nec mi nec, finibus scelerisque purus. Pellentesque lacus est, mattis sed elementum sit amet, pellentesque ut sem. Nam tincidunt ullamcorper velit, sed consectetur arcu tincidunt in. Phasellus arcu nisi, sagittis quis sodales finibus, condimentum eu felis. Vivamus sit amet finibus libero. Etiam iaculis convallis fermentum. Proin quam dolor, blandit cursus pretium condimentum, faucibus eget augue.\n" +
                "\n" +
                "Nulla in scelerisque massa. Suspendisse nibh neque, venenatis sit amet magna quis, egestas egestas ex. Nam tempus vulputate magna, non luctus metus malesuada a. Etiam quis scelerisque justo, et volutpat sem. Aenean quis massa metus. Proin semper consequat quam a varius. Proin sodales vulputate justo ac fermentum.");
    }

}
