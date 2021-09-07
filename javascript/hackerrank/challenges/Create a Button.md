클릭하면 0부터 1씩 증가하는 버튼만들기


- button.css
```css
#btn{
    width:96px;
    height:48px;
    font-size:24px
}
```

- index.html
```html
<!-- Enter your HTML code here -->
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Button</title>
        <link rel="stylesheet" href="css/button.css" type="text/css"/>
    </head>
    <body>
        <button id="btn"></button>
        <script>
            var btn = document.getElementById("btn");
            btn.innerHTML = '0';
            var click_count = 0;
            btn.onclick = function(){
                click_count++;
                btn.innerHTML = click_count;
            }
        </script>
    </body>
</html>
```
