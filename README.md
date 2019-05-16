[![](https://jitpack.io/v/razavioo/PersianNumberToWord.svg)](https://jitpack.io/#razavioo/PersianNumberToWord)

# Intro
Convert numbers to Persian word in Android (Java)
based on : https://github.com/SalmanAA/wordifyfa

# Add library
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

```
dependencies {
	        implementation 'com.github.razavioo:PersianNumberToWord:1.2.2'
}
```

# Example
If you want to have the persian word of number 122, you only need to do like below:
```java
BigDecimal number = new BigDecimal(122);
String numberWord = PersianNumberToWord.onWork(number, "ریال");
```
