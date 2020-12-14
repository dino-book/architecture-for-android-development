package di;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import org.jetbrains.annotations.Nullable;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PersonModule_ProvideBirthdayFactory implements Factory<Integer> {
  private final PersonModule module;

  public PersonModule_ProvideBirthdayFactory(PersonModule module) {
    this.module = module;
  }

  @Override
  @Nullable
  public Integer get() {
    return provideBirthday(module);
  }

  public static PersonModule_ProvideBirthdayFactory create(PersonModule module) {
    return new PersonModule_ProvideBirthdayFactory(module);
  }

  @Nullable
  public static Integer provideBirthday(PersonModule instance) {
    return instance.provideBirthday();
  }
}
