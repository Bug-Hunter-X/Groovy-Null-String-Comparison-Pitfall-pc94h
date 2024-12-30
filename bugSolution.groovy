```groovy
class MyClass {
    def myMethod(String str) {
        if (str == null || str.isEmpty()) {
            return "Null or Empty String"
        }
        return "Not Null and Not Empty String"
    }
}

assert new MyClass().myMethod(null) == "Null or Empty String"
assert new MyClass().myMethod("") == "Null or Empty String"
assert new MyClass().myMethod("Hello") == "Not Null and Not Empty String"
```