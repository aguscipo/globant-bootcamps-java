1) Develop examples with at least one implementation of each Java collection taking the following domain into account: Globant. When using each collection, ensure that it represents the most appropriate selection for the use case.

I developed 4 examples, one for each type of collection: ListDemo, SetDemo, QueueDemo and MapDemo. Each example is explained in respective comments lines and you can run separately.


2)Provide auxiliary methods to sort your lists according to at least the following criteria: surname, first name, position, age.

Methods to sort are provided in the ListDemo example. 


3)Investigate what hashCode is and how Java Maps use it for storing elements. Override hashCode() method in one of the generated classes in point 1. What happens if you do/do not override equals() method also? Show the different possible scenarios with some examples.

Example in SetDemo uses an implementation of HashSet, that override the hashCode() method (is explained in the comment lines)