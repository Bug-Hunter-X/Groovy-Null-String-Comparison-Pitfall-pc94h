```groovy
class MyClass {
    def myMethod(String str) {
        if (str == null) {
            return "Null String"
        }
        return "Not Null String"
    }
}

assert new MyClass().myMethod(null) == "Null String"
assert new MyClass().myMethod("Hello") == "Not Null String"
```