package di.component;

import dagger.internal.Preconditions;
import di.module.PersonModule;
import di.module.PersonModule_ProvideNameFactory;
import javax.annotation.processing.Generated;
import model.PersonA;
import model.PersonB;
import model.PersonB_MembersInjector;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerPersonComponent implements PersonComponent {
  private final PersonModule personModule;

  private DaggerPersonComponent(PersonModule personModuleParam) {
    this.personModule = personModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static PersonComponent create() {
    return new Builder().build();
  }

  @Override
  public PersonA getPersonA() {
    return new PersonA(PersonModule_ProvideNameFactory.provideName(personModule), personModule.provideBirthday());}

  @Override
  public void inject(PersonB personB) {
    injectPersonB(personB);}

  private PersonB injectPersonB(PersonB instance) {
    PersonB_MembersInjector.injectName(instance, PersonModule_ProvideNameFactory.provideName(personModule));
    PersonB_MembersInjector.injectSetBirthday(instance, personModule.provideBirthday());
    return instance;
  }

  public static final class Builder {
    private PersonModule personModule;

    private Builder() {
    }

    public Builder personModule(PersonModule personModule) {
      this.personModule = Preconditions.checkNotNull(personModule);
      return this;
    }

    public PersonComponent build() {
      if (personModule == null) {
        this.personModule = new PersonModule();
      }
      return new DaggerPersonComponent(personModule);
    }
  }
}
