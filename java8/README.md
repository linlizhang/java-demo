### New Features added in Java 8

#### Interface default and static method
Interface with default and static menthods.
#### Method Reference
#### Optional<T> 
#### Stream
#### Functional Interface
#### Lambda Expression
#### forEach
  void forEach(Consumer<? super T> action), and Consumer is a functional interface which accepts an input and returns no result. 

  Definition of Consumer interface:
@FunctionalInterface
public interface Consumer {
    void accept(T t);
}

forEach Usage:

List<String> fruits = Array.asList({"apple", "orange", "strawberry"});

Consumer<String> fruitConsumer = new Consumer<String>() {
  public void accept(String fruit) {
    System.out.println(fruit)
  }
}

fruits.forEach(fruitConsumer);


