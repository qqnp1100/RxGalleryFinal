package cn.finalteam.rxgalleryfinal.sample;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

import cn.finalteam.rxgalleryfinal.RxGalleryFinal;
import cn.finalteam.rxgalleryfinal.sample.imageloader.GlideImageLoader;
import cn.finalteam.rxgalleryfinal.utils.ModelUtils;

/**
 * Desction:
 * Author:pengjianbo  Dujinyang
 * Date:16/5/16 上午9:17
 */
public class IApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //打开日志
        ModelUtils.setDebugModel(true);
        RxGalleryFinal.setImageLoader(new GlideImageLoader());
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.install(this);
    }
}
