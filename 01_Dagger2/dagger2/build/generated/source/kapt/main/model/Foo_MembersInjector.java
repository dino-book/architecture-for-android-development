package model;

import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import java.util.Optional;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Foo_MembersInjector implements MembersInjector<Foo> {
  private final Provider<Optional<String>> strProvider;

  private final Provider<Optional<Provider<String>>> str2Provider;

  private final Provider<Optional<Lazy<String>>> str3Provider;

  public Foo_MembersInjector(Provider<Optional<String>> strProvider,
      Provider<Optional<Provider<String>>> str2Provider,
      Provider<Optional<Lazy<String>>> str3Provider) {
    this.strProvider = strProvider;
    this.str2Provider = str2Provider;
    this.str3Provider = str3Provider;
  }

  public static MembersInjector<Foo> create(Provider<Optional<String>> strProvider,
      Provider<Optional<Provider<String>>> str2Provider,
      Provider<Optional<Lazy<String>>> str3Provider) {
    return new Foo_MembersInjector(strProvider, str2Provider, str3Provider);}

  @Override
  public void injectMembers(Foo instance) {
    injectStr(instance, strProvider.get());
    injectStr2(instance, str2Provider.get());
    injectStr3(instance, str3Provider.get());
  }

  @InjectedFieldSignature("model.Foo.str")
  public static void injectStr(Foo instance, Optional<String> str) {
    instance.str = str;
  }

  @InjectedFieldSignature("model.Foo.str2")
  public static void injectStr2(Foo instance, Optional<Provider<String>> str2) {
    instance.str2 = str2;
  }

  @InjectedFieldSignature("model.Foo.str3")
  public static void injectStr3(Foo instance, Optional<Lazy<String>> str3) {
    instance.str3 = str3;
  }
}
