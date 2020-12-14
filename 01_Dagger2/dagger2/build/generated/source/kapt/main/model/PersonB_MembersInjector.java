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
public final class PersonB_MembersInjector implements MembersInjector<PersonB> {
  private final Provider<String> nameProvider;

  private final Provider<Integer> p0Provider;

  public PersonB_MembersInjector(Provider<String> nameProvider, Provider<Integer> p0Provider) {
    this.nameProvider = nameProvider;
    this.p0Provider = p0Provider;
  }

  public static MembersInjector<PersonB> create(Provider<String> nameProvider,
      Provider<Integer> p0Provider) {
    return new PersonB_MembersInjector(nameProvider, p0Provider);}

  @Override
  public void injectMembers(PersonB instance) {
    injectName(instance, nameProvider.get());
    injectSetBirthday(instance, p0Provider.get());
  }

  @InjectedFieldSignature("model.PersonB.name")
  public static void injectName(PersonB instance, String name) {
    instance.name = name;
  }

  public static void injectSetBirthday(PersonB instance, Integer p0) {
    instance.setBirthday(p0);
  }
}
