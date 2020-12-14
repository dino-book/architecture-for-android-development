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
public final class MyClass_MembersInjector implements MembersInjector<MyClass> {
  private final Provider<String> stringProvider;

  public MyClass_MembersInjector(Provider<String> stringProvider) {
    this.stringProvider = stringProvider;
  }

  public static MembersInjector<MyClass> create(Provider<String> stringProvider) {
    return new MyClass_MembersInjector(stringProvider);}

  @Override
  public void injectMembers(MyClass instance) {
    injectString(instance, stringProvider.get());
  }

  @InjectedFieldSignature("model.MyClass.string")
  public static void injectString(MyClass instance, String string) {
    instance.string = string;
  }
}
