package Data_loacal;

import android.app.Application;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        DataLocalManager.init(getApplicationContext());
    }
}
