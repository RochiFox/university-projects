program Project1;

Uses SysUtils;

Var a, b, c, D, x, x1, x2: real;

BEGIN
write ('Введіть a, a='); readln(a);
write ('Введіть b, b='); readln(b);
write ('Введіть c, c='); readln(c);

D := b * b - 4 * a * c;

if D < 0 then
    writeln('Дійсних коренів немає')
else 
    if D = 0 then
    begin 
     x := -b / (2 * a);
     writeln ('x=', x=6:3);
    end
    else
    begin 
    x1 := -b + sqrt (D);
    x2 := -b - sqrt (D);
    writeln ('x1=', x1:6:3, 'x2=', x2:6:3);
    end;
    
readln; {Затримка зображення}
     
END.
