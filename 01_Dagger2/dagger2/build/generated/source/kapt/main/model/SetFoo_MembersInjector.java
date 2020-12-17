package model;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import java.util.Set;
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
public final class SetFoo_MembersInjector implements MembersInjector<SetFoo> {
  private final Provider<Set<String>> stringsProvider;

  public SetFoo_MembersInjector(Provider<Set<String>> stringsProvider) {
    this.stringsProvider = stringsProvider;
  }

  public static MembersInjector<SetFoo> create(Provider<Set<String>> stringsProvider) {
    return new SetFoo_MembersInjector(stringsProvider);}

  @Override
  public void injectMembers(SetFoo instance) {
    injectStrings(instance, stringsProvider.get());
  }

  @InjectedFieldSignature("model.SetFoo.strings")
  public static void injectStrings(SetFoo instance, Set<String> strings) {
    instance.strings = strings;
  }
}
