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
public final class MyModule_ProvideDoubleFactory implements Factory<Double> {
  private final MyModule module;

  public MyModule_ProvideDoubleFactory(MyModule module) {
    this.module = module;
  }

  @Override
  @Nullable
  public Double get() {
    return provideDouble(module);
  }

  public static MyModule_ProvideDoubleFactory create(MyModule module) {
    return new MyModule_ProvideDoubleFactory(module);
  }

  @Nullable
  public static Double provideDouble(MyModule instance) {
    return instance.provideDouble();
  }
}
