package Data_loacal;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

public class MySharedpreferences {
    private static String mysharedpreferences="mysharedpreferences";
    private static Context mContext;

    public MySharedpreferences(Context mContext) {
        this.mContext = mContext;
    }

    public static void putStringvalues(String key,String values){
        SharedPreferences sharedPreferences=mContext.getSharedPreferences(mysharedpreferences,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString(key,values);
        editor.apply();
    }
    public static String getStringvalues(String key){
        SharedPreferences sharedPreferences=mContext.getSharedPreferences(mysharedpreferences,Context.MODE_PRIVATE);
        return sharedPreferences.getString(key,"");
    }

}
