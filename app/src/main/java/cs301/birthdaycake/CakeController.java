package cs301.birthdaycake;

import android.os.RecoverySystem;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
    private CakeView cakeView;
    private CakeModel cakeModel;

    CakeController(CakeView cv){
        cakeView =  cv;
        cakeModel = cakeView.getCakeModel();
    }


    @Override
    public void onClick(View v) {
        Log.d("Events", "Button clicked");
        cakeModel.candlesLit = false;
        cakeView.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        Log.d("Events","Switch switched");
        if(isChecked){
            cakeModel.hasCandles=true;
            cakeView.invalidate();
        }
        else{
            cakeModel.hasCandles=false;
            cakeView.invalidate();
        }
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        Log.d("Events", "Progress Changed");
        cakeModel.numCandles=progress;
        cakeView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
