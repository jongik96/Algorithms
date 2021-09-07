숫자 5 버튼을 누르면 모서리의 버튼들이 시계방향으로 회전하도록

- buttonsGrid.css
```css
  #btns {
    width: 75%;
}
button {
    width: 30%;
    height: 48px;
    font-size: 24px;
}
```

- buttonsGrid.js
```javascript
  document.getElementById("btn5").addEventListener("click",function() {
    let temp = document.getElementById("btn1").innerHTML;
    document.getElementById("btn1").innerHTML = document.getElementById("btn4").innerHTML;
    document.getElementById("btn4").innerHTML = document.getElementById("btn7").innerHTML;
    document.getElementById("btn7").innerHTML = document.getElementById("btn8").innerHTML;
    document.getElementById("btn8").innerHTML = document.getElementById("btn9").innerHTML;
    document.getElementById("btn9").innerHTML = document.getElementById("btn6").innerHTML;
    document.getElementById("btn6").innerHTML = document.getElementById("btn3").innerHTML;
    document.getElementById("btn3").innerHTML = document.getElementById("btn2").innerHTML;
    document.getElementById("btn2").innerHTML = temp;
});
```

- index.html
```html
<!-- Enter your HTML code here -->
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Buttons Grid</title>
        <link rel="stylesheet" href="css/buttonsGrid.css" type="text/css">
    </head>
    <body>
        <div id="btns">
            <button id="btn1">1</button>
            <button id="btn2">2</button>
            <button id="btn3">3</button>
            <button id="btn4">4</button>
            <button id="btn5">5</button>
            <button id="btn6">6</button>
            <button id="btn7">7</button>
            <button id="btn8">8</button>
            <button id="btn9">9</button>
        </div>
        <script src="js/buttonsGrid.js" type="text/javascript"></script>
    </body>
</html>
```
