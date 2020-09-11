package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.Button;

public class CakeController implements View.OnClickListener{
    private CakeView cakeView;
    private CakeModel cakeModel;

    CakeController(CakeView cv){
        cakeView =  cv;
        cakeModel = cakeView.getCakeModel();
    }


    @Override
    public void onClick(View v) {
        Log.d("Events", "Button clicked");
        Button blowoutButton = cakeView.findViewById(R.id.blowOutButton);
        blowoutButton.setOnClickListener(this);
        cakeModel.candlesLit = false;
        cakeView.innerFlamePaint.setColor(0x00000000);
        cakeView.outerFlamePaint.setColor(0x00000000);
        cakeView.invalidate();
    }
}
