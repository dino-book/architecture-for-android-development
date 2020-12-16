package model;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class Bind_MembersInjector implements MembersInjector<Bind> {
  private final Provider<String> strProvider;

  public Bind_MembersInjector(Provider<String> strProvider) {
    this.strProvider = strProvider;
  }

  public static MembersInjector<Bind> create(Provider<String> strProvider) {
    return new Bind_MembersInjector(strProvider);}

  @Override
  public void injectMembers(Bind instance) {
    injectStr(instance, strProvider.get());
  }

  @InjectedFieldSignature("model.Bind.str")
  public static void injectStr(Bind instance, String str) {
    instance.str = str;
  }
}
