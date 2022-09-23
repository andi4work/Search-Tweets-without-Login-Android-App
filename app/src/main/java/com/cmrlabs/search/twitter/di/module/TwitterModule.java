package com.cmrlabs.search.twitter.di.module;

import com.cmrlabs.search.twitter.twitter.TwitterApi;
import com.cmrlabs.search.twitter.twitter.TwitterApiProvider;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module public final class TwitterModule {
  @Provides @Singleton public TwitterApi provideTwitterApi() {
    return new TwitterApiProvider();
  }
}
