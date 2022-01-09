### New Features added in Java 8

#### Interface default and static method
Interface with default and static menthods.
#### Method Reference


#### Optional<T>


#### Stream


#### Functional Interface


#### Lambda Expression


#### forEach
**void forEach(Consumer<? super T> action)**
  
Consumer is a functional interface which accepts an input and returns no result. 

Definition of Consumer interface:

<pre>
<code>@FunctionalInterface
public interface Consumer {
    void accept(T t);
}
</code></pre>

forEach Usage:
<pre>
<code></code>List<String> fruits = Array.asList({"apple", "orange", "strawberry"});

Consumer<String> fruitConsumer = new Consumer<String>() {
  public void accept(String fruit) {
    System.out.println(fruit)
  }
}

fruits.forEach(fruitConsumer);
</code></pre>


