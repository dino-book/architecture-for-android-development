package model;

import dagger.internal.Factory;
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
public final class PersonA_Factory implements Factory<PersonA> {
  private final Provider<String> nameProvider;

  private final Provider<Integer> birthdayProvider;

  public PersonA_Factory(Provider<String> nameProvider, Provider<Integer> birthdayProvider) {
    this.nameProvider = nameProvider;
    this.birthdayProvider = birthdayProvider;
  }

  @Override
  public PersonA get() {
    return newInstance(nameProvider.get(), birthdayProvider.get());
  }

  public static PersonA_Factory create(Provider<String> nameProvider,
      Provider<Integer> birthdayProvider) {
    return new PersonA_Factory(nameProvider, birthdayProvider);
  }

  public static PersonA newInstance(String name, Integer birthday) {
    return new PersonA(name, birthday);
  }
}
