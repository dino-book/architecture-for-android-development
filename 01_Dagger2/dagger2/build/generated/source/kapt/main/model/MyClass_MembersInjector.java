package model;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Named;
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

  private final Provider<String> helloWorldProvider;

  public MyClass_MembersInjector(Provider<String> stringProvider,
      Provider<String> helloWorldProvider) {
    this.stringProvider = stringProvider;
    this.helloWorldProvider = helloWorldProvider;
  }

  public static MembersInjector<MyClass> create(Provider<String> stringProvider,
      Provider<String> helloWorldProvider) {
    return new MyClass_MembersInjector(stringProvider, helloWorldProvider);}

  @Override
  public void injectMembers(MyClass instance) {
    injectString(instance, stringProvider.get());
    injectHelloWorld(instance, helloWorldProvider.get());
  }

  @InjectedFieldSignature("model.MyClass.string")
  public static void injectString(MyClass instance, String string) {
    instance.string = string;
  }

  @InjectedFieldSignature("model.MyClass.helloWorld")
  @Named("HelloWorld")
  public static void injectHelloWorld(MyClass instance, String helloWorld) {
    instance.helloWorld = helloWorld;
  }
}
