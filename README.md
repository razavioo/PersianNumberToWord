Convert numbers to Persian word in Android (Java)

based on : https://github.com/SalmanAA/wordifyfa


```java
  BigDecimal number = new BigDecimal(122);
  String numberWord = PersianNumberToWord.onWork(number, "ریال");
  Toast.makeText(this, numberWord, Toast.LENGTH_SHORT).show();
```
