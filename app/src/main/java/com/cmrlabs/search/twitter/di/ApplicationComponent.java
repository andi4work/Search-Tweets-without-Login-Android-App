package com.cmrlabs.search.twitter.di;

import com.cmrlabs.search.twitter.di.module.NetworkModule;
import com.cmrlabs.search.twitter.di.module.TwitterModule;
import com.cmrlabs.search.twitter.ui.MainActivity;
import dagger.Component;
import javax.inject.Singleton;

@Singleton @Component(modules = { TwitterModule.class, NetworkModule.class })
public interface ApplicationComponent {
  void inject(MainActivity mainActivity);
}
