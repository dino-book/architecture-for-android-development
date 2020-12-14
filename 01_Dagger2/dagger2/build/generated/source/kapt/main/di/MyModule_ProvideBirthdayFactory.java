package di;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MyModule_ProvideBirthdayFactory implements Factory<Integer> {
  private final MyModule module;

  public MyModule_ProvideBirthdayFactory(MyModule module) {
    this.module = module;
  }

  @Override
  public Integer get() {
    return provideBirthday(module);
  }

  public static MyModule_ProvideBirthdayFactory create(MyModule module) {
    return new MyModule_ProvideBirthdayFactory(module);
  }

  public static int provideBirthday(MyModule instance) {
    return instance.provideBirthday();
  }
}
