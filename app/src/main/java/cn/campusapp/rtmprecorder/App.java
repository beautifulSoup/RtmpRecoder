package cn.campusapp.rtmprecorder;

import android.app.Application;
import android.content.Context;

/**
 * Created by kris on 16/1/28.
 */
public class App extends Application {

    private static Context APPLICATION_CONTEXT;

    public static Context getContext(){
        return APPLICATION_CONTEXT;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        APPLICATION_CONTEXT = this;
    }
}
