package di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import model.Person;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MyModule_ProvidePersonFactory implements Factory<Person> {
  private final MyModule module;

  private final Provider<String> nameProvider;

  private final Provider<Integer> birthdayProvider;

  public MyModule_ProvidePersonFactory(MyModule module, Provider<String> nameProvider,
      Provider<Integer> birthdayProvider) {
    this.module = module;
    this.nameProvider = nameProvider;
    this.birthdayProvider = birthdayProvider;
  }

  @Override
  public Person get() {
    return providePerson(module, nameProvider.get(), birthdayProvider.get());
  }

  public static MyModule_ProvidePersonFactory create(MyModule module, Provider<String> nameProvider,
      Provider<Integer> birthdayProvider) {
    return new MyModule_ProvidePersonFactory(module, nameProvider, birthdayProvider);
  }

  public static Person providePerson(MyModule instance, String name, int birthday) {
    return Preconditions.checkNotNull(instance.providePerson(name, birthday), "Cannot return null from a non-@Nullable @Provides method");
  }
}
