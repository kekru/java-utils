package de.kekru.javautils.dependencyinjection;

public interface ServiceProvider<T> {
  T getService();
}
