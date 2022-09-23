package com.cmrlabs.search.twitter.di.module;

import com.cmrlabs.search.twitter.network.NetworkApi;
import com.cmrlabs.search.twitter.network.NetworkApiProvider;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module public final class NetworkModule {
  @Provides @Singleton public NetworkApi provideNetworkApi() {
    return new NetworkApiProvider();
  }
}
