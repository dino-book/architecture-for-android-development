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
public final class Coffee_Factory implements Factory<Coffee> {
  private final Provider<CoffeeBean> coffeeBeanProvider;

  private final Provider<Water> waterProvider;

  public Coffee_Factory(Provider<CoffeeBean> coffeeBeanProvider, Provider<Water> waterProvider) {
    this.coffeeBeanProvider = coffeeBeanProvider;
    this.waterProvider = waterProvider;
  }

  @Override
  public Coffee get() {
    return newInstance(coffeeBeanProvider.get(), waterProvider.get());
  }

  public static Coffee_Factory create(Provider<CoffeeBean> coffeeBeanProvider,
      Provider<Water> waterProvider) {
    return new Coffee_Factory(coffeeBeanProvider, waterProvider);
  }

  public static Coffee newInstance(CoffeeBean coffeeBean, Water water) {
    return new Coffee(coffeeBean, water);
  }
}
