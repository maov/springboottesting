# Exercise 1
Part 1 of https://reflectoring.io/unit-testing-spring-boot/


Add a junit test which tests the ColorService returns the basic colors 
"Green", "Red", "Blue"

you can compare collections by making them into a Set and using equals

``` 
import java.util.*;

List<String> aList = Arrays.asList("Geeks", "for",
                    "GeeksQuiz", "GeeksforGeeks", "GFG");

Set s1 = HashSet<String>(aList);

Set s2 = HashSet<String>();
s2.add("lkjsdf");


s1.eqauals(s2) // false
```